package stdf.impl.builder.conditional.switchcase;

import stdf.Action;
import stdf.builder.conditional.switchcase.SwitchStatementBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Switch<S> implements SwitchStatementBuilder<S>
{
    S valueToCompare;
    private boolean shouldContinue = true;
    private Action originalAction = null;
    private Action defaultAction = null;
    private List<Action> actions;

    public Switch(S valueToCompare)
    {
        this.valueToCompare = valueToCompare;
    }

    public Switch<S> Case(S anotherValue, Action action)
    {
        if (valueToCompare.equals(anotherValue))
        {
            originalAction = action;
        }
        else if (originalAction != null && shouldContinue)
        {
            if (actions == null)
            {
                actions = new ArrayList<>();
            }
            actions.add(action);
        }
        return this;
    }

    @Override
    public Switch<S> Break()
    {
        if (originalAction != null)
        {
            shouldContinue = false;
        }
        return this;
    }

    @Override
    public SwitchStatementBuilder<S> Default(Action action)
    {
        this.defaultAction = action;
        return this;
    }

    @Override
    public void done()
    {
        Optional.ofNullable(originalAction).orElse(defaultAction).perform();
        Optional.ofNullable(actions).ifPresent(actions -> actions.forEach(Action::perform));
    }
}

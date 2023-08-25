package stdf.impl.builder.conditional.ifelse;

import stdf.Action;
import stdf.builder.conditional.ifelse.ElseConditionBuilder;
import stdf.builder.conditional.ifelse.IfStatementBuilder;
import stdf.builder.conditional.ifelse.ThenConditionBuilder;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Then implements ThenConditionBuilder
{
    protected boolean condition;
    protected Action action;

    protected Then(boolean condition, Action action)
    {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public ElseConditionBuilder Else(Action action)
    {
        return condition ? new Else(this.action) : new Else(action);
    }

    @Override
    public IfStatementBuilder ElseIf(boolean condition)
    {
        return this.condition ? new If(this.condition, action) : new If(condition);
    }

    @Override
    public IfStatementBuilder ElseIf(Supplier<Boolean> conditionProvider)
    {

        return this.condition ? new If(this.condition, action) : new If(conditionProvider.get());
    }

    @Override
    public void done()
    {
        if (condition && action != null)
        {
            action.perform();
        }
    }
}

package stdf.impl.builder.conditional.ifelse;

import stdf.builder.conditional.ifelse.IfStatementBuilder;
import stdf.Action;

public class If implements IfStatementBuilder
{
    private boolean condition;
    private Action action;

    public If(boolean condition)
    {
        this.condition = condition;
    }

    protected If(boolean condition, Action action)
    {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public Then Then(Action action)
    {
        return condition && this.action != null
                       ? new Then(condition, this.action)
                       : new Then(condition, action);
    }
}

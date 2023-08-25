package stdf.impl.builder.conditional.ifelse;

import stdf.Action;
import stdf.builder.conditional.ifelse.ElseConditionBuilder;

public class Else implements ElseConditionBuilder
{
    protected Action action;
    public Else(Action action)
    {
        this.action = action;
    }

    @Override
    public void done()
    {
        if (action != null)
        {
            action.perform();
        }
    }
}

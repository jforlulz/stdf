package stdf.impl.builder.loop;

import stdf.Action;
import stdf.builder.loop.DoWhileLoopBuilder;

import java.util.function.Supplier;

public class Do implements DoWhileLoopBuilder
{
    private Action action;
    private Supplier<Boolean> condition;

    public Do(Action action)
    {
        this.action = action;
    }

    public Do While(Supplier<Boolean> condition)
    {
        this.condition = condition;
        return this;
    }

    @Override
    public void done()
    {
        do
        {
            action.perform();
        }
        while (condition.get());
    }
}

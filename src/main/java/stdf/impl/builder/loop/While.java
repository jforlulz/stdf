package stdf.impl.builder.loop;

import stdf.Action;
import stdf.builder.loop.WhileLoopBuilder;

import java.util.function.Supplier;

public class While implements WhileLoopBuilder
{
    private Supplier<Boolean> conditionSupplier;
    private Action action;

    public While(Supplier<Boolean> conditionSupplier)
    {
        this.conditionSupplier = conditionSupplier;
    }

    public While Do(Action action) {
        this.action = action;
        return this;
    }

    @Override
    public void done()
    {
        while (conditionSupplier.get())
        {
            action.perform();
        }
    }
}

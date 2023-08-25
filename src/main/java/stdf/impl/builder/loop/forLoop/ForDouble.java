package stdf.impl.builder.loop.forLoop;

import stdf.ConsumableAction;

import java.util.function.Function;

public class ForDouble extends For
{
    private double start;
    private double finish;
    private Function<Double, Double> operation;
    private ConsumableAction action;

    public ForDouble(double start, double finish, Function<Double, Double> operation)
    {
        this.start = start;
        this.finish = finish;
        this.operation = operation;
    }

    @Override
    public ForDouble Do(ConsumableAction action)
    {
        this.action = action;
        return this;
    }

    @Override
    public void done()
    {
        for (double i = start; i < finish; i = operation.apply(i))
        {
            action.perform(i);
        }
    }
}

package stdf.impl.builder.loop.forLoop;

import stdf.ConsumableAction;

import java.util.function.Function;

public class ForInt extends For
{
    private int start;
    private int finish;
    private Function<Integer, Integer> operation;
    private ConsumableAction action;

    public ForInt(int start, int finish, Function<Integer, Integer> operation)
    {
        this.start = start;
        this.finish = finish;
        this.operation = operation;
    }

    @Override
    public ForInt Do(ConsumableAction action)
    {
        this.action = action;
        return this;
    }

    @Override
    public void done()
    {
        for (int i = start; i < finish; i = operation.apply(i))
        {
            action.perform(i);
        }
    }
}

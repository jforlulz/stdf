package stdf.impl.builder.loop.forLoop;

import stdf.ConsumableAction;

import java.util.function.Function;

public class ForLong extends For
{
    private long start;
    private long finish;
    private Function<Long, Long> operation;
    private ConsumableAction action;

    public ForLong(long start, long finish, Function<Long, Long> operation)
    {
        this.start = start;
        this.finish = finish;
        this.operation = operation;
    }

    @Override
    public ForLong Do(ConsumableAction action)
    {
        this.action = action;
        return this;
    }

    @Override
    public void done()
    {
        for (long i = start; i < finish; i = operation.apply(i))
        {
            action.perform(i);
        }
    }
}

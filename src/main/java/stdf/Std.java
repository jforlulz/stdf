package stdf;

import stdf.builder.conditional.ifelse.IfStatementBuilder;
import stdf.builder.conditional.switchcase.SwitchStatementBuilder;
import stdf.builder.exceptions.TryCatchBuilder;
import stdf.builder.loop.DoWhileLoopBuilder;
import stdf.builder.loop.ForLoopBuilder;
import stdf.builder.loop.WhileLoopBuilder;
import stdf.builder.out.SystemOutBuilder;
import stdf.builder.rand.RandomBuilder;
import stdf.impl.builder.conditional.ifelse.If;
import stdf.impl.builder.conditional.switchcase.Switch;
import stdf.impl.builder.exceptions.Try;
import stdf.impl.builder.loop.Do;
import stdf.impl.builder.loop.While;
import stdf.impl.builder.loop.forLoop.ForDouble;
import stdf.impl.builder.loop.forLoop.ForInt;
import stdf.impl.builder.loop.forLoop.ForLong;
import stdf.impl.builder.out.Out;
import stdf.impl.builder.rand.Random;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Std
{
    static IfStatementBuilder If(boolean expression)
    {
        return new If(expression);
    }

    static IfStatementBuilder If(Supplier<Boolean> expression)
    {
        return new If(expression.get());
    }

    static ForLoopBuilder For(int start, int end, Function<Integer, Integer> operation)
    {
        return new ForInt(start, end, operation);
    }

    static ForLoopBuilder For(long start, long end, Function<Long, Long> operation)
    {
        return new ForLong(start, end, operation);
    }

    static ForLoopBuilder For(double start, double end, Function<Double, Double> operation)
    {
        return new ForDouble(start, end, operation);
    }

    static <S> SwitchStatementBuilder<S> Switch(S valueToCompare)
    {
        return new Switch<S>(valueToCompare);
    }

    static WhileLoopBuilder While(Supplier<Boolean> condition)
    {
        return new While(condition);
    }

    static DoWhileLoopBuilder Do(Action action)
    {
        return new Do(action);
    }

    static TryCatchBuilder Try(ExceptionableAction action)
    {
        return new Try(action);
    }

    static SystemOutBuilder Out()
    {
        return new Out();
    }

    static RandomBuilder Rand()
    {
        return new Random();
    }
}

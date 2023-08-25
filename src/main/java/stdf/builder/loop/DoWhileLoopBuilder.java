package stdf.builder.loop;

import stdf.Debuggable;
import stdf.builder.FiniteBuilder;

import java.util.function.Supplier;

public interface DoWhileLoopBuilder extends FiniteBuilder, Debuggable<DoWhileLoopBuilder>
{
    DoWhileLoopBuilder While(Supplier<Boolean> condition);
}

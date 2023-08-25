package stdf.builder.loop;

import stdf.ConsumableAction;
import stdf.Debuggable;
import stdf.builder.FiniteBuilder;

public interface ForLoopBuilder extends FiniteBuilder, Debuggable<ForLoopBuilder>
{
    ForLoopBuilder Do(ConsumableAction action);
}

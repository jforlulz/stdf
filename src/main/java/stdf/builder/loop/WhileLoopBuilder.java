package stdf.builder.loop;

import stdf.Action;
import stdf.Debuggable;
import stdf.builder.FiniteBuilder;

public interface WhileLoopBuilder extends FiniteBuilder, Debuggable<WhileLoopBuilder>
{
    WhileLoopBuilder Do(Action action);
}

package stdf.builder.conditional.switchcase;

import stdf.Action;
import stdf.Debuggable;
import stdf.builder.FiniteBuilder;

public interface SwitchStatementBuilder<S> extends FiniteBuilder, Debuggable<SwitchStatementBuilder<S>>
{
    SwitchStatementBuilder<S> Case(S anotherValue, Action action);
    SwitchStatementBuilder<S> Break();
    SwitchStatementBuilder<S> Default(Action action);
}

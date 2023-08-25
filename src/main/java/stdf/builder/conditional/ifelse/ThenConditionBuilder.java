package stdf.builder.conditional.ifelse;

import stdf.Debuggable;
import stdf.builder.FiniteBuilder;
import stdf.Action;

import java.util.function.Supplier;

public interface ThenConditionBuilder extends FiniteBuilder, Debuggable<ThenConditionBuilder>
{
    ElseConditionBuilder Else(Action action);
    IfStatementBuilder ElseIf(boolean condition);
    IfStatementBuilder ElseIf(Supplier<Boolean> conditionProvider);
}

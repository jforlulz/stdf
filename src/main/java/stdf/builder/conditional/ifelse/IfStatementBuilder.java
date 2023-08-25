package stdf.builder.conditional.ifelse;

import stdf.Debuggable;
import stdf.Action;

public interface IfStatementBuilder extends Debuggable<IfStatementBuilder>
{
    ThenConditionBuilder Then(Action action);
}

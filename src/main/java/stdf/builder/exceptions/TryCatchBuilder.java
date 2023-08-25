package stdf.builder.exceptions;

import stdf.Action;
import stdf.Debuggable;
import stdf.builder.FiniteBuilder;

import java.util.function.Consumer;

public interface TryCatchBuilder extends FiniteBuilder, Debuggable<TryCatchBuilder>
{
    <T extends Exception> TryCatchBuilder Catch(Class<T> eclass, Consumer<Exception> action);
   @SuppressWarnings("unchecked")
   TryCatchBuilder Catch(Consumer<Exception> action, Class<? extends Exception>... eclasses);
    TryCatchBuilder Finally(Action action);
}

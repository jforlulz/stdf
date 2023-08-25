package stdf.impl.builder.exceptions;

import stdf.Action;
import stdf.ExceptionableAction;
import stdf.builder.exceptions.TryCatchBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class Try implements TryCatchBuilder
{
    private ExceptionableAction action;
    private Map<Class<? extends Exception>, Consumer<Exception>> exceptionHandlers = new HashMap<>();
    private Action finallyAction;

    public Try(ExceptionableAction action)
    {
        this.action = action;
    }

    @Override
    public <T extends Exception> TryCatchBuilder Catch(Class<T> eClass, Consumer<Exception> action)
    {
        exceptionHandlers.put(eClass, action);
        return this;
    }

    @Override
    public TryCatchBuilder Catch(Consumer<Exception> action, Class<? extends Exception>... eclasses)
    {
        for (Class<? extends Exception> c : eclasses)
        {
            var eclass = (Class<? extends Exception>) c;
            exceptionHandlers.put(eclass, action);
        }
        return this;
    }

    @Override
    public TryCatchBuilder Finally(Action action)
    {
        this.finallyAction = action;
        return this;
    }

    @Override
    public void done()
    {
        try
        {
            action.perform();
        }
        catch (Exception e)
        {
            Optional
                    .ofNullable(exceptionHandlers.get(e.getClass()))
                    .ifPresentOrElse(ex -> ex.accept(e), () -> { throw new RuntimeException(e); });
        }
        finally
        {
            Optional
                    .ofNullable(finallyAction)
                    .ifPresent(Action::perform);
        }
    }
}

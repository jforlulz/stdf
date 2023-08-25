package stdf;

import javax.naming.OperationNotSupportedException;

public interface Debuggable<T>
{
    default T breakpoint() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException("Debugging is not supported");
    }
}

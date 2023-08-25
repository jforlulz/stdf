package stdf.builder.out;

import stdf.Debuggable;

public interface SystemOutBuilder extends Debuggable<SystemOutBuilder>
{
    void Print(int value);
    void Print(char value);
    void Print(long value);
    void Print(float value);
    void Print(char[] value);
    void Print(double value);
    void Print(String value);
    void Print(boolean value);
    void Print(Object value);
    void PrintLn(int value);
    void PrintLn(char value);
    void PrintLn(long value);
    void PrintLn(float value);
    void PrintLn(char[] value);
    void PrintLn(double value);
    void PrintLn(String value);
    void PrintLn(boolean value);
    void PrintLn(Object value);
    void PrintF(String format, Object... args);
    void PrintLnF(String format, Object... args);
}

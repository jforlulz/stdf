package stdf.impl.builder.out;

import stdf.builder.out.SystemOutBuilder;

public class Out implements SystemOutBuilder
{
    @Override
    public void Print(int value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(char value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(long value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(float value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(char[] value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(double value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(String value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(boolean value)
    {
        System.out.print(value);
    }

    @Override
    public void Print(Object value)
    {
        System.out.print(value);
    }

    @Override
    public void PrintLn(int value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(char value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(long value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(float value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(char[] value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(double value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(String value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(boolean value)
    {
        System.out.println(value);
    }

    @Override
    public void PrintLn(Object value)
    {
        System.out.println(value);
    }

    public void PrintF(String format, Object... args)
    {
        System.out.printf(format, args);
    }

    public void PrintLnF(String format, Object... args)
    {
        System.out.printf(format + "\n", args);
    }
}

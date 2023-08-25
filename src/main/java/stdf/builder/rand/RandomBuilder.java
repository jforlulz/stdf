package stdf.builder.rand;

import stdf.Debuggable;

public interface RandomBuilder extends Debuggable<RandomBuilder>
{
    int randomInt();
    int randomInt(int end);
    int randomInt(int start, int end);

    long randomLong();
    long randomLong(long end);
    long randomLong(long start, long end);

    char randomChar();

    boolean randomBoolean();

    boolean randomBoolean(int trueProbabilityPercentage);
}

package stdf.impl.builder.rand;

import stdf.builder.rand.RandomBuilder;

public class Random implements RandomBuilder
{
    private static final java.util.Random random = new java.util.Random();
    @Override
    public int randomInt()
    {
        return random.nextInt();
    }

    @Override
    public int randomInt(int end)
    {
        return random.nextInt(end);
    }

    @Override
    public int randomInt(int start, int end)
    {
        return random.nextInt(start, end);
    }

    @Override
    public long randomLong()
    {
        return random.nextLong();
    }

    @Override
    public long randomLong(long end)
    {
        return random.nextLong(end);
    }

    @Override
    public long randomLong(long start, long end)
    {
        return random.nextLong(start, end);
    }

    @Override
    public char randomChar()
    {
        return 0;
    }

    @Override
    public boolean randomBoolean()
    {
        return random.nextBoolean();
    }

    @Override
    public boolean randomBoolean(int trueProbabilityPercentage)
    {
        if (trueProbabilityPercentage < 0 || trueProbabilityPercentage > 100)
        {
            throw new IllegalArgumentException("Probability should be in range [0..100]");
        }
        return (trueProbabilityPercentage > 0 && trueProbabilityPercentage < 100)
                       ? randomInt(1, 101) <= trueProbabilityPercentage
                       : trueProbabilityPercentage > 0;
    }
}

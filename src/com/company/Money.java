package com.company;

public abstract class Money
{
    int count = 1;
    double value;

    public Money(int count)
    {
        this.count = count;
    }

    public Money()
    {
    }

    public double getValue()
    {
        return value * count;
    }

    public abstract String toString();
}
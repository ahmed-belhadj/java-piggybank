package com.company;

public class Nickel extends Money
{
    public Nickel(int count)
    {
        super(count);
        value = 0.05;
    }

    public Nickel()
    {
        value = 0.05;
    }

    @Override
    public String toString()
    {
        return count + " Nickel";
    }
}
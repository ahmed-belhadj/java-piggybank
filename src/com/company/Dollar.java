package com.company;

public class Dollar extends Money
{
    public Dollar(int count)
    {
        super(count);
        value = 1.00;
    }

    public Dollar()
    {
        value = 1.00;
    }

    @Override
    public String toString()
    {
        return "$" + count;
    }
}
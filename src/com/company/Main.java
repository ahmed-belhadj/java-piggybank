package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Money> piggyBank = new ArrayList<Money>();
        DecimalFormat df = new DecimalFormat("#.00");

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(p -> System.out.println(p.toString()));

        double balance = 0.00;
        for (Money m : piggyBank)
        {
            balance += m.getValue();
        }

        System.out.println("The piggy bank holds $" + df.format(balance));
    }
}
package ru.geekbrains.homework.enumsAndThrows;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MyExeptions {
        // ЗАпутался весь, времени не хватило.

        // System.out.println(Week.MONDAY.ordinal());


        //Ниже первые 3 задания.


        String [] [] arr1 = new String[][]
        {
            {
                "12", "12", "12", "12"
            }
            ,
            {
                "12", "12", "12", "12"
            }
            ,
            {
                "12", "Oleg", "12", "12"
            }
            , {
                "12", "12", "12", "12"
            }


        };
       MyExeptions.getArrayChek(arr1);

    }

}





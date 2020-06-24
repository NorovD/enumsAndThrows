package ru.geekbrains.homework.enumsAndThrows;

public class MyExeptions extends Exception {
    private String [][] inputArray;


    public MyExeptions(String msg, String[][] inputArray){
        super(msg);
        this.inputArray=inputArray;
    }
    public static void getArrayChek(String[][] inputArray) throws MyExeptions {
        ArrayChek.myArraySizeException(inputArray);
        ArrayChek.MyArrayDataException(inputArray);
    }

}
class ArrayChek{
    public static void MyArrayDataException(String[][] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");

            for (int j = 0; j < array[i].length; j++) {

                try{
                    int  bufferArray = Integer.parseInt(array[i][j]);
                     sum +=bufferArray;

                   System.out.println(sum);
               }catch (NumberFormatException e){

                   System.out.println(new MyExeptions("Oleg here!!!"+ array[i][j],array));
               }
            }
        }
    }




    public static void myArraySizeException(String[][] array) throws MyExeptions {
        if(array.length != 4 ) throw new MyExeptions("Введите массив размером 4х4!!!", array);
    }

}
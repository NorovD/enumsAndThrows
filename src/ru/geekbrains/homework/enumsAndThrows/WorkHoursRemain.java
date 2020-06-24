package ru.geekbrains.homework.enumsAndThrows;

public class WorkHoursRemain {


    public void WorkHoursRemain(int workHours) {
        for(Week o:Week.values()){
            //int summaryWorkHours = 0;
            o.getWorkHours();



          //  summaryWorkHours = summaryWorkHours + workHours;
            System.out.println( o.getWorkHours());

        }


    }

}

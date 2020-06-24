package ru.geekbrains.homework.enumsAndThrows;

public enum Week {
    MONDAY(12), TUESDAY(12), WEDNESDAY(12), THURSDAY(12), FRIDAY(12), SATURDAY(8), SUNDAY(0);
    private int workHours;


    public int getWorkHours() {





        return workHours;
    }

    Week(int workHours) {
        this.workHours = workHours;
    }

//    public static void workHoursRemain() {
//        for(Week o: Week.values()){
//            int summaryWorkHours = 0;
//
//
//            summaryWorkHours = summaryWorkHours + workHours;
//            System.out.println(summaryWorkHours);
//
//        }
//
//
//    }
//


}


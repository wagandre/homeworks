/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro.pensionFoundation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
        PensionFoundation pensionFoundation = new PensionFoundation();



        pensionFoundation.setWorkingDays(DayOfWeek.SUNDAY,false);
        pensionFoundation.setWorkingDays(DayOfWeek.MONDAY,false);
        pensionFoundation.setWorkingDays(DayOfWeek.TUESDAY,false);
        pensionFoundation.setWorkingDays(DayOfWeek.WEDNESDAY,false);
        pensionFoundation.setWorkingDays(DayOfWeek.THURSDAY,false);
        pensionFoundation.setWorkingDays(DayOfWeek.FRIDAY,true);
        pensionFoundation.setWorkingDays(DayOfWeek.SATURDAY,true);

        double basePension = 1000.0;
        double totalPension = pensionFoundation.calculatePension(basePension);

        System.out.println("Base pension : " + basePension);
        System.out.println("Available pension today  : " + totalPension);
    }
}

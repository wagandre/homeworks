/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro.pensionFoundation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PensionFoundation {
    private Map<DayOfWeek, Boolean> workingDays;

    public PensionFoundation() {
        this.workingDays = new HashMap<>();
        initializeWorkingDays();
    }

    private void initializeWorkingDays() {
        for (DayOfWeek day : DayOfWeek.values()) {
            workingDays.put(day, true);
        }
    }

    public void setWorkingDays(DayOfWeek dayOfWeek, boolean isWorking) {

        workingDays.put(dayOfWeek, isWorking);
    }

    public double calculatePension(double basePension) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek currentDay = currentDate.getDayOfWeek();

        if (!workingDays.getOrDefault(currentDay, false)) {
            System.out.println("Pension Foundation don't work today. Pension = 0");
            return 0.0;
        }
        return basePension;
    }
}
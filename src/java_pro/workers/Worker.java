/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro.workers;

import java_pro.workers.Profession;

import java.util.EnumSet;
import java.util.Set;

public class Worker {
    private Set<Profession> professions;

    public Worker() {
        this.professions = EnumSet.noneOf(Profession.class);
    }

    public void addProfession(Profession profession) {
        professions.add(profession);
    }

    public double calculatePension(double basePension) {
        int numberOfProfessions = professions.size();
        double bonus = (double) (numberOfProfessions / 3) + 0.05;
        double totalPension = basePension + (basePension * bonus);
        return totalPension;
    }
}

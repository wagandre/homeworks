/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.addProfession(Profession.DRIVER);

        double basePension = 1000.0;
        double totalPension = worker.calculatePension(basePension);

        System.out.println("Base pension for all workers : " + basePension);
        System.out.println("Total pension with bonus for all workers : " + totalPension);
    }
}

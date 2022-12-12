import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("Lekarstvo1", 3, 12, "02/12/2000");
        Pharmacy pharmacy2 = new Pharmacy("Lekarstvo2", 4, 20, "03/18/2003");
        Pharmacy pharmacy3 = new Pharmacy("Lekarstvo3", 5, 60, "04/05/2022");
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        printPharmacyWithLowerPriceThanFive(pharmacies);
    }

    private static void printPharmacyWithLowerPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for (Pharmacy p : pharmacies) {

            if(p.price > 5) {
                newPharmacies.add(p);
            }

        }

        for (Pharmacy p : newPharmacies) {

            System.out.println(p.toString());
        }

    }
}
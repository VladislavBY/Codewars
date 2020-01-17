package by.popkov;

//        In a small town the population is p0 = 1000 at the beginning of a year.
//        The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
//        How many years does the town need to see its population greater or equal to p = 1200 inhabitants?

public class GrowthPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        double pStart = p0;
        int year = 0;
        while (pStart < p) {
            pStart = (pStart * ((100 + percent) / 100)) + aug;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
}

package by.bsu2.enummap;
import java.util.EnumMap;

public class MapDemo {
    public static void main(String[] args) {
        EnumMap<Country, Integer> population1900 = new EnumMap<>(Country.class);
        population1900.put(Country.FRANCE, 6_000_000);
        population1900.put(Country.SWEDEN, 1_000_000);
        EnumMap<Country, Integer> population2016 = new EnumMap<>(Country.class);
        population2016.put(Country.UKRAINE, 42_600_000);
        population2016.put(Country.LIETUVA, 2_800_000);
        population2016.put(Country.BELARUS, 9_800_000);
        population2016.put(Country.SWEDEN, 8_500_000);
    }
}

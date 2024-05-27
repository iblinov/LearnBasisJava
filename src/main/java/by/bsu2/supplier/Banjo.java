package by.bsu2.supplier;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Created by VKI on 15.01.2018.
 */
public class Banjo {

    private final int numberOfStrings;
    private final boolean isMediator;

    private static final WeakHashMap<Banjo, WeakReference<Banjo>> flyweightData =
            new WeakHashMap<>();
    
    private Banjo(int numberOfStrings, boolean isMediator) {

        this.numberOfStrings = numberOfStrings;
        this.isMediator = isMediator;
    }

    public static Banjo create(int numberOfStrings, boolean isMediator) {

        Banjo banjo = new Banjo(numberOfStrings, isMediator);
        if (!flyweightData.containsKey(banjo)) {
            flyweightData.put(banjo, new WeakReference<>(banjo));
            System.out.println("New " + Banjo.class.getName() + " created");
        }

        return flyweightData.get(banjo).get();
    }

}

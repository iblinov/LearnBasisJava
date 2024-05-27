package by.bsu2.supplier;

import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Supplier;


/**
 * Created by VKI on 07.01.2018.
 */
public class InstrumentFactory {

    final static EnumMap<InstrumentType, Supplier<StringInstrument>> map = new EnumMap<>(InstrumentType.class);

    static {

        map.put(InstrumentType.ELECTRIC_GUITAR, ElectricGuitar::new);
        map.put(InstrumentType.BASS_GUITAR, BassGuitar::new);
        map.put(InstrumentType.BALALAIKA, Balalaika::new);
    }

    public StringInstrument getStringInstrument(InstrumentType type) {

        Supplier<StringInstrument> instrumentSupplier = map.get(type);

        if (instrumentSupplier != null) {
            return instrumentSupplier.get();
        }
        throw new IllegalArgumentException("No such instrument " + type);
    }
}

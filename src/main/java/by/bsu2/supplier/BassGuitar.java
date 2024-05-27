package by.bsu2.supplier;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Created by VKI on 07.01.2018.
 */
public class BassGuitar extends SimpleStringInstrument {

    private boolean isFourStrings;

    public BassGuitar() {

        this.numberOfStrings = 4;
        this.mensurLength = 86.36;
        this.isFourStrings = true;

    }

    public BassGuitar(int numberOfStrings, double mensurLength) {

        this.numberOfStrings = numberOfStrings;
        this.mensurLength = mensurLength;

        isFourStrings = (numberOfStrings == 4) ? true : false;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof BassGuitar) {

            if (obj == this) {

                return true;
            }

            BassGuitar otherBass = (BassGuitar) obj;

            if (otherBass.numberOfStrings == numberOfStrings &&
                    Math.abs(otherBass.mensurLength - mensurLength) <= 0.0001 &&
                    otherBass.isFourStrings == isFourStrings) {

                return true;
            }
        }

        return false;
    }

}

package by.bsu2.forksimple;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ihar_Blinou on 5/22/2015.
 */
public class NodeImpl  {
    private ArrayList<NodeImpl> list = new ArrayList<>();
    private long value = 2;

    public ArrayList<NodeImpl> getChildren() {
        return list;
    }


    public long getValue() {
        return value;
    }
}

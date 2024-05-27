package by.bsu2.fork2;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Ihar_Blinou on 5/22/2015.
 */
public class Node {

    private volatile long val;
    private CopyOnWriteArrayList<Node> nodes = new CopyOnWriteArrayList<Node>();

    Node(long val) {
        this.val = val;
    }

    public Collection<Node> getChildren() {
        return nodes;
    }

    public long getValue() {
        return val;
    }

    void setNodes(CopyOnWriteArrayList<Node> nodes) {
        this.nodes = nodes;
    }
}
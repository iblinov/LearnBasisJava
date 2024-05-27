package by.bsu2.java8.copyonwritearray;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

class Publisher {

    private CopyOnWriteArraySet<SubScriber> setOfSubs = new CopyOnWriteArraySet<>();

    public void addSubscriber(SubScriber sub) {
        //System.out.println("add");
        setOfSubs.add(sub);
    }

    public void notifySubs(String score) {
        Iterator<SubScriber>  itr = setOfSubs.iterator();
        while (itr.hasNext()) {
            SubScriber sub =  itr.next();
            sub.receive(score);

        }
    }
}

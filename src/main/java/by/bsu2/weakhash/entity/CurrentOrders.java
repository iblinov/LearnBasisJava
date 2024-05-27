package by.bsu2.weakhash.entity;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class CurrentOrders {
    private WeakHashMap<Key, Order> orders = new WeakHashMap<>();

    public Order remove(Object key) {
        return orders.remove(key);
    }

    public Order put(Key key, Order value) {
        return orders.put(key, value);
    }

    public Order get(Object key) {
        return orders.get(key);
    }

    public int size() {
        return orders.size();
    }
    public Set<Map.Entry<Key, Order>> entrySet() {
        return orders.entrySet();
    }
	@Override
	public String toString() {
		return "WeakOrders [orders=" + orders + "]";
	}
}

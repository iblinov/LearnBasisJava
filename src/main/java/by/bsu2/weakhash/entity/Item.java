package by.bsu2.weakhash.entity;

public class Item {
    private int itemId;
    private float price;
    private String name;

    public Item() {
    }

    public Item(int itemId, float price, String name) {
        super();
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }
    public int getItemId() {
        return itemId;
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", name=" + name
				+ "]";
	}
    
    

}

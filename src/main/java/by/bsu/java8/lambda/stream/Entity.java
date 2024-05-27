package by.bsu.java8.lambda.stream;

public class Entity {
    private int entityId;
    private float weight;
    private String name;
    public Entity(int entityId, float weight, String name) {
        this.entityId = entityId;
        this.weight = weight;
        this.name = name;
    }
    public int getEntityId () {
        return entityId;
    }
    public float getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "[entityId =" + entityId + ", weight=" + weight + ", name=" + name + "]\n";
    }
}

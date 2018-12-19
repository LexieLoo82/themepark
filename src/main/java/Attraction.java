public abstract class Attraction {
    private String name;
    private int capacity;

    public Attraction(String name, int capacity){
        this.capacity = capacity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

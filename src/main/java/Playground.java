public class Playground extends Attraction implements ISecurity{

    public Playground(String name, int capacity) {
        super(name, capacity);
    }

    public Boolean isAllowedToVisit(Visitor visitor){
        if (visitor.getAge() > 15){
            return true;
        }
        return false;
    }

}

public class CandyflossStall extends Stall implements ISecurity {

    public CandyflossStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }


    public Boolean isAllowedToVisit(Visitor visitor){
        if (visitor.getAge() > 5){
            return true;
        }
       return false;
    }



}

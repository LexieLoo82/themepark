public class RollerCoaster extends Attraction implements ISecurity {

   public RollerCoaster(String name, int capacity){
       super(name, capacity);
   }


   public Boolean isAllowedToVisit(Visitor visitor){
       if (visitor.getHeight() > 145 && visitor.getAge() >12){
           return true;
       }
       return false;
   }



}

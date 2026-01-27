import java.util.Scanner;

public class Main {

  public static void main() {
    Scanner sc = new Scanner(System.in);
    Property p1 = new apartment("Luxury Apartment", "Center", 500000, 7, 7);
    Property p2 = new villa("Beachfront Villa", "Ocean view", 1500000, true,4 , 15);
    Property p3 = new villa("Miami Villa", "Beateful city view", 750000, false,3 , 12);

    dbms.deleteProperty(1);
    dbms.deleteProperty(2);
    dbms.deleteProperty(3);

    System.out.println();
    Property[] realtors_property = {p1,p2,p3};
    for(int n=1; n < realtors_property.length; n++){
      Property current = realtors_property[n];
      String name = current.getName();
      String type = current.getDescription();
      int floor = current.getFloor();
      int price = current.getPrice();
      boolean pool = current.getPool();
      int roomQty = current.getRoomQty();
      dbms.addProperty(n,name,type,floor,price,pool,roomQty);
    }

    dbms.readProperty(1);
    dbms.readProperty(2);
    dbms.readProperty(3);
  }
}
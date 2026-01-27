import java.util.Scanner;

public class Main {

  public static void main() {
    Scanner sc = new Scanner(System.in);
    Property p1 = new apartment("Luxury Apartment", "Center", 500000, 7, 7);
    Property p2 = new villa("Beachfront Villa", "Ocean view", 1500000, true,4 , 15);
    Property p3 = new villa("Miami Villa", "Beateful city view", 750000, false,3 , 12);

    for(int i = 0; i<dbms.getMaxId(); i++){
      dbms.deleteProperty(i+1);
    }
    System.out.println();

    Property[] realtors_property = {p1,p2,p3};
    for(int n=1; n < realtors_property.length+1; n++){
      Property current = realtors_property[n-1];
      dbms.addProperty(n, current.getName(), current.getDescription(), current.getFloor(), current.getPrice(), current.getPool(), current.getRoomQty());
    }

    System.out.println();
    for(int i = 0; i<dbms.getMaxId(); i++){
        dbms.readProperty(i+1);
        System.out.println();
    }
  }
}
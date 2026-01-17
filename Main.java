import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Property p1 = new apartment("Luxury Apartment", "Center", 500000, 7);
    Property p2 = new villa("Beachfront Villa", "Ocean view", 1500000, true);
    Property p3 = new villa("Miami Villa", "Beateful city view", 750000, false);

    dbms.addProperty(1, "miami villa", "villa", 3, 1500000, true, 32);
    dbms.addRealtor(1,"Aiden Brooks", "Pinnacle Property Group", "Maiami villa, Manhattan penthouse");

    Property[] realtors_properety = {p1,p2,p3};
    int n = 0;
    while(true){
      realtors_properety[n].printInfo();
      System.out.println("back, leaving or next?");
      String ans = sc.nextLine().trim();

      if(ans.equalsIgnoreCase("next")){
        n++;
      } else if (ans.equalsIgnoreCase("back")) {
        n--;
      } else if  (ans.equalsIgnoreCase("leave")) {
        sc.close();
        break;
      }

      if ( n==3 ) {
        n=0;
      } else if ( n==-1 ) {
        n=2;
      }
    }
  }
}
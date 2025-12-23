public class Main {
  public static void main(String[] args) {
    Property property1 = new Property("Luxury Apartment", "3 Bedroom apartment in city center", 500000, "Apartment");
    Property property2 = new Property("Beachfront Villa", "Luxury villa with ocean view", 1500000, "Villa");

    Property[] realtorProperties = {property1, property2};

    Realtor realtor1 = new Realtor("John Doe", "Elite Realty", realtorProperties);


    Realtor[] agencyRealtors = {realtor1};
    RealEstateAgency agency = new RealEstateAgency("Elite Realty Group", agencyRealtors);

    agency.printInfo();
  }
}
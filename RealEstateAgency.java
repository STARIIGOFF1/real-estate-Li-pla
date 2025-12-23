public class RealEstateAgency {
    private String agencyName;
    private Realtor[] realtors;

    public RealEstateAgency(String agencyName, Realtor[] realtors) {
        this.agencyName = agencyName;
        this.realtors = realtors;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Realtor[] getRealtors() {
        return realtors;
    }

    public void setRealtors(Realtor[] realtors) {
        this.realtors = realtors;
    }

    public void printInfo() {
        System.out.println("Agency: " + agencyName);
        for (Realtor realtor : realtors) {
            realtor.printInfo();
        }
    }
}
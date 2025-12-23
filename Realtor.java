public class Realtor {
    private String realtor_name;
    private String agencyName;
    private Property[] properties;

    public Realtor(String realtor_name, String agencyName, Property[] properties) {
        this.realtor_name = realtor_name;
        this.agencyName = agencyName;
        this.properties = properties;
    }

    public String getRealtor_name() {
        return realtor_name;
    }

    public void setRealtor_name(String realtor_name) {
        this.realtor_name = realtor_name;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    public void printInfo() {
        System.out.println("Realtor: " + realtor_name);
        System.out.println("Agency: " + agencyName);
        System.out.println("Properties:");
        for (Property property : properties) {
            property.printInfo();
        }
    }
}
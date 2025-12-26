public abstract class Property {
    private String name;
    private String description;
    private double price;

    public Property(String name, String description, double price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("name is empty");
        }
            this.name = name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("price should be more than 0");
        }
        this.price = price;
    }

    public abstract String getType();

    public void printInfo() {
        System.out.println("Property Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + getType());
    }
}
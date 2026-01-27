public abstract class Property {
    private String name;
    public int floor;
    private String description;
    private int price;
    private int roomQty;

    public Property(String name, String description, int price, int floor, int roomQty) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setRoomQty(roomQty);
        setFloor(floor);
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public int getFloor(){
        return floor;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public abstract boolean getPool();

    public void setRoomQty(int roomQty){
        this.roomQty=roomQty;
    }

    public int getRoomQty(){
        return roomQty;
    }
}
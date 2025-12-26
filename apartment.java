public class apartment extends Property{
    private int floor;

    public apartment(String name, String description, double price, int floor) {
        super(name, description, price);
        setFloor(floor);
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public int getFloor(){
        return floor;
    }

    @Override
    public String getType(){
        return "Apartment";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Floor: " + floor);
    }
}
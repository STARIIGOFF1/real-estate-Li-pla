public class apartment extends Property{
    private boolean pool;

    public apartment(String name, String description, int price, int floor, int roomQty) {
        super(name, description, price, floor, roomQty);
        setPool(pool);
    }

    public void setPool(boolean pool){
        this.pool = pool;
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

    @Override
    public boolean getPool(){
        return pool;
    };
}
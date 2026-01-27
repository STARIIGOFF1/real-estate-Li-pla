public class villa extends Property{
    private boolean pool;

    public villa (String name, String discription, int price, boolean pool, int floor, int roomQty){
        super(name, discription, price, floor, roomQty);
        setPool(pool);
    }

    @Override
    public boolean getPool(){
        return pool;
    }

    public void setPool(boolean pool){
        this.pool= pool;
    }

    @Override
    public String getType(){
        return "Villa";
    }

    @Override
    public void printInfo(){
         super.printInfo();
         if (pool){
             System.out.println("Pool: Does have pool");
         }else{
             System.out.println("Pool: Does not have pool");
         }
    }
}
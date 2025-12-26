public class villa extends Property{
    private boolean hasPool;

    public villa (String name, String discription, double price, boolean hasPool){
        super(name, discription, price);
        this.hasPool=hasPool;
    }

    public boolean isHasPool(){
        return hasPool;
    }

    public void setHasPool(boolean hasPool){
        this.hasPool=hasPool;
    }

    @Override
    public String getType(){
        return "Villa";
    }
    @Override
    public void printInfo(){
         super.printInfo();
         if (hasPool){
             System.out.println("Pool: Does have pool");
         }else{
             System.out.println("Pool: Does not have pool");
         }
    }
}
public class BubbleTea {
    public String Flavor;
    public double size;
    public double isDairy;
    public boolean sweetness;


    public void describeBubbleTea(){
        System.out.println("This flavor is " + Flavor + " The size is " + size + " with this much dairy " + isDairy
                + " is it sweet " + sweetness);

    }
    public BubbleTea( String pFlavor, double pSize, double pIsDairy,  boolean pSweetness){
        Flavor= pFlavor;
        size= pSize;
        isDairy= pIsDairy;
        sweetness= pSweetness;



    }
}

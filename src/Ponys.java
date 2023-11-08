public class Ponys {
    //true/false=boolean
    //numbers= int  double= decimal
    //words= String


    public void describePony() {
        System.out.println("this si a pony" + name + "they are the color" + color + "with a size of" + size + "it is" + isUnicorn + "that the pony is a unicorn. It is" +isPegasus + "That the pony is a pegasus");
    }


 public boolean isUnicorn;

 public boolean isPegasus;
 public double size;
 public String name;
 public String color;


 public Ponys(boolean pIsUnicorn, boolean pIsPegasus, double pSize, String pName){
     isUnicorn = pIsUnicorn;
     isPegasus = pIsPegasus;
     size = pSize;
     name = pName;
     color = "blue";
     //f(color.equals("pink"));
     System.out.println();
 }
 }




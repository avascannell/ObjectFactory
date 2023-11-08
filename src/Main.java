public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ponys p = new Ponys(true, false, 15, "AppleJack");
        System.out.println(p.isUnicorn);
        p.isUnicorn = true;
        System.out.println(p.isUnicorn);
        p.describePony();
        Ponys a;
        a = new Ponys(true, false, 20, "ShutterFly");

        BubbleTea f;
        f = new BubbleTea("mango", 10, 5, true);
        f.describeBubbleTea();

    }

}
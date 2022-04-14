package Week08;

public class Test {
    public static void main(String[] args){
        Printer p = new Printer();
        ColorInkbox c = new ColorInkbox();
        A4Paper a4 = new A4Paper();
        p.print(c,a4);
        GrayInkBox g = new GrayInkBox();
        B5paper b5 = new B5paper();
        p.print(g,b5);
    }
}

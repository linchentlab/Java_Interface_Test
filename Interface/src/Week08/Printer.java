package Week08;

public class Printer {
    public void print(InkBox inkbox,Paper paper){
        System.out.println("使用"+inkbox.getColor()+"墨盒在"+paper.getSize()+"纸上打印");
    }
}

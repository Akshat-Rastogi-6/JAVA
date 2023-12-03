abstract class Box{

    int l, h, w;
    Box(){
        this.l = this.w = this.h = 10;
    }

    abstract void display();

}

class disBox extends Box{
    disBox(){
        super();
    }

    void display(){
        System.out.println("Height: " + this.h);
        System.out.println("Width: " + this.w);
        System.out.println("Length: " + this.l);
    }
} 

public class abs {
    public static void main(String[] args) {
        disBox b = new disBox();

        b.display();
    }
}


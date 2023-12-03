class Box{

    int height, width, length;

    Box(){
        this.height = 0;
        this.width = 0;
        this.length = 0;
    }

    Box(int a){
        this.height = this.length = this.width = a;
    }

    Box(int h, int w, int l){
        this.height = h;
        this.length = l;
        this.width = w;
    }

    void setValue(int h, int w, int l){
        this.height = h;
        this.length = l;
        this.width = w;
    }

    void display(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}

class vol extends Box{
    vol(){
        super(10);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Volume: " + height*length*width);        
    }
}


public class oop {
    public static void main(String[] args) {
        Box b = new Box(10);

        b.display();

        vol b1 = new vol();

        b1.display();
    }
}

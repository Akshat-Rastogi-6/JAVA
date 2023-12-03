class Box{
    double height;
    double depth;
    double width;

    Box(){
        height = width = depth = 0;
    }

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void set(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void display(){
        System.out.println(height);
        System.out.println(width);
        System.out.println(depth);
    }

}

class Volume extends Box{
    Volume(double h, double w, double d){
        super(h,w,d);
    }

    double vol(){
        return height*depth*width;
    }
}

public class uper {
    public static void main(String[] args) {
        Volume v = new Volume(25, 20, 10);
        double vol = v.vol();
        v.display(); 
        System.out.println("Volume is : " + vol);   
    }
}

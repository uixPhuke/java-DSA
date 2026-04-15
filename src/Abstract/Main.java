package Abstract;


abstract class Shape{
    double length,breadth, height;
    Shape(double l,double b,double h){
         this.length=l;
         this.breadth=b;
        this.height=h;
    }
    abstract void volume();
    abstract void surfaceArea();
}
class Cube extends Shape{
    Cube(double length){
        super(length,0,0);
    }

    void volume(){
        //double length=l;
        double result=length*length*length;
        System.out.println("Volume of the Cube: "+result);
    }

    void surfaceArea(){

        double result=6*length*length;
        System.out.println("Volume of the Cube: "+result);
    }

}
public class Main {
    static void main(String[] args) {
        Shape sh=new Cube(5);
        sh.volume();
        sh.surfaceArea();
    }
}

package Contructor;

class Fraction{
    int num;
    int denum;

    Fraction(){
        num=0;
        denum=0;
    }
    Fraction(int n,int d){
        num=n;
        denum=d;
    }
    Fraction(Fraction f){
        num=f.num;
        denum=f.denum;
    }
    void show(){
        System.out.println(num+"/"+denum);
    }
    Fraction add(Fraction f){
        Fraction temp = new Fraction();
        temp.num=(num*f.denum)+(f.num*denum);
        temp.denum=denum* f.denum;
        return temp;
    }
    Fraction subtract(Fraction f){
        Fraction temp1=new Fraction();
        temp1.num=(num*f.denum)-(f.num*denum);
        temp1.denum=denum* f.denum;
        return temp1;
    }
    Fraction Multiply(Fraction f){
        Fraction temp2=new Fraction();
        temp2.num=num*f.denum;
        temp2.denum=f.num*denum;
        return temp2;
    }
    Fraction Division(Fraction f){
        Fraction temp3=new Fraction();
        temp3.num=num* f.denum;
        temp3.denum=f.num*denum;
        return temp3;
    }
}
class FractionDE{
    static void main(String[] args) {
        Fraction s=new Fraction();
        Fraction s1=new Fraction(5,4);
        Fraction s2=new Fraction(6,5);

        Fraction add=s1.add(s2);
        System.out.println("Addition:");
        add.show();

        Fraction sub=s1.subtract(s2);
        System.out.println("Subtraction");
        sub.show();

        Fraction mul = s1.Multiply(s2);
        System.out.println("Multiplication");
        mul.show();

        Fraction div=s1.Division(s2);
        System.out.println("Division:");
        div.show();
    }
}
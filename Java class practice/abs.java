class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    abstract double calcArea();
    
}
class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    double calcArea(){
        return 3.14*radius*radius;
    }
}
class abs{
public static void  main(String [] args){
        Circle c1=new Circle("Red",3.2);
        System.out.println(c1.color);
        System.out.println(c1.radius);
        System.out.println(c1.calcArea());

    }
    
}

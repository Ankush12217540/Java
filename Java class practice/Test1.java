class Box{
    double length,width,height;
    Box(){
        length=width=height=2;
    }
    Box(double l,double w,double h){
        this.length=l;
        this.width=w;
        this.height=h;
    }
    Box(double l){
         length=width=height=l;
    }

    public void volume(){
        System.out.println(length*width*height);
    }
}
 class Test1 {
    public static void main(String[] args){
        Box b1=new Box();
        Box b2=new Box(5);
        Box b3=new Box(1,6,7);
        b1.volume();
        b2.volume();
        b3.volume();
}
}

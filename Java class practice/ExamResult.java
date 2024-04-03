import java.util.Scanner;
class Student{
    String name;
    int id;
    void setData(String name,int id){
        this.name=name;
        this.id=id;

    }
void displayData(){
    System.out.println(name);
    System.out.println(id);;
}
}

class Marks extends Student{
    float m1,m2,m3;
    void setMarks(float m1,float m2,float m3){
        this.m1=m1;
        this.m2=m2;
        this.m2=m2;
    }
    void displayMarks(){
        displayData();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
class Result extends Marks{
    float total,avg;
    void compute(){
        total=m1+m2+m3;
        avg=total/3;
    }
    void show(){
        displayMarks();
        System.out.println(total);
        System.out.println(avg);
    }
}

public class ExamResult {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Result s1= new Result();

        
    }
}

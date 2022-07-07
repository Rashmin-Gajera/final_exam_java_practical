
class rectangle{

double height;
double width;
double c_x, x_left, x_right;
double c_y, y_up, y_down;

double getArea(){
return height*width;
}

double getPerimeter(){
return (2*(height+width));
}


void contains(int p_x, int p_y){

x_left=(c_x-(width/2));
x_right=(c_x+(width/2));
y_up=(c_x+(height/2));
y_down=(c_x-(height/2));

if((p_x>x_left && p_x<x_right) &&(p_y< y_up && p_y> y_down )){

System.out.println("The Rectangle contains Point("+p_x+","+p_y+") Inside it's Area");

}else
{

System.out.println("Point("+p_x+","+p_y+") outside of rectengle");

}

}

rectangle(){
c_x=c_y=0;
height=width=1;
}

rectangle (double h, double w, double x, double y){
this.height=h;
this.width=w;
this.c_x= x;
this.c_y=y;
}


}


public class First{

public static void main(String Arg[]){


//initalize object
rectangle r1= new rectangle();
rectangle r2= new rectangle(5,7,1,2);

//area method
System.out.println("Area Of Rectangle r1 is "+ r1.getArea());
System.out.println("Area Of Rectangle r2 is "+ r2.getArea());



//periMeter method

System.out.println("Perimeter Of Rectangle r1 is "+ r1.getPerimeter());
System.out.println("Perimeter Of Rectangle r2 is "+ r2.getPerimeter());


//find point reside rectangle
r1.contains(12,3);
r2.contains(1,0);
}
}



public class fibonacy {

public static void main(String arg[]) {
    
int a=1,b=1,c=0;
int l= Integer.parseInt(arg[0]);

System.out.println("Your Fibonacy Series:");
System.out.print(a+"  "+b+"  ");

for (int i = 2; i <l; i++) {
c=a+b;    
System.out.print(c+"  ");
   a=b;
   b=c;    

}

}


}
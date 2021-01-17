public class ThisKeyword
{

private int x = 10; 

private static int y = 0;

public void printX(){

int x = 5; 

System.out.println(x);

}

public void setX(){

this.x = x;

System.out.println(x);


}

public void resetY(){

int y = 0;

this.y = y;


}


public static void main (String[] args)
   {
   
   ThisKeyword u = new ThisKeyword ();
   
   u.printX();
   u.setX();
   
   //System.out.println(u.printX());

   
   }


}


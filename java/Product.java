import java.util.Scanner;
public class Product{

    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
   

    System.out.print("Enter the first number: ");

    int num1=sc.nextInt();
    

    System.out.print("Enter the second number: ");

    int num2=sc.nextInt();
    
    System.out.print("Enter the Third number: ");

    int num3=sc.nextInt();

    sc.close();

int Product=calcProduct(num1,num2,num3); 
System.out.println("product of three numbers  "+Product);
}

    public static int calcProduct(int x,int y,int z){
    int result=x*y*z;
    return result;


    }
}
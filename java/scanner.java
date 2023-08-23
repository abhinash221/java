import java.util.Scanner;
class scanner {

    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter marks of four subject:");
        // String input
        
        // Numerical input
        int m1 = myObj.nextInt();
        int m2 = myObj.nextInt();
        int m3 = myObj.nextInt();
        int m4 = myObj.nextInt();
        int total = m1+m2+m3+m4;
        int percentage = total/4;

        if (percentage >= 70) {
            System.out.println("First class");
        }

        else if (percentage >59) {
            System.out.println("Upper second class");
        }
        else if (percentage >49) {
            System.out.println("Second Class");
        }
        
        else{
            System.out.println("Failed");
        }

    
        // Output input by user
        System.out.println("Total: "+ total);
        System.out.println("Percentage: "+ percentage);

        
    }
}
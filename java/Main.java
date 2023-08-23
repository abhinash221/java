//  first video ko
//Just to know about printing statements in JAVA
//public class Main {
// this is a comment bitchhh
    /* This is also a comment bitchh */

//     public static void main(String[] args) {
//         System.out.println("My name is Aayushman");
// another way of printing in different line
//         System.out.print("Hello world\n");
//         System.out.println("My name is Aayushman");
//         System.out.println("hello from the other side ");

//    }

// }


//Second one
//DATA TYPES
//public class Main{
//    public static void main(String[] args) {
//        int x = 123;
//        char symbol = '@';
//        boolean y = true;
//        double  z = 1.3456789;
//        String name = "Aayushman";
//
//        System.out.println(x);
//        System.out.println(symbol);
//        System.out.println("My name is: "+name);
//        System.out.println(y);
//        System.out.println(z);
//
//    }
//}

//THIRD ONE
//SWAPPING VARIABLES
// NULL means nothing "null = empty"
//public class Main{
//    public static void main(String[] args) {
//        String x = "Aayushman";
//        String y = "Shrestha";
//        String temp = null;
//        temp = x;
//        x = y;
//        y = temp;
//        System.out.println("x is: "+x);
//        System.out.println("y is: "+y);
//
//    }
//}





//ACCEPTING USER INPUT IN JAVA
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("What is your age? ");
//        int age = scanner.nextInt();
////because there's "nextInt" the compiler will leave /n at the end  so in order to make it work we add "scanner.nextline()"
//        scanner.nextLine();
//        System.out.println("Your favourite food is?");
//        String food = scanner.nextLine();
//
//
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("Your favourite food is "+food);
//
//
//    }
//}





//EXPRESSIONS IN JAVA(sit back an relaxxx)
//class Main{
//    public static void main(String[] args){
//
//        int x = 56;
//        x = x + 1;
////or
//        x++;
////or
//        x--;
//
//        System.out.println(x);
//
//    }
//}

//Normal GUI
//import javax.swing.JOptionPane;
//
//
//class Main{
//    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Enter your name:");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//
//        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
//        JOptionPane.showMessageDialog(null, "Your age is "+age+" years old");
//
//        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
//        JOptionPane.showMessageDialog(null, "Your height is "+height+" feet");
//    }
//}


//math function
//class Main{
//    public static void main(String[] args) {
//        Double x = 3.14215;
//        Double y = 3.14214;
//        Double d = -10.141;
//        Double f = 16.0;
//
//        Double z = Math.max(x, y);
//        Double c = Math.min(x, z);
//        Double e = Math.abs(d);
//        Double i = Math.sqrt(f);
//        long s = Math.round(y);
//
//
//        System.out.println(z);
//        System.out.println(c);
//        System.out.println(e);
//        System.out.println(i);
//        System.out.println(s);
//    }
//}








//to find hypotenuse by taking user input
//import java.util.Scanner;
//class Main{
//    public static void main(String[] args) {
//        Double x;
//        Double y;
//        Double z;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("perpendicular: ");
//        x = scanner.nextDouble();
//
//        System.out.println("Base:");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x*x+y*y));
//        System.out.println("The hypotenuse is "+z+ " cm");
//        //Not necessary to close scanner but it’s a good practice to do it
//        scanner.close();
//
//    }
//}

// Random numbers in Java
//import java.util.Random;
//class Main{
//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        int x = random.nextInt(6)+1;
//        System.out.println(x);
//
//        Double y = random.nextDouble();
//        System.out.println(y);
//
//        Boolean z = random.nextBoolean();
//        System.out.println(z);
//
//
//    }
//}


//conditional statements in JAVA

//import java.util.Scanner;
//        import javax.swing.JOptionPane;
//public class Main{
//    public static void main(String[] args) {
//
//        int x =Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
//
//        if(x>=60) {
//            JOptionPane.showMessageDialog(null, "You're an old man");
//
//        }
//
//        else if(x>=18) {
//            JOptionPane.showMessageDialog(null, "You're an adult");
//
//        }
//
//
//
//        else {
//            JOptionPane.showMessageDialog(null, "You're a fooking child");
//        }
//
//
//
//
//    }
//}
//






// switch statements(use this  instead of if statements if there are many conditions)

//public class Main{
//    public static void main(String[] args) {
//
//        String day = "jkasbdj";
//
//        switch(day) {
//
//            case "Sunday" : System.out.println("It is sunday!");
//                break;
//            case "Monday" : System.out.println("It is monnday!");
//                break;
//            case "Tuesday" : System.out.println("It is tuesday!");
//                break;
//            case "Thursday" : System.out.println("It is thursday!");
//                break;
//            case "Wednesday" : System.out.println("It is wednesday!");
//                break;
//            case "Friday" : System.out.println("It is friday!");
//                break;
//            case "Saturday" : System.out.println("It is saturday!");
//                break;
//            default:System.out.println("That is not a day!!");
//        }
//
//    }
//}










//LOGICAL OPERATORS
//AND OPERATOR
//public class Main{
//    public static void main(String[] args) {
//        int temp = 28;
//        if(temp>=30) {
//            System.out.println("It is hot outside!!");
//        }
//        //USING AND LOGICAL OPERATOR
//        else if(temp>=20 && temp<=30) {
//            System.out.println("It is warm outside!!");
//        }
//        else {
//            System.out.println("It is cold outside!!");
//        }
//
//    }
//
//
//}

//OR OPERATOR
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game!! press q or Q to quit the game!");
//        String response = scanner.next();
//
//        //Using OR logical operator
//        if(response.equals("Q") || response.equals("q")) {
//            System.out.println("****You quit the game ****");
//        }
//
//        else {
//            System.out.println("You are still in the game!!");
//        }
//    }
//}

//NOT OPERATOR
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game!! press q or Q to quit the game!");
//        String response = scanner.next();
//
//        //Using NOT logical operator
//        if(!response.equals("Q") && !response.equals("q")) {
//            System.out.println("You are still in the game!!");
//
//        }
//
//        else {
//            System.out.println("****You quit the game ****");
//
//        }
//
//
//
//    }
//}
//LOOPS IN JAVA
//WHILE LOOPS
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        //USING WHILE LOOPS
//        while(name.isBlank()) {
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("HELLO "+name);
//    }
//}
//FOR LOOPS
//public class Main{
//    public static void main(String[] args) {
//        //increase the loop
//        for(int i=1;i<=10;i++) {
//            System.out.println(i);
//        }
//        //decrease the loop
//        for(int z=10;z>=0;z--) {
//            System.out.println(z);
//        }
//    }
//}
//NESTED LOOPS  IN JAVA
//public class Main{
//    public static void main(String[] args) {
//        int row;
//        int column;
//        String symbol = "";
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of rows: ");
//        row = scanner.nextInt();
//
//        System.out.println("Enter the number of  column: ");
//        column = scanner.nextInt();
//
//        System.out.println("Enter the symbol: ");
//        symbol = scanner.next();
//
//        for(int i=1;i<=row;i++) {
//            System.out.println();
//            for(int j=1;j<=column;j++) {
//                System.out.print(symbol);
//            }
//        }
//
//
//    }
//
//}
//ARRAYS IN JAVA
//package com.company;
//public class Main{
//    public static void main(String[] args) {
//        //ARRAY IS USED TO STORE MULTIPLE VALUE IN A SINGLE VARIABLE
//        String[] car = {"BMW", "Honda", "Ford"};
//        System.out.println(car[1]);
//
//        //another way of using it
//        String[] bike = new String[2];
//        bike[0] = "honda";
//        bike[1] = "abcdef";
//        System.out.println(bike[0]);
//        //USING LOOP TO PRINT ALL THE CAR NAMES
//        for(int i=0;i<car.length;i++) {
//
//            System.out.println(car[i]);
//        }
//
//    }
//}




////2D ARRAYS
//public class Main{
//    public static void main(String[] args) {
//        //2d array= an array of arrays
//        String[][] cars = new String[3][3];
//        cars[0][0] = "asdas";
//        cars[0][1] = "wdwq";
//        cars[0][2] = "sdasd";
//        cars[1][0] = "efwf";
//        cars[1][1] = "cvxcv";
//        cars[1][2] = "asdas";
//        cars[2][0] = "asdqweqwas";
//        cars[2][1] = "opuiu";
//        cars[2][2] = "asasdasdas";
//
//        //OR WE CAN JUST DO THIS
//        //Just for an example
//        String[][] bikes = {  {"asdasd","asdac","ascae"},
//                              {"sdad","ada","Adaasd"},
//                              {"Asda","wqeq","qwerty"}
//        };
//
//
//        System.out.println(cars);
//
//        for(int i=0;i<cars.length;i++) {
//            System.out.println();
//            for(int j=0;j<cars[i].length;j++) {
//                System.out.print(cars[i][j]+" ");
//            }
//        }
//
//
//
//
//    }
//}

//STRING METHODS
//package com.company;
//public class Main{
//    public static void main(String[] args) {
//
//        String name = "Aayush";
//        boolean result = name.equals("Aayush");
//        System.out.println(result);
//
//        //To remove case sensitivity
//        String hello = "Shrestha";
//        boolean out = hello.equalsIgnoreCase("sHreStHa");
//        System.out.println(out);
//
//        //Length method
//        String i = "hello";
//        int x = i.length();
//        System.out.println(x);
//
//        //To find the char
//        String k = "Aayushmanshrestha";
//        char l = k.charAt(5);
//        System.out.println(l);
//
//        //To find the index
//        String acer = "microsoft";
//        int hyalo = acer.indexOf("t");
//        System.out.println(hyalo);
//
//        //TO check if the variable is empty
//        String dell = "";
//        boolean hp = dell.isEmpty();
//        System.out.println(hp);
//
//        //To convert the string to uppercase
//        String apple = "android";
//        String ball = apple.toUpperCase();
//        System.out.println(ball);
//
//
//        //To convert the string to lowercase
//        String banana = "CAR";
//        String car = banana.toLowerCase();
//        System.out.println(car);
//
//        //To remove the empty spaces in the string
//        String dog = "   husky     ";
//        String mobile = dog.trim();
//        System.out.println(mobile);
//
//        //REPLACE method
//        String cat = "mousee";
//        String biralo = cat.replace("m","n");
//        System.out.println(biralo);
//
//
//    }
//
//}



////ARRAY LIST
//package com.company;
//import java.util.ArrayList;
//public class Main{
//    public static void main(String[] args) {
//
//        ArrayList<String> cars = new ArrayList<String>();
//
//        //ADDS ITEMS IN THE EMPTY ARRAY LIST
//        cars.add("porsche");
//        cars.add("Hyundai");
//        cars.add("BMW");
//        cars.add("TATA");
//
//        //EDITING THE ARRAY LIST
//        cars.set(1, "Mercedes");
//        cars.remove(3);
//
//        //TO CLEAR THE ARRAY LIST
//        //cars.clear();
//
//        //PRINTING THE ITEMS IN THE ARRAY LIST
//        for(int i=0;i<cars.size();i++) {
//
//            System.out.println(cars.get(i));
//
//        }
//
//    }


////2D ARRAYLIST
//import java.util.*;
//import java.util.ArrayList;
//public class Main{
//    public static void main(String[] args) {
//        //ARRAY INTO ARRAY
//        ArrayList<ArrayList<String>> groceris = new ArrayList();
//
//        ArrayList<String> fruits = new ArrayList();
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Mango");
//
//        ArrayList<String> vegetables = new ArrayList();
//        vegetables.add("pummpkin");
//        vegetables.add("Mushroom");
//
//        groceris.add(fruits);
//        groceris.add(vegetables);
//
//        System.out.println(groceris);
//
//        for(int i=0;i<groceris.size();i++) {
//            System.out.println(groceris.get(i));
//
//        }
//    }
//}

////for-each loop
//import java.util.ArrayList;
//public class Main{
//    public static void main(String[] args) {
//
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Banana");
//        fruits.add("Apple");
//        fruits.add("Mango");
//
//        //IT IS SIMILAR AS FOR LOOP BUT MUCH EASIER AND SHORTER BUT LESS FLEXIBLE
//        for(String i:fruits) {
//            System.out.println(i);
//        }
//
//
//
//    }
//}
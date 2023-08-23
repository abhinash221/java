package com.dataStructures;

import java.util.Scanner;

public class C32Stack {
    int size;
    int[] arr;
    int top;
    C32Stack(int size){
        this.size = size;
        this.arr = new int[this.size];
        this.top = -1;
        System.out.printf("Stack using array of size %d has been initialized\n ",this.size);
    }

    public void push(int itemToPush){
        if(!isFull()){
            top++;
            arr[top] = itemToPush;

            System.out.println("Item successfully pushed!");
        }else{
            System.out.println("Stack is already full!");
        }
    }

    public void pop(){
        if(!isEmpty()){
            System.out.println("The popped element is: "+arr[top]);
            top--;
        }else{
            System.out.println("Stack is already empty!");
        }
    }

    public boolean isFull(){
        return (top == size-1);
    };

    public boolean isEmpty(){
        return (top==-1);
    };

    public int peek(){
        return arr[top];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the stack you want: ");
        int stSize = in.nextInt();
        C32Stack stack = new C32Stack(stSize);

        int choice = 0;

        do {
            System.out.println("1.Exit");
            System.out.println("2.Pop");
            System.out.println("3.Push");
            System.out.println("4.Peek");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Program ended!");
                case 3 -> {
                    System.out.println("Enter the number to push:");
                    int uChoice = in.nextInt();
                    stack.push(uChoice);
                }
                case 2 -> stack.pop();
                case 4 -> stack.peek();
            }
        }while(choice != 1);




    }


}
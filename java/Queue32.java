public class Queue32 {
    private int size;
    int[] arr;
    static int front,rear,currentsize;
    Queue32(int size){
        this.size=size;
        this.arr=new int[this.size];
        this.front=-1;
        this.rear=-1;
        this.currentsize=0;
        System.out.printf("Queue of size %d has been initialized",this.size);

    }
    public static void variablewatch(){
        System.out.printf("Front:%d\nRear:%d\nCurrent Size:%d\n",front,rear,currentsize);

    }
    public static void main(String[] args){
        Queue32 qu=new Queue32(5);
        variablewatch();

    }
}

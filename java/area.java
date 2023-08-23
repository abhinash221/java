class area{
    public static void main(String[] args){
        double capturedValue=areaofCircle(5.05);
        System.out.println("The area of the circle is:"+ capturedValue);

    }

    public static double areaofCircle(double r){
        double result= 22/7*r*r;
        return result;
        }
}
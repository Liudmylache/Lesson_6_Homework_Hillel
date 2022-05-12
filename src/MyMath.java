public class MyMath {

    public static double calculate (double a, double b, double c){
        return  (Math.abs(a-b)) / Math.pow((a + b),3) - Math.sqrt(c);
    }
}

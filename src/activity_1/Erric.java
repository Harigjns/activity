package activity_1;


public class Erric {
 
   
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
 
   public static double calculateDiscount(double price, double discountRate) {
        return price - (price * discountRate / 100);
    }
 
    public static int findMinimumValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
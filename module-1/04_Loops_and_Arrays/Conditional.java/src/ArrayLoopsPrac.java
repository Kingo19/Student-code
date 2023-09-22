public class ArrayLoopsPrac {


    public static void main(String[] args) {


    }

    private final static int FREEZING_TEMPERATURE = 32;



    private static final int SMALL_PEPRONI = 11;
    private static final int SMALL_CHEESE = 10;
    private final int SMALL_PEPPERONI = 11;

    private final int MEDIUM_CHEESE = 20;
    private final int MEDIUM_PEPPERONI = 21;

    private final int LARGE_CHEESE = 30;
    private final int LARGE_PEPPERONI = 31;

    private static final int CALZONE = 40;
    private static final int SPAGHETTI_PIE = 41;
    private final int BAKED_ZITI = 42;
    public static int[] createOrder(){

        int[] CO = {SMALL_CHEESE, CALZONE, SMALL_PEPRONI, SPAGHETTI_PIE};
        return CO;
    }

    public int getCalzoneSales(int[] orders) {
        int count;
        for (count = 0; count < orders.length; count++) {
            if (orders[count] == CALZONE) {
                count++;
            }
        }
        return count;

    }

    public int getRevenue(int[] order) {
        int revenue = 0;
        int count;
        for (count = 0; count < order.length; count++) {
            if (order[count] == SMALL_CHEESE) {
                revenue = revenue + 8;
            } else if (order[count] == MEDIUM_CHEESE) {
                revenue = revenue = 11;
            }
            else {
                revenue = revenue + 14;
            }
        }
        return revenue;
    }
    public int belowFreezing(int[] dailyHighs) {
        int count = 0;
        for (count =0; count < dailyHighs.length; count++) {
            if (dailyHighs[count] <= FREEZING_TEMPERATURE) {
                count ++;
            }
        }
         return count;
        }

    public int hottestDay(int[] dailyHighs) {
        int count = 0;
        int max = dailyHighs[0];
        for (count = 0; count < dailyHighs.length; count++) {
            if (dailyHighs[count] > max) {
                max = dailyHighs[count];
            }
        }
        return max;
    }
}

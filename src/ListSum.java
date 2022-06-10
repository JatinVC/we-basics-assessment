public class ListSum {
    public static void main(String[] args) {
        int[] testOne = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] testTwo = { 999, -60, -77, 14, 160, 301 };
        int[] testThree = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }; 
    
        System.out.println("#1 Array Sum: " + arraySum(testOne));
        System.out.println("#2 Array Sum: " + arraySum(testTwo));
        System.out.println("#3 Array Sum: " + arraySum(testThree));
    }

    /**
     * sums all the elements in a list of integers
     * @param array A list of integers.
     * @return the sum of the all the elements in the list of integers.
     */
    public static int arraySum(int[] array){
        int sum = 0;

        for(int number: array){
            sum+=number;
        }

        return sum;
    }
}
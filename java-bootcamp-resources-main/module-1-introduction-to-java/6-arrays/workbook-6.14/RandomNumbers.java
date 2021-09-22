public class RandomNumbers {
    public static void main(String[] args) {
        int[][] nums = new int[100][10];

        for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums[i].length; j++) {
                 nums[i][j] = randomNumber();
             };
         };
        
        print2DArray(nums);




    }

    /**
     * Function name: randomNumber.
     *
     * @return randomNumber (int)
     *
     * Inside the function:
     *    1. return a random number between 1 and 100.
     */

    public static int randomNumber() {
        double num = Math.random() * 100 + 1;
        return (int) num;
    }


    /**
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */

    public static void print2DArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                  System.out.print(numbers[i][j] + " ");
              };
             System.out.print("\n");
        };
    }
}


public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int [] [] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int [] [] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                count += a[i][j];
            }
        }
        return count;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int [][] a){
        double count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                count += a[i][j];
            }
        }
        int z = (a.length)*(a.length);
        return count/z;
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int [][] a){
        int count = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < count){
                    count = a[i][j];
                }
            }
        }
        return count;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int [] [] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > count){
                    count = a[i][j];
                }
            }
        }
        return count;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int [][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] %2 == 0){
                    count++;
                }
            }
        }
        return count;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int [][]a){
        int count = 0;
        for(int[] row : a){
            for(int num : row){
                if(num % 2 == 0){
                    count ++;
                }
            }
        }
        return count;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int [][] a){
        for(int [] row : a){
            for(int num : row){
                if(num <= 0){
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int [][]a){
        int [] rows = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                rows[i] += a[i][j];
            }
        }
        return rows;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int [][] a){
        int [] cols = new int[a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                cols[j] += a[i][j];
            }
        }
        return cols;
    }
}

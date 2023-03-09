package u7pp;

public class RecursiveFunctions {
    //factorial method
    //returns the inputted number multiplied by every number lower than itself down to one
    //factorial of 0 will return 1
    public static double factorial(int num){
        if(num <= 1){
            return 1;
        }
        else{
            return(num * factorial(num - 1));
        }
    }
    //power method
    //takes in the double base and the integer exponent
    //multiplies the num by itself exponent amount of times
    //if exponent is 0, returns 1
    public static double pow(double num, int exp){
        if(exp == 0){
            return 1;
        }
        if(exp <= 1){
            return num;
        }
        else{
            return(num * pow(num, exp - 1));
        }
    }
    //fibonacci method
    //takes in an integer parameter, returns the parameter term of the fibonacci sequence
    //ex. input of 4 will return 3
    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return(fibonacci(num - 1) + fibonacci(num - 2));
        }    
    }
    //palindrome tester method
    //takes in a string parameter and returns the boolean true if the string input is a palindrome
    public static boolean isPalindrome(String test){
        if(test.length() == 0 || test.length() == 1){
            return true;
        }
        if(test.charAt(0) == test.charAt(test.length() - 1)){
            return(isPalindrome(test.substring(1, test.length() - 1)));
        }
        else{
            return false;
        }
    }
    //nextisdouble method
    //checks the total amount of times in the array parameter that a number is half of the number to the right of it 
    //takes an array and starting point, will return the amount of times the next index is double the current one
    public static int nextIsDouble(int[] arr, int start) {
        if(start >= arr.length - 1){
            return 0;
        }
        if(arr[start] * 2 == arr[start + 1]){
            return(nextIsDouble(arr, start + 1) + 1);
        } 
        else{
            return(nextIsDouble(arr, start + 1));
        }
    }
    //getbinary method
    //converts a number parameter into a binary string
    public static String getBinary(int num){
        if(num == 0){
            return "0";
        }
        if(num == 1){
            return "1";
        }
        else{
            return(getBinary(num / 2) + Integer.toString(num % 2));
        }    
    }
    //binary search method
    //checks the middle value of the array, checks whether or not the num parameter is less than or equal to it
    //continually does that until the array start and end parameter
    public static int binarySearch(int[] arr, int num, int start, int end){
        if (start > end) {
            return -1;
        }
        if(arr[(start + end) / 2] == num){
            return (start + end) / 2;
        } 
        else if(arr[(start + end) / 2] < num){
            return binarySearch(arr, num, (start + end) / 2 + 1, end);
        } 
        else{
            return binarySearch(arr, num, start, (start + end) / 2 - 1);
        }
    }
    //can flow off map function
    //takes in a 2d array, row, and column and checks the surrounding numbers and whether they lead to the edge of the 2d array
    //if the row and column are at the edge of the array, the method will return 0
    public static boolean canFlowOffMap(int[][] map, int row, int col){
        if(row == 0 || col == 0 || row == map.length -1 || col == map[0].length - 1){
            return true;
        }
        else if(map[row][col] > map[row + 1][col] && canFlowOffMap(map, row + 1, col)){
            return true;
        }
        else if(map[row][col] > map[row - 1][col] && canFlowOffMap(map, row - 1, col)){
            return true;
        }
        else if(map[row][col] > map[row][col + 1] && canFlowOffMap(map, row, col + 1)){
            return true;
        }
        else if(map[row][col] > map[row][col - 1] && canFlowOffMap(map, row, col - 1)){
            return true;
        }
        else{
            return false;
        }
    }
}
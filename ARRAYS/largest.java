public class largest {
    public static int getlargest(int numbers[]){
        int largestx = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largestx <numbers[i]){
                largestx = numbers[i];
            }
        }
        return largestx;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 9};

        System.out.println("largest number is " + getlargest(numbers));
    }
}

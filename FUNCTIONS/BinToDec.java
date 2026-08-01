public class BinToDec {
    public static void bintodec( int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int Lastdigt = binNum % 10;
            decNum = decNum + (Lastdigt * (int)Math.pow(2,pow));
            pow ++;
            binNum = binNum/10;

            
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
        
    }
    public static void main(String[] args) {
        bintodec(111);
    }
}

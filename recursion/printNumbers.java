public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(10);
    }
    public static void printNumbers(int num){
        if (num==0) return;
        System.out.println(num);
        printNumbers(num-1);
    }
    
}
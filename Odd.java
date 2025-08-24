import java.util.Scanner;
public class Odd{
    static Scanner Sc=new Scanner(System.in);
    public static void main (String args[]){
    System.out.println("Enter a Number:"); //10
    int num=Sc.nextInt();
    if (isEvenOdd(num)){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    
    }}
    public static boolean isEvenOdd (int num)
    {
        return num%2==0; //Even
    }
}


import java.util.Scanner;

public class main {
    static void prime(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number which you wanna see if it's prime or not:");
        int a = scan.nextInt();
        int i=2;
        int sum=0;
        while(i<a){
            if(a%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==0){
            System.out.println(a+" "+"is a prime number.");
        }else{
            System.out.println(a+ "  " +"is not a prime number.");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
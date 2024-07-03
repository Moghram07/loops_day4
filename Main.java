import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q.1 Print the numbers from 1 to 100
        // if a number is a multiple of 3 print "fizz"
        for(int i =1; i<=100; i++){
            if((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
        //Q.2 write a program to reverse a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence you like to reverse: ");
        String userInput = scanner.nextLine();
        String reversed ="";
         for(int i = userInput.length()-1; i>=0; i--){
             reversed += userInput.charAt(i);
         }
        System.out.println(reversed);
        //Q.3 create factorial value of any number
        System.out.println("enter the number you like to make factorial: ");
        int  number = scanner.nextInt();
        int fact = 1;
        int factorial = 1;
        while(fact<=number){
            factorial *=fact;
            fact++;
        }
        System.out.println("factorial of "+number+ " is: "+ factorial);

        //Q.4 Two numbers are entered through the keyboard
        System.out.println("please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("please enter second number: ");
        int num2 = scanner.nextInt();
        int result = 1;
        for (int i = 0; i<num2; i++){
            result *= num1;
        }
        System.out.println(result);

        //Q.5 write a program that reads a set of integers than
        // prints the sum of odd and even numbers
        System.out.println("Enter a number to print odd & even sum: ");
        int userNumber = scanner.nextInt();
        int oddSum =0, evenSum=0;
        for (int i=1; i <= userNumber; i++){
            if(i%2==1){
                oddSum += i;
            }else if(i%2 == 0){
                evenSum += i;
            }

        }
        System.out.println("sum of odd numbers :" + oddSum);
        System.out.println("sum of even numbers : "+ evenSum);

        //Q.6 enter a positive number and check if it's prime or not
        System.out.println("Enter a positive number: ");
        int isPrime = scanner.nextInt();
        boolean prime = true;
        if(isPrime == 0 || isPrime == 1){
            System.out.println(isPrime + " is not a prime number, try a higher number");
        }else{
            for(int i = 2; i<isPrime; i++){
                if(isPrime%i == 0){
                    prime = false;
                    break;
                }else {
                    prime = true;
                }
            }
            String result1 = prime ? " is a prime number":" is not a prime number";
            System.out.println(isPrime + result1);
        }
        // Q.7 print the days for four weeks
        System.out.println("enter number of weeks: ");
        int weeks = scanner.nextInt();
        for(int i = 1; i <= weeks; i++){
            System.out.println("Week " + i);
            for(int j = 1; j <= 7; j++){
                System.out.println("Day "+ j);
            }
        }
        scanner.nextLine();
        // Q.8 palindrome or not
        System.out.println("Enter a word to check if it's palindrome or not:");
        String palindrome = scanner.nextLine().toLowerCase();
        Boolean isPalindrome = true;
        int r = 0;
        while (r < palindrome.length()){
            if(palindrome.charAt(r) != palindrome.charAt(palindrome.length()-r-1)){
                isPalindrome = false;
                break;
            }else{
                isPalindrome = true;
            }
           r++;
        }
        String answer = isPalindrome == true? " is palindrome":" is not palindrome!!";
        System.out.println(palindrome + answer);
    }
}
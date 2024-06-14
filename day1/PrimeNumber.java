package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		        int input = 4;
		        boolean isPrime = true;

		        if (input <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i < input; i++) {
		                if (input % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(input + " is a prime number");
		        } else {
		            System.out.println(input + " is not a prime number");
		        }
		    }
	


	}


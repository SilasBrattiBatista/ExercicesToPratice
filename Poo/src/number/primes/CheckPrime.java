package number.primes;

public class CheckPrime extends NumberPrimes {
    public void checkIsPrime(int n) {
        if(isPrime(n)) {
            System.out.println("The number " + n + " is a prime number");
        } else {
            System.out.println("The number " + n + " is not a prime number");
        }
    }
}

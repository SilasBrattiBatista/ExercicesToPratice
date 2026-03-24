package number.primes;

public class NumberPrimes {
    public boolean isPrime(int n) {
        if(((n % 2) == 0) && n >= 1) {
            return true;
        } else {
            return false;
        }
    }
}

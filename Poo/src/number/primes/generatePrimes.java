package number.primes;

public class generatePrimes extends NumberPrimes{
    public void nextPrime(int n){
        int untilPrime = n;
        while (!isPrime(untilPrime)) {
            untilPrime = untilPrime + 1;
        }
        System.out.print(untilPrime);
    }
}

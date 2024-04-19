import java.util.ArrayList;

class PrimeCalculator {
    static int MAX_SIZE = 1000005;
    static ArrayList<Integer> primeList = new ArrayList<>();
    static void primeListGenerator(){
        boolean [] isPrime = new boolean[MAX_SIZE];
        for(int i = 0; i < MAX_SIZE; i++)
            isPrime[i] = true;
        for (int p = 2; p * p < MAX_SIZE; p++)
        {
            if (isPrime[p] == true)
            {
                for (int i = p * p; i < MAX_SIZE; i += p)
                    isPrime[i] = false;
            }
        }
        for(int i = 2 ;i< MAX_SIZE ; i++){
            if(isPrime[i]==true) primeList.add(i);
        }

    }
    int nth(int nth) throws IllegalArgumentException {
        if(nth == 0) throw new IllegalArgumentException();
        PrimeCalculator pc = new PrimeCalculator();
        pc.primeListGenerator();
        return primeList.get(nth-1);
    }

    }






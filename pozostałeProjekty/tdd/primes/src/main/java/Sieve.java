public class Sieve {
    public boolean isPrime (int num){
        if (num<2)
        {
            throw new IllegalArgumentException();
        }

        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0)
                return false;
        }
        return true;
    }
}

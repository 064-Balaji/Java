package LAB;

public class primeNumberRange {
    public static void main(String []args) throws PositiveInteger, num2Greater {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if(num1<0 || num2<0){
            throw new PositiveInteger("Both Numbers are need to be as an Positive");
        }
        if(num1 > num2){
            throw new num2Greater("Number 2 is greater then the Number 1");
        }

        for(int i=num1; i<=num2; i++){
            if(isprime(i))
                System.out.println(i+" ");
        }
    }
    static boolean isprime(int number){
        for(int i=2; i<= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

class PositiveInteger extends Exception{
    PositiveInteger(String msg){
        super(msg);
    }
}

class num2Greater extends Exception{
    num2Greater(String msg){
        super(msg);
    }
}
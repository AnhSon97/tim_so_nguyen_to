public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2;i < 100; i++){
            if (i < 2){
                System.out.println("is not prime");
            } else {
                if (i == 2){
                    System.out.println("is prime");
                } else {
                    int j = 2;
                    boolean check = true;
                    while ( j <= i){
                        if (i % j == 0){
                            check = false;
                            break;
                        }
                        j++;
                    }
                    if (check){
                        System.out.println(i + "t2-is prime");
                    } else {
                        System.out.println(i + "t2-is not prime");
                    }
                }
            }
        }
    }
}

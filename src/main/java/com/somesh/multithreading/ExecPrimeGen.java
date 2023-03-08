package multithreading;

public class ExecPrimeGen {
    public static void main(String args[]){
        Runnable task = new PrimeGenerator ();

        task.run ();
    }
}

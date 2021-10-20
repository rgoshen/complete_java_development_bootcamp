public class MultiThread {

    // Option 1
    // static class LongTask implements Runnable {
    //     @Override
    //     public void run() {
    //         longTask();
    //     }
    // }
    public static void main(String[] args) {

        // LongTask runnable = new LongTask();

        // Option 2
        // Runnable runnable = new Runnable() {
        //     @Override
        //     public void run() {
        //         longTask();
        //     }
        // };

        // Thread thread2 = new Thread(runnable);
        // thread2.start();

        // Option 3
        Thread thread = new Thread(() -> longTask());
        thread.start();

        System.out.println("Doing other work on main thread");

    }

    public static void longTask() {
        long t= System.currentTimeMillis();
        long end = t+3000;

        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }

}

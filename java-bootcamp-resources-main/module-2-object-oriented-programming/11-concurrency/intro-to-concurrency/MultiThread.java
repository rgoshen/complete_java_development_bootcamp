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
        System.out.println("Before: " + thread.getState());
        thread.start();
        System.out.println("After: " + thread.getState());
        
        System.out.println("Error occurred in main thread.");
        // thread.interrupt();
        // System.out.println("Interrupted: " + thread.isInterrupted());
        System.out.println("After interrupted: " + thread.getState());
        System.out.println("Doing other work on main thread");

    }

    public static void longTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Done sleeping");
        // long t= System.currentTimeMillis();
        // long end = t+3000;

        // while(true) {
        //     if (System.currentTimeMillis() == end) {
        //         System.out.println("Finished long task");
        //         break;
        //     } else if (Thread.currentThread().isInterrupted()) {
        //         System.out.println("This task has been interrupted.");
        //         break;
        //     }
        // }
    }

}

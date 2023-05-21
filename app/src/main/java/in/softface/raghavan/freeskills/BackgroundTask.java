package in.softface.raghavan.freeskills;

public class BackgroundTask implements Runnable {

        public String username;
        public String imageurl;


    @Override
    public void run() {


        // Code to be executed in the background
        while (true) {
            System.out.println("Background task is running...");

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

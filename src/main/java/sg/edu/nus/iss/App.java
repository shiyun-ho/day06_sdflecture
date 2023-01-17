package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
       Thread thread1 = new Thread(new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            //specify the code we want to orun
            for (int i = 0; i<20; i++){
                System.out.println(Thread.currentThread().getName()
                + "\tRunnable ..." + i);
            }
            }
       });
       thread1.start(); 
       MyRunnableImplementation mRI = new MyRunnableImplementation("Task1");
       MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task2");
    //    Thread thread2 = new Thread(mRI);
    //    thread2.start();

    //    Thread thread3 = new Thread(mRI); 
    //    thread3.start();

       //single thread executor 
       ExecutorService executorService = Executors.newSingleThreadExecutor();
       executorService.execute(mRI);
       //executing two tasks to executo
       executorService.execute(mRI2);
       executorService.shutdown();

       }; 
      
    }


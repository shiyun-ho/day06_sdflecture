package sg.edu.nus.iss;

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

       MyRunnableImplementation mRI = new MyRunnableImplementation();
       Thread thread2 = new Thread(mRI);
       thread2.start();

       Thread thread3 = new Thread(mRI); 
       thread3.start();
       }; 
      
    }


package sg.edu.nus.iss;

public class MyRunnableImplementation implements Runnable {

    private String taskName; 

    public MyRunnableImplementation(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " "
            + taskName + "\t runnable..." + i);
        }
    }
    


}

package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


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
       MyRunnableImplementation mRI = new MyRunnableImplementation("Task 1");
       MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task 2");
       MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task 3");
       MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task 4");
       MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task 5");
    //    Thread thread2 = new Thread(mRI);
    //    thread2.start();

    //    Thread thread3 = new Thread(mRI); 
    //    thread3.start();

       //single thread executor 
    //    ExecutorService executorService = Executors.newSingleThreadExecutor();
    //    executorService.execute(mRI);
    //    //executing two tasks to executo
    //    executorService.execute(mRI2);
    //    executorService.shutdown();
       
    //    ExecutorService executorService = Executors.newFixedThreadPool(3);
    //    executorService.execute(mRI);
    //executing two tasks to executo
    //    executorService.execute(mRI2);
    //    executorService.execute(mRI3);
    //    executorService.execute(mRI4);
    //    executorService.execute(mRI5);
    //    executorService.shutdown();

       ExecutorService executorService = Executors.newCachedThreadPool();
       executorService.execute(mRI);
    // executing two tasks to executo
       executorService.execute(mRI2);
       executorService.execute(mRI3);
       executorService.execute(mRI4);

       MyRunnableInterface<Integer> addOperation = (a,b) -> {
            return a+b;
       };

       MyRunnableInterface<Integer> multiplyOperation = (a,b) -> {
            return a*b;
       };

       MyRunnableInterface<Integer> minusOperation = (a,b) -> {
        return a-b;
        };

        MyRunnableInterface<String> concatString = (a,b) -> {
            return a+b;
        };

        MyMessageInterface printString = (a) -> {
            System.out.println(a);
        };

       System.out.println("Add operation: " + addOperation.process(1, 1));
       System.out.println("Multiply operation: " + multiplyOperation.process(2, 5));
       System.out.println("Minus operation: " + minusOperation.process(5, 2));
       System.out.println("Concatenate operation: " + concatString.process("The quick brown fox", " jumps over the fence."));
       
       printString.printMessage("Let's take a break at 12 pm.");
       
    //list of employees

    List <Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(1, "Adam", "Toh", 23, 2500));
    employees.add(new Employee(1, "Lernice", "Choo", 33, 2500));
    employees.add(new Employee(1, "Zatherine", "Poh", 43, 6500));
    employees.add(new Employee(1, "Den", "Ho", 26, 5500));
    employees.add(new Employee(1, "Ellie", "Chow", 28, 15500));
    
    // //prints all the records
    // employees.forEach(emp -> {
        
    //     System.out.println(emp);
    // });
    
    //filter by last name
    List<Employee> filteredEmployees = employees.stream().filter(emp -> emp.
    getLastName().contains("Ch"))
            .collect(Collectors.toList());
    // filteredEmployees.forEach(emp -> {
    //             System.out.println("Here are the filtered result: ");
    //             System.out.println(emp);
    //         });

    // employees.sort(Comparator.comparing(e -> e.getFirstName()));
    // //
    // employees.forEach(emp -> {
            
    //         System.out.println(emp);
    //     });


    // employees.sort(Comparator.comparing(Employee::getFirstName).reversed());
    
    // employees.forEach(emp -> {
    //         System.out.println(emp);
    //     });

    Comparator<Employee> compare = Comparator.comparing(e->e.getFirstName());
    employees.sort(compare.reversed());
    // employees.forEach(emp -> {
    //         System.out.println(emp);
    //     });

    //compares by two parameters: sort by first name, then last name
    Comparator<Employee> groupByComparator = Comparator.comparing
    (Employee::getFirstName).thenComparing(Employee::getLastName);
    employees.sort(groupByComparator);
    employees.forEach(emp -> {
        System.out.println(emp);
    });
    }
}
      
    


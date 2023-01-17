package sg.edu.nus.iss;

//annotate to indicate functional interface
@FunctionalInterface

public interface MyRunnableInterface<T> {
    //lamda expression
    T process(T a, T b); 
}

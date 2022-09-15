package Lists;

public interface List <T>{
    void add(T value);
    T get(int index);
    int size();
    void remove(int index);
    void reverse();
}

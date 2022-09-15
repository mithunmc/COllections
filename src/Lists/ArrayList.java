package Lists;

import java.lang.reflect.Array;

public class ArrayList<T>  implements List<T> {
    private static final int INITIAL_SIZE = 2;
    private static final float GROWTH_FACTOR = 1.5f;

    private int elements;
    private T[] values = (T[]) new Object[INITIAL_SIZE]; //Java feature bug forces allocate size for array declaration

    @Override
    public void add(T value) {
        if(elements == values.length){
            T[] temp = (T[]) new Object[(int)(values.length*GROWTH_FACTOR)];
            for(int i = 0;i< values.length; i++){
                temp[i] = values[i];
            }
            values = temp;
        }
        values[elements] = value;
        elements++;

    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public void remove(int index) {
        elements--;
        for(int i = index; i<values.length; i++){
            values[i] = values[i+1];
        }
    }

    @Override
    public void reverse() {
        for(int i = 0; i<elements/2; i++){
            T temp = values[i];
            values[i] = values[(elements - i) - 1];
            values[elements - i - 1] = temp;
        }
    }

    @Override
    public String toString(){
        String rtn = "";
        for(int i = 0; i<elements; i++){
            rtn+= values[i] + " " ;
        }
        return rtn;
    }


}


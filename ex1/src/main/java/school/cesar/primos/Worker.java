package school.cesar.primos;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Worker extends Thread {
    private List<Integer> values;
    private List<Integer> result;


    public Worker(List<Integer> values) {
        this.values = values;
        this.result = new ArrayList<Integer>();
    }

    private void add(int value) {
        this.result.add(value);
    }

    public List<Integer> getResult() {
        return this.result;
    }

    public void run() {
        for (int value : this.values) {
            if(Util.primo(value)) {
                this.add(value);
            }
        }
    }
}
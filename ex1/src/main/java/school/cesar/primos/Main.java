package school.cesar.primos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// NOTE: 
// Calcule os primos de 0 a 1000 em paralelo (4 threads com cargas iguais)
// Apesar de ineficiente, use o método Util.primo() e armazene os numeros
// primos na List primos declarada acima

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> primos = new ArrayList<Integer>();

        List<List<Integer>> slices = new ArrayList<List<Integer>>();

        List<Worker> workers = new ArrayList<Worker>();

        int workersCount = 4;
        int workerSliceSize = 1000 / workersCount;

        int count = 0;
        for (int i = 0; i < workersCount; i++) {
            List<Integer> workerValues = new ArrayList<Integer>();
            for (int v = 0; v < workerSliceSize; v++) {
                workerValues.add(count);
                count++;
            }
            slices.add(workerValues);
        }

        for (int w = 0; w < workersCount; w++) {
            Worker worker = new Worker(slices.get(w));
            worker.run();
            workers.add(worker);
        }

        for (Worker worker : workers) {
            worker.join();
            List<Integer> workerResult = worker.getResult();

            int len = workerResult.size();

            for (int valPosix = 0; valPosix < len; valPosix++) {
                primos.add(workerResult.get(valPosix));
            }

        }

        System.out.println(Arrays.toString(primos.toArray()));
    }
}
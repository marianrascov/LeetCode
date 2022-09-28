import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        // am creat lista pe care o voi returna la final
        List<List<Integer>> fin = new ArrayList<>(numRows);
        List<Integer> first = new ArrayList<>();
        first.add(1);
        fin.add(first);

        if (numRows == 1) {
            return fin;
        }

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        fin.add(second);

        if (numRows == 2) {
            return fin;
        }

        for (int i = 2; i < numRows; i++) {

            // am creat o lista temporara pe care o voi adauga la lista finala
            List<Integer> temp = new ArrayList<>();

            //adaug primul element
            temp.add(1);

            for (int j = 1; j < i; j++) {
                // adaug elementul j ca suma a lui j element si j-1 de pe randul anterior
                temp.add(fin.get(i - 1).get(j) + fin.get(i - 1).get(j - 1));
            }

            // adaug elementul final
            temp.add(1);

            // adaug lista temporara la lista finala
            fin.add(temp);
        }

        // returnez lista finala
        return fin;
    }
}

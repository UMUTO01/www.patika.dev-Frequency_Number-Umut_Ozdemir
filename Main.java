import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        findFrequency(array);
    }

    public static void findFrequency(int[] array) {
        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("Number " + array[i] + " appears " + count + " times.");
        }
    }

}
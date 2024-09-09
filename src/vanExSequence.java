import java.util.HashMap;
import java.util.Map;
public class vanExSequence {
    public static void main(String args[]){
        int n = 20; // Length of the sequence to generate
        int[] sequence = generateVanEckSequence(n);

        // Print the sequence
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }

    public static int[] generateVanEckSequence(int length) {
        int[] sequence = new int[length];
        Map<Integer, Integer> lastOccurrence = new HashMap<>();

        // Initialize the first term
        sequence[0] = 0;
        lastOccurrence.put(0, 0);

        for (int i = 1; i < length; i++) {
            int lastTerm = sequence[i - 1];
            if (lastOccurrence.containsKey(lastTerm)) {
                sequence[i] = i - lastOccurrence.get(lastTerm) - 1;
            } else {
                sequence[i] = 0;
            }
            lastOccurrence.put(lastTerm, i - 1);
        }

        return sequence;
    }
}

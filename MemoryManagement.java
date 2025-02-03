import java.util.ArrayList;

public class MemoryManagement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Dynamically allocate and fill the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Numbers before clearing: " + numbers);

        // Clear the list and let the garbage collector reclaim the memory
        numbers.clear();
        System.out.println("Numbers after clearing: " + numbers);

        // Suggest garbage collection (may not run immediately)
        System.gc();
    }
}


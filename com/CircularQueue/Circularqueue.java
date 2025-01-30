package CircularQueue;


/*
import java.util.LinkedList;
import java.util.Queue;

public class PetrolPumpTourQueue {

    public static int canCompleteTour(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>(); // Queue to store pump indices
        int start = 0; // Starting pump index
        int currentPetrol = 0; // Current petrol in the tank
        int count = 0; // Number of pumps visited in the current tour

        // Add all pump indices to the queue
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int currentPump = queue.poll(); // Get the next pump
            currentPetrol += petrol[currentPump] - distance[currentPump]; // Update petrol
            count++; // Increment the count of visited pumps

            // If petrol is negative, reset and try the next pump as the starting point
            if (currentPetrol < 0) {
                currentPetrol = 0; // Reset petrol
                start = (start + count) % n; // Update starting point
                count = 0; // Reset count
                queue.clear(); // Clear the queue
                // Re-add remaining pumps to the queue
                for (int i = start; i < n; i++) {
                    queue.add(i);
                }
                for (int i = 0; i < start; i++) {
                    queue.add(i);
                }
            } else if (count == n) {
                // If all pumps are visited successfully, return the starting index
                return start;
            }
        }

        // If no valid starting point is found
        return -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = canCompleteTour(petrol, distance);
        if (startIndex != -1) {
            System.out.println("Starting petrol pump index: " + startIndex);
        } else {
            System.out.println("No valid starting point exists.");
        }
    }
}
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.

 */
 class CircularQueue{
     public static int startingIndex(int n,int []petrol,int[]distance){
         int currentPetrol=0;
         int totalPetrol=0;
         int startIndex=-1;
         for(int i=0;i<n;i++) {
             currentPetrol += petrol[i] - distance[i];
             totalPetrol += petrol[i] - distance[i];
             if (currentPetrol < 0) {
                 currentPetrol = 0;
                 startIndex = i + 1;
             }
         }
             if(totalPetrol<0){
                 return -1;
             }
             return startIndex;


     }

    public static void main(String[] args) {
        int petrol[]={4,6,7,4};
        int distance[]={6,5,3,5};
        int n=petrol.length;
        int value=startingIndex(n,petrol,distance);
        System.out.println("The Starting Index of the Circular is "+value);

    }


}

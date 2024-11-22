package Sheet5;

// Define an interface for queue operations
interface QueueImpl {
    void insert(int element) throws Exception; // Add element to the queue
    int delete() throws Exception;            // Remove and return element from the queue
    void display();                           // Display elements in the queue
}

// Implement the interface in a class
class QueueDemo implements QueueImpl {
    private int[] queue;     // Array to hold queue elements
    private int front;       // Index for the front of the queue
    private int rear;        // Index for the rear of the queue
    private int size;        // Current size of the queue
    private final int capacity; // Maximum capacity of the queue

    // Constructor
    public QueueDemo(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Insert element into the queue
    @Override
    public void insert(int element) throws Exception {
        if (size == capacity) {
            throw new Exception("Queue Overflow: Cannot add more elements.");
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = element;
        size++;
        System.out.println("Inserted: " + element);
    }

    // Delete element from the queue
    @Override
    public int delete() throws Exception {
        if (size == 0) {
            throw new Exception("Queue Underflow: No elements to delete.");
        }
        int element = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println("Deleted: " + element);
        return element;
    }

    // Display elements in the queue
    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

// Main class to demonstrate the functionality
public class q1 {
    public static void main(String[] args) {
        try {
            QueueDemo queue = new QueueDemo(10); // Queue with max size 10

            // Insert elements
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);

            // Display the queue
            queue.display();

            // Delete elements
            queue.delete();
            queue.delete();

            // Display the queue again
            queue.display();

            // Insert more elements
            queue.insert(50);
            queue.insert(60);

            // Display the queue again
            queue.display();

            // Simulate overflow
            for (int i = 0; i < 10; i++) {
                queue.insert(i + 70);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Simulate underflow
            QueueDemo emptyQueue = new QueueDemo(10);
            emptyQueue.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

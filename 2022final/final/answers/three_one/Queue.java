public class Queue {
    private String array[] = new String[100];
    private int front = 0;
    private int rear = 0;
    private static final Queue instance = new Queue();
    
    private Queue(){
    }

    public static Queue getInstance() {
        return instance;
    }

    public int getSize() {
        return (rear - front + 100) % 100;
    }

    public void enqueue(String x) {
        if((rear + 1) % 100 == front) {
            return;
        }
        array[rear] = x;
        rear = (rear + 1) % 100;
    }

    public String dequeue() {
        if(rear == front) {
            return null;
        }
        String result = array[front];
        front = (front + 1) % 100;
        return result;
    }
}

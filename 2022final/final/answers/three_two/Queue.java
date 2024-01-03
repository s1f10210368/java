import java.util.ArrayList;

public class Queue {
    private String array[] = new String[100];
    private int front = 0;
    private int rear = 0;

    public Queue(){
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
        notifyObservers();
    }

    public String dequeue() {
        if(rear == front) {
            return null;
        }
        String result = array[front];
        front = (front + 1) % 100;
        notifyObservers();
        return result;
    }

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}

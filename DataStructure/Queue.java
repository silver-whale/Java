package DataStructure;
public class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue){
        return queue.size == queue.capacity;
    }

    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    void enqueue(int item){
        // 현재 객체가 꽉 차 있다면
        if(isFull(this))
            return;
        // index 초과 방지
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }
    
    int dequeue(){
        if(isEmpty(this)) return Integer.MIN_VALUE;
        
        int item = this.array[this.front];
        // index 초과 방지
        this.front = (this.front+1) % this.capacity;
        this.size = this.size-1;
        return item;
    }

    int front(){
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    int rear(){
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

}

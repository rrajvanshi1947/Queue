/**
 * 
 */

/**
 * @author Roopam Rajvanshi
 *
 */
public class Queue {

	/**
	 * 
	 */
	int front, rear, qsize;
    int  qcapacity;
    int qa[];
	
	public Queue(int n) {
		// TODO Auto-generated constructor stub
		this.qcapacity=n;
		front=qsize=0;
		rear = qcapacity - 1;
		qa = new int[qcapacity];
	}
	void inQueue(int val) {
		if (isFull()) {
			System.out.println("Queue is full. Can't insert any more values");
			return ;
		}
		this.rear = (this.rear + 1)%this.qcapacity;
        this.qa[this.rear] = val;
        this.qsize = this.qsize + 1;		
	}
	
	int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue does not has any value. Operation failed");
			return 0;
		}  
        int val = this.qa[this.front];
        this.front = (this.front + 1)%this.qcapacity;
        this.qsize = this.qsize - 1;
        return val;
	}
	
	boolean isFull() {
		if (qsize == qcapacity)
			return true;
		else	
			return false;
	}
	
	boolean isEmpty() {
		if ( qsize == 0)
			return true;
		return false;
	}
}

package queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.queue(12);

		q.dequeue();
		q.dequeue();

		q.dequeue();
		q.show();

	}

}

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Roopam Rajvanshi
 *
 */
class QueueTest {

	

	/**
	 * Test method for {@link Queue#Queue(int)}.
	 */
	@Test
	void testQueue() {
		Queue q = new Queue(5);
		assertEquals(5, q.qcapacity,"Assertion failed for queue capacity");
		assertEquals (0, q.qsize,"Assertion failed for queue size");
		assertEquals(0, q.front, "Assertion failed for queue front");
	}

	/**
	 * Test method for {@link Queue#inQueue(int)}.
	 */
	@Test
	void testInQueue() {
		Queue q = new Queue(4);
		q.inQueue(2);
		q.inQueue(32);
		assertFalse(q.isEmpty(),"Test failed for inQueue function");
		q.inQueue(22);
		q.inQueue(31);
		assertTrue("Test failed for inQueue-isFull test", q.isFull());

	}

	/**
	 * Test method for {@link Queue#deQueue()}.
	 */
	@Test
	void testDeQueue() {
		Queue q = new Queue(4);
		q.inQueue(2);
		q.inQueue(32);
		q.inQueue(23);
		q.inQueue(31);
		q.deQueue();
		assertFalse(q.isEmpty(),"Test failed for deQueue function");
		q.deQueue();
		q.deQueue();
		q.deQueue();
		assertTrue("Test failed for Queue class deQueue function test", q.isEmpty());
	}

	/**
	 * Test method for {@link Queue#isFull()}.
	 */
	@Test
	void testIsFull() {
		Queue q = new Queue(2);
		q.inQueue(2);
		q.inQueue(32);
		assertFalse(q.isEmpty(),"Test failed for isFull-empty function");
		assertTrue("Test failed for isFull function", q.isFull());
	}

	/**
	 * Test method for {@link Queue#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		Queue q = new Queue(2);
		assertTrue(q.isEmpty(),"Test failed for Queue class isEmpty function");
		q.inQueue(2);
		q.inQueue(32);
		assertFalse(q.isEmpty(),"Test failed for Queue class isEmpty function");

	}

}

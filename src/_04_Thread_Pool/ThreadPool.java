package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {

	private Thread[] thread;
	private ConcurrentLinkedQueue taskQueue;
	
	public ThreadPool(int totalThreads) {
		
		thread = new Thread[totalThreads];
		for (int i = 0; i < thread.length; i++) {
			
		}
		
	}
	
}

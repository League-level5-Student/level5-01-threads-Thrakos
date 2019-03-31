package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {

	private Thread[] thread;
	private ConcurrentLinkedQueue<Task> taskQueue;
	
	public ThreadPool(int totalThreads) {
		
		taskQueue = new ConcurrentLinkedQueue<Task>();

		thread = new Thread[totalThreads];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(new Worker(taskQueue));
		}
		
	}
	
	public void addTask(Task task) {
		taskQueue.add(task);
	}
	
	public void start() {
		for (int i = 0; i < thread.length; i++) {
			thread[i].start();
		}
		
		for (int i = 0; i < thread.length; i++) {
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

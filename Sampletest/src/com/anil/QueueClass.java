package com.anil;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueClass {
	
	private void priQueue() {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("");
		pq.add("Test2");
		
		System.out.println(pq.size());
		
		Iterator it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueClass qc = new QueueClass();
		qc.priQueue();
		

	}

}

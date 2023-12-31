package EY1808;

import java.util.Scanner;

public class HeapSpace {
	
	int heapsize;
	
	void build max_heap(int[] a) {
		heapsize = a.length;
		for(int i=(heapsize/2); i>=0; i--) {
			max_heapify(a,i);
			
		}
	}
	
	void max_heapify(int[] a, int i) {
		int l =2*i+1;
		int r = 2*i+2;
		
		int largest = i;
		
		if(l<heapsize && a[i] >a[largest])
			largest = r;
	
	if(largest !=1) {
		int t =a[i];
	    a[i] = a[largest];
		a[largest] = t;
		max_heapify(a,largest);
	}
}

    int extract_max(int[] a) {
    	if(heapsize < 0) {
    		System.out.println("Underflow");
    	}
    	int max = a[0];
    	a[0] = a[heapsize - 1];
    	heapsize --;
    	max_heapify(a,0);
    	return max;
    }
    
    void increase_key(int[] a, int i , int key) {
    	if(key<a[i])
    	{
    		System.out.println("Error");
    		a[i ] = key;
    		while (i>=0 && a[(i-1)/2] <a[i]) {
    			int t = a[(i-1)/2];
    			a[(i-1)/2] = a[i];
    			a[i] = t;
    			
    			i=(i-1)/2;
    		}
    	}
    }
    
    	void print_heap(int[] a) {
    		for(int i =0; i< heapsize; i++) {
    			System.out.println(a[i] + " ");
    		}
    	}
    	
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int(n);
		
		System.out.println("Enter the elements of array");
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Heap obj = new Heap();
		
		obj.build_max_heap(arr);
		obj.print_heap(arr);
		
		System.out.println("Maximum value is " + obj.extract_max(arr));
		obj.print_heap(arr);
		
		System.out.println("Minimum element is " + obj.extract_max(arr));
		obj.increase_key(arr,6, 800);
	}
//INCOMPLETE PROGRAM
}

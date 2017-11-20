package com.sort;

import java.util.Arrays;
  
public class HeapSort {
    int tempArray[];
      
    private void swap(int i, int j) {
         int temp = tempArray[i];
         tempArray[i] = tempArray[j];
         tempArray[j] = temp;
     }
      
    // To Max-Heapify a subtree rooted at node i which is
    // an index in A[].  n -> size of heap
    void maxHeapify(int array[],int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
   
        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;
   
        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;
   
        // If largest is not root
        if (largest != i)
        {
              
            swap(i,largest);
            // Recursively heapify the affected sub-tree
            maxHeapify(array,n,largest);
        }
    }
      
 // Build-Max-Heap (rearrange array)
  //Converting array A to Max-Heap
    public void BuildMaxHeap(int A[])
    {
        int n = A.length; 
        // one by one checking all root nodes
        //and calling Heapify function 
        //if they does not satisfy heap property
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(A,n,i);
    }
      
    // main function to do Heap Sort
    public void heapSort(int arr[])
    {   
        this.tempArray=arr;
        int n = tempArray.length;
          
        BuildMaxHeap(tempArray);
        // One by one extract an element from heap
        //and get the sorted array
        for (int i=n-1; i>=0; i--)
        {
            // Move top root element to end element
            swap(0,i);
            // call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
        }
    }
   
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {24,-2,45,200,56,75,2,560,0,53,12};
      //print unsorted array using Arrays.toString()
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
   
        HeapSort ob = new HeapSort();
        ob.heapSort(arr);
   
        System.out.print("Sorted array: ");
        //print sorted array
          System.out.println(Arrays.toString(arr)); 
    }
}
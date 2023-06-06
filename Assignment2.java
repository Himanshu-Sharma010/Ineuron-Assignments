package com.ineuronlearn.main.Assignment;
import java.util.*;
public class Assignment2 {
	public static void main(String[] args)
	{
		
		//Q1.  duplicates in array:
		
//		int a[] = {1,4,2,6,2,8,1};
		            
//		              or
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter array size:");
//		int size = sc.nextInt();
//		
//		int a[] = new int[size];
//		for(int i=0;i<size;i++) {
//			System.out.println("\nenter index "+i+" value (integertype):");
//			a[i]= sc.nextInt();
//		}
//		
//		System.out.print("\narray is:");
//		
//		for(int elem:a) {
//			System.out.print(elem+" ");
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) 
//					System.out.println("\nduplicate of: "+a[i]+" found at index "+j);
//
//				
//			}
//		}
		
		


		
		
		
		//Q.2 Quick Sort
//
//	public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {5, 9, 3, 1, 8, 6, 2, 7};
//        System.out.println("Original array:");
//        printArray(arr);
//        
//        quickSort(arr, 0, arr.length - 1);
//        
//        System.out.println("\nSorted array:");
//        printArray(arr);
//    }
//    
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int partitionIndex = partition(arr, low, high);
//            
//            if (partitionIndex - low < high - partitionIndex) {
//                quickSort(arr, low, partitionIndex - 1);
//                quickSort(arr, partitionIndex + 1, high);
//            } else {
//                quickSort(arr, partitionIndex + 1, high);
//                quickSort(arr, low, partitionIndex - 1);
//            }
//        }
//    }
//    
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[low];
//        int i = low + 1;
//        int j = high;
//        
//        while (true) {
//            while (i <= j && arr[i] <= pivot) {
//                i++;
//            }
//            
//            while (i <= j && arr[j] >= pivot) {
//                j--;
//            }
//            
//            if (i > j) {
//                break;
//            }
//            
//            swap(arr, i, j);
//        }
//        
//        swap(arr, low, j);
//        return j;
//    }
//    
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    
//    public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}

		 

		
		
		
		
		
		
		//Q3 Bubble Sort
//		int a[] = {2,1,5,4,7,8,6};
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=1;j<a.length;j++) {
//				if(a[j]<a[j-1]) {
//					int temp = a[j];
//					a[j] = a[j-1];
//					a[j-1] = temp;
//				}
//			}
//		}
//		
//		for(int elem:a) {
//			System.out.print(elem+" ");
//		}
		
		
		




		
		//Q.4 Merge Sort
//		public class MergeSort {
//		    public static void main(String[] args) {
//		        int[] arr = {5, 9, 3, 1, 8, 6, 2, 7};
//		        System.out.println("Original array:");
//		        printArray(arr);
//		        
//		        mergeSort(arr, 0, arr.length - 1);
//		        
//		        System.out.println("\nSorted array:");
//		        printArray(arr);
//		    }
//		    
//		    public static void mergeSort(int[] arr, int low, int high) {
//		        if (low < high) {
//		            int mid = low + (high - low) / 2;
//		            
//		            mergeSort(arr, low, mid);
//		            mergeSort(arr, mid + 1, high);
//		            
//		            merge(arr, low, mid, high);
//		        }
//		    }
//		    
//		    public static void merge(int[] arr, int low, int mid, int high) {
//		        int n1 = mid - low + 1;
//		        int n2 = high - mid;
//		        
//		        int[] left = new int[n1];
//		        int[] right = new int[n2];
//		        
//		        System.arraycopy(arr, low, left, 0, n1);
//		        System.arraycopy(arr, mid + 1, right, 0, n2);
//		        
//		        int i = 0;
//		        int j = 0;
//		        int k = low;
//		        
//		        while (i < n1 && j < n2) {
//		            if (left[i] <= right[j]) {
//		                arr[k++] = left[i++];
//		            } else {
//		                arr[k++] = right[j++];
//		            }
//		        }
//		        
//		        while (i < n1) {
//		            arr[k++] = left[i++];
//		        }
//		        
//		        while (j < n2) {
//		            arr[k++] = right[j++];
//		        }
//		    }
//		    
//		    public static void printArray(int[] arr) {
//		        for (int num : arr) {
//		            System.out.print(num + " ");
//		        }
//		        System.out.println();
//		    }
//		}




		
		
		
		
		//Q5  subset of array:
//		
//		int mainarray[] = {1,2,6,8,5};
//		int subarray[] = {1,9,6};
//		int k = 0;
//	
//		for(int j=0;j<subarray.length;j++) {
//			for(int i=0;i<mainarray.length;i++) {
//				if(subarray[j]==mainarray[i]) {
//					
//					k = ++k;//when if(true) k will increase
//				}
//			}
//			
//			
//		}
//		
//		if(k==subarray.length) {
//			//this logic is for, if subset array length match with k value it means that much time j loop find true and increase val variable value and store  in k. 
//           //that is actually length of subset array. 
//			System.out.println("Yes,subarray[] is subset of mainarray[]");
//		}
//		
//		else if(k!=subarray.length) {//it is false condition of previous if loop.
//			System.out.println("No,subarray[] is not subset of mainarray[]");
//		}
	
		
		




		
		
		//Q.6 selection sort
//		public class SelectionSort {
//		    public static void main(String[] args) {
//		        int[] arr = {5, 9, 3, 1, 8, 6, 2, 7};
//		        System.out.println("Original array:");
//		        printArray(arr);
//		        
//		        selectionSort(arr);
//		        
//		        System.out.println("\nSorted array:");
//		        printArray(arr);
//		    }
//		    
//		    public static void selectionSort(int[] arr) {
//		        int n = arr.length;
//		        
//		        for (int i = 0; i < n - 1; i++) {
//		            int minIndex = i;
//		            
//		            for (int j = i + 1; j < n; j++) {
//		                if (arr[j] < arr[minIndex]) {
//		                    minIndex = j;
//		                }
//		            }
//		            
//		            swap(arr, i, minIndex);
//		        }
//		    }
//		    
//		    public static void swap(int[] arr, int i, int j) {
//		        int temp = arr[i];
//		        arr[i] = arr[j];
//		        arr[j] = temp;
//		    }
//		    
//		    public static void printArray(int[] arr) {
//		        for (int num : arr) {
//		            System.out.print(num + " ");
//		        }
//		        System.out.println();
//		    }
//		}

	}

}

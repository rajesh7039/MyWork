import java.util.*;

public class Main {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  // n=5
        for (int j = 1; j < n; j++) {   
            int key = array[j];  // key=14  key=3
            int i = j-1;        // i=0   i=1
            while ( (i > -1) && ( array [i] > key ) ) {  // i=0; 9 > 14    // i=1; 14>3  9>3
                array [i+1] = array [i];  // 14 9
                i--;      // 0 -1
            }  
            array[i+1] = key;  // 3
        }  
    }  
       
    public static void main(String a[]){    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :: ");
        int size = sc.nextInt();
        
        int arr1[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            arr1[i] = sc.nextInt();
        }
        
        //9,14,3,2,43
        System.out.println("Before Insertion Sort");  
        for(int i=0;i<size;i++){  
            System.out.print(arr1[i]+" ");  
        }  
        System.out.println();  
          
        insertionSort(arr1);//sorting array using insertion Sort
         
        System.out.println("After Insertion Sort");  
        for(int i=0;i<size;i++){  
            System.out.print(arr1[i]+" ");  
        }
    }    
} 
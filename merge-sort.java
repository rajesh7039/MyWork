import java.util.*;

 public class Main {
    // Function to merge the two sorted arrays
    static void merge(int[] array,int low,int mid,int high){
        int i,j,k;
        int[] c= new int[high-low+1];
        k = 0;
        i=low;
        j=mid+1;
        while(i<=mid && j<=high){
            if(array[i]<=array[j]){
                c[k++] = array[i++];
            }
            else{
                c[k++] = array[j++];
            }
        }
        while(i<=mid){
            c[k++] = array[i++];
        }
        while(j<=high){
            c[k++] = array[j++];
        }
        k=0;
        for(i = low; i<=high; i++){
            array[i] = c[k++];
        }
    }
    // Function implementing the merge sort
    static void mergeSort(int[] array,int low, int high){
        if(high-low+1>1){
            int mid = (low+high)/2;
            mergeSort(array,low,mid);
            mergeSort(array,mid+1,high);
            merge(array,low,mid,high);
        }
    }
    //5,4,3,2,1
    // Function to read the input and display the output
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :: ");
        int size = sc.nextInt(); // size=5

        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Before merge Sort");  
        for(int i=0;i<size;i++){  
            System.out.print(array[i]+" ");
        }
        System.out.println();  
        
        mergeSort(array,0,array.length-1);   //a,0,4
         
        System.out.println("After merge Sort");  
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :: ");
        int size = sc.nextInt(); // size=5

        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Before quick Sort");  
        for(int i=0;i<size;i++){  
            System.out.print(array[i]+" ");
        }
        System.out.println();  
        
        quickSort(array,0,array.length-1);
         
        System.out.println("After quick Sort");  
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    static void quickSort(int[] array,int left, int right){
        if(left>=right){
            return;
        }
        int pivot=array[(left+right)/2];
        int index=partition(array,left,right,pivot);
        quickSort(array,left,index-1);
        quickSort(array,index,right);
    }
    public static int partition(int[] array,int left,int right,int pivot){
        while(left<=right){
            while(array[left]<pivot){
                left++;
            }
            while(array[right]>pivot){
                right--;
            }
            while(left<=right){
                swap(array,left,right);
                left++;
                right--;
                break;
            }
        }
        return left;
    }
    static void swap(int[] array, int left, int right)
    {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
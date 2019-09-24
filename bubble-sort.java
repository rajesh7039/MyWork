import java.util.*;

 public class Main {
    // Function to merge the two sorted arrays
    static void bubbleSort(int[] array){
        int n=array.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(array[j-1]>array[j])
                {
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }
            }
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
        
        System.out.println("Before bubble Sort");  
        for(int i=0;i<size;i++){  
            System.out.print(array[i]+" ");
        }
        System.out.println();  
        
        bubbleSort(array);
         
        System.out.println("After bubble Sort");  
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
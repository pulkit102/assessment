package sorting;

public class bubbleSortarr {
    static int[] bubblesort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,5,5,6,5,2,3,6,2,57,7,9,9,1,5,6,556};
        bubblesort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

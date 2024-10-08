package July26;

public class NextGreaterElement {
    static void printNGE(int arr[], int n){
        for(int i=0;i<n;i++){
           int next = -1;
            for( int j =i+1; j<n ;j++){
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "------>>"+ next);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3,2,5};
        int n = arr.length;
        printNGE(arr, n);

    }
}

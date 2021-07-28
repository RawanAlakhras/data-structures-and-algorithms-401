package array.binary.search;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    public static int BinarySearch(int arr[],int val){
        int l=0;
        int r=arr.length-1;
        int index =-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(arr[mid]==val){
                index =mid;
                return index;
            }
            else if(arr[mid]>val){
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5, 6, 7};

        System.out.println(BinarySearch (arr,7));
    }
}

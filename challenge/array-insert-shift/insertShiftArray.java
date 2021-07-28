package insertShiftArray;
public class Library {
    public static int[] insertShiftArray(int arr[], int value) {
        int n = arr.length;
        int midle = 0;
        if (n % 2 == 0) {
            midle = n / 2;
        } else {
            midle = (n / 2) + 1;
        }
        int newArr[] = new int[n + 1];
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == midle) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[index];
                index++;
            }

        }
        return newArr;

    }

    public static void main(String[] args) {
        int arr2[]={1,2,3,4,5};
        int arr3[]= insertShiftArray(arr2,6);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
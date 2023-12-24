public class BinarySearch {

    public static int binarySearch(int[] a, int lowIndex, int highIndex, int value){
        if(lowIndex > highIndex){
            return -1;
        }
        else{
            int midIndex = (lowIndex + highIndex)/2;
            if(a[midIndex] == value){
                return midIndex;
            } else if (value < a[midIndex]) {
                return binarySearch(a, lowIndex, midIndex-1, value);
            }else {
                return binarySearch(a, midIndex+1, highIndex, value);
            }
        }
    }

    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(BinarySearch.binarySearch(b,0,13, 1));
    }
}

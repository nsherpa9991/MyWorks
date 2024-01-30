public class Merge {
    public static int[] merging(int[] array1, int[] array2) {
        int[] finalArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                finalArray[k] = array1[i];
                i++;
            } else {
                finalArray[k] = array2[j];
                j++;
            }
            k++;

        }

        while(i<array1.length){
            finalArray[k] = array1[i];
            i++;
            k++;
        }

        while(j<array2.length){
            finalArray[k] = array2[j];
            j++;
            k++;
        }
        for (int x : finalArray) {
            System.out.println(x);
        }

        return finalArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,7,8,9};
        int[] arr2 = {1,2,5,6,10,11};
        Merge.merging(arr2,arr1);

    }
}
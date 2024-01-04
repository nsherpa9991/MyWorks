import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static int descendingLargeInteger(int n){
        String finalString ="";
        String s = Integer.toString(n);
        Character[] array1 = new Character[s.length()];
        for(int i=0; i<s.length();i++){
            array1[i] = s.charAt(i);
        }

        Arrays.sort(array1, Comparator.reverseOrder());
        for(int x: array1){
            finalString+=(Character.toString(x));


        }
        return Integer.parseInt(finalString);
    }

    public static void main(String[] args) {
        System.out.println(descendingLargeInteger(178934));
    }
}

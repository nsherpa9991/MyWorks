public class FizzBuzz {
    public static String[] fizzBuzz(int n){
        String[] ans = new String[n];
        for(int i=1;i<=n; i++){
            if(i%3 ==0 && i%5 ==0){
                ans[i-1] = "FizzBuzz";
            } else if (i%3 ==0) {
                ans[i-1] = "Fizz";

            } else if (i%5 == 0) {
                ans[i-1] = "Buzz";

            }else{
                ans[i-1] = Integer.toString(i);
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        for(String n: FizzBuzz.fizzBuzz(15)){
            System.out.println(n);
        }
    }




}


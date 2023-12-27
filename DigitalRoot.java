public class DigitalRoot {
    public static int digital_root(int n){
        if(n<10){
            return n;
        }else{
            int temp = 0;
            while(n>0){
                int i = n%10;
                n/= 10;
                temp = temp +i;
            }
            n = temp;
        }
        return digital_root(n);
    }

    public static void main(String[] args) {
        System.out.println(DigitalRoot.digital_root(493193));
    }

}

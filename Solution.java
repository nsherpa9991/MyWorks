public class Solution {
    public static String whoLikesit(String... names){
        String last = "";
        int length = names.length;
        switch (length) {
            case 0 -> last += "no one like this";
            case 1 -> last+= names[0] +" like this";
            case 2 -> last += names[0] + " and " + names[1]+" like this";
            case 3 -> last += names[0]+", "+names[1]+ " and " + names[1]+" like this";
            default -> last += names[0] +", "+names[1] + " and " +(length-2) +" others like this";
        }

        return last;
    }

    public static void main(String[] args) {
        System.out.println(Solution.whoLikesit("nima", "furba"));

    }
}

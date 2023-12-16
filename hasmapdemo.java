import java.util.HashMap;

public class hasmapdemo {
    private HashMap<Character,Integer> mymap;

    public hasmapdemo(){
        this.mymap = new HashMap<>();
    }
    public void  lowerCase(String s){
        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                mymap.put(s.charAt(i),mymap.getOrDefault(s.charAt(i),0)+1);
            }
        }
    }
    public int getCount(char ch){
        return mymap.getOrDefault(ch,0);

    }
}

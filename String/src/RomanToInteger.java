import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMIV";
        System.out.println(romanToInteger(roman));
    }
    private static int romanToInteger(String str){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //Take a variable to calculate total
        int total = 0;
        //Loop through the string
        for(int i=0; i<str.length(); i++){
            int currentValue = map.get(str.charAt(i));
            //If the current letter value is less than next letter value, subtract it from total
            if(i+1 < str.length() && currentValue < map.get(str.charAt(i+1))){
                total = total - currentValue;
            }
            //Otherwise add it to total;
            else{
                total = total + currentValue;
            }
        }
        return total;
    }
}

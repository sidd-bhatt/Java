public class Atoi {
    public static void main(String[] args) {
        String str = "-123";
        System.out.println(atoi(str));
    }

    private static int atoi(String str){
        int index = 0;
        int sign = 1;
        long result = 0;

        //Remove white spaces from string
        str = str.replace(" ","");

        //Case where if the first character is + or -
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            //Store the sign
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        //Seconds condition make sure characters are digit
        while(index<str.length() && Character.isDigit(str.charAt(index))){
            result = result * 10 + (str.charAt(index) - '0');
            index++;

            //These case takes care of case when the result exceed the 32bit limit (upper and lower).
            if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        //Apply sign to the result and covert to integer and return.
        return (int)(sign*result);
    }
}

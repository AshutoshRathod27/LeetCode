public class RemoveDigitMaximize {

    public static String removeDigit(String number, char digit) {
        String max = "";
        for (int i=0; i<number.length(); i++) {
            if(digit==number.charAt(i)) {
                String updatedString = number.substring(0,i) + number.substring(i+1);
                if(max.compareTo(updatedString)<0)
                    max = updatedString;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(removeDigit("551", '5'));
    }
}

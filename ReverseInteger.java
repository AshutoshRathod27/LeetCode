public class ReverseInteger {

    public static int reverse(int x) {
        try {
            String stringInt = String.valueOf(x);
            if (x < 0) {
                return Integer.parseInt("-" + new StringBuilder(stringInt).reverse().substring(0, stringInt.length() - 1));
            } else {
                return Integer.parseInt(new StringBuilder(stringInt).reverse().toString());
            }
        }catch(NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}

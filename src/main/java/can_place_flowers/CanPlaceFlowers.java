package can_place_flowers;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (n == 0)
            return true;
        for (int i = 0; i < length; i++) {
            if (n == 0)
                return true;
            if (length == 1 && flowerbed[i] == 0)
                n--;
            else if (length == 1 && flowerbed[i] == 1)
                break;
            else if (i == 0 && flowerbed[1] == 0 && flowerbed[i] != 1) {
                n--;
                flowerbed[i] = 1;
            } else if (i == length - 1 && flowerbed[i - 1] == 0 && flowerbed[i] != 1) {
                n--;
                flowerbed[i] = 1;
            } else if (i != 0 && i < length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
    }
}

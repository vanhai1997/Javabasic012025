package BT3_Java_Basic;

public class BT3_2_Logic {
    public static void main(String[] agrs) {
        int number = 100;
        boolean Sosanh = true;
        if (number < 100) {
            System.out.println("Dưới TB");

        } else if (number >= 100 && number < 150) {
            System.out.println("TB");

        } else if (number >= 150 || number < 200) {
            System.out.println("Khá");

        } else if (number > 200) {
            System.out.println("Giỏi");

        }
        if (number >= 100 || Sosanh) {
            System.out.println("Đạt yêu cầu");
        }
    }
}
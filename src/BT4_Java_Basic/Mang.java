package BT4_Java_Basic;

public class Mang {


        public static void main(String[] args) {
            // Tạo mảng để lưu số chẵn
            int[] mangSoChan = new int[26]; // Từ 0 đến 50 có 26 số chẵn
            int index = 0; // Biến để theo dõi vị trí trong mảng

            // Vòng lặp FOR để in và lưu số chẵn
            System.out.println("Các số chẵn từ 0 đến 50:");
            for (int i = 0; i <= 50; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    mangSoChan[index] = i;
                    index++;
                }
            }

            // In mảng số chẵn
            System.out.println("\n\nMảng số chẵn:");
            for (int so : mangSoChan) {
                if (so != 0) { // Chỉ in các phần tử đã được gán giá trị
                    System.out.print(so + " ");
                }
            }
        }
    }

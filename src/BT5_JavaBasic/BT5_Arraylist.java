package BT5_JavaBasic;

import java.util.ArrayList;

public class BT5_Arraylist {
    public static void thongtinNhanVien() {
        ArrayList<String> nhanvien = new ArrayList<>();
        nhanvien.add("Nguyễn Văn Hải");
        nhanvien.add("Nam");
        nhanvien.add("Bắc ninh");

        System.out.println("Thông tin nhân viên");
        for (String item : nhanvien) {
            System.out.println(item);


        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> listSoNguyen = new ArrayList<>();
        // int[] mangSoChan = new int[26]; // Từ 0 đến 50 có 26 số chẵn
        //int index = 0; // Biến để theo dõi vị trí trong mảng

        // Vòng lặp FOR để in và lưu số chẵn
        System.out.println("Các số chẵn từ 0 đến 50:");
        for (int i = 3; i <= 97; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                listSoNguyen.add(i);
                //index++;
            }
        }

        // In mảng số chẵn
        System.out.println("\n\nMảng số chẵn:");
        for (int so : listSoNguyen) {
            if (so != 0) { // Chỉ in các phần tử đã được gán giá trị
                System.out.print(so + " ");

            }

        }
        thongtinNhanVien();

    }

    }




package NguyenVanHai_BT_Java_Basic1;

public class Sinhvien {
    //Biến static
    static String name = "Van hải";
    static String email = "Haideptraibn@gmail.com";
    static String Sđt = " 087654898 ";


    //Biến toàn cục
    static String address = "Bắc ninh";
    static int MSV = 126336;



    public void getinfo(){
      int age = 30;
      System.out.println(age);
      System.out.println(address);
      System.out.println(MSV);
    }

    public static void main(String[] args) {
      Sinhvien Sinhvien = new Sinhvien();// Khai báo bien
        System.out.println(Sinhvien.address);
        System.out.println(Sinhvien.MSV);
        System.out.println(name);
        System.out.println(Sinhvien.Sđt);

    }
}
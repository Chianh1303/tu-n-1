import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diem1");
        System.out.println("Diem2");
        System.out.println("Diem3");

        double kiemtra1 = sc.nextDouble();
        double kiemtra2 = sc.nextDouble();
        double kiemtra3 = sc.nextDouble();
        double DTB = (kiemtra1 + kiemtra2 + kiemtra3) / 3;
        String xeploai = "";
        if (DTB >= 8.5) {
            xeploai = "A";

        } else if (DTB >= 7 & DTB < 8.5) {
            xeploai = "B";
        } else if (DTB >= 5.5 & DTB < 7) {
            xeploai = "C";
        }else if (DTB >=4 & DTB < 5.5) {
            xeploai = "D";
        }else if (DTB < 4) {
            xeploai = "F";
        }
        System.out.println("Sinh vien xep loai:" +" "+ xeploai);
    }
    }

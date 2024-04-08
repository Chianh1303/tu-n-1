import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//       điểm bắt đầu cho việc thực thi chương trình.
        double vnđ = 23000;
//       double: để lưu trữ giá trị số thực, với phần nguyên và phần thập phân.
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiền vào đây");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gía trị VNĐ" + quydoi);

    }
}

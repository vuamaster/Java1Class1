package buoi2BTVN;

public class bai139 {
    /*Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số
    nguyên (vitrihoanthiencuoi). Nếu mảng không có số hoàn thiện thì trả
    về giá trị - 1.*/
    public static void main(String[] args) {
        int[] arr = {5,4,36,6,76,34,28,43};
        int lastPosition = -1; // Khởi tạo giá trị ban đầu của biến lastPosition

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int sum = 1; // Khởi tạo sum bằng 1 vì 1 luôn là ước của mọi số
            for (int j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            if (sum == n) { // Nếu n là số hoàn thiện
                lastPosition = i;
            }
        }
        if (lastPosition == -1) {
            System.out.println("\n -1");
        } else {
            System.out.print("\n vị trí số hoàn thiện cuối cùng "+lastPosition);
        }
    }
}

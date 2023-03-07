package buoi3;

public class bai144 {
    /*Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
            (nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1.*/
    public static boolean kiemtrasonguyento(int n){
        if (n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int songuyentodautien(int[] arr){
        for (int i =0;i<arr.length;i++){
            if (kiemtrasonguyento(arr[i]) == true){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr2 = {2,3,6,7,8,9,23};
        int[] arr1 = {10,4,6,8};
        System.out.println("so nguyen to dau tien trong mang 1 chieu so nguyen la " + songuyentodautien(arr1));
    }
}

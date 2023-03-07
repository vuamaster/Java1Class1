package buoi3;

public class bai143 {
    /*Viết hàm tìm “số chẵn đầu tiên” trong mảng các số nguyên (chandau).
    Nếu mảng không có giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -1 */
    public static int sochan(int[] arr){
        for (int i = 0; i<arr.length;i++){
            if (arr[i]%2 == 0) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,75,8,4};
        int[] arr1 = {1,3,5};
        int min = sochan(arr1);
        System.out.println("so chan dau tien " + min);
    }
}

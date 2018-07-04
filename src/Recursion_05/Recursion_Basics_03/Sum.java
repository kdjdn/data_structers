package Recursion_05.Recursion_Basics_03;

/**
 * 递归数组加法
 * 链表和递归有着密不可缺的关系
 */
public class Sum {

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    // 计算arr[l...n)这个区间内所有数字的和
    private static int sum(int[] arr, int l){//l为左边界点
        if(l == arr.length)//整个数组为空
            return 0;

        // 计算arr[l+1...n)这个区间内所有数字的和
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(nums));
    }
}

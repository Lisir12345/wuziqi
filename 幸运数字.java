package 算法竞技;

public class 幸运数字 {
    // 判断一个数字是否在给定进制下是哈沙德数
    public static boolean isHarshad(int num, int base) {
        int sum = 0;
        int temp = num;

        // 计算 num 在给定进制下的各位数字之和
        while (temp > 0) {
            sum += temp % base;
            temp /= base;
        }

        // 如果 num 能被 sum 整除，返回 true，否则返回 false
        return num % sum == 0;
    }

    // 判断一个数字是否是幸运数字
    public static boolean isLucky(int num) {
        // 判断数字是否在二进制、八进制、十进制、十六进制下都是哈沙德数
        return isHarshad(num, 2) && isHarshad(num, 8) && isHarshad(num, 10) && isHarshad(num, 16);
    }

    public static void main(String[] args) {
        int count = 0; // 记录幸运数字的数量
        int num = 1;   // 从1开始检查数字
        int target = 2023; // 目标幸运数字位置
        // 循环直到找到第2023个幸运数字
        while (count < target) {
            if (isLucky(num)) {
                count++;
            }
            num++;
        }


        // 输出第2023个幸运数字
        System.out.println(num - 1);
    }
}

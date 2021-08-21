package github.petterobam.array;

/**
 * 最多水的容器
 *
 * @author 欧阳洁
 * @date 2021/7/17 18:25
 */
public class MostWarterContainer {
    /**
     * 盛最多水的容器
     * 题目大意
     * 给出一个非负整数数组 a1，a2，a3，…… an，每个整数标识一个竖立在坐标轴 x 位置的一堵高度为 ai 的墙，选择两堵墙，和 x 轴构成的容器可以容纳最多的水。
     * <p>
     * 解题思路
     * 这一题也是对撞指针的思路。首尾分别 2 个指针，每次移动以后都分别判断长宽的乘积是否最大。
     * <p>
     * 代码
     * <p>
     * 作者：halfrost
     * 链接：https://leetcode-cn.com/leetbook/read/leetcode-cookbook/5l8q5j/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static int fun(int[] array) {
        int result = 0;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int ret = (end - start) * Math.min(array[start], array[end]);
            if (array[start] < array[end]) {
                start++;
            } else {
                end--;
            }
            if (ret > result) {
                result = ret;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("dear john".replaceAll(" ", "-"));
        System.out.println(MostWarterContainer.fun(new int[]{4, 2, 3, 7, 8, 2, 1, 6, 5, 1}));
    }
}

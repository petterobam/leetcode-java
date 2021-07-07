package github.petterobam.array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 两数之和
 *
 * @author 欧阳洁
 * @date 2021/7/7 23:33
 */
public class SumOfTwoNums {
    /**
     * 题目大意
     * 在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。
     * <p>
     * 解题思路
     * 这道题最优的做法时间复杂度是 O(n)。
     * <p>
     * 顺序扫描数组，对每一个元素，在 map 中找能组合给定值的另一半数字，如果找到了，直接返回 2 个数字的下标即可。如果找不到，就把这个数字存入 map 中，等待扫到“另一半”数字的时候，再取出来返回结果。
     * <p>
     * 作者：halfrost
     * 链接：https://leetcode-cn.com/leetbook/read/leetcode-cookbook/5lu4og/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static int[] find(int[] arr, int target) {
        if (null == arr || arr.length < 2) {
            return null;
        }
        Map<Integer, Integer> valIdxMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer another = valIdxMap.get(target - arr[i]);
            if (null != another) {
                return new int[]{another, i};
            } else {
                valIdxMap.put(arr[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] res = SumOfTwoNums.find(new int[] {1,4,5,5,7,8}, 8);
        if (null != res) {
            IntStream.of(res).forEach(System.out::println);
        } else {
            System.out.println("not found");
        }
    }
}

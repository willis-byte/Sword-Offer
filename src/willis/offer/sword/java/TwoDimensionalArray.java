package willis.offer.sword.java;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

/**
 * @Author: wuzhijian
 * @Date: 2020/4/2
 * @Description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class TwoDimensionalArray {
    private static final int START_NUM = 10;
    private static final int INTERVEL = 2;

    private static int[][] generateTwoDimensionalArray(int x, int y) {
        int temp = START_NUM;
        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = temp + INTERVEL;
                temp = temp + INTERVEL;
            }
        }
        return array;
    }

    private static boolean find(int [][] array,int num){
        for (int i = 0; i < array.length; i++) {
            int arrayLast = array[i][array[1].length - 1];
            if (arrayLast >= num) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == num) {
                        System.out.println("找到了位置为i:" + i + " j:" + j);
                        System.out.println(Arrays.deepToString(array));
                        return true;
                    }
                }
            }
        }
        System.out.println("找不到,数组为:"+ Arrays.deepToString(array)+"  整数为:"+num);
        return false;
    }
    public static void main(String[] args) {
        find(generateTwoDimensionalArray(10,19),30);

    }


}

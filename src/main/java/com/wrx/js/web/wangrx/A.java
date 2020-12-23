package com.wrx.js.web.wangrx;

public class A {
    class Inner {
        public String  v1 = "Fake News";
        public String v2 = "Go ahead";
    }

    private static String GetVal() {
        try {
            return Inner.class.newInstance().v1;
        } catch (Exception e) {
            try {
                return Inner.class.getDeclaredConstructor(A.class).newInstance((A)null).v2;
            } catch (Exception ee) {
                ee.printStackTrace();
                return "Fake News, Go ahead";
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(GetVal());
    }
    public static boolean searchMatrix(int[][] nums, int x) {
        // Todo your code goes here...
        // 行数
        int rowSize = nums.length;
        // 列数
        int colSize = nums[0].length;

        for(int i = rowSize - 1, j = 0; i >= 0 && j< colSize-1;)
        {
            if(x == nums[i][j])
                return true;
            if (x < nums[i][j])
            {
                i--;
                continue;
            }
            if(x > nums[i][j])
            {
                j++;
                continue;
            }
        }
        return false;
    }
}

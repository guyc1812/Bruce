package com.avengers.bruce.algorithm.basic.StringAbout.LCS;

public class SubString {

    private static String lcs(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int c[][] = new int[len1 + 1][len2 + 1];

        int maxNum = 0;
        int maxIndex = 0;

        // str1为列，str2为行
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;

                    //记录 最大长度 和 index
                    if (c[i][j] > maxNum) {
                        maxNum = c[i][j];
                        maxIndex = i;
                    }

                } else {
                    c[i][j] = 0;
                }
            }
        }

        return str1.substring(maxIndex - maxNum, maxIndex);
    }

    public static void main(String[] args) {

        String str1 = "ABCBADAB";
        String str2 = "BDCABCBA";

        String LCS = lcs(str1, str2);

        System.out.println(LCS);
        //ABCBA

    }


}

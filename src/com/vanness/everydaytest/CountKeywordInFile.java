package com.vanness.everydaytest;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountKeywordInFile {
    public static void main(String[] args) {
        countKeywordInFile("D:/read.txt", "java");
    }

    /**
     * 题目：统计一个文件中某个字母出现的次数
     *
     * @param filePath
     * @param keyword
     * @return
     */
    public static int countKeywordInFile(String filePath, String keyword) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String str;
            int count = 0;
            while ((str = br.readLine()) != null) {
                Pattern p = Pattern.compile(keyword);
                Matcher matcher = p.matcher(str);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(keyword + "c在文件中出现的次数为：" + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}

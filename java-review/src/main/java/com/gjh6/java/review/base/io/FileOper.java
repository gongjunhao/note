package com.gjh6.java.review.base.io;

import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-13
 * Time: 11:10 AM
 */
public class FileOper {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/gjh/Downloads/git_clone.all.sh");
        File fileout = new File("/Users/gjh/Downloads/git_clone_all_new.sh");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(fileout);
        BufferedReader bf = new BufferedReader(fileReader);{}
        String str;
        // 按行读取字符串
        while ((str = bf.readLine()) != null) {
            String target = " ."+str.substring(str.indexOf("88/")+2, str.lastIndexOf("."))+"/\n";
            fileWriter.write(str+target);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
        BiConsumer<File, String> fileStringBiConsumer = File::new;
        fileStringBiConsumer.accept(file, "/xxx");
    }
}

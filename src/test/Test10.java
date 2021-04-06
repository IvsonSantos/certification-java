package test;

import java.io.File;
import java.io.FileFilter;

public class Test10 {

    public static void main(String[] args) {

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        File dir = new File("/Users/ivsonsantos/Projects/certificacao-java/src/error");
        File[] javaFiles = dir.listFiles(fileFilter);

        System.out.println(javaFiles.length);



        // using almbda
        FileFilter filter = (File pathname) -> pathname.getName().endsWith(".java");
    }
}

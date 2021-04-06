package test;

import java.io.File;
import java.io.FileFilter;

public class Test11 {

    public static void main(String[] args) {

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith("java");
            }
        };

        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith("java");

        File dir = new File("/Users/ivsonsantos/Projects/certificacao-java/src/error");
        File[] javaFiles = dir.listFiles(filterLambda);

        for (File f : javaFiles) {
            System.out.println(f);
        }
    }
}

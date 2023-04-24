package ss17_doc_ghi_file_nhi_phan.bai_2;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    private static final String FILE_SOURCE_PATH = "codegym/src/ss17_doc_ghi_file_nhi_phan/bai_2/source_file";
    private static final String FILE_SOURCE_PATH1 = "codegym/src/ss17_doc_ghi_file_nhi_phan/bai_2/copy_file";

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File sourceFile = new File(FILE_SOURCE_PATH);
        File destFile = new File(FILE_SOURCE_PATH1);
        try {
            copyFileUsingStream(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Copy completed");
    }
}

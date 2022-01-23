package ex24;

import java.io.*;

public class FileCopyNoBuffer {
    public static void main(String[] args) {
        String inFileStr = "test-in.txt";
        String outFileStr = "test-out.txt";
        FileInputStream in = null;
        FileOutputStream out = null;
        long startTime, elapsedTime;
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");

        try {
            in = new FileInputStream(inFileStr);
            out = new FileOutputStream(outFileStr);
            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

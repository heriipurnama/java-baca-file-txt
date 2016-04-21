/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelia;

/**
 *
 * @author heriipurnama
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Adelia {

    /**
     * @param args the command line arguments
     */
   private static String file;
   public static void main(String[] args) {
       
       Scanner i=new Scanner(System.in);
       System.out.println("==========================");
       System.out.println("Pilihan nama file text");
       System.out.println("--------------------------");
       System.out.println("1. id.txt");
       System.out.println("2. data.txt");
       System.out.print("Masukkan nama file TXT : ");
        file=i.next();
      
      StringBuffer contents = new StringBuffer();
      BufferedReader reader = null;
       try {
             reader = new BufferedReader(new FileReader(file));
              String text = null;
                // ulangi sampai semua baris terbaca
                while ((text = reader.readLine()) != null) {
                    contents.append(text)
                    .append(System.getProperty("line.separator"));
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                    reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    
     // tampilkan isi file
     System.out.println(contents.toString());
  }
}
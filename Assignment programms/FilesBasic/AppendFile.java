package com.onebill.corejava.Files;
import java.io.*;

public class AppendFile {
  
    public static void appendStrToFile(String fileName,
                                       String str)
    {
        try {
  
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                   new FileWriter(fileName, true));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
  
    public static void main(String[] args)
        throws Exception
    {
        
        String fileName = "/home/hindhuja/Documents/Files/Movies.txt";

        // Let us append given str to above
        String str = "||Maze Runner";
        appendStrToFile(fileName, str);
  
        // Let us print modified file
        try {
            BufferedReader in = new BufferedReader(
                        new FileReader("/home/hindhuja/Documents/Files/Movies.txt"));
  
            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        }
        catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }
}
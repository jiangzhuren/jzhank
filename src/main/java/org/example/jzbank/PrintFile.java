package org.example.jzbank;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintFile {
    RealServer rs = new RealServer();
    Scanner sc = new Scanner(System.in);

    public PrintFile() throws IOException {
        try {
            System.out.println("请输入文件名");
            String fileName = sc.next();
            String fileType = ".txt";
            File file = new File("C:\\Users\\24741\\Desktop\\" + fileName + fileType);
            PrintWriter writer = new PrintWriter(file);
            ArrayList realServer = rs.getRealServer();
            Iterator it = realServer.iterator();
            while (it.hasNext()){
                String a = (String) it.next();
                writer.print(a);
            }
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

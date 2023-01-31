package org.example.jzbank.member;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
public class AutoRead {
    public static void main(String[] args) throws Exception {
        final String SLB = "slb member s_";
        Scanner sc = new Scanner(in);
        String ip = "";
        int port;
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<String> writeList = new ArrayList<>();
        out.println("请输入桌面上要读取的文件名");
        String readFilename = sc.next();
        String fileName = "C:\\Users\\24741\\Desktop\\" + readFilename;
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(".")) {
                ip = line;
            } else if (1 < line.length()) {
                port = Integer.parseInt(line);
                ar.add(port);
            }
            for (Integer o : ar) {
                String slb ;
                slb = SLB + ip + "_" + o + "\n" + "ip address "
                        + ip + "\n" + "port " + o + "\n";
                writeList.add(slb);
            }
            ar.clear();
        }
        br.close();
        try {
            out.println("请输入文件名");
            String outFileName = sc.next();
            String fileType = ".txt";
            File outFile = new File("C:\\Users\\24741\\Desktop\\" + outFileName + fileType);
            PrintWriter writer = new PrintWriter(outFile);
            for (String a : writeList) {
                writer.println(a);
            }
            writer.close();
        } catch (Exception e) {
            out.println("生成文件出错");
        }
    }
}

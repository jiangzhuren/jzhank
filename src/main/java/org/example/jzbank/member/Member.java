package org.example.jzbank.member;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Member {
    Scanner sc = new Scanner(System.in);
    final String SLB = "slb member rs_";
    String ip = "";
    int port = 0;
    String slb ;
    ArrayList<String> list = new ArrayList<String>();
    int count = 0;
    public Member() throws IOException {
        do {
            System.out.println("请输入ip和端口");
            ip = sc.next();
            port = sc.nextInt();
            slb = "";
            slb = SLB + ip + "_" + port  + "\n" + "ip address " + ip + "\n" +
                    "port " + port + "\n" + "\n";
            list.add(slb);
            count++;
            if (port == 114514){
                System.out.println("添加了" + count + "个真实服务器");
                break;
            }
        }while (true);
    }
    public ArrayList<String> getRealServer(){
        return  list;
    }
}

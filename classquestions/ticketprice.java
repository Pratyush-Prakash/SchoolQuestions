package classquestions;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.*;
import java.util.*;
import java.util.Scanner;
/*
        ticket amount                     discount
        >70000                               18%
        55001 to 70000                       16%
        35001 to 55000                       12%
        25001 to 35000                       10%
        <25001                                2%

      sl no       Name          Ticket charge       Discount      Net amount

print like this for 15 people
 */


public class ticketprice {
    public static void  main(String args[]) throws IOException {
//        Scanner obj = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double dis=1 ;int  net=0;
        String name[] = new String[5];
        int ticket[] = new int[5];

        System.out.println("Enter names and amount of ticket : ");
        for(int i=0;i<5;i++)
        {
            name[i] = br.readLine();
            ticket[i] = Integer.parseInt(br.readLine());
        }
        for(int i =0;i<5;i++)
        {
            if(ticket[i]>70000)
            {
                dis = ticket[i]*0.18;
                net = ticket[i] - (int) dis;
            }else if(ticket[i]>55001 &&ticket[i]<70000)
            {
                dis = ticket[i]*0.16;
                net = ticket[i] - (int) dis;
            }else if(ticket[i]>35001 && ticket[i]<55000)
            {
                dis = ticket[i]*0.12;
                net = ticket[i] - (int) dis;
            }else if(ticket[i]>25001 && ticket[i]<35000)
            {
                dis = ticket[i]*0.10;
                net = ticket[i]- (int) dis;
            }else if(ticket[i]<25001)
            {
                dis = ticket[i]*0.02;
                net = ticket[i] - (int) dis;
            }
            System.out.println("Name"+" "+name[i]+" "+"Ticket charge"+" "+ticket[i]+" "+"Discount"+" "+dis+" "+"Net amount"+" "+net);
        }

    }
}

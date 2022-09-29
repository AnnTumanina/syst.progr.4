package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader rd = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter sttt = new BufferedWriter(new FileWriter("statistika.txt"));)
        {
            String txt = "";
            String str;

            while ((str = rd.readLine())!=null){
                txt+=(str+" ");
            }
            System.out.println(txt);
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            for (String simvol:txt.split("")) {
                count++;
                if (Objects.equals(simvol, " ")){
                    count1++;
                }
            }
            String[] slova = txt.split("\\s+");
            System.out.println(Arrays.toString(slova));
            for (String slova1:slova){
                count2++;
            }
            count1--;
            count--;
            count1=count-count1;
            System.out.println(count+" "+count1+" "+count2);
            sttt.write("Количество символов: "+count+"\nКоличество символов без пробелов: "+count1+"\nКоличество слов: "+count2);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
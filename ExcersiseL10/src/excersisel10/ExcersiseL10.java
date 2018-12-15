/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersisel10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 */
public class ExcersiseL10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Task №1");
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread1");
                }
            }

        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread2");
                }
            }

        };
        Thread th3 = new Thread() {
            @Override
            public void run() {
                while ((th1.isAlive() || th2.isAlive())) {
                    try {
                        sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ExcersiseL10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i < 5; i++) {
                    System.err.println("Thread3");
                }
            }
        };
        th1.start();
        th2.start();
        th3.start();
        Thread.sleep(2000);

        System.out.println("Task №2");
        System.out.println("Щось я тут не поняв))))");
        System.out.println("Task №3");
        Thread one = new Thread("ONE") {
            @Override
            public void run() {
                Thread two = new Thread("TWO") {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number " + getName());
                        }
                        Thread three = new Thread("THREE") {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number " + getName());
                                }
                            }
                        };
                        three.start();
                    }
                };
                two.start();
            }
        };
        one.start();
        
        Thread.sleep(2000);

        System.out.println("Task №4");
        String fileName = "text.txt";
        List<String> fileContext = new ArrayList<>();
        String s;
        String longestStr = "";
        String Name = "";
        String birthday = "";
        int count = 0;
        int longest = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((s = br.readLine()) != null) {
                fileContext.add(s);
                if (s.indexOf("д.р.") != -1) {
                    birthday = s.substring(s.indexOf("д.р.") + "д.р.".length() + 1);
                }
                if (count == 0) {
                    Name = s;
                }
                if (s.length() > longest) {
                    longest = s.length();
                    longestStr = s;
                }
                count++;
            }
        } catch (Exception ex) {
            Logger.getLogger(ExcersiseL10.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("text2.txt"))) {
            for (String str : fileContext) {
                bw.write(str + "\r\n");
            }
        } catch (Exception ex) {
            Logger.getLogger(ExcersiseL10.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Longest string have " + longest + "\r\n"
                + "It is : " + longestStr + " characters" + "\r\n"
                + "text.txt has " + (count + 1) + " lines." + "\r\n"
                + "My birthDay is " + birthday + "\r\n"
                + "My name is " + Name);
    }

}

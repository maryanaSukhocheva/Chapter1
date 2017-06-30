/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.four.password.main;

import java.util.Scanner;

/**
 *
 * @author SLAVA
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String samplePassword ="образец";
        System.out.println("Введите пароль и нажмите <Enter>:");
        String encoding = System.getProperty("console.encoding", "cp1251");
        Scanner scan = new Scanner(System.in, encoding);
        String password = "";
        if (scan.hasNext()) {
            password = scan.next();
           }
        if (password.equals(samplePassword)){
           System.out.println("Пароль введен верно!"); 
        } else {
           System.out.println("Пароль введен не верно!"); 
        }
           
    }
}

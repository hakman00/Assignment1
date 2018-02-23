/*
    NAME            :   Heinrich Klein
    STUDENT NUMBER  :   195032659
    DATE            :   23 Feb 2018
    DESCRIPTION     :   This project was cloned from a peers github,
                        then modified and pushed to my github repository.
 */
package com.IntelliJProjects;

import javax.swing.*;

public class AdditionApp {

    public static void main(String[] args) {
	// write your code here
        String s1 = JOptionPane.showInputDialog("ENTER FIRST NUMBER: "); //upadted for user readability
        String s2 = JOptionPane.showInputDialog("ENTER SECOND NUMBER: "); //upadted for user readability
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null,"ADDITION RESULT: "+sum,"Results", JOptionPane.INFORMATION_MESSAGE); //upadted for user readability
    }
}

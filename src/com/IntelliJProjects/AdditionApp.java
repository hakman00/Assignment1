package com.IntelliJProjects;

import javax.swing.*;

public class AdditionApp {

    public static void main(String[] args) {
	// write your code here
        String s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
        String s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

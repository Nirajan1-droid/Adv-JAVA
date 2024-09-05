/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Basic {

    public  Basic() {
        // Create the main frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a panel to hold and organize components
        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // GridLayout with 2 columns and 10px gaps
        
        // Add a JLabel
        JLabel label = new JLabel("Label:");
        panel.add(label);
//        JLabel('label 1')
        
        // Add a JTextField
        JTextField textField = new JTextField(15);
        panel.add(textField);
//        JTextField(15);

        // Add a JLabel for password
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        
        // Add a JPasswordField
        JPasswordField passwordField = new JPasswordField(15);
        panel.add(passwordField);
//JPasswordField(no_of_characters)        
        // Add a JLabel for multi-line text
        JLabel textAreaLabel = new JLabel("Text Area:");
        panel.add(textAreaLabel);

        
        // Add a JTextArea
        JTextArea textArea = new JTextArea(5, 15);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);
//        TO MAKE THE TEXT AREA SCROLLABLE JScrollPane(nameoftextarea) and instead of adding text area to panel
// we add scrollablepane to the panel.
        // Add a JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");
        panel.add(checkBox);
        
        // Add radio buttons in a ButtonGroup
        JLabel radioButtonLabel = new JLabel("Choose one:");
        panel.add(radioButtonLabel);
        
        
        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        ButtonGroup radioGroup2 = new ButtonGroup();
        
        
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        
        
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioGroup2.add(radioButton2);
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
//        radioPanel.add(radioButton)
        panel.add(radioPanel);
        
        // Add a JComboBox
        JLabel comboBoxLabel = new JLabel("Select an option:");
        panel.add(comboBoxLabel);
        
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        panel.add(comboBox);
        
        String[] optionsanother = {"sas"};
        JComboBox<String> comboBoxanother=  new JComboBox<>(optionsanother);
        panel.add(comboBoxanother);
        
        
        // Add a JButton
        JButton button = new JButton("Submit");
        panel.add(button);
        
        JButton buttonc = new JButton("cancel");
        panel.add(buttonc);
        
        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        
        // Set the frame visibility
        frame.setVisible(true);
    }
}

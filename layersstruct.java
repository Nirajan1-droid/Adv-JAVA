/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layer {

    public Layer(){
        // Create the main frame
        JFrame frame = new JFrame("Swing Layout Managers Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // FlowLayout Panel
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Flow 1"));
        flowPanel.add(new JButton("Flow 2"));
        flowPanel.add(new JButton("Flow 3"));
        flowPanel.add(new JButton("Flow 4"));

        // BorderLayout Panel
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // GridLayout Panel
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        gridPanel.add(new JButton("Grid 1"));
        gridPanel.add(new JButton("Grid 2"));
        gridPanel.add(new JButton("Grid 3"));
        gridPanel.add(new JButton("Grid 4"));
        gridPanel.add(new JButton("Grid 5"));
        gridPanel.add(new JButton("Grid 6"));

        // BoxLayout Panel
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Box 1"));
        boxPanel.add(Box.createVerticalStrut(10)); // Adds space between buttons
        boxPanel.add(new JButton("Box 2"));
        boxPanel.add(Box.createVerticalStrut(10)); // Adds space between buttons
        boxPanel.add(new JButton("Box 3"));

        // GridBagLayout Panel
        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding around components

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagPanel.add(new JButton("GridBag 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gridBagPanel.add(new JButton("GridBag 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gridBagPanel.add(new JButton("GridBag 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gridBagPanel.add(new JButton("GridBag 4"), gbc);

        // CardLayout Panel
        JPanel cardPanel = new JPanel(new CardLayout());
        JPanel card1 = new JPanel();
        card1.add(new JButton("Card 1 Button"));
        JPanel card2 = new JPanel();
        card2.add(new JButton("Card 2 Button"));

        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");

        // Add panels to the main frame
        frame.add(flowPanel, BorderLayout.NORTH);
        frame.add(borderPanel, BorderLayout.WEST);
        frame.add(gridPanel, BorderLayout.CENTER);
        frame.add(boxPanel, BorderLayout.EAST);
        frame.add(cardPanel, BorderLayout.SOUTH);

        // Card Layout Switcher
        JButton switchCardButton = new JButton("Switch Card");
        switchCardButton.addActionListener(new ActionListener() {
            private boolean card1Visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cardPanel.getLayout();
                if (card1Visible) {
                    cl.show(cardPanel, "Card2");
                } else {
                    cl.show(cardPanel, "Card1");
                }
                card1Visible = !card1Visible;
            }
        });
        frame.add(switchCardButton, BorderLayout.PAGE_END);

        // Set frame visibility
        frame.setVisible(true);
    }
}

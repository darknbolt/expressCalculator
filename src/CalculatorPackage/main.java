package CalculatorPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class main {
    public static void main(String[] args) {
        {//Frame
            JFrame frame = new JFrame("Express Calculator");
            frame.setSize(385, 330);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Panel
            JPanel panel = new JPanel();
            panel.setLayout(null);
            frame.add(panel);

            //Calculator
            String operation = "";
            int a = 0;
            int b = 0;
            String sum = "";
            if (operation == "+") {
                sum = Integer.toString(a + b);
            } else if (operation == "-") {
                sum = Integer.toString(a - b);
            } else if (operation == "*") {
                sum = Integer.toString(a * b);
            } else if (operation == "/") {
                sum = Integer.toString(a / b);
            } else {
                sum = "";
            }

            //Text Field
            JTextField textFieldOfSum = new JTextField(sum);
            textFieldOfSum.setBounds(180, 20, 180, 40);
            panel.add(textFieldOfSum);

            JButton numEquals = new JButton("=");
            numEquals.setBounds(70, 40, 60, 60);
            panel.add(numEquals);
            numEquals.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int counter = 0; int x = 0; int y = 0; char sign;
                    String test = textFieldOfSum.getText();
                    for(int i = 0; i < test.length(); i++){

                        if(Character.isDigit(test.charAt(i)) && counter == 0){
                            x =+ Character.getNumericValue(test.charAt(i));
                        }else if(!Character.isDigit(test.charAt(i))){
                            counter++;
                            sign = test.charAt(i);
                        }else{
                            y =+ Character.getNumericValue(test.charAt(i));
                        }
                    }
                    int finalSum = x+y;

                    textFieldOfSum.setText(Integer.toString(finalSum));

                }
            });

            //Buttons
            JButton num1 = new JButton("1");
            num1.setBounds(180, 100, 60, 60);
            panel.add(num1);
            num1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit1 = textFieldOfSum.getText() + num1.getText();
                    textFieldOfSum.setText(digit1);
                }
            });


            JButton num2 = new JButton("2");
            num2.setBounds(240, 100, 60, 60);
            panel.add(num2);
            num2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit2 = textFieldOfSum.getText() + num2.getText();
                    textFieldOfSum.setText(digit2);
                }
            });
            JButton num3 = new JButton("3");
            num3.setBounds(300, 100, 60, 60);
            panel.add(num3);
            num3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit3 = textFieldOfSum.getText() + num3.getText();
                    textFieldOfSum.setText(digit3);
                }
            });
            JButton num4 = new JButton("4");
            num4.setBounds(180, 160, 60, 60);
            panel.add(num4);
            num4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit4 = textFieldOfSum.getText() + num4.getText();
                    textFieldOfSum.setText(digit4);
                }
            });
            JButton num5 = new JButton("5");
            num5.setBounds(240, 160, 60, 60);
            panel.add(num5);
            num5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit5 = textFieldOfSum.getText() + num5.getText();
                    textFieldOfSum.setText(digit5);
                }
            });
            JButton num6 = new JButton("6");
            num6.setBounds(300, 160, 60, 60);
            panel.add(num6);
            num6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit6 = textFieldOfSum.getText() + num6.getText();
                    textFieldOfSum.setText(digit6);
                }
            });
            JButton num7 = new JButton("7");
            num7.setBounds(180, 220, 60, 60);
            panel.add(num7);
            num7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit7 = textFieldOfSum.getText() + num7.getText();
                    textFieldOfSum.setText(digit7);
                }
            });
            JButton num8 = new JButton("8");
            num8.setBounds(240, 220, 60, 60);
            panel.add(num8);
            num8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit8 = textFieldOfSum.getText() + num8.getText();
                    textFieldOfSum.setText(digit8);
                }
            });

            JButton num9 = new JButton("9");
            num9.setBounds(300, 220, 60, 60);
            panel.add(num9);
            num9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit9 = textFieldOfSum.getText() + num9.getText();
                    textFieldOfSum.setText(digit9);
                }
            });

            JButton num0 = new JButton("0");
            num0.setBounds(10, 220, 60, 60);
            panel.add(num0);
            num0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digit0 = textFieldOfSum.getText() + num0.getText();
                    textFieldOfSum.setText(digit0);
                }
            });

            JButton numAddition = new JButton("+");
            numAddition.setBounds(10, 100, 60, 60);
            panel.add(numAddition);
            numAddition.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int sum = Integer.parseInt(textFieldOfSum.getText());
                    String digitAdd = textFieldOfSum.getText() + numAddition.getText();
                    textFieldOfSum.setText(digitAdd);

                }
            });

            JButton numSubtraction = new JButton("-");
            numSubtraction.setBounds(70, 100, 60, 60);
            panel.add(numSubtraction);
            numSubtraction.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digitSub = textFieldOfSum.getText() + numSubtraction.getText();
                    textFieldOfSum.setText(digitSub);

                }
            });

            JButton numMultiplication = new JButton("*");
            numMultiplication.setBounds(10, 160, 60, 60);
            panel.add(numMultiplication);
            numMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digitMul = textFieldOfSum.getText() + numMultiplication.getText();
                    textFieldOfSum.setText(digitMul);
                }
            });

            JButton numDivision = new JButton("/");
            numDivision.setBounds(70, 160, 60, 60);
            panel.add(numDivision);
            numDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digitDiv = textFieldOfSum.getText() + numDivision.getText();
                    textFieldOfSum.setText(digitDiv);
                }
            });

            JButton numDot = new JButton(".");
            numDot.setBounds(70, 220, 60, 60);
            panel.add(numDot);
            numDot.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String digitDot = textFieldOfSum.getText() + numDot.getText();
                    textFieldOfSum.setText(digitDot);
                }
            });

            JButton numC = new JButton("C");
            numC.setBounds(10, 40, 60, 60);
            panel.add(numC);
            String finalSum = sum;
            numC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textFieldOfSum.setText(finalSum);
                }
            });

            frame.setVisible(true);
        }
    }
}

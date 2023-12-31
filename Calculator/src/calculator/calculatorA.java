package calculatorA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorA implements ActionListener {

    Double number, res, textFieldnumber, labeltextnumber;
    int calculation;
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttondot = new JButton(".");
    JButton buttonclear = new JButton("C");
    JButton buttondelete = new JButton("DEL");
    JButton buttonequal = new JButton("=");
    JButton buttonmul = new JButton("x");
    JButton buttondiv = new JButton("/");
    JButton buttonadd = new JButton("+");
    JButton buttonsub = new JButton("-");
    JButton buttonsquare = new JButton("x\u00B2");
    JButton buttonreciprocal = new JButton("1/x");
    JButton buttonsqrt = new JButton("\u221A");

    calculatorA(){
        preparegui();
        addComponents();
        actionEvent();
    }

    public static void main(String[]args){
        new calculatorA();
    }

    public void preparegui(){
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(305, 500);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void addComponents(){

        label.setBounds(240,-10,270,50);
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.BLACK);
        onRadioButton.setForeground(Color.WHITE);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.BLACK);
        offRadioButton.setForeground(Color.WHITE);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        //Setting property of button 7
        button7.setBounds(10, 230, 60, 40);
        button7.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button7);

        // Setting property of button 8
        button8.setBounds(80, 230, 60, 40);
        button8.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button8);

        //Setting property of button 9
        button9.setBounds(150, 230, 60, 40);
        button9.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button9);

        //Setting property of button 4
        button4.setBounds(10, 290, 60, 40);
        button4.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button4);

        //Setting property of button 5
        button5.setBounds(80, 290, 60, 40);
        button5.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button5);

        //Setting property of button 6
        button6.setBounds(150, 290, 60, 40);
        button6.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button6);

        //Setting property of button 1
        button1.setBounds(10, 350, 60, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button1);

        //Setting property of button 2
        button2.setBounds(80, 350, 60, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button2);

        //Setting property of button 3
        button3.setBounds(150, 350, 60, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button3);

        //Setting property of dot button
        buttondot.setBounds(150, 410, 60, 40);
        buttondot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttondot);

        //Setting property of button 0
        button0.setBounds(10, 410, 130, 40);
        button0.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button0);

        //Setting property of button =
        buttonequal.setBounds(220, 350, 60, 100);
        buttonequal.setFont(new Font("Arial", Font.BOLD, 20));
        buttonequal.setBackground(new Color(239, 188, 2));
        frame.add(buttonequal);

        //Setting property of button /
        buttondiv.setBounds(220, 110, 60, 40);
        buttondiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttondiv.setBackground(new Color(239, 188, 2));
        frame.add(buttondiv);

        //Setting property of button square root
        buttonsqrt.setBounds(10, 170, 60, 40);
        buttonsqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonsqrt);

        //Setting property of button X
        buttonmul.setBounds(220, 230, 60, 40);
        buttonmul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonmul.setBackground(new Color(239, 188, 2));
        frame.add(buttonmul);

        //Setting property of button -
        buttonsub.setBounds(220, 170, 60, 40);
        buttonsub.setFont(new Font("Arial", Font.BOLD, 20));
        buttonsub.setBackground(new Color(239, 188, 2));
        frame.add(buttonsub);
        //Setting property of button +
        buttonadd.setBounds(220, 290, 60, 40);
        buttonadd.setFont(new Font("Arial", Font.BOLD, 20));
        buttonadd.setBackground(new Color(239, 188, 2));
        frame.add(buttonadd);

        //Setting property of button square
        buttonsquare.setBounds(80, 170, 60, 40);
        buttonsquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonsquare);

        //Setting property of reciprocal button
        buttonreciprocal.setBounds(150, 170, 60, 40);
        buttonreciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonreciprocal);

        //Setting property of delete button
        buttondelete.setBounds(150, 110, 60, 40);
        buttondelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttondelete.setBackground(Color.red);
        buttondelete.setForeground(Color.white);
        frame.add(buttondelete);

        //Setting property of clear button
        buttonclear.setBounds(80, 110, 60, 40);
        buttonclear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonclear.setBackground(Color.red);
        buttonclear.setForeground(Color.white);
        frame.add(buttonclear);
    }

    public void actionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonsub.addActionListener(this);
        buttonsquare.addActionListener(this);
        buttonsqrt.addActionListener(this);
        buttonreciprocal.addActionListener(this);
        buttonmul.addActionListener(this);
        buttonequal.addActionListener(this);
        buttondot.addActionListener(this);
        buttondiv.addActionListener(this);
        buttondelete.addActionListener(this);
        buttonclear.addActionListener(this);
        buttonadd.addActionListener(this);
    }

    public void enable() {
        onRadioButton.setEnabled(false); //Functionality Off
        offRadioButton.setEnabled(true); //Functionality On
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonclear.setEnabled(true);
        buttondelete.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonsqrt.setEnabled(true);
        buttonsquare.setEnabled(true);
        buttonreciprocal.setEnabled(true);
        buttonsub.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonmul.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        buttonadd.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        buttonequal.setEnabled(true);
        button0.setEnabled(true);
        buttondot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false); //Functionality Off
        textField.setText("");
        label.setText("");
        res=0.0;
        calculation=0;
        buttonclear.setEnabled(false);
        buttondelete.setEnabled(false);
        buttondiv.setEnabled(false);
        buttonsqrt.setEnabled(false);
        buttonsquare.setEnabled(false);
        buttonreciprocal.setEnabled(false);
        buttonsub.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonmul.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        buttonadd.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        buttonequal.setEnabled(false);
        button0.setEnabled(false);
        buttondot.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();//Calling enable() function
        } else if (source == offRadioButton) {
            disable();//Calling disable function
        }else if (source == buttonclear){
            res = 0.0;
            calculation=0;
            label.setText("");
            textField.setText("");
        }else if(source == buttondelete) {
            int len = textField.getText().length(); //getting the length of input-element
            int lastindex = len - 1;
            if (len > 0) {
                StringBuffer sb = new StringBuffer(textField.getText());
                sb.deleteCharAt(lastindex);
                textField.setText(sb.toString());
            }

        }else if(source == button0){
            if(textField.getText().equals("0")){ //if the textfield is just 0
                return;
            }
            else{
                textField.setText( (textField.getText()) +"0"); //appending
            }
        }else if(source == button1){
            textField.setText(textField.getText() + "1");
        }else if(source == button2){
            textField.setText(textField.getText() + "2");
        }else if(source == button3){
            textField.setText(textField.getText() + "3");
        }else if(source == button4){
            textField.setText(textField.getText() + "4");
        }else if(source == button5){
            textField.setText(textField.getText() + "5");
        }else if(source == button6){
            textField.setText(textField.getText() + "6");
        }else if(source == button7){
            textField.setText(textField.getText() + "7");
        }else if(source == button8){
            textField.setText(textField.getText() + "8");
        }else if(source == button9){
            textField.setText(textField.getText() + "9");
        }
        else if(source == buttonadd){
            if (!textField.getText().isEmpty()) {
                calcupart();
                if(Double.toString(res).endsWith(".0")){
                    label.setText(Double.toString(res).replace(".0","")+"+");
                    textField.setText("");
                }else{
                    label.setText(Double.toString(res));
                    textField.setText("");
                }
                calculation = 1;
            }
        }
        else if(source == buttonsub){
            if(!textField.getText().isEmpty()) {
                calcupart();
                if (Double.toString(res).endsWith(".0")) {
                    label.setText(Double.toString(res).replace(".0", "") + "-");
                    textField.setText("");
                } else {
                    label.setText(Double.toString(res));
                    textField.setText("");
                }
                calculation = 2;
            }
        }
        else if (source == buttondiv) {
            if(!textField.getText().isEmpty()) {
                calcupart();
                if (Double.toString(res).endsWith(".0")) {
                    label.setText(Double.toString(res).replace(".0", "") + "/");
                    textField.setText("");
                } else {
                    label.setText(Double.toString(res));
                    textField.setText("");
                }
                calculation = 3;
            }
        }
        else if (source == buttonmul) {
            if(!textField.getText().isEmpty()) {
                calcupart();
                if (Double.toString(res).endsWith(".0")) {
                    label.setText(Double.toString(res).replace(".0", "") + "x");
                    textField.setText("");
                } else {
                    label.setText(Double.toString(res));
                    textField.setText("");
                }
                calculation = 4;
            }
        }
        else if (source == buttondot){
            if(textField.getText().contains(".")){
                return;
            }
            else{
                textField.setText(textField.getText()+".");
            }
        }
        else if(source == buttonsqrt){
            number = Double.parseDouble(textField.getText());
            double Sqrt = Math.sqrt(number);
            if(Double.toString(Sqrt).endsWith(".0")){
                textField.setText(Double.toString(Sqrt).replace(".0",""));
            }else{
                textField.setText(Double.toString(Sqrt));
            }
//            textField.setText(Double.toString(Sqrt));
        }
        else if(source == buttonsquare){
            number = Double.parseDouble(textField.getText());
            double Square = Math.pow(number,2);
            if(Double.toString(Square).endsWith(".0")){
                textField.setText(Double.toString(Square).replace(".0",""));
            }
            else{
                textField.setText(Double.toString(Square));
            }
//            textField.setText(Double.toString(Square));
        } else if (source == buttonreciprocal) {
            number = Double.parseDouble(textField.getText());
            double ans = 1/number;
            String str = Double.toString(ans);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }
            else{
                textField.setText(str);
            }
        }
        else if (source == buttonequal){
            if(textField.getText().isEmpty()){
                textField.setText(Double.toString(number));
                label.setText("0");
            }
            equal();
        }
    }

    private void calcupart() {
        if(!textField.getText().isEmpty()){
            number = Double.parseDouble(textField.getText());
            if(calculation == 0){
                res = number;
            }
            else if(calculation == 1){
                res+=number;
            }
            else if(calculation == 2){
                res-=number;
            }
            else if(calculation == 3){
                res/=number;
            }
            else if(calculation == 4){
                res*=number;
            }

        }
    }

    private void equal() {
        textFieldnumber = Double.parseDouble(textField.getText());
        switch (calculation){

            case 1:
                res = res+textFieldnumber;
                break;

            case 2:
                res = res-textFieldnumber;
                break;

            case 3:
                res = res/textFieldnumber;
                break;

            case 4:
                res = res*textFieldnumber;
                break;

        }

        if(Double.toString(res).endsWith(".0")){
            textField.setText(Double.toString(res).replace(".0",""));
        }
        else{
            textField.setText(Double.toString(res));
        }
//        res=0.0;
        label.setText("");
    }
}
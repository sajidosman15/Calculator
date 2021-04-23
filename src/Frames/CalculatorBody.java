package Frames;

import Controller.Calculation;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class CalculatorBody extends JFrame implements ActionListener, MouseListener {

    private final Container block;
    private JPanel container;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, point;
    private JButton plus, minus, devide, multiply, equal, firstBracketOpen, firstBracketClose;
    private JButton percent, root, square, off, cle, del, answer;
    private Color color;
    private Font btnFont, newFont;
    private Border bor;
    private JTextField input, output;
    private String text = "", prevans = "", prevout = "";

    public CalculatorBody() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(356, 520);
        this.setResizable(false);
        block = this.getContentPane();
        block.setBackground(new Color(112, 128, 144));
        block.setLayout(null);
        this.setLocationRelativeTo(null);
        initializer();
        body();
    }

    private void initializer() {
        container = new JPanel();
        input = new JTextField();
        output = new JTextField();
        one = new JButton();
        two = new JButton();
        three = new JButton();
        four = new JButton();
        five = new JButton();
        six = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        zero = new JButton();
        point = new JButton();
        plus = new JButton();
        minus = new JButton();
        devide = new JButton();
        multiply = new JButton();
        equal = new JButton();
        firstBracketOpen = new JButton();
        firstBracketClose = new JButton();
        answer = new JButton();
        percent = new JButton();
        root = new JButton();
        square = new JButton();
        off = new JButton();
        cle = new JButton();
        del = new JButton();
        btnFont = new Font("Arial", Font.BOLD, 25);
        bor = new BevelBorder(BevelBorder.RAISED, Color.red, Color.blue);
    }

    private void body() {

        container.setBounds(5, 5, 340, 480);
        container.setBackground(Color.BLACK);
        container.setBorder(bor);
        container.setLayout(null);
        block.add(container);

        input.setBounds(10, 10, 320, 50);
        input.setBackground(Color.WHITE);
        input.setForeground(Color.BLACK);
        input.setEditable(false);
        input.setFont(btnFont);
        input.setBorder(null);
        container.add(input);

        output.setBounds(10, 60, 320, 50);
        output.setBorder(null);
        output.setBackground(Color.WHITE);
        output.setForeground(Color.BLACK);
        output.setFont(btnFont);
        output.setEditable(false);
        container.add(output);

        firstBracketOpen.setText("(");
        firstBracketOpen.setBounds(10, 120, 60, 50);
        firstBracketOpen.setFont(btnFont);
        firstBracketOpen.setBackground(new Color(255, 102, 0));
        firstBracketOpen.setForeground(Color.WHITE);
        firstBracketOpen.addActionListener(this);
        firstBracketOpen.addMouseListener(this);
        container.add(firstBracketOpen);

        firstBracketClose.setText(")");
        firstBracketClose.setBounds(75, 120, 60, 50);
        firstBracketClose.setFont(btnFont);
        firstBracketClose.setBackground(new Color(255, 102, 0));
        firstBracketClose.setForeground(Color.WHITE);
        firstBracketClose.addActionListener(this);
        firstBracketClose.addMouseListener(this);
        container.add(firstBracketClose);

        answer.setText("Ans");
        answer.setBounds(140, 120, 60, 50);
        answer.setFont(new Font("Arial", Font.BOLD, 15));
        answer.setBackground(new Color(255, 102, 0));
        answer.setForeground(Color.WHITE);
        answer.addActionListener(this);
        answer.addMouseListener(this);
        container.add(answer);

        off.setText("OFF");
        off.setBounds(205, 120, 125, 50);
        off.setFont(btnFont);
        off.setBackground(new Color(255, 0, 0));
        off.setForeground(Color.WHITE);
        off.addActionListener(this);
        off.addMouseListener(this);
        container.add(off);

        root.setText("√");
        root.setBounds(10, 180, 60, 50);
        root.setFont(new Font("Arial", Font.BOLD, 30));
        root.setBackground(new Color(255, 102, 0));
        root.setForeground(Color.WHITE);
        root.addActionListener(this);
        root.addMouseListener(this);
        container.add(root);

        square.setText("²");
        square.setBounds(75, 180, 60, 50);
        square.setFont(btnFont);
        square.setBackground(new Color(255, 102, 0));
        square.setForeground(Color.WHITE);
        square.addActionListener(this);
        square.addMouseListener(this);
        container.add(square);

        percent.setText("%");
        percent.setBounds(140, 180, 60, 50);
        percent.setFont(btnFont);
        percent.setBackground(new Color(255, 102, 0));
        percent.setForeground(Color.WHITE);
        percent.addActionListener(this);
        percent.addMouseListener(this);
        container.add(percent);

        cle.setText("CLE");
        cle.setBounds(205, 180, 125, 50);
        cle.setFont(btnFont);
        cle.setBackground(new Color(255, 0, 0));
        cle.setForeground(Color.WHITE);
        cle.addActionListener(this);
        cle.addMouseListener(this);
        container.add(cle);

        seven.setText("7");
        seven.setBounds(10, 240, 60, 50);
        seven.setFont(btnFont);
        seven.setBackground(new Color(51, 153, 255));
        seven.setForeground(Color.WHITE);
        seven.addActionListener(this);
        seven.addMouseListener(this);
        container.add(seven);

        eight.setText("8");
        eight.setBounds(75, 240, 60, 50);
        eight.setFont(btnFont);
        eight.setBackground(new Color(51, 153, 255));
        eight.setForeground(Color.WHITE);
        eight.addActionListener(this);
        eight.addMouseListener(this);
        container.add(eight);

        nine.setText("9");
        nine.setBounds(140, 240, 60, 50);
        nine.setFont(btnFont);
        nine.setBackground(new Color(51, 153, 255));
        nine.setForeground(Color.WHITE);
        nine.addActionListener(this);
        nine.addMouseListener(this);
        container.add(nine);

        del.setText("DEL");
        del.setBounds(205, 240, 125, 50);
        del.setFont(btnFont);
        del.setBackground(new Color(255, 0, 0));
        del.setForeground(Color.WHITE);
        del.addActionListener(this);
        del.addMouseListener(this);
        container.add(del);

        four.setText("4");
        four.setBounds(10, 300, 60, 50);
        four.setFont(btnFont);
        four.setBackground(new Color(51, 153, 255));
        four.setForeground(Color.WHITE);
        four.addActionListener(this);
        four.addMouseListener(this);
        container.add(four);

        five.setText("5");
        five.setBounds(75, 300, 60, 50);
        five.setFont(btnFont);
        five.setBackground(new Color(51, 153, 255));
        five.setForeground(Color.WHITE);
        five.addActionListener(this);
        five.addMouseListener(this);
        container.add(five);

        six.setText("6");
        six.setBounds(140, 300, 60, 50);
        six.setFont(btnFont);
        six.setBackground(new Color(51, 153, 255));
        six.setForeground(Color.WHITE);
        six.addActionListener(this);
        six.addMouseListener(this);
        container.add(six);

        multiply.setText("×");
        multiply.setBounds(205, 300, 60, 50);
        multiply.setFont(new Font("Arial", Font.BOLD, 40));
        multiply.setBackground(new Color(102, 0, 153));
        multiply.setForeground(Color.WHITE);
        multiply.addActionListener(this);
        multiply.addMouseListener(this);
        container.add(multiply);

        devide.setText("÷");
        devide.setBounds(270, 300, 60, 50);
        devide.setFont(new Font("Arial", Font.BOLD, 40));
        devide.setBackground(new Color(102, 0, 153));
        devide.setForeground(Color.WHITE);
        devide.addActionListener(this);
        devide.addMouseListener(this);
        container.add(devide);

        one.setText("1");
        one.setBounds(10, 360, 60, 50);
        one.setFont(btnFont);
        one.setBackground(new Color(51, 153, 255));
        one.setForeground(Color.WHITE);
        one.addActionListener(this);
        one.addMouseListener(this);
        container.add(one);

        two.setText("2");
        two.setBounds(75, 360, 60, 50);
        two.setFont(btnFont);
        two.setBackground(new Color(51, 153, 255));
        two.setForeground(Color.WHITE);
        two.addActionListener(this);
        two.addMouseListener(this);
        container.add(two);

        three.setText("3");
        three.setBounds(140, 360, 60, 50);
        three.setFont(btnFont);
        three.setBackground(new Color(51, 153, 255));
        three.setForeground(Color.WHITE);
        three.addActionListener(this);
        three.addMouseListener(this);
        container.add(three);

        plus.setText("+");
        plus.setBounds(205, 360, 60, 50);
        plus.setFont(new Font("Arial", Font.BOLD, 40));
        plus.setBackground(new Color(102, 0, 153));
        plus.setForeground(Color.WHITE);
        plus.addActionListener(this);
        plus.addMouseListener(this);
        container.add(plus);

        minus.setText("−");
        minus.setBounds(270, 360, 60, 50);
        minus.setFont(new Font("Arial", Font.BOLD, 40));
        minus.setBackground(new Color(102, 0, 153));
        minus.setForeground(Color.WHITE);
        minus.addActionListener(this);
        minus.addMouseListener(this);
        container.add(minus);

        zero.setText("0");
        zero.setBounds(10, 420, 125, 50);
        zero.setFont(btnFont);
        zero.setBackground(new Color(51, 153, 255));
        zero.setForeground(Color.WHITE);
        zero.addActionListener(this);
        zero.addMouseListener(this);
        container.add(zero);

        point.setText("·");
        point.setBounds(140, 420, 60, 50);
        point.setFont(new Font("Arial", Font.BOLD, 50));
        point.setBackground(new Color(51, 153, 255));
        point.setForeground(Color.WHITE);
        point.addActionListener(this);
        point.addMouseListener(this);
        container.add(point);

        equal.setText("=");
        equal.setBounds(205, 420, 125, 50);
        equal.setFont(new Font("Arial", Font.BOLD, 40));
        equal.setBackground(new Color(0, 0, 204));
        equal.setForeground(Color.WHITE);
        equal.addActionListener(this);
        equal.addMouseListener(this);
        container.add(equal);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == equal) {
            outputText();
        } else if (ae.getSource() == off) {
            dispose();
        } else if (ae.getSource() == cle) {
            text = "";
            input.setText("");
            output.setText("");
        } else if (ae.getSource() == del) {
            output.setText("");
            setNewText();
        } else if (ae.getSource() == answer) {
            output.setText(prevout);
            input.setText(prevans);
            text = prevans;
        } else if (ae.getSource() == square) {
            if (!text.isEmpty()) {
                if (text.charAt(text.length() - 1) != '²') {
                    output.setText("");
                    String typedText = square.getText();
                    text += typedText;
                    input.setText(text);
                }
            }
        } else {
            output.setText("");
            JButton typed = (JButton) ae.getSource();
            String typedText = typed.getText();
            text += typedText;
            input.setText(text);
        }
    }

    private void setNewText() {
        if (text.length() != 0) {
            String newText = "";
            for (int i = 0; i < text.length() - 1; i++) {
                newText += text.charAt(i);
            }
            text = newText;
            input.setText(text);
        }
    }

    private int getFontSize(Font font) {
        String text = font.toString();
        text = text.charAt(text.length() - 3) + "" + text.charAt(text.length() - 2);
        int size = Integer.parseInt(text);
        return size;
    }

    private void outputText() {
        if (!text.isEmpty()) {
            prevans = text;
            Calculation cal = new Calculation(text);
            String value = cal.getAnswer();
            if (value.contains(".")) {
                String ans = value.substring(0, value.indexOf("."));
                String anspnt = value.substring(value.indexOf(".") + 1, value.length());
                double ansdbl = Double.parseDouble(anspnt);
                if (value.contains("E")) {
                    output.setText(value);
                    prevout = value;
                } else if (ansdbl == 0) {
                    output.setText(ans);
                    prevout = ans;
                } else {
                    output.setText(value);
                    prevout = value;
                }
            } else {
                output.setText(value);
                prevout = value;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getSource() != answer) {
            JButton button = (JButton) me.getSource();
            newFont = button.getFont();
            button.setFont(new Font("Arial", Font.BOLD, (getFontSize(newFont) + 5)));
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        if (me.getSource() != answer) {
            JButton button = (JButton) me.getSource();
            button.setFont(newFont);
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        color = button.getBackground();
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        button.setBackground(color);
        button.setForeground(Color.WHITE);
    }

}

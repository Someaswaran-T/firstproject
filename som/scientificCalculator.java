import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    JTextField tfield;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch, c;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp, fac, plus, min, div, log, rec, mul, eq, addsub, dot, mr, mc, mp, mm, sqrt, sin, cos, tan;
    Container cont;
    JPanel textPanel, buttonpanel;

    ScientificCalculator() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        
        textPanel = new JPanel();
        tfield = new JTextField(25);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        tfield.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textPanel.add(tfield);

        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));
        boolean t = true;

        // Buttons
        mr = new JButton("MR");
        buttonpanel.add(mr);
        mr.addActionListener(this);

        mc = new JButton("MC");
        buttonpanel.add(mc);
        mc.addActionListener(this);

        mp = new JButton("M+");
        buttonpanel.add(mp);
        mp.addActionListener(this);

        mm = new JButton("M-");
        buttonpanel.add(mm);
        mm.addActionListener(this);

        b1 = new JButton("1");
        buttonpanel.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        buttonpanel.add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        buttonpanel.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        buttonpanel.add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        buttonpanel.add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        buttonpanel.add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        buttonpanel.add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        buttonpanel.add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        buttonpanel.add(b9);
        b9.addActionListener(this);

        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);

        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);

        min = new JButton("-");
        buttonpanel.add(min);
        min.addActionListener(this);

        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);

        div = new JButton("/");
        buttonpanel.add(div);
        div.addActionListener(this);

        addsub = new JButton("+/-");
        buttonpanel.add(addsub);
        addsub.addActionListener(this);

        dot = new JButton(".");
        buttonpanel.add(dot);
        dot.addActionListener(this);

        eq = new JButton("=");
        buttonpanel.add(eq);
        eq.addActionListener(this);

        rec = new JButton("1/x");
        buttonpanel.add(rec);
        rec.addActionListener(this);

        sqrt = new JButton("sqrt");
        buttonpanel.add(sqrt);
        sqrt.addActionListener(this);

        log = new JButton("log");
        buttonpanel.add(log);
        log.addActionListener(this);

        sin = new JButton("SIN");
        buttonpanel.add(sin);
        sin.addActionListener(this);

        cos = new JButton("COS");
        buttonpanel.add(cos);
        cos.addActionListener(this);

        tan = new JButton("TAN");
        buttonpanel.add(tan);
        tan.addActionListener(this);

        pow2 = new JButton("x^2");
        buttonpanel.add(pow2);
        pow2.addActionListener(this);

        pow3 = new JButton("x^3");
        buttonpanel.add(pow3);
        pow3.addActionListener(this);

        exp = new JButton("EXP");
        buttonpanel.add(exp);
        exp.addActionListener(this);

        fac = new JButton("n!");
        buttonpanel.add(fac);
        fac.addActionListener(this);

        clr = new JButton("AC");
        buttonpanel.add(clr);
        clr.addActionListener(this);

        cont.add("Center", buttonpanel);
        cont.add("North", textPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        // Handle button clicks here
        if (s.equals("1")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "1");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "1");
                z = 0;
            }
        }
        // Handle other buttons similarly
        // Example: Handling clear button
        if (s.equals("AC")) {
            tfield.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        // Implement other actions similarly
    }

    double fact(double x) {
        if (x < 0) return 0;
        double s = 1;
        for (int i = 2; i <= x; i++) s *= i;
        return s;
    }

    public static void main(String args[]) 
    {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ScientificCalculator f = new ScientificCalculator();
        f.setTitle("Scientific Calculator");
        f.pack();
        f.setVisible(true);
    }
}


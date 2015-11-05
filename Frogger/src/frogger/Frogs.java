package frogger;

import javax.swing.JFrame;

public class Frogs extends JFrame
{
    public static void main(String[] args)
    {
        Frogs f = new Frogs();
        f.setVisible(true);
    }
    
    public Frogs()
    {
        MainScreen ms = new MainScreen();
        add(ms);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

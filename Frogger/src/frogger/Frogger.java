package frogger;

import javax.swing.JFrame;

public class Frogger extends JFrame
{
    public static void main(String[] args)
    {
        Frogger f = new Frogger();
        f.setVisible(true);
    }
    
    public Frogger()
    {
        MainScreen ms = new MainScreen();
        add(ms);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

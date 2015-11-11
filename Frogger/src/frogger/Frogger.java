package frogger;
import javax.swing.*;
import java.awt.event.*;

public class Frogger extends JFrame 
{
    private JButton startButton;
    private JButton backButton;
    
    private ActionListener startListener;
    private ActionListener backListener;
    
    private JPanel homePanel;
    private JPanel gamePanel;
    
    private JFrame ff = this;

    public Frogger()
    {
        createComponents();
        createPanels();
        this.setSize(200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void createComponents()
    {
        createButtons();
    }    
    private void createButtons()
    {
        class AddRemoveListener implements ActionListener
        {
            private String action;
            public AddRemoveListener(String action)
            {
                this.action=action.toLowerCase();
            }
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Object obj = e.getSource();                
                if (action.equals("start"))
                {
                    startGame();
                }
                if (action.equals("back"))
                {
                    gamePanel.setVisible(false);
                    homePanel.setVisible(true);
                    ff.setSize(200, 150);
                } 
            }
        }        
        startButton=new JButton("start");
        backButton=new JButton("back");

        startListener = new AddRemoveListener("start");
        backListener = new AddRemoveListener("back");
        
        startButton.addActionListener(startListener);
        backButton.addActionListener(backListener);        
    }
    private void createPanels()
    {
        homePanel=new JPanel();
        homePanel.setLayout(null);
        homePanel.add(startButton);        
        startButton.setBounds(50, 40, 80, 25);        
        
        gamePanel=new JPanel();
        gamePanel.setLayout(null);
        gamePanel.setVisible(false);
        gamePanel.setBounds(0, 0, 500, 500);
	gamePanel.add(backButton);
	backButton.setBounds(0,0,75,25);
        
        this.add(gamePanel);
        this.add(homePanel);
    }
    public void startGame()
    {
        homePanel.setVisible(false);
        gamePanel.setVisible(true);
        ff.setSize(510, 510);
        ff.setTitle("Frogger");
    }
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        JFrame f = new Frogger();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frogger extends JFrame
{
    private JButton startButton;
	private JButton backButton;
    //private ArrayList<JButton> cars;
    //private ImageIcon board = new ImageIcon("images/classroom_defense1.png");
    //private ImageIcon frogIcon = new ImageIcon("images/cartoon-soldier-010.jpg");
    
	private ActionListener startListener;
	private ActionListener backListener;
	
	private JPanel homePanel;
	private JPanel gamePanel;
	
	private JFrame cdf = this;

    public FroggerFrame()
    {
        createComponents();
        createPanels();
        this.setSize(235, 505);
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
                    gameScreenPanel.setVisible(false);
                    gameOptionsPanel.setVisible(false);
                    homePanel.setVisible(true);
                    cdf.setSize(235, 505);
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
        startButton.setBounds(130, 10, 80, 25);        
        
        gameScreenPanel=new JPanel();
        gameScreenPanel.setLayout(null);
        gameScreenPanel.setVisible(false);
        gameScreenPanel.setBounds(0, 0, 750, 750);
		gameScreenPanel.add(backButton);
		backButton.setBounds(0,0,50,25)
        
        this.add(gameScreenPanel);
        this.add(homePanel);
    }
    public void startGame()
    {
        homePanel.setVisible(false);
        gameScreenPanel.setVisible(true);
        cdf.setSize(960, 790);
        cdf.setTitle("Frogger");
        gameScreenPanel.add(gameBoard);
        gameBoard.setBounds(0,0,750,750);
    }
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        JFrame testFrame = new FroggerFrame();
    }
}

package frogger;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite 
{
    int x;
    int y;
    int width;
    int height;
    boolean visible;
    ImageIcon icon;
    Rectangle r;
    
    public Sprite(int xLocation, int yLocation, String imageLocation)
    {
        x = xLocation;
        y = yLocation;
        setImage(imageLocation);
        r = new Rectangle(x, y, width, height);
    }
    
    public void setImage(String imageLocation)
    {
        icon = new ImageIcon(imageLocation);
        width = icon.getIconWidth();
        height = icon.getIconHeight();
    }
    
    public Image getImage()
    {
        Image i = icon.getImage();
        return i;
    }
    
    public Rectangle checkBounds()
    {
        return new Rectangle(x, y, width, height);
    }
}

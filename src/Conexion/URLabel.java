package Conexion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URISyntaxException;
import java.net.URI;
import java.net.URL;
import javax.swing.JLabel;

/** @author pc */

public class URLabel extends JLabel implements MouseListener    {
    
    private URI url;
    private URL link;
    
    /**  @return the link*/
    
    public URL getLink() {
        return link;
    }

    /** @param link the link to set */
    
    public void setLink(URL link) {
        this.link = link;
    }
    
    public URLabel(){
        try {
            url = new URI("sd");
        } catch (URISyntaxException ex) {
            
        }
    }

    public void setURL( String url )
            {
                try {
                    this.url = new URI(url);
                    this.setToolTipText( url );
                } catch (URISyntaxException ex) {
                    System.err.println( ex.getMessage() );
                }
            }
    public String getURL()
            {
                return this.url.toString();
            }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}

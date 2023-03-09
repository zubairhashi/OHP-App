package starter;



import java.awt.Desktop;
import java.io.*;
import java.net.URI;
  
public class sttt {
    public static void main(String[] args)
             throws Exception
    {
        Desktop desk = Desktop.getDesktop();
        
        // now we enter our URL that we want to open in our
        // default browser
        desk.browse(new URI("https://twitter.com/home"));
    }
}

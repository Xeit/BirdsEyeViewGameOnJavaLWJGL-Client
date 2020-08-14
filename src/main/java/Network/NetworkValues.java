package Network;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Klasa przechowujaca wartosci potrzebne do komunikacji z serwerem
 */
public class NetworkValues
{
    public static Socket socket=null;
    public static BufferedReader br=null;
    public static BufferedReader is=null;
    public static PrintWriter os=null;
    public static OutputStream outputStream = null;
}

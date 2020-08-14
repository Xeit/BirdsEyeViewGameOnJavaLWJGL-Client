package Network;// A simple Client Server Protocol .. Client for Echo Server

import Engine.Values.GameState;
import UI.ServersOffline;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

import static Engine.Values.Window.gameState;

/**
 * Klasa obslugujaca polaczenie z serwerem
 */
public class NetworkClient
{
    /**
     * Klasa laczaca clienta z serwerem
     * @return - zwraca czy nastapilo poprawne polaczenie
     * @throws IOException - wyrzuca wyjatek jezeli nastapi blad (np serwer bedzie offline)
     */
    public static boolean connect() throws IOException
    {
        InetAddress address=InetAddress.getLocalHost();
        try
        {
            NetworkValues.socket =new Socket(address, 4445); // You can use static final constant PORT_NUM
            NetworkValues.br= new BufferedReader(new InputStreamReader(System.in));
            NetworkValues.is=new BufferedReader(new InputStreamReader(NetworkValues.socket.getInputStream()));
            NetworkValues.outputStream = NetworkValues.socket.getOutputStream();
            NetworkValues.os= new PrintWriter(new OutputStreamWriter(NetworkValues.outputStream, "UTF-8"), true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.err.print("IO Exception");
            for(int time = 10; time > 0; time--)
            {
                new ServersOffline().serversOffline(time);
                try
                {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
            String read = null;
            read = NetworkValues.is.readLine();
            System.out.println("Message from server: " + read);
            NetworkValues.os.println(address.toString());
            gameState = GameState.LOGIN_SCREEN;
            return false;
        }
        return true;
    }

    /**
     * Poprzednia wersja laczenia z serwerem, zapisana aby w razie problemow mozna bylo zobaczyc jak bylo
     * @throws IOException - wyrzuca wyjatek
     */
    public static void network() throws IOException
    {
        InetAddress address=InetAddress.getLocalHost();
        Socket s1=null;
        String line=null;
        BufferedReader br=null;
        BufferedReader is=null;
        PrintWriter os=null;

        try
        {
            s1=new Socket(address, 4445); // You can use static final constant PORT_NUM
            br= new BufferedReader(new InputStreamReader(System.in));
            is=new BufferedReader(new InputStreamReader(s1.getInputStream()));
            os= new PrintWriter(s1.getOutputStream());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.err.print("IO Exception");
        }

        System.out.println("Client Address : "+address);
        System.out.println("Enter Data to echo Server ( Enter QUIT to end):");

        String response=null;
        try
        {
            os.println(address);
            line=br.readLine();
            while(line.compareTo("QUIT")!=0)
            {
                os.println(line);
                os.flush();
                response=is.readLine();
                System.out.println("Server Response : "+response);
                line=br.readLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Socket read Error");
        }
        finally
        {
            is.close();os.close();br.close();s1.close();
            System.out.println("Connection Closed");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends ServerClient {
    public Client() {
        super();

    }

    public Client(String address) {
        super(address);

    }

    public Client(int port) {
        super(port);

    }

    public Client(String address, int port) {
        super(address, port);

    }

    public void go() {
        try (Socket serverSocket = new Socket(getAddr(), getPort())) {
            // Set up the ability to read user input from keyboard
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Set up the ability to send the data to the server
            PrintWriter serverOut = new PrintWriter(serverSocket.getOutputStream(), true);

            // Set up the ability to read the data from the server
            BufferedReader serverIn = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

            while (true) {
                System.out.println("Please enter some text");
                String userInputString = userInput.readLine();
                serverOut.println(userInputString);
                String serverResponse = serverIn.readLine();
                System.out.println("Server responded with: " + serverResponse);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client myEchoClient = new Client("localhost");
        myEchoClient.go();
    }
}

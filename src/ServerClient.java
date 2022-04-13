public class ServerClient {
    private String address;
    private int port;
    private static int defaultPort = 14002;
    private static String defaultAddr = "localhost";

    public ServerClient() {
        setAddr(ServerClient.defaultAddr);
        setPort(ServerClient.defaultPort);

    }

    public ServerClient(String newAddress) {
        setAddr(newAddress);
        setPort(ServerClient.defaultPort);

    }

    public ServerClient(int newPort) {
        setAddr(ServerClient.defaultAddr);
        setPort(newPort);

    }

    public ServerClient(String newAddress, int newPort) {
        setAddr(newAddress);
        setPort(newPort);
    }

    public int getPort() {
        return port;
    }

    public void setPort(int newPort) {
        this.port = newPort;
    }

    public String getAddr() {
        return address;
    }

    public void setAddr(String newAddress) {
        this.address = newAddress;
    }
}

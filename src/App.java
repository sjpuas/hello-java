import java.net.InetAddress;
import java.net.UnknownHostException;

public class App{

 public static void main(String...args) throws UnknownHostException{
   System.out.println("Hello world 23 from docker container:"+InetAddress.getLocalHost().getHostName());
 } 

}

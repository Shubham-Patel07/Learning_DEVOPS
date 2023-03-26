import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

    public class testclient {
        public static void main(String[] args) throws IOException {
            InetAddress IpAddr = InetAddress.getByName("Localhost");
//        Socket server = new Socket();
            System.out.println(IpAddr);

            Socket connection = new Socket(IpAddr,500);

            //for the communication between client and server or we can say server-client session on both the classes C and S
            BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            Scanner frames = new Scanner(System.in);

            System.out.println(".....Client.....");
            System.out.println("Connect");
            System.out.println("Enter the no of frames to be requested / N");
            int c = frames.nextInt();

            out.write(c);
            out.flush();

            System.out.println("Enter the type of trans. error = 1 / error = 0");
            int choice = frames.nextInt();
            out.write(choice);

            int check = 0,i = 0,j = 0;

            if (choice == 0){
                for(j = 0;j < c;++j){
                    i = in.read();
                    System.out.println("Recieved frame no : " + i);
                    System.out.println("sending acknowledgement for frame no : " + i);
                    out.write(i);
                    out.flush();
                }
                out.flush();
            }
            else {
                for(j = 0;j < c;++j){
                    i = in.read();
                    if (i == check) {
                        System.out.println("i : " + i + "check" + check);
                        System.out.println("Recieved frame no : " + i);
                        System.out.println("sending acknowledgement for frame no : " + i);
                        out.write(i);
                        ++check;
                    }
                    else {
                        --j;
                        System.out.println("Discarded frame no " + i);
                        System.out.println("Sending negitive ack");
                        out.write(-i);
                    }
                    out.flush();
                }
            }
            in.close();
            out.close();
            System.out.println("....QUITING....");
        }
    }


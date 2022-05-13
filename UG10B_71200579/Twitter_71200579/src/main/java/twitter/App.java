package twitter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )

    {
        Scanner scan = new Scanner(System.in);
        User user = new User("u71200579", "p71200579");
        System.out.println("Selamat datang di Twitter");
        System.out.println("Silakan login dengan akun anda.\n");
        System.out.print("Username: " );
        String un = scan.nextLine();
        System.out.print("Password: " );
        String pw = scan.nextLine();
        new Login(un,pw);
        System.out.println("Kamu diminta untuk mengganti username, silakan masukan username kamu.");
        new Username();


    }
}

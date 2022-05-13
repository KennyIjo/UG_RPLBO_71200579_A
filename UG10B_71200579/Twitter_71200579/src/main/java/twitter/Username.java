package twitter;
import java.util.Scanner;

public class Username {
    private String username;
    private User user;
    public Username(){
        Scanner scan = new Scanner(System.in);
        boolean ok = true;
        this.username = username;
        System.out.print("Username: ");
        String un = scan.nextLine();
        try {
            if (un.isEmpty()) {
                ok = false;
                throw new UsernameException(1);
            } else if (un.length() < 6) {
                ok = false;
                throw new UsernameException(2);
            }
            //            else if(username.contains(!char) && username.contains(!int) && username.contains(!"_")){
            //                ok = false;
            //                throw new UsernameException(3);
//                            }
            }
        catch(UsernameException e){
            System.out.println("Maaf, " + e.getErrMessage());
        }
        if(ok){
            System.out.println("Username kamu berhasil diperbaharui, " + un);
        }
    }
}

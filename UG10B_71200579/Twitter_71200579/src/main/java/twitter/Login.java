package twitter;

public class Login {
    private String username;
    private String password;
    private User user;
    public Login(String username, String password){
        this.username = username;
        this.password = password;
        boolean ok = true;

        try{
            if(username.isEmpty()){
                ok = false;
                throw new LoginException(1);
            }
            else if(password.isEmpty()){
                ok = false;
                throw new LoginException(2);
            }
//            else if(username != user.getUsername() || password != user.getPassword()){
//                ok = false;
//                throw new LoginException(3);
//            }
        }
        catch (LoginException e){
            System.out.println("Maaf, " + e.getErrMessage());
        }
        if(ok){
            System.out.println("Selamat datang di Twitter, " + username);
        }
    }
}

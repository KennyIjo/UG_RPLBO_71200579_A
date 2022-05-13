package twitter;

public class LoginException extends Throwable {
    private int errCode;
    private String errMessage;
    public LoginException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode == 1){
            this.errMessage = "Input username tidak boleh kosong.";
        }
        else if(errCode == 2){
            this.errMessage = "Input password tidak boleh kosong";
        }
        else if(errCode == 3){
            this.errMessage = "Username atau password salah! Silakan coba lagi";
        }
    }
//    public LoginException(){
//        try{
//            if(getUsername().isEmpty())
//        }
//    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErrMessage() {
        return this.errMessage;
    }
}

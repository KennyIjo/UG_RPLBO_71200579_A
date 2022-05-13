package twitter;

public class UsernameException extends Throwable {
    private int errCode;
    private String errMessage;
    public UsernameException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode == 1){
            this.errMessage = "Input username tidak boleh kosong.";
            new Username();
        }
        else if(errCode == 2){
            this.errMessage = "Username minimal harus terdiri dari 6 karakter.";
            new Username();
        }
        else if(errCode == 3){
            this.errMessage = "Username hanya boleh terdiri dari huruf, angka, dan underscore(_).";
            new Username();
        }
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErrMessage() {
        return this.errMessage;
    }
}

package com.ug11.channelsahamukdw;

public class EmailException extends Throwable {
    private int errorCode;
    private String errorMessage;

    public EmailException(int errorCode){
        super();
        this.errorCode = errorCode;
        if(errorCode == 1){
            this.errorMessage = "Error: Login gagal! Email Anda tidak terdaftar dalam UKDW.";
        } else if(errorCode == 2){
            this.errorMessage = "Error: Login gagal! Email UKDW Anda tidak valid.";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

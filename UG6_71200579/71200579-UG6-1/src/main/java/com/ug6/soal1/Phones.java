package com.ug6.soal1;

public class Phones {
    private String phoneCode, companyCode, androidType;
    private int ramCapacity, romCapacity, cameraResolution;
    private float screenSize;

    public Phones (String phoneCode, String companyCode, String androidType,
                   int ramCapacity, int romCapacity, float screenSize, int cameraResolution) {
        this.phoneCode = phoneCode;
        this.companyCode = companyCode;
        this.androidType = androidType;
        this.ramCapacity = ramCapacity;
        this.romCapacity = romCapacity;
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }
}

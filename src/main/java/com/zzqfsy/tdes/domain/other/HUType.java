package com.zzqfsy.tdes.domain.other;

public enum HUType {

    CABINET(0),
    BOX(1)
    ;

    HUType(int type) {
        this.type = type;
    }

    private int type;


    public int getType() {
        return type;
    }
}

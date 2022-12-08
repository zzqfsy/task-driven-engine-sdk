package com.zzqfsy.tdes.domain.core;

public enum WaveStatusType {

    CLOSE(0),
    READY(1),
    BEING(2),
    PART_OVER(3),
    OVER(4),
    ;

    private int status;

    WaveStatusType(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

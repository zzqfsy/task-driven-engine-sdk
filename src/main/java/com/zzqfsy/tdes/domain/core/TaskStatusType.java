package com.zzqfsy.tdes.domain.core;

public enum TaskStatusType {

    INIT(0),
    READY(1),
    BEING(2),
    PART_OVER(3),
    OVER(4),
    ;

    TaskStatusType(int status) {
        this.status = status;
    }

    private int status;


    public int getStatus() {
        return status;
    }
}

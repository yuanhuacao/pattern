package com.houbank.constants;

import java.util.Objects;

/**
 * Created by Administrator on 2017/2/21.
 */
public enum WeekEnum {
    MONDAY(1),WENDESDAY(3), FRIDAY(5);
    private Integer day;

    WeekEnum(Integer day) {
        this.day = day;
    }

    public static boolean existsDay(Integer code) {
        for (WeekEnum weekEnum:WeekEnum.values()){
            if(Objects.equals(weekEnum.getDay(),code)){
                return true;
            }
        }
        return false;
    }



    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}

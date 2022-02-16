package com.example.springopgaver.Services;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

public class WeekCalculation {
    /*//opgave 1.3
    @GetMapping("/www.erdetfredag.dk")
    public String isItFriday(){
        Date date = new Date();
        int h = 0; //temporary variable

        int q = 14; //day of the month
        int year = 2000;
        int m = 14; //month of the year
        if (m==1) {
            m=13;
            year--;
        } else if (m==2) {
            m=14;
            year--;
        }
        int j = year/100; //century year/100
        int k = 2022%100; // year of the century

        h = (q +(13*(m + 1)/5) + k + (k/4) + (j/4) - 2 * j)%7;
        int d = ((h+5)%7)+1;

        String result = "";
        if (d == 6) {
            result = " Wuhuu, Det er fredag" ;
        } else {
            result = " øv øv, det er ikke fredag";
        }
        return result;
    }*/
}

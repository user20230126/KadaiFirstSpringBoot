package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class KadaiFirstController {
    
    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {
        String ymd = yyyymmdd;
        String year = ymd.substring(0, 4);
        String month = ymd.substring(4, 6);
        String day = ymd.substring(6, 8);
        
        Calendar cal = Calendar.getInstance();{
            Integer y = Integer.valueOf(year);
            Integer m = Integer.valueOf(month) -1;
            Integer d = Integer.valueOf(day);
        // 日付を指定
        cal.set(y, m, d);
        // 曜日を取得
        
        int week = cal.get(Calendar.DAY_OF_WEEK);
        
        String weekString = "";
        switch(week) {
        case Calendar.MONDAY:
            weekString = "Monday";
            break;
        case Calendar.TUESDAY:
            weekString = "Tuesday";
            break;
        case Calendar.WEDNESDAY:
            weekString = "Wednesday";
            break;
        case Calendar.THURSDAY:
            weekString = "Thursday";
            break;
        case Calendar.FRIDAY:
            weekString = "Friday";
            break;
        case Calendar.SATURDAY:
            weekString = "Saturday";
            break;
        case Calendar.SUNDAY:
            weekString = "Sunday";
            break;
        }
        
        return  "実行結果:" + weekString;
        }
    }
    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }
    
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }
    
}


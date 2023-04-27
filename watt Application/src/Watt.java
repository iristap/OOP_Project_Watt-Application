/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Watt {
    String name,time1,time2,date;
    double unit;
    int watt;
    public Watt(String name,int watt,String time1,String time2,String date,double unit){
        this.name = name;
        this.watt = watt;
        this.time1 = time1;
        this.time2 = time2;
        this.date =  date;
        this.unit = unit;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWatt(){
        return watt;
    }
    public String getTime1(){
        return time1;
    }
    public String getTime2(){
        return time2;
    }
    public String getDate(){
        return date;
    }
    public double getUnit(){
        return unit;
    }
    
}

    
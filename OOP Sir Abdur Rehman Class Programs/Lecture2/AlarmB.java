/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clockb;

/**
 *
 * @author arahman
 */
public class AlarmB {

    int hr, min, sec;
    boolean active;

    public AlarmB(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        this.active=true;
    }
    public void setStatus(boolean status){
        this.active=status;
    }
    public void setAlarm(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public void checkAlarm(ClockB clock){
        if(this.active==true && clock.hr==this.hr && clock.min==this.min && clock.sec==this.sec){
            System.out.println("Its Alarm Time.. Rinnnnnggggggggggggggg");
        }
    }
    public int getAlarmHr(){
        return this.hr;
    }
    public int getAlarmMin(){
        return this.min;
    }
    public int getAlarmSec(){
        return this.sec;
    }
    
}

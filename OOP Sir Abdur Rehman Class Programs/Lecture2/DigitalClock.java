/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clockb;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arahman
 */
public class DigitalClock {

    public static void main(String args[]) {
        ClockB clock = new ClockB(12,0,8);
        
        List<AlarmB> alarms=new ArrayList();
        AlarmB alarm = new AlarmB(12, 0, 10);
        AlarmB alarm2 = new AlarmB(12, 0, 15);
        alarm2.setStatus(false);
        AlarmB alarm3 = new AlarmB(12, 0, 18);
        alarms.add(alarm);
        alarms.add(alarm2);
        alarms.add(alarm3);
        
        while (true) {
            clock.displayTime();
            for(int i=0;i<alarms.size();i++){
                AlarmB tAlarm=alarms.get(i);
                tAlarm.checkAlarm(clock);
            }
            clock.tickClock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DigitalClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clockb;

/**
 *
 * @author arahman
 */
public class ClockB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClockB clk = new ClockB(12, 34, 20);
        clk.displayTime();
        for (int i = 0; i < 100; i++) {
            clk.tickClock();
        }
        clk.displayTime();
    }
    int hr, min, sec;

    //default constructor
    public ClockB() {
        System.out.println("Constrcutor called");
        hr = 12;
        min = 0;
        sec = 0;
    }

    //parameterized constructor
    public ClockB(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void displayTime() {
        System.out.println(hr + ":" + min + ":" + sec);
    }

    public void tickClock() {
        sec++;
        if (sec == 60) {
            sec = 0;
            min++;
            if (min == 60) {
                min = 0;
                hr++;
                if (hr == 24) {
                    hr = 0;
                }
            }
        }

    }
}

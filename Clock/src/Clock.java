import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Enathen on 2017-03-23.
 */
public class Clock {
    private String displayString = new String();
    NumberDisplay hour = new NumberDisplay(0, 24);
    NumberDisplay minutes = new NumberDisplay(0, 60);

    public Clock(){

        getTime();
        System.out.println(displayString);

            long time = System.currentTimeMillis();
            Runnable update = new Runnable(){
                public void run(){
                    timeTick();
                }
            };
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                public void run(){
                    update.run();
                }
            }, time % 10000, 10000);
        //update.run();





    }
    private void Clock(int hour, int minute){


    }
    private void timeTick(){

        boolean open = minutes.increment();
        if(minutes.didWrapAround(open)) {
            hour.increment();
        }
        getTime();
        System.out.println(displayString );
        if(hour.didWrapAround(open) && hour.getValue() == 0){
            System.out.println("Good new day");
        }


    }
    private void setTime(int hour, int minute){

    }
    private void getTime(){
        hour.getValue();
        minutes.getValue();
        displayString = new String();
        displayString = displayString.concat(hour.getDisplayValue());
        displayString = displayString.concat(minutes.getDisplayValue());

    }
    private void updateDisplay(){

    }
}

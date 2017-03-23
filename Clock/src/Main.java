/**
 * Created by Enathen on 2017-03-23.
 */
public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        int minLimit = 0;
        int HourMaxLimit = 24;
        int minutesMaxLimit = 60;
        NumberDisplay hour = new NumberDisplay(minLimit, HourMaxLimit);
        NumberDisplay minutes = new NumberDisplay(minLimit, minutesMaxLimit);
        String stringHour =  hour.getDisplayValue();
        String stringMinutes =  minutes.getDisplayValue();
        System.out.println(stringHour + ":" + stringMinutes);
        for(int i = 0; i < 1440; i++){

            boolean open = minutes.increment();
            if(minutes.didWrapAround(open)){
                hour.increment();
            }

            hour.getValue();
            minutes.getValue();
            stringHour =  hour.getDisplayValue();
            stringMinutes =  minutes.getDisplayValue();
            System.out.println(stringHour + ":" + stringMinutes);
            if(hour.didWrapAround(open) && hour.getValue() == 0){
                System.out.println("Good new day");
            }

        }
    }
}

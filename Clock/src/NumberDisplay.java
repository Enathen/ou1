/**
 * Created by Enathen on 2017-03-23.
 */
public class NumberDisplay {
    private int minLimit;
    private int maxLimit;
    private int value;
    public NumberDisplay(int min, int max) {
        minLimit = min;
        maxLimit = max;
        if(minLimit >= maxLimit) {
            System.out.println("MaxLimit not larger than minLimit");
            java.lang.System.exit(1);
        }
    }
    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }
    public String getDisplayValue() {
        String display = String.format("%02d", value);
        return display;
    }
    public boolean increment() {
        value = value+1;
        if(value == maxLimit){
            value = minLimit;
            return true;
        }
        return false;

    }
    public boolean didWrapAround(boolean open) {
        if(open){
            return true;
        }
        return false;
    }
}

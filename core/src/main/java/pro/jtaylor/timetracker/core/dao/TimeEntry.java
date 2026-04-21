package pro.jtaylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String info;
    private float rate;
    private int time;

    public String getInfo() {
        return info;
    }

    public void setInfo(String value) {
        this.info = value;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float value) {
        this.rate = value;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int value) {
        this.time = value;
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "info='" + info + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}

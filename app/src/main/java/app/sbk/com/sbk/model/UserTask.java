package app.sbk.com.sbk.model;

/**
 * Created by RR on 22-Jan-18.
 */

public class UserTask {
    String date;
    String task;

    public UserTask(String date, String task) {
        this.date = date;
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private  int second;
    private double w = 250;
    private double h = 250;

    public ClockPane() {
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    private void paintClock() {
        Circle circle = new Circle();
        double circleX = w / 2;
        double circleY = h / 2;
        double circleRadius = Math.min(w, h) * 0.8 * 0.5;
        circle.setRadius(circleRadius);
        circle.setCenterX(circleX);
        circle.setCenterY(circleY);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Text t1 = new Text(circleX - 10, circleY - circleRadius + 12, "12");
        Text t2 = new Text(circleX + circleRadius - 10, circleY + 4, "3");
        Text t3 = new Text(circleX - 4, circleY + circleRadius - 5, "6");
        Text t4 = new Text(circleX - circleRadius + 5, circleY + 4, "9");

        double hourX = circleX + Math.sin((Math.PI / 6) *
                (hour + minute / 60.0 + second / 3600.0 )) * (circleRadius - 50);
        double hourY = circleY - Math.cos((Math.PI / 6) * (hour + minute / 60.0 + second / 3600.0 )) * (circleRadius - 50);
        Line lineHour = new Line(circleX, circleY,hourX, hourY);
        lineHour.setStrokeWidth(3);
        lineHour.setStroke(Color.RED);
        double minuteX = circleX + Math.sin((Math.PI / 30) * (minute + second / 60)) * (circleRadius - 30);
        double minuteY = circleY - Math.cos(Math.PI / 30 * (minute + second / 60)) * (circleRadius - 30);

        Line lineMinute = new Line(circleX, circleY, minuteX, minuteY);
        lineMinute.setStrokeWidth(3);
        lineMinute.setStroke(Color.BLUE);
        Line lineSecond = new Line(circleX, circleY, circleX + Math.sin((Math.PI / 30) * second) * (circleRadius - 10),
                circleY - Math.cos(Math.PI / 30 * second) * (circleRadius - 10));
        getChildren().add(circle);
        getChildren().addAll(t1,t2, t3, t4, lineHour, lineMinute, lineSecond);

    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    private void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        paintClock();
    }



}

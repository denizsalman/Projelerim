import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
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
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        for (int i = 1; i <= 12; i++) {
            Text text = new Text(circleX + Math.sin(Math.PI / 6 * i) * (circleRadius - 20),
                   circleY - Math.cos(Math.PI / 6 * i) * (circleRadius - 20),i + "");
            text.setFont(Font.font(12));
            getChildren().add(text);
        }
        for (int i = 0; i <= 59; i++) {
            double startPoint = 0;
            if (i % 5 == 0) {
                startPoint = 10;
            } else {
                startPoint = 4;
            }
                Line line = new Line(circleX + Math.sin(Math.PI / 30 * i) * (circleRadius - startPoint),
                        circleY - Math.cos(Math.PI / 30 * i) * (circleRadius - startPoint),
                        circleX + Math.sin(Math.PI / 30 * i) * (circleRadius ),
                        circleY - Math.cos(Math.PI / 30 * i) * (circleRadius));
                getChildren().add(line);
        }

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
        getChildren().addAll(lineHour, lineMinute, lineSecond);

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

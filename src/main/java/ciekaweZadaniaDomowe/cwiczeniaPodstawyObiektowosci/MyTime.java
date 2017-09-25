package ciekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;


public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if (hour < 24 && hour > -1)
            this.hour = hour;
        else
            System.out.println("zły czas");
        if (minute < 60 && minute > -1)
            this.minute = minute;
        else
            System.out.println("Zły czas");
        if (second < 60 && minute > -1)
            this.second = second;
        else
            System.out.println("Zły czas");
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 24 && hour > -1)
            this.hour = hour;
        else
            System.out.println("zły czas");
        if (minute < 60 && minute > -1)
            this.minute = minute;
        else
            System.out.println("Zły czas");
        if (second < 60 && minute > -1)
            this.second = second;
        else
            System.out.println("Zły czas");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 24 && hour > -1)
            this.hour = hour;
        else
            System.out.println("zły czas");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 60 && minute > -1)
            this.minute = minute;
        else
            System.out.println("Zły czas");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 60 && minute > -1)
            this.second = second;
        else
            System.out.println("Zły czas");
    }

    public String toString() {
        return String.format("%02d" + ":" + "%02d" + ":" + "%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                this.minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else
                    hour++;
            } else
                minute++;
        } else
            second++;
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else
                hour++;
        } else
            minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23)
            hour = 0;
         else
            hour++;
         return this;
    }
    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                this.minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else
                    hour--;
            } else
                minute--;
        } else
            second--;
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            if (hour == 0) {
                hour = 23;
            } else
                hour--;
        } else
            minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0)
            hour = 23;
        else
            hour--;
        return this;
    }
}

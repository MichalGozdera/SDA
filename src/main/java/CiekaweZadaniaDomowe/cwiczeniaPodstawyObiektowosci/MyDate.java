package CiekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;

import java.util.Set;

public class MyDate {
    int year;
    int month;
    int day;
    String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String[] strDays = {"Monday", "Tuesday", "Wedensday", "Thursday", "Friday", "Saturday", "Sunday"};
    int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        if (isValidDate(year, month, day) == true) {
            this.month = month;
            this.day = day;
        }
    }

    public void SetDate(int year, int month, int day) {
        this.year = year;
        if (isValidDate(year, month, day) == true) {
            this.month = month;
            this.day = day;
        }
    }

    public String getDayOfTheWeek(int year, int month, int day) {
        int dzienRoku;
        int yy, c, g;
        int wynik;
        int liczbaDni[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        dzienRoku = day + liczbaDni[month - 1];
        if ((month > 2) && (isLeapYear(year) == true))
            dzienRoku++;

        yy = (year - 1) % 100;
        c = (year - 1) - yy;
        g = yy + (yy / 4);
        wynik = (((((c / 100) % 4) * 5) + g) % 7);
        wynik += dzienRoku - 1;
        wynik %= 7;

        return strDays[wynik];
    }

    public boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else
            return true;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (isLeapYear(year) && month == 2 && day < 30)
            return true;
        else if (day < 0 || day > daysInMonths[month - 1])
            return false;
        else if (month > 13 || month < 0)
            return false;
        else
            return true;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 13 && month > 0)
            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isLeapYear(this.year) && this.month == 2 && day < 30)
            this.day = day;
        if (day > 0 && day <= daysInMonths[month])
            this.day = day;
    }

    @Override
    public String toString() {
        return (getDayOfTheWeek(this.year, this.month, this.day) + " " + getDay() + " " + strMonths[getMonth() - 1] + " " + getYear());
    }

    public MyDate nextDay() {
        if (month == 2 && day == 29) {
            day = 1;
            month = 3;
            return this;
        }
        if (day == daysInMonths[month - 1]) {
            if (isLeapYear(year) && month == 2 && day == 28) {
                day = 29;
                month = 2;
                return this;
            }
            day = 1;
            if (month == 12) {
                year = year + 1;
                month = 1;
            } else
                month++;
        } else day++;
        return this;
    }

    public MyDate nextmonth() {
        if (month == 12) {
            year = year + 1;
            month = 1;
        } else
            month++;
        if (month == 2 && isLeapYear(year) == true)
            day = 29;
        if (isValidDate(year, month, day) == false)
            day = daysInMonths[month - 1];
        return this;
    }
    public MyDate nextyear(){
        if (isLeapYear(year)&&month==2)
        day=28;
        year++;
        return this;
    }
    public MyDate previousDay() {
        if (month == 2 && day == 29) {
            day = 28;
            return this;
        }
        if (day == 1) {
            if (isLeapYear(year) && month == 3) {
                day = 29;
                month = 2;
                return this;
            }
            if (month == 1) {
                year = year - 1;
                month = 12;
            } else
                month--;
            day = daysInMonths[month-1];
        } else day--;
        return this;
    }

    public MyDate previousmonth() {
        if (month == 1) {
            year = year - 1;
            month = 12;
        } else
            month--;
        if (month == 2 && isLeapYear(year) == true)
            day = 29;
        if (isValidDate(year, month, day) == false)
            day = daysInMonths[month - 1];
        return this;
    }
    public MyDate previousyear(){
        if (isLeapYear(year)&&month==2)
            day=28;
        year--;
        return this;
    }
}

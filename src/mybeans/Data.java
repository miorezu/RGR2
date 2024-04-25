package mybeans;

public class Data {

    private String date;
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Data{" +
                "date='" + date + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
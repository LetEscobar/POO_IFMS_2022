public class Ponto {
    private int x;
    private int y;

    public Ponto() {

    }

    public Ponto(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Ponto p1, Ponto p2) {
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        return Math.sqrt(d);
    }
}

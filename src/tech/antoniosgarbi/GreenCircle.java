package tech.antoniosgarbi;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando círculo [cor: verde, raio: " + radius + ", x: " + x + ", " + y + "]");

    }

}
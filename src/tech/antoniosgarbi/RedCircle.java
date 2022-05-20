package tech.antoniosgarbi;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando círculo [cor: vermelho, raio: " + radius + ", x: " + x + ", " + y + "]");
    }

}
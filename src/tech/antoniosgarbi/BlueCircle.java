package tech.antoniosgarbi;

public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando círculo [cor: azul, raio: " + radius + ", x: " + x + ", " + y + "]");

    }

}
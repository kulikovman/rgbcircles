package ru.kulikovman.rgbcircles;


public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }

    public void oneTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x, y);
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}

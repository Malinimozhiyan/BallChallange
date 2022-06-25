import processing.core.PApplet;
public class FourBallChallenge extends PApplet{
    public static  int WIDTH = 500,HEIGHT = 500, DIAMETER = 5;
    int BallOne = 0,BallTwo = 0,BallThree = 0,BallFour = 0;
    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        BallOne = drawCircle(BallOne, 1);
        BallTwo = drawCircle(BallTwo, 2);
        BallThree = drawCircle(BallThree, 3);
        BallFour = drawCircle(BallFour, 4);
    }

    private int drawCircle(int xAxisPos, int unitPerFrame) {
        ellipse(xAxisPos, (float) (unitPerFrame * HEIGHT) / 5, DIAMETER, DIAMETER);
        return xAxisPos + unitPerFrame;
    }
}


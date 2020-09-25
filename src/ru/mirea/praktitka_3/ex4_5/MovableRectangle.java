package ru.mirea.praktitka_3.ex4_5;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isSpeedEqual(int speed1, int speed2) {
        return speed1 == speed2;
    }


    @Override
    public void moveUp() {
        if(isSpeedEqual(topLeft.getYSpeed(), bottomRight.getYSpeed())) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if(isSpeedEqual(topLeft.getYSpeed(), bottomRight.getYSpeed())) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if(isSpeedEqual(topLeft.getXSpeed(), bottomRight.getXSpeed())) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if(isSpeedEqual(topLeft.getXSpeed(), bottomRight.getXSpeed())) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle {" +
                " topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                " } ";
    }
}

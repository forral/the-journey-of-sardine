package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 04/06/2018.
 */
public class Grid {

    public final int PADDING = 10;

    private Rectangle canvas;

    private Rectangle frameRight;

    private Rectangle frameLeft;




    public Grid(int width, int height, int widthFrame) {
        this.canvas = new Rectangle(PADDING,PADDING,width,height);
        this.frameRight = new Rectangle(width - widthFrame + PADDING, PADDING, widthFrame, height);
        this.frameLeft = new Rectangle(PADDING, PADDING, widthFrame, height);
    }


    public void init(){
        canvas.draw();
        frameLeft.fill();
        frameRight.fill();

    }


    public Rectangle getCanvas() {
        return canvas;
    }

    public Rectangle getFrameRight() {
        return frameRight;
    }

    public Rectangle getFrameLeft() {
        return frameLeft;
    }
}

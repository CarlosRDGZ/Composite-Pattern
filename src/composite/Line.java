package composite;

import java.awt.Graphics;

public class Line implements IShape
{

    int xLeft, xRight, yTop, yBottom;
    public Line(int xLeft, int yTop, int xRight, int yBottom)
    {
        super();
        this.xLeft = xLeft;
        this.xRight = xRight;
        this.yTop = yTop;
        this.yBottom = yBottom;
    }
    
    @Override
    public void draw(Graphics g)
    {
        g.drawLine(xLeft, yTop, xRight, yBottom);
    }
}

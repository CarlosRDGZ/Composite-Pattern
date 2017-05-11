package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompositePatternDemo extends JPanel
{
    public static void main(String[] args)
    {
        JFrame app = new JFrame("Village");
        app.setVisible(true);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(new CompositePatternDemo());
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        CompositeShape[] shapes = { new House(50, 60, 60, 100),
            new House(40, 190, 50, 70), new House(175, 140, 40, 60)};

        ArrayList<IShape>villageShapes = new ArrayList<>();
        villageShapes.addAll(Arrays.asList(shapes));

        Village village = new Village(villageShapes);
        village.draw(g);
    }
}

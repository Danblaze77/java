 import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ShapeDrawingApplet extends Applet implements ItemListener {
    private Color foregroundColor = Color.BLACK;
    private Color backgroundColor = Color.WHITE;
    private int selectedShape = 0;

    private CheckboxGroup shapeGroup;
    private Checkbox circleCheckbox;
    private Checkbox squareCheckbox;
    private Checkbox rectangleCheckbox;

    private CheckboxGroup foregroundColorGroup;
    private Checkbox redCheckbox;
    private Checkbox greenCheckbox;
    private Checkbox blueCheckbox;

    private CheckboxGroup backgroundColorGroup;
    private Checkbox whiteCheckbox;
    private Checkbox grayCheckbox;
    private Checkbox blackCheckbox;

    public void init() {
        setLayout(new FlowLayout());
        shapeGroup = new CheckboxGroup();
        circleCheckbox = new Checkbox("Circle", shapeGroup, true);
        squareCheckbox = new Checkbox("Square", shapeGroup, false);
        rectangleCheckbox = new Checkbox("Rectangle", shapeGroup, false);
        foregroundColorGroup = new CheckboxGroup();
        redCheckbox = new Checkbox("Red", foregroundColorGroup, true);
        greenCheckbox = new Checkbox("Black", foregroundColorGroup, false);
        blueCheckbox = new Checkbox("Blue", foregroundColorGroup, false);
        backgroundColorGroup = new CheckboxGroup();
        whiteCheckbox = new Checkbox("White", backgroundColorGroup, true);
        grayCheckbox = new Checkbox("Gray", backgroundColorGroup, false);
        blackCheckbox = new Checkbox("Pink", backgroundColorGroup, false);

        add(new Label("Select Shape:"));
        add(circleCheckbox);
        add(squareCheckbox);
        add(rectangleCheckbox);

        add(new Label("Select Foreground Color:"));
        add(redCheckbox);
        add(greenCheckbox);
        add(blueCheckbox);

        add(new Label("Select Background Color:"));
        add(whiteCheckbox);
        add(grayCheckbox);
        add(blackCheckbox);

        circleCheckbox.addItemListener(this);
        squareCheckbox.addItemListener(this);
        rectangleCheckbox.addItemListener(this);

        redCheckbox.addItemListener(this);
        greenCheckbox.addItemListener(this);
        blueCheckbox.addItemListener(this);

        whiteCheckbox.addItemListener(this);
        grayCheckbox.addItemListener(this);
        blackCheckbox.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (circleCheckbox.getState()) {
            selectedShape = 0;
        } else if (squareCheckbox.getState()) {
            selectedShape = 1;
        } else if (rectangleCheckbox.getState()) {
            selectedShape = 2;
        }

        if (redCheckbox.getState()) {
            foregroundColor = Color.RED;
        } else if (greenCheckbox.getState()) {
            foregroundColor = Color.BLACK;
        } else if (blueCheckbox.getState()) {
            foregroundColor = Color.BLUE;
        }

        if (whiteCheckbox.getState()) {
            backgroundColor = Color.WHITE;
        } else if (grayCheckbox.getState()) {
            backgroundColor = Color.GRAY;
        } else if (blackCheckbox.getState()) {
            backgroundColor = Color.PINK;
        }

        repaint();
    }

    public void paint(Graphics g) {
        setBackground(backgroundColor);
        g.setColor(foregroundColor);

        int width = getWidth();
        int height = getHeight();

        if (selectedShape == 0) {
            g.fillOval(250, 250,400,400);
        } else if (selectedShape == 1) {
            g.fillRect(250, 250,400,400);
        } else if (selectedShape == 2) {
            g.fillRect(250, 250,800,400);
        }
    }
}
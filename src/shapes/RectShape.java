package shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectShape implements GraphicShape {
  int posX, posY, rectWidth, rectHeight, strokeWidth;
  Color fillColor, strokeColor;

  public RectShape(int posX, int posY, int rectWidth, int rectHeight, int strokeWidth, Color fillColor, Color strokeColor) {
    this.posX = posX;
    this.posY = posY;
    this.rectWidth = rectWidth;
    this.rectHeight = rectHeight;
    this.fillColor = fillColor;
    this.strokeColor = strokeColor;
    this.strokeWidth = strokeWidth;
  }

  public void drawShape(GraphicsContext g) {
    g.setLineWidth(strokeWidth);
    g.setStroke(strokeColor);
    g.setFill(fillColor);
    g.fillRect(posX, posY, rectWidth, rectHeight);
    g.strokeRect(posX, posY, rectWidth, rectHeight);
  }
}

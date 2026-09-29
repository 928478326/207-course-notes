/**
 * Represents a rectangle with a width and height.
 */
public class Rectangle {
  private double width;
  private double height;
  /**
   * Creates a rectangle with the given width and height.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }
  /**
   * Returns the area of this rectangle.
   *
   * @return the area of this rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the scale factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }
  /**
   * Returns whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a larger area than the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}

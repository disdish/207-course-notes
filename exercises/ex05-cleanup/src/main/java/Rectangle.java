/**
 * A Class to calculate the area of a rectangle, get the width and height, along with comparing the
 * rectangles, and scaling the area of the rectangles.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initialize a rectangle with a width and height.
   *
   * @param w any double
   * @param h any double
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculate the area of a rectangle by multiplying the width and height.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor a double to multiply the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Return true if the rectangle is larger than the other rectangle false otherwise.
   *
   * @param other Type rectangle
   * @return true if rectangle is larger than the other rectangle
   *
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}

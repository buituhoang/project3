package project3;

public class Rectangle implements Shape {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

//    Setter
//    Also check coordinate x, y

    /**
     * Construct a rectangle with the height and width, which starts at the coordinate (x, y)
     * @param x X coordinate of the starting point of the rectangle
     * @param y Y coordinate of the starting point of the rectangle
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public Rectangle(int x, int y, int width, int height) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinate x & y cannot be less than 0.");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("The width cannot be 0 or less than 0.");
        }

        if (height <= 0) {
            throw new IllegalArgumentException("The height cannot be 0 or less than 0.");
        }

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    /**
     * Get the x coordinate of the starting point of the rectangle
     * @return A integer data type
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the starting point of the rectangle
     * @return A integer data type
     */
    public int getY() {
        return y;
    }

    /**
     * Get the width of the rectangle
     * @return A integer data type
     */
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the rectangle
     * @return A integer data type
     */
    public int getHeight() {
        return height;
    }

    @Override
    /**
     * Determine whether or not the given point is contained within this shape.
     */
    public boolean contains(int x, int y) {
        return (x >= this.x) && (x < this.x + width) && (y >= this.y) && (y < this.y + height);
    }

    @Override
    /**
     * Determine a <i>bounding box</i> of the current shape. A bounding box is a
     *      * box that will fit around the entire shape and, hence, can be used to
     *      * determine the maximum width and height of the shape. This is useful when
     *      * it comes to drawing the shape!
     *      *
     */
    public Shape boundingBox() {
        return this;
    }

}

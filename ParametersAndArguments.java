public class ParametersAndArguments { 
    public static int calculateArea(int width, int height) {
        int area = width * height; // Multiply width and height
        return area;  // Return the calculated area
    }

    // Main method
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the calculateArea method and store result in 'area'
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }
} // End of class

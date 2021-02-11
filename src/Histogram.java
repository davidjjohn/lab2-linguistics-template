/**
 * Create a Histogram object based on an integer array.
 *
 * Initial design:  Stan Thomas,  February 2021
 *
 * Name:
 * Date:
 *
 */

public class Histogram {

    // class members
    private int[] data;  // data to be graphed
    private final int PAGEWIDTH = 100;  // maximum row size

    // constructor
    public Histogram(int[] data){
        this.data = data;
    }

    // Find largest int value for scaling row size
    private int findmax(){
        int max = data[0];

        return max;
    }

    // print the histogram
    public void print(){
        int unitsPerMark = findmax() / PAGEWIDTH;



    }
}

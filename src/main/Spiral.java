package main;

public class Spiral {
    public static String spiralTraverse(int[][] array2D) {

        //in 2d array, assuming x is axis for rows and y is the axis for columns
        int xmin = 0; //start point of x
        int ymin = 0; //start point of y
        int xmax = array2D.length -1; //end of x
        int ymax = array2D[0].length -1; //end of y
        String output = "";

        //this will traverse till it reaches the traversing till end
        while(xmin <= xmax && ymin <= ymax)
        {
            //traverse top row(xmin) of the 2D box
            for(int y = ymin; y <= ymax; y++){
                output += array2D[xmin][y]+",";
            }

            //remove top row after from box
            xmin++;

            //traverse left most column(ymax) of the 2D box
            for(int x = xmin; x <= xmax; x++){
                output += array2D[x][ymax]+",";
            }

            //remove left most column after from box
            ymax--;

            //traverse bottom row(xmax) of the 2D box
            for(int y = ymax; ymin <= y; y--){
                output += array2D[xmax][y]+",";
            }

            //remove bottom row after from box
            xmax--;

            //traverse right most column(ymin) of the 2D box
            for(int x = xmax; xmin<= x; x--){
                output += array2D[x][ymin]+",";
            }

            //remove right most column after from box
            ymin++;
        }

        //remove the extra ',' at the end
        if(!output.isEmpty()) {
            output = output.substring(0, output.length() - 1);
        }

        System.out.println("main.Spiral Output: " + output);

        return output;
    }
}

package Array;

class JaggedArrayExample
{
    public static void main(String args[])
    {
        // Declaration of jagged array
        int[][] arr = new int[3][];

        // Initializing each row with different size
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        // Assigning values
        arr[0][0] = 10;
        arr[0][1] = 20;

        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[1][2] = 50;

        arr[2][0] = 60;

        // Displaying the jagged array
        System.out.println("Jagged Array Elements:");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

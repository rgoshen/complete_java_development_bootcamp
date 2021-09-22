import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 },
        };
        
        // int[][] grades = new int[3][4];

        // Harry's grades Potions, Herbology, Arithmancy, Charms
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // Ron's grades Potions, Herbology, Arithmancy, Charms
        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;

        // Hermione's grades Potions, Herbology, Arithmancy, Charms
        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        

        // System.out.println("\tHarry:"+ "\t\t" + Arrays.toString(grades[0]));
        // System.out.println("\tRon:"+ "\t\t" + Arrays.toString(grades[1]));
        // System.out.println("\tHermione:"+ "\t" + Arrays.toString(grades[2]));
        // System.out.println("\tHarry:"+ "\t\t" + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        // System.out.println("\tRon:"+ "\t\t" + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        // System.out.println("\tHermione:"+ "\t" + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

        // for (int j = 0; j < grades[0].length; j++) {
        //     System.out.print(grades[0][j] + " "); //Harry's grades
        // };
         
        // System.out.println("\n");
        
        // for (int j = 0; j < grades[1].length; j++) {
        //      System.out.print(grades[1][j] + " ");  //Ron's grades
        //  };
        
        //  System.out.println("\n");
        
        // for (int j = 0; j < grades[2].length; j++) {
        //      System.out.print(grades[2][j] + " ");  //Hermione's grades
        //  };
    
        //  System.out.println("\n");

        for (int i = 0; i < grades.length; i++) { // i: row, j: each element in current row
            switch (i) {
                case 0:
                    System.out.print("\tHarry:\t\t");
                    break;
                case 1:
                    System.out.print("\tRon:\t\t");
                    break;
                case 2: System.out.print("\tHermione:\t");
            }
              for (int j = 0; j < grades[i].length; j++) {
                   System.out.print(grades[i][j] + " ");
              };
              System.out.println("\n");
         };

    }
}

package arrays.multidimesionall_arrays;

import java.util.Arrays;

public class TwoD_2 {

    public static void main(String[] args) {

        String[][] carModel = new String[3][4];

        carModel[0][0] = "Accord";
        carModel[0][1] = "Civic";
        carModel[0][2] = "Odyssey";
        carModel[0][3] = "Pilot";

        carModel[1][0] = "BMW";
        carModel[1][1] = "Mercedes";
        carModel[1][2] = "Audi";
        carModel[1][3] = "Lexus";

        carModel[2][0] = "Fiesta";
        carModel[2][1] = "Mustang";
        carModel[2][2] = "F150";
        carModel[2][3] = "Raptor";

        System.out.println(Arrays.toString(carModel[0]));
        System.out.println(Arrays.toString(carModel[1]));
        System.out.println(Arrays.toString(carModel[2]));

        for( int i = 0; i < carModel.length; i++){
            for (int j = 0; j < carModel.length; j++){
                System.out.print(carModel[j][i] + ",");
            }
            System.out.println();
        }
    }
}

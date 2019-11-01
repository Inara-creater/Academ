package homework.hw2;

public class ShootingArea {
    public static void main(String[] args) {
        int [][]area = new int[6][6];
        System.out.println("\nAll set. Get ready to rumble!\n");
        area[1][0] = 1;
        area[2][0] = 2;
        area[3][0] = 3;
        area[4][0] = 4;
        area[5][0] = 5;
        area[0][1] = 1;
        area[0][2] = 2;
        area[0][3] = 3;
        area[0][4] = 4;
        area[0][5] = 5;
        for ( int i = 0; i<area.length; i++) {
            for (int j = 0; j<area[i].length; j++) {
                System.out.print(area[i][j] + " | ");
            }
            System.out.println();


        }
    }}


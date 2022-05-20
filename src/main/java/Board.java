//import java.util.Scanner;
//
//public class Board {
//
//
//    String[][] grid = new String[10][10];
//
//    public void topBorder() {
//        //Making initial gap for the top border 0
//        System.out.print("     ");
//        for (int i = 0; i < 10; i++) {
//
//            System.out.print("  "  + i + "  " + " ");
//
//        }
//        System.out.println(" ");
//    }
//
//    public void remainderOfBoard() {
//
//
//        for (int i = 0; i < 10; i++) {
//            grid[i][0] = "" + i ;
////            System.out.print( i + "\t| ");
//
//            for (int j = 0; j < 10; j++) {
//
//                System.out.print(" o ");
//                System.out.print(" | ");
//
//            }
//
//            System.out.println(" ");
//
//
//        }
//
//   }
//
//   public void scanner (int currentX, int currentY){
//        Scanner inputFromUser = new Scanner(System.in);
//       System.out.println("Give us the input values starting with x");
//       int x = inputFromUser.nextInt();
//
//       System.out.println("Now for y");
//       int y = inputFromUser.nextInt();
//
//        if(currentX == x && currentY == y){
//            System.out.print(" x ");
//            System.out.print(" | ");
//
//
//        }else {
//            System.out.print(" o ");
//            System.out.print(" | ");
//        }
//
//   }
//
//
//}

import java.util.Scanner;

public class Board {



    Tile[][] map;
    int[]bombLocation ;

    public Board() {
        Scanner mapSize = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rowSize = mapSize.nextInt();
        System.out.println("How many columns do you want?");
        int columnSize = mapSize.nextInt();


        map = new Tile[columnSize][rowSize];
//       bombLocation = new int[columnSize/rowSize +1];
//       randomBombGen(rowSize,columnSize);
        bombLocation = new int[]{
                1,2,3
        };
        displayBombLocation();

    }

    public void createBoard(){
        for(int i=0; i<map.length; i++){

            for (int j=0; j<map[i].length;j++){
                Tile currentTile = new Tile();
                currentTile.setPosX(j);
                currentTile.setPosY(i);

                map[i][j] = currentTile;
                System.out.print(map[i][j].getDisplay());

            }
            System.out.println("");
        }
    }

    public void displayBoard(){
        for(int i=0; i<map.length; i++){

            for (int j=0; j<map[i].length;j++){

                System.out.print(map[i][j].getDisplay());

            }
            System.out.println("");
        }
    }

    public void scanBoard(){
        Scanner scanBoard = new Scanner(System.in);
        System.out.println("Where do you wanna put your X?");
        int userXInput = scanBoard.nextInt();

        System.out.println("Now where do you wanna put your Y?");
        int userYInput = scanBoard.nextInt();
        boolean foundPosition = false;
        for(int i=0; i<map.length; i++){
            for (int j=0; j<map[i].length;j++){

                if (userXInput == map[i][j].getPosX() && userYInput == map[i][j].getPosY()){
                    foundPosition = true;

                    map[i][j].setDisplay(" x ");

                }

            }


        }
        displayBoard();
        scanBoard();
        if (foundPosition == false){
            System.out.println("Invalid Input, try again");
            scanBoard();
        }


    }

    public void randomBombGen(int x, int y){

        int min = x;
        int max = y;
        int range = max-min + 1;
        for (int i = 0; i < bombLocation.length; i++) {
            int bombRandom = (int)(Math.random() * range) + min;

            bombLocation[i] = bombRandom;

        }
    }

    public  void displayBombLocation(){
        for (int i = 0; i < bombLocation.length; i++) {
            System.out.println(bombLocation[i]);

        }
    }

    public void setBomb(){

    }


}


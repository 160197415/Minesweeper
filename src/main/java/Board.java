public class Board {

    public void topBorder() {
        //Making initial gap for the top border 0
        System.out.print("     ");
        for (int i = 0; i < 10; i++) {

            System.out.print("  "  + i + "  " + " ");

        }
        System.out.println(" ");
    }

    public void remainderOfBoard() {
        for (int i = 0; i < 10; i++) {
            System.out.print( i + "\t| ");

            for (int j = 0; j < 10; j++) {

                System.out.print(" ? ");
                System.out.print(" | ");

            }
            System.out.println(" ");


        }

   }


}

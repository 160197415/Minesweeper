//public class Tile {
//
//
//    int iValue;
//    int jValue;
//
//    int visibleNumber;
//    boolean isNumber;
//    boolean emptySpace;
//
//    boolean isFlag;
//    boolean isMine;
//    boolean isHidden;
//
//
//    public int getiValue() {
//        return iValue;
//    }
//
//    public void setiValue(int iValue) {
//        this.iValue = iValue;
//    }
//
//    public int getjValue() {
//        return jValue;
//    }
//
//    public void setjValue(int jValue) {
//        this.jValue = jValue;
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//}

public class Tile {



    int posX;
    int posY;

    String display;
    boolean isBomb;
    public void setBomb() {
        isBomb =true;
    }



    public Tile() {
        display = " o ";

    }



    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


}

public class Tank {
    private int currentPosition;

    public void goForward(int distance)
    {this.currentPosition = currentPosition + distance; }

    public void goBackward(int distance)
    {this.currentPosition = currentPosition - distance; }

    public void printPosition(){
        System.out.println("The tank is " + currentPosition + " now");
    }
     //комментарий4
}

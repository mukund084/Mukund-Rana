import java.util.*;


class JugPuzzle{

private ArrayList<Jug> Jugs; // Array list used call a jug
private int moves;           // Uesed to store numbers moves played
private boolean isWon;       // inform us wheather game has been won or not

private static int highScore = 10000; // 

public JugPuzzle(){

Jugs = new ArrayList<>();

Jugs.add(new Jug(0, 8, 8));
Jugs.add(new Jug(1, 0, 5));
Jugs.add(new Jug(2, 0, 3));
this.moves = 0;
this.isWon = false;


}


public String toString(){
return this.moves +
" 0: (" + this.Jugs.get(0).getVolume() + "/8) " +
"1: (" + this.Jugs.get(1).getVolume() + "/5) " +
"2: (" + this.Jugs.get(2).getVolume() + "/3) ";


}

public void startGame(){

while(!this.isWon){
System.out.println(this.toString());
this.getMove();
}

System.out.println("Congrats, you solved it in " + this.moves + " moves!!");
setHighScore(this.moves);

}





private void getMove(){
Scanner moves = new Scanner(System.in);
System.out.println("Spill from jug: ");
int move1 = moves.nextInt();
System.out.println("into jug: ");
int move2 = moves.nextInt();

Jugs.get(move1-1).pourFrom(Jugs.get(move2-1));
this.moves ++;
this.setWinState();

}

private void setWinState(){
if (this.Jugs.get(0).getVolume() == 4 && this.Jugs.get(1).getVolume() == 4){
this.isWon = true;
}

}

private static void setHighScore(int currentScore){
if (currentScore < highScore){
highScore = currentScore;
}
System.out.println( "Congrats, your new high socre is " + highScore);


}







}
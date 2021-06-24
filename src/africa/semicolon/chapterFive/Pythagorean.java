package africa.semicolon.chapterFive;

public class Pythagorean {
    public static void main(String[] args) {
        int oppSquare;
        int adjSquare;
        int hypSquare;
        System.out.print("Opposite \tAdjacent\tHypotenuse\n");
        for(int opp = 1; opp <= 500; opp++){
            for(int adj = 1; adj <= 500; adj++){
                for(int hyp = 1; hyp <= 500; hyp++){
                    oppSquare = opp * opp;
                    adjSquare = adj * adj;
                    hypSquare = hyp * hyp;
                    if(hypSquare == (oppSquare + adjSquare)){
                        System.out.println(opp + "\t" + adj + "\t" + hyp);
                    }
                }
            }
        }
    }
}

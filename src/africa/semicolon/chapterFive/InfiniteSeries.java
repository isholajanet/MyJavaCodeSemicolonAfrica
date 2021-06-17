package africa.semicolon.chapterFive;

public class InfiniteSeries {
    public static void main(String[] args) {
        calculateValueOfPie();

    }




    public static void calculateValueOfPie() {
        double denominator = 1;
        int counter = 1;
        double pie = 0.0;

        while(counter <= 200){
            if(counter % 2 == 0) {
                pie = pie + (4 / denominator);
            }
            else if(counter % 2 == 1){
                pie = pie - (4 / denominator);
            }
            System.out.println(counter + "\t\t" + pie);
            counter++;
            denominator+=2;
        }



    }
}

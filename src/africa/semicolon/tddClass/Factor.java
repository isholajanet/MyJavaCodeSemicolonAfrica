package africa.semicolon.tddClass;

public class Factor {
    public String getFactorsOfNumbers(int number) {

        String allFactor = "";
        int factor = 1;
        while(number >= factor){
            if(number % factor == 0) {
                allFactor = allFactor  + factor + ",";
            }
            factor++;
        }
        return allFactor;
    }
}

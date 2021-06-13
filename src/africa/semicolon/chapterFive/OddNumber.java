package africa.semicolon.chapterFive;

public class OddNumber {
    public int getProduct() {
        int product = 1;
        for(int count = 1; count <= 15; count++){
            if(count % 2 != 0){
                product = count * product;
            }
        }
        return product;
    }
}

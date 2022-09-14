public class Pythagorean {

    int side1, side2, side3;

    public Pythagorean(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String pythagoreanTriplet(int side, int side2, int side3){
        if(side > side2 && side > side3){
            int hyp = side * side;
            int oth = side2*side2 + side3*side3;
            if(hyp == oth){
                return "triplet";
            }
            else{
                return "No";
            }
        }
        else if(side2 > side && side2 > side3){
            int hyp = side2 * side2;
            int oth = side*side + side3*side3;
            if(hyp == oth){
                return "triplet";
            }
            else {
                return "No";
            }
        }
        else{
            int hyp = side3 * side3;
            int oth = side*side + side2*side2;
            if(hyp == oth){
                return "triplet";
            }
            else {
                return "No";
            }
        }
    }
}

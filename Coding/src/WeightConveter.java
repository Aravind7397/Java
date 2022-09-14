public class WeightConveter {
    double weight;

    public WeightConveter(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double convertToGrams(double weight){
        return weight*1000;
    }

    public double convertToMilliGrams(double weight){
        return weight*1000000;
    }


}

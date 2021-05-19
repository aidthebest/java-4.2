public class BodyMassIndexService {
    public double calculate (double weight, double height){
        int index = (int) (weight / (height*height));
        return index;
    }
}

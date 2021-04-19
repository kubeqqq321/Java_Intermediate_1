package SubClassAndSuperClass_13;

/**
 * @author Jakub Marciniak
 * #13
 */

public class Running extends Shoe{

    public final double weight;

    Running(double weight , String brand , double size){
        super(brand, size);
        this.weight = weight;

    }

}

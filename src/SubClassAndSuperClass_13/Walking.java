package SubClassAndSuperClass_13;

/**
 * @author Jakub Marciniak
 * #13
 */

public class Walking extends Shoe{
    public final boolean goreTex;

    Walking(boolean goreTex , String brand , double size){
        super(brand, size);
        this.goreTex = goreTex;
    }
}

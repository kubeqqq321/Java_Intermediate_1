package Enums_5;

/**
 * @author Jakub Marciniak
 * #5
 */

enum levelsEnum{
    //"Low","Medium","High" Not like that
    LOW, MEDIUM , HIGH;
}


public class Enums {

    static String [] levels = {"Low" , "Medium" , "High"};

    enum Flavour{
        CHOCOLATE , VANILLA , STRAWBERRY;

        public static void getVanilla(){
            System.out.println(Flavour.VANILLA);
        }
    }



    public static void main(String[] args) {

        System.out.println(levels[0]);
        System.out.println(levels[1]);
        System.out.println(levels[2]);


        System.out.println("-----------Enum outside class------------");
        levelsEnum l = levelsEnum.LOW;
        //levelsEnum l = levelsEnum.MEDIUM;
        //levelsEnum l = levelsEnum.HIGH;
        System.out.println(levelsEnum.MEDIUM);
        System.out.println(l);

        switch (l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                System.out.println("Super High level");
                break;
        }


        System.out.println("-----------Enum inside class------------");
        //Flavour f = new Flavour(); Wrong enum is not an Object
        Flavour f = Flavour.CHOCOLATE;

        if(f == Flavour.VANILLA){
            System.out.println("It's Vanilla");
        }else if(f == Flavour.CHOCOLATE){
            System.out.println("It's Chocolate");
        }else if(f == Flavour.STRAWBERRY){
            System.out.println("It's Strawberry");
        }


        f.getVanilla();

    }


}

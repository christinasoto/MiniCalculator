/**
 * Aids UnitTests by implementing methods and making sure they don't crash.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 *  * @version 8.0.0
 *  * @since 04-18-2020
 */
public abstract class Calculator implements Multiplier,Divider {
    protected int total;

    Calculator(){
        total = 1;

    }
    //implement methods and make sure they don't crash
public void multiply(int y){
        try {
            total = y * total;
        } catch(Exception e){
            System.out.println(e);{
                System.out.println(e);
            }
        }

}
    public void divide(int y){
        try{  total=total/y;
        } catch(Exception e)
        { System.out.println(e);
        }
    }
     abstract int calculate();
}

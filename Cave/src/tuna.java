/**
 * Created by blarson on 2/14/14.
 */
public class tuna {
    private String girlName;
    public void setName(String name){
        girlName =name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        //System.out.printf("Your first gf was %s", getName());
        System.out.println("Your first gf was " + getName());
    }

}

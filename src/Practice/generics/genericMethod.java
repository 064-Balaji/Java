package Practice.generics;

import java.util.ArrayList;

public class genericMethod {
    public static void main(String []args){
        setObject(new String[]{"Virat", "Dhoni", "Bumbra"});
    }

    private static  <T> void setObject(T[] obj){
        //Array List
        ArrayList names = new ArrayList<>();
        for (int i=0; i< obj.length; i++) {
            names.add(obj[i]);
        }

        for(Object i: names){
            System.out.println(i+ ", ");
        }
    }
}

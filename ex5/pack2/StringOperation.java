        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import java.util.*;

/**
 *
 * @author test05
 */
public class StringOperation {
    public String concatenate(String str1, String str2){
        return str1 + str2;
    }
    public String reverse(String str1){
        String reverse = "";
        for(int i=0; i<str1.length(); i++){
            char c;
            c = str1.charAt(i);
            reverse = reverse + c;
        }
        
        return  reverse;
    }
}

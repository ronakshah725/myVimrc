/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ronakshahmac
 */
public class Validate {
    
    private static String FullContact;
    private static String [] p;
    private static ArrayList<String> incompleteErrors;
     private static String firstname;
    private static String lastname;
    private static String mname;
    private static String gender;
    private static String phone;//
    private static String state_string;//9
    private static String city;//8
    private static String add1;//6
    private static String add2;//7
    private static String zip;//10
    private static String country;//11
    private static String email;//4
    
    
    
     public Validate (String textFieldsString){
         
        String []  parts=textFieldsString.split("\t",-1);
        
        this.p=parts;
                
        
    
        setStrings();
    //    isValid();
        incompleteErrors=new ArrayList<>(20);
        for(int i=0; i<this.p.length;i++){
            incompleteErrors.add(i,"");
            
        }
        
        
        
    }
     public Validate ()
     {}    
     void setStrings(){
    firstname = p[0];
         
    lastname=p[2];
    mname=p[1];
    gender=p[3];
    phone=p[5];
    state_string=p[9];
    city=p[8];
    add1=p[6];
    add2=p[7];
    zip=p[10];
    country=p[11];
    email=p[4];
    }

        //first check all   required fields are not null or white space
        //in the main code, if all entries are not filledfilled 
    boolean requiredDataEntered(){
            boolean status= true;
            for(int i=0; i<p.length;i++){
                if(i==1||i==7)continue;// index 1 is for middle name and index 7 is for address line 2
                                        //since they are not required fields , we will skip through those
                if(isNullOrWhitespace(p[i])){
                    
                    incompleteErrors.set(i,"Cannot be left blank");
                    status=false;
                    
                            
                }
            }
            
            
            
            
            return status;
        }
    
    
        
    ArrayList<String> getIncompleteErrorString(){
        return incompleteErrors;
    }
        //then, check the validity
        
     boolean isValid() {
        
        
        //email verification
        if(isValidEmail(email))
            incompleteErrors.add(4, "");
        else
            incompleteErrors.add(4, "Invalid Email Address!!");
        
        //then check whether similar fields for first name and last name
        
       // this is done in main code with isUnique()
        
            
        return false;
        
    }
    
     boolean isValidEmail(String email) { 
    boolean status=false; 
    
     String EMAIL_PATTERN = 
    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    Pattern pattern = Pattern.compile(EMAIL_PATTERN); 
    Matcher matcher=pattern.matcher(email); 

        return matcher.matches();
    
    
    
    }
     boolean isNullOrWhitespace(String s) {
         if(s.length()==0||s==null||isWhitespace(s))
                return true ;
         
    return false;

}
     static boolean isWhitespace(String s) {
    int length = s.length();
    if (length > 0) {
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    return false;
}
     
     
     
     
}

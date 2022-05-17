package exception;

public class exception {
     static class AgeInvalid extends Exception{
        AgeInvalid(String s){
            super (s);
        }
    }
         static void validate(int age)throws AgeInvalid{
            if(age<18)
                throw new AgeInvalid("not valid");
            else
                System.out.println("welcome to vote");
        }
        public static void main(String args[]){
            try {
                validate(13);
            }
            catch(Exception i){
                System.out.println("Exception aktif " + i);
            }
            System.out.println("rest ");
        }
    }


package entities;

public class Student {
    public String name;
    public double mediaFinal = 100;
   
    public double media1;
    public double media2;
    public double media3;
    
    
    public double mediaAluno(){
        return media1 + media2 + media3;
    }
     public double saldo(){
    return 60 - mediaAluno();
   }

    public String resultado(){
        if( mediaAluno() < 60)
         return String.format("FAILED %n MISSING %.2f POINTS", saldo());

        else {
            return  "PASS";
        }
    }
       

    }
    
    
    
    

    


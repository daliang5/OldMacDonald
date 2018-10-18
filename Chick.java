class Chick extends Cow {         
    private int thee; 
    public Chick(String type, String sound)     {         
      thee = (int)(Math.random()*2);   
      if(thee == 0){
         mySound = sound;
       }else{ 
         mySound = "cheep";
       }
       myType = type;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}

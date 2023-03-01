public class Gato extends Animal  {
    private String color;
    
    public Gato(String nombre, int edad, String color){
    
        super(nombre,edad);
        this.color = color;
        
    }
    public String getColor(){
            return color;
    }
    
    public void setColor(String color){
        this.color = color;   
    }
    
    public String sonido(){
    return "Miauu";
    
    }
}
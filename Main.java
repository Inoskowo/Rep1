public class Main {

        public static void main(String[] args) {
            
            Gato Gato1 = new Gato("Bills",10,"Cafe");
  
            System.out.println("Mi gato se llama: " + Gato1.getNombre());
            System.out.println("Tiene " + Gato1.getEdad() + " Años" + 
                               "\nEs de color: " + Gato1.getColor() + 
                               "\nY hace: " + Gato1.sonido());
        }

    }
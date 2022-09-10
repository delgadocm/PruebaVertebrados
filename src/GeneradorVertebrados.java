public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camell-o", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vac-a", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tibur-ón", "Pez"); 
        
        return miVertebrados;
    }
}

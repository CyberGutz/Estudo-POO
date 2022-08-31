public class Termometro {
    
    float ctof(float c){
        return (c*1.8f)+32f; 
    }

    float ftoc(float f){
        return (f-32f)*0.55f;
    }

}

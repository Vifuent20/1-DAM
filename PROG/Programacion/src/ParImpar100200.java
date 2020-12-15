
public class ParImpar100200 {
    public static void main(String[] args) {

        int par=0;
        int impar=0;
        int num=200;
        
        for(int cont=100;cont<=num;cont++) {
            if(cont%2==0) {
                par+=cont;
            }
            else {
                impar+=cont;
            } 
        }
        System.out.println ("La suma de los pares es "+par);
        System.out.println ("La suma de los impares es "+impar);
    
    
    
    
    } 
}
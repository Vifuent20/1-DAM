

public class ParImpar100200While {

	public static void main(String[] args) {
	
        int par=0;
        int impar=0;
        int num=200;
        int cont=100;
        
        while(cont <= num)   {  
        	
        	if(cont%2==0) {
                par+=cont;
            }
            else {
                impar+=cont;
            } 
        cont=cont+1;
        		}
	System.out.println("Suma par " + par);
	System.out.println("Suma impar " + impar);
	
	
	}
	
	
	


	}

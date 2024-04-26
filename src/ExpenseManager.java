// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public class ExpenseManager {
	public static void sumarizarGastos(String tipo) {
    	double sum = 0;
    	for(int i=0; i<indicegasto; i++) {
    		if(gastotipo[i].equals(tipo)){
    			sum = sum + gastod[i];
    		}
    	}
    	System.out.println("Total de gastos en " + tipo + " " + sum + "€");
    }
    
}
}

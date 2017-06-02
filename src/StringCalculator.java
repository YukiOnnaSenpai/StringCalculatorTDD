
public class StringCalculator {
	public String niz[];
	public int result;
	
	public int add(String numbersStr) throws StringCalculatorException {
		if(numbersStr != ""){
			String niz[] = numbersStr.split(",");
		}
		else{
			return 0;
		}
		for(int i=0;i<numbersStr.length();i++){
			if(Integer.parseInt(niz[i]) <= 0){
				throw new StringCalculatorException();
			}
		}
		for(int i=0;i<numbersStr.length();i++){
			result += Integer.parseInt(niz[i]);
			
		}
		
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
	public int substract(String numbersStr) {
		if(numbersStr != ""){
			String niz[] = numbersStr.split(",");
		}
		
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
	public int multiply(String numbersStr) {
		if(numbersStr != ""){
			String niz[] = numbersStr.split(",");
		}
		
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
	public int devide(String numbersStr) {
		if(numbersStr != ""){
			String niz[] = numbersStr.split(",");
		}
		
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
	public void check(String numberStr){
		
	}
}

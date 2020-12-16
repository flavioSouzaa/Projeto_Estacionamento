package CriaClasses;

public class VerificaCampos {

	public boolean NumberIsString(String temp) {
		
		boolean found = false;
		
		for (char c : temp.toCharArray()) {
			if (Character.isDigit(c)) {
				found = true;				
			} else {
				found = false;
				break;
			}
		}

		if(found) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean VerificaCampoNull(String campo) {
		
		if(campo == null) {
			return true;
		}else {
			return false;
		}
	}
}

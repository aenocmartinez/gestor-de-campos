import com.abix360.CampoCompuesto;
import com.abix360.CampoSimple;

import com.abix360.Campo;

public class GestorFormulario {

	public static void main(String[] args) {
		
		CampoCompuesto fecElab = new CampoCompuesto();
		
		Campo campo1 = new CampoSimple();
		campo1.withName("dia").withDescription("dia").withId(1);
		fecElab.agregarSubcampo(campo1);
		
		campo1 = new CampoSimple();
		campo1.withName("mes").withDescription("mes").withId(2);		
		fecElab.agregarSubcampo(campo1);
		
		campo1 = new CampoSimple();
		campo1.withName("año").withDescription("año").withId(3);		
		fecElab.agregarSubcampo(campo1);		
		
		for(Campo campo: fecElab.subcampos()) {
			System.out.println(campo.getId() + " - " + campo.getName());
		}
		
	}

}

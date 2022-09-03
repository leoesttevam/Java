package oo.encapsulamento1;

public class Paulo {

	Ana esposa = new Ana();
	Paulo pl = new Paulo();
	
	void testeAcesso() {
		//segredo = "...";
		//facoDentroDeCasa = "..."; //default ou pacote
		//formaDeFalar = "...";
		//todosSabem = "...";
		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}

package oo.encapsulamento2;

import oo.encapsulamento1.Ana;

public class Pedro extends Ana{

	Ana mae = new Ana();
	
	//acessei o default ou pacote fazendo instancia da propria classe.
	Pedro pd = new Pedro(); 
	
	void testeAcesso() {
		//segredo = "...";
		//facoDentroDeCasa = "..."; //default ou pacote
		//formaDeFalar = "...";
		//todosSabem = "...";
		
		//System.out.println(esposa.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(pd.formaDeFalar);
		System.out.println(pd.todosSabem);
		System.out.println(mae.todosSabem);
	}
}

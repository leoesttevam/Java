package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimento = sdf.parse("14/09/2022");
		Date data = sdf.parse("15/09/2022");
		
		if(dataVencimento.before(data)) {
			System.out.println("Boleto vencido");
		}else {
			System.out.println("Boleto não vencido");
		}
		
	}
}

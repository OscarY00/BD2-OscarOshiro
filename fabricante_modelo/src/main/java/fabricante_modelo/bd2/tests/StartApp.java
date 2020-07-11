package fabricante_modelo.bd2.tests;

import java.util.Date;

import fabricante_modelo.bd2.DAO.FabricanteDAO;
import fabricante_modelo.bd2.DAO.ModeloDAO;
import fabricante_modelo.bd2.modal.Fabricante;
import fabricante_modelo.bd2.modal.Modelo;

public class StartApp {
	public static void main(String[] args) {
		startapp();
	}
	
	private static void fabricanteTest() {
		FabricanteDAO fDAO = new FabricanteDAO();
		Fabricante f = new Fabricante();
		
		//Adicionar
		f.setCod(01);
		f.setNome("Fiat");
		f.setCidade("Betim");
		f.setPais("Brasil");
		f.setTipo("Automovel");
		fDAO.insertNewFabricante(f);
//		
//		//Atualizar
//		f.setCod(02);
//		f.setNome("Ford");
//		f.setCidade("São Paulo");
//		f.setPais("Brasil");
//		f.setTipo("Veiculo");
//		fDAO.updateFabricante(f);
//		
//		//Listar
//		fDAO.getAllFabricantes();
//		
//		//Deletar
//		fDAO.deleteFabricante(2);
	}
	
	private static void startapp() {
		ModeloDAO mDAO = new ModeloDAO();
		Modelo m = new Modelo();
		Fabricante f = new Fabricante();
		
//		//Inserir
		m.setId(2);
		m.setName("Marea");
		m.setTipo("Sedan");
		m.setCor("Prata");
		m.setAno(new Date());
		mDAO.insertModelo(m);
//		
//		//Atualizar
//		m.setId(1);
//		m.setName("EcoSport");
//		m.setTipo("SUV");
//		m.setCor("vermelho");
//		m.setAno(new Date());
//		mDAO.updateModelo(m);
//		
//		//Listar
//		mDAO.getAllModels();
//		
//		//Deletar
//		mDAO.deleteModelo(1);
//		
	}
}

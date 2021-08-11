package Models;

import Infra.ResvistaDAO;

public class Revista extends Material {
	private String Titulo;
	private String Org;
	private String Vol;
	private String Nro;
	private String Ano;
	
	public Revista(String TituloRevista, String OrgRevista, String VolRevista, String NroRevista, String AnoRevista) throws Exception {
		if(TituloRevista.isEmpty() || OrgRevista.isEmpty() || VolRevista.isEmpty()|| NroRevista.isEmpty()|| AnoRevista.isEmpty())
			throw new Exception("Erro");
		else {
			this.Titulo = TituloRevista;
			this.Org = OrgRevista;
			this.Vol = VolRevista;
			this.Nro = NroRevista;
			this.Ano = AnoRevista;}
	}
	
	public String GetTitulo() {
		return (Titulo);	
		
	}

	public String GetOrg() {
		return (Org);	
		
	}

	public String GetAno() {
		return (Ano);	
		
	}

	public String GetVol() {
		// TODO Auto-generated method stub
		return (Vol);
	}

	public String GetNro() {
		// TODO Auto-generated method stub
		return (Nro);
	}
	
	@Override
	String GetListagem() {
		return ("Revista: "+GetTitulo()+" "+GetOrg()+" "+GetVol()+" "+GetNro()+" "+GetAno()+"\n");
	}

	@Override
	public void Insert() throws Exception {
		ResvistaDAO.InsertDados(new Revista(this.Titulo, this.Org, this.Vol, this.Nro, this.Ano));
		
	}


}

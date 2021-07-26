package POO;


public class Revista extends Material {
	String Titulo;
	String Org;
	String Vol;
	String Nro;
	String Ano;
	
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

	String GetVol() {
		// TODO Auto-generated method stub
		return (Vol);
	}

	String GetNro() {
		// TODO Auto-generated method stub
		return (Nro);
	}
	
	@Override
	String GetListagem() {
		return ("Revista: "+GetTitulo()+" "+GetOrg()+" "+GetVol()+" "+GetNro()+" "+GetAno()+"\n");
	}

}

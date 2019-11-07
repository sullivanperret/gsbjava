package modele;

public class Unite {
	protected String codeUnite;
	protected String ville;
	
	
	public Unite(String codeUnite, String ville) {
		this.codeUnite = codeUnite;
		this.ville = ville;
	}


	public String getCodeUnite() {
		return codeUnite;
	}


	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}

}
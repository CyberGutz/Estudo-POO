
public class Aluno {

	public int matricula;
	public String nome;
	public float notaP1;
	public float notaP2;
	public float notaT;
	public float media;
	public float nFinal;
	
	float calculaMedia() {
		media = (notaP1*2.5f)+(notaP2*2.5f)+(notaT*2);
		return media;
	}
	
	float notaFinal() {
		if(media>60) {
			nFinal = 100-media;
			return nFinal;
		}
		else
			return 0;
	}
}

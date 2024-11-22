public class Prove
{
	public static void main(String[] args)
	{
		ListaNuovaGenerica<Integer> listaInteri = new ListaNuovaGenerica<>();

		listaInteri.aggiungi(10);
		listaInteri.aggiungi(15);
		listaInteri.aggiungi(13);

		int somma = 0;

		for(int i = 0;i<listaInteri.getNumeroElementi();i++)
			somma += (int)listaInteri.prendi(i);

		System.out.println(somma);

		ListaNuovaGenerica<String> listaString = new ListaNuovaGenerica<>();

		listaString.aggiungi("ciao");
		listaString.aggiungi("pluto");
		Impostore i = new Impostore();
		i.anniCondanna = 120;
		i.cattiveIntenzioni = "Usare Zoom per l'eternità";
		//listaString.aggiungi(i);

		String concatenazione = "";

		for(Object o:listaString.getContenuto())
		{
			concatenazione += o;
		}

		System.out.println(concatenazione);
	}
}

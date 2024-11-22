public class ListaNuovaString
{
	private String[] contenuto;
	private int dimensione;
	private int lastPos = 0;



	public ListaNuovaString()
	{
		dimensione = 10;
		contenuto =  new String[dimensione];
	}
	//prendi

	public String prendi(int pos)
	{
		return contenuto[pos];
	}

	//aggiungi
	public void aggiungi(String o)
	{
		if(lastPos == dimensione)
		{
			//se sto sforando il vettore
			dimensione*=2;
			String[] newContenuto = new String[dimensione];
			for(int i = 0; i < lastPos; i++)
			{
				newContenuto[i] = contenuto[i];
			}
			contenuto = newContenuto;
		}

		contenuto[lastPos] = o;
		lastPos++;
	}

	public int getNumeroElementi()
	{
		return lastPos;
	}

	public String[] getContenuto()
	{
		String[] res = new String[lastPos];
		for(int i = 0; i < lastPos; i++)
		{
			res[i] = contenuto[i];
		}

		return res;
	}
}

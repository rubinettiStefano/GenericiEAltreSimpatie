public class ListNuova
{

	private Object[] contenuto;
	private int dimensione;
	private int lastPos = 0;



	public ListNuova()
	{
		dimensione = 10;
		contenuto =  new Object[dimensione];
	}
	//prendi

	public Object prendi(int pos)
	{
		return contenuto[pos];
	}

	//aggiungi
	public void aggiungi(Object o)
	{
		if(lastPos == dimensione)
		{
			//se sto sforando il vettore
			dimensione*=2;
			Object[] newContenuto = new Object[dimensione];
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

	public Object[] getContenuto()
	{
		Object[] res = new Object[lastPos];
		for(int i = 0; i < lastPos; i++)
		{
			res[i] = contenuto[i];
		}

		return res;
	}
}

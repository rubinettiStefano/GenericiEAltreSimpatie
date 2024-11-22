import java.util.ArrayList;
import java.util.List;

public class ListaNuovaGenerica<TipoGenerico>
{
	private List<TipoGenerico> contenuto;
	private int dimensione;
	private int lastPos = 0;



	public ListaNuovaGenerica()
	{
		dimensione = 10;
		contenuto = new ArrayList<>();
	}
	//prendi

	public TipoGenerico prendi(int pos)
	{
		return contenuto.get(pos);
	}

	//aggiungi
	public void aggiungi(TipoGenerico o)
	{
		if(lastPos == dimensione)
		{
			//se sto sforando il vettore
			dimensione*=2;
			List<TipoGenerico> newContenuto = new ArrayList<>();
			for(int i = 0; i < lastPos; i++)
			{
				newContenuto.add(i,contenuto.get(i)) ;
			}
			contenuto = newContenuto;
		}

		contenuto.add(lastPos,o);
		lastPos++;
	}

	public int getNumeroElementi()
	{
		return lastPos;
	}

	public List<TipoGenerico> getContenuto()
	{
		return new ArrayList<>(contenuto);
	}
}

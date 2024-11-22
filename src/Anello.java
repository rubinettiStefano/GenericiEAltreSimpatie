import java.util.ArrayList;
import java.util.List;

public class Anello<X>
{
	private List<X> content = new ArrayList<>();
	private int posScorrimento = 0;

	public X get(int pos)
	{
		return content.get(pos);
	}

	public void add(X x)
	{
		 content.add(x);
	}

	public X next()
	{
		X res = content.get(posScorrimento);
		posScorrimento++;
		if(posScorrimento == content.size())
			posScorrimento = 0;
		return res;
	}

	public X previous()
	{
		X res = content.get(posScorrimento);
		posScorrimento--;
		if(posScorrimento == -1)
			posScorrimento = content.size()-1;
		return res;
	}

	public void setPosition(int pos)
	{
		posScorrimento = pos;
	}
}

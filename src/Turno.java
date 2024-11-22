import java.util.StringJoiner;

public class Turno
{
	public String nome;

	public Turno(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return new StringJoiner(", ", Turno.class.getSimpleName() + "[", "]")
				.add("nome='" + nome + "'")
				.toString();
	}
}

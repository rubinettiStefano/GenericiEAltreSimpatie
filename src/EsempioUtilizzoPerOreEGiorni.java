public class EsempioUtilizzoPerOreEGiorni
{
	public static void main(String[] args)
	{
		Anello<String> settimana  = new Anello<>();
		settimana.add("Lun");
		settimana.add("Mar");
		settimana.add("Mer");
		settimana.add("Gio");
		settimana.add("Ven");
		settimana.add("Sab");
		settimana.add("Dom");


		settimana.setPosition(4);
//		for(int i=0;i<=19;i++)
//		{
//			System.out.println(settimana.previous());
//		}


		Anello<Turno> worksheet  = new Anello<>();
		Turno s = new Turno("Stefano");
		Turno t = new Turno("Tea");
		Turno m = new Turno("Marco");
		Turno e = new Turno("Enrico");

		worksheet.add(s);
		worksheet.add(t);
		worksheet.add(m);
		worksheet.add(e);
		worksheet.setPosition(1);

		Turno restituo = worksheet.next();

		for(int i=0;i<=30;i++)
		{
			System.out.println(settimana.next()+" "+ worksheet.next());
		}
	}
}

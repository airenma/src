
public enum Fruit {
	LEMON,
	ORANGE,
	MANDARIN,
	APPLE;
	
	public static Fruit getFruit(String line)
	{
		try {
			Fruit fruit = Fruit.valueOf(line);
			return fruit;
		}
			catch(Exception e){
				return null;
			}
	}
}

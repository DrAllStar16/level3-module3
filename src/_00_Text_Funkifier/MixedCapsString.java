package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String d = new String();
		Character t;
		Character z;
		for (int i = 0; i < 1; i++) {
			z = s.charAt(i);
			z.toUpperCase(i);
			d = d +z;
		}
		
		for (int i = 1; i < s.length(); i++) {
			z = s.charAt(i);
			z.toLowerCase(i);
			d = d +z;
		}
		
		return d;
	}

}

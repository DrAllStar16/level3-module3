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
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				t = s.charAt(i);
				z = t.toLowerCase(t);
				d = d + z;
			}
			
			else if (i % 2 != 0) {
				t = s.charAt(i);
				z = t.toUpperCase(t);
				d = d + z;
			}
		}
		
		return d;
	}

}

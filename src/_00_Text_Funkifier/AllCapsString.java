package _00_Text_Funkifier;

public class AllCapsString extends SpecialString{

	public AllCapsString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s) {
		String d = new String();
		Character t;
		Character z;
	for (int i = 0; i < s.length(); i++) {
		t = s.charAt(i);
		z = t.toUpperCase(t);
		d = d + z;
	}
			
	return d;

	}
	
}

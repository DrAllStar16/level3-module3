package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String d = new String();
		Character t;
		
		
		int e = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			t = s.charAt(i);
			d = d + t;
		}
		return d;
	}

}

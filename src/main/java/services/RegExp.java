package services;

public class RegExp implements RegExpInterface {
	
	@Override
	public boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }  
}

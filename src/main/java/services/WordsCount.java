package services;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class WordsCount implements WordsCountInterface {
	
	@Override
	public HashMap<String,Integer> count(String word1){
		
		
		HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
		RegExp reg=new RegExp();
		String[] word2 = word1.split(" ");
		
	    for (int i=0; i < word2.length; i++)
	    {
	    if(reg.isAlpha(word2[i])) {
	      if (Hmap.containsKey(word2[i])) 
	      {
	         int count = Hmap.get(word2[i]);
	          Hmap.put(word2[i], count+1);
	      }
	      else 
	      {
	        Hmap.put(word2[i], 1);
	      }
	    }
	    else {
			continue;
		}
	   
        }
	  return Hmap;
		
      }
}
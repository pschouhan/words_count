package controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.Translator;
import services.WordsCount;

@RestController
public class WordCountRestController {

	WordsCount wordscount =new WordsCount();

	@PostMapping("/ApiCountWord")
		public HashMap<String,Integer> postMap(@RequestParam String word) throws Exception{
			
			Translator.translate(word);
			String word1=Translator.tranword;
			HashMap<String,Integer> map=wordscount.count(word);
			
			return map;
		}
}

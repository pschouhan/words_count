package com.wordsCount;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import services.Translator;

public class TranslateTest extends AbstractTest {
  
   @Test
   public void testTranslator() throws Exception {
      Translator.translate("mi nombre es");
      String word=Translator.tranword;
      Assertions.assertEquals("my name is", word);
   }

   @Test
   public void testTranslatorAlphaNumeric() throws Exception {
      Translator.translate("mi nombre es123");
      String word=Translator.tranword;
      Assertions.assertEquals("my name is 123", word);
   }
}

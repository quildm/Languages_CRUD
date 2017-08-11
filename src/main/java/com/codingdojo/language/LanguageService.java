package com.codingdojo.language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.language.models.Language;

@Service
public class LanguageService {
	
	

	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "Java SE 8 Update 144"),
            new Language("Python", "Guido van Rossum", "2.7"),
            new Language("Javascript", "Brendan Eich", "ES6")
			));
	
	public List<Language> allLanguages() {
		return languages;
	}

	public Language findLanguageByIndex(int index) {
		if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
	}
	
	 public void addLanguage(Language language) {
	        languages.add(language);
	    }

	public void updateLanguage(int id, Language language) {
		 if (id < languages.size()){
			 languages.set(id, language);
	        }
		}

	public void destroyLanguage(int id) {
        if (id < languages.size()){
            languages.remove(id);
        }
    }
}

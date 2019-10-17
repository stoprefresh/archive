package com.skilldistillery.text.services;

import org.springframework.stereotype.Service;

@Service
public class UnderscoreTextTranslationService implements TextTranslationService {

	@Override
	public String translateText(String input) {
		return input.replaceAll("\\s", "_");
	}
}

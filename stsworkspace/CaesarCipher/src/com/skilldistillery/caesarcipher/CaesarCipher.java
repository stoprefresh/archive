package com.skilldistillery.caesarcipher;

public class CaesarCipher {

	public String encrypt(String text, int shift) {

		String result = "";


		if (text == null) {
			return null;
		}
		if (text.equals("")) {
			result = "";
		}
		if (shift > 26) {
			shift %= 26;
		}
		if (!text.equals("")) {
			char[] textArray = text.toCharArray();
			for (int i = 0; i < textArray.length; i++) {
				result += encryptChar(textArray[i], shift);
			}
			return result;
		}

		return result;
	}

	public String decrypt(String text, int shift) {

		String result = "";

		if (text == null) {
			return null;
		}
		if (text.equals("")) {
			result = "";
		}
		if (shift > 26) {
			shift %= 26;
		}
		if (!text.equals("")) {
			char[] textArray = text.toCharArray();
			for (int i = 0; i < textArray.length; i++) {
				result += decryptChar(textArray[i], shift);

			}
			return result;
		}

		return result;
	}

	private char encryptChar(char toEncrypt, int shift) {

		char encrypted = toEncrypt;

		if (toEncrypt >= 'A' && toEncrypt <= 'Z') {
			encrypted = (char) (toEncrypt + shift);
			if (encrypted > 'Z') {
				encrypted -= 26;
			}
		}
		if (toEncrypt >= 'a' && toEncrypt <= 'z') {
			encrypted = (char) (toEncrypt + shift);
			if (encrypted > 'z') {
				encrypted -= 26;
			}
		}
		
		return encrypted;

	}

	private char decryptChar(char toDecrypt, int shift) {

		char decrypted = toDecrypt;

		if (toDecrypt >= 'A' && toDecrypt <= 'Z') {
			decrypted = (char) (toDecrypt - shift);
			if (decrypted < 'A') {
				decrypted += 26;
			}
		}
		if (toDecrypt >= 'a' && toDecrypt <= 'z') {
			decrypted = (char) (toDecrypt - shift);
			if (decrypted < 'a') {
				decrypted += 26;
			}
		}
		

		return decrypted;

	}

}

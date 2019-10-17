package com.skilldistillery.sorting.labs;

import java.io.*;
import java.util.*;

public class ShowHits {

		
		
		public static void main(String[] args) {
			
			ShowHits hits = new ShowHits();
			
			hits.ipFileReader();
		}
		
		public void ipFileReader() {
			Set<String> accessSet = new TreeSet<>();
			List<String> lists = new ArrayList<>();			
			
			String line = null;
			
			try(BufferedReader br = new BufferedReader(new FileReader("access_log"))) {
				
				while((line = br.readLine()) != null) {
					lists.add(line);
					System.out.println(line);
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
			
//			for(int i = 0; i < lists.size(); i++) {
			
				
				 
			}
			
			
			
		}


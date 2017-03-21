package com.nivedita.springrest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SearchDevops {

	public static String scanPage(String url){
			String positionStatus=null;
			List<String> joblist= new ArrayList<String>();
	        Document doc;
			try {
				doc = Jsoup.connect(url).get();
				   Elements links = doc.select("a[href]");
			        for (Element link : links) {
			        	joblist.add(link.text());
			        
			        }
			    	if(joblist.toString().contains("DevOps")){
		        		positionStatus="DevOps Position Available";
		        	} else {
		        		positionStatus="Sorry! No DevOps Roles Found";
		        	}
			        
			} catch (IOException e) {
				e.printStackTrace();
			}
			return positionStatus; 

	    }

	
	

}

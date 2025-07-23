package com.muratyildirim.app.yazicilar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

@Repository
public class YazicilarRepository {
	
	List<Yazicilar> getAllYazicilar() {
		List<Yazicilar> ls = new ArrayList<>();
		PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
		for (PrintService ps: printServices) {
			Yazicilar y = new Yazicilar();
			y.setAdi(ps.getName());
			y.setId(ps.getName());
			ls.add(y);
		}
		return ls;
	}

}

package com.example.jsfdemo.service;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Artist;
import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class ArtistManager {
	private ArrayList<Artist> db = new ArrayList<Artist>();
	
	public void addArtist(Artist artist) {
		//Artist newystaArtist = new Artist();
		Artist artist2 = new Artist();
		
		artist2.setName(artist.getName());
		artist2.setYof(artist.getYof());
		artist2.setNameofcd(artist.getNameofcd());
		artist2.setYop(artist.getYop());
		artist2.setNumber(artist.getNumber());
		artist2.setPrice(artist.getPrice());
		//newArtist.setName(artist.getName());
		//newArtist.setYof(artist.getYof());
		//newArtist.setPrice(artist.getPrice());
				//db.add(newArtist);
		db.add(artist2);
	}
	
	public void deleteArtist(Artist artist) {
	
		 int x = 0;
         for (Artist e : db) {
                 if (e.getNumber().equals(artist.getNumber())) {
                         db.remove(x);
                         break;
                 }
                 x++;
         }
 }
			

		
	public ArrayList<Artist> getAllArtists() {
	return db;
		
	}
	

	

public ArrayList<Artist> searchArtist(Artist artist) {
    ArrayList<Artist> zmienna = new ArrayList<Artist>();
    for (Artist e : db) {
            if (e.getName().equals(artist.getName())) {
                    zmienna.add(e);
            }
    }

    return zmienna;
}
}

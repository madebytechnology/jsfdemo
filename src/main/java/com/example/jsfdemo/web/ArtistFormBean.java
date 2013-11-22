package com.example.jsfdemo.web;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Artist;
import com.example.jsfdemo.service.ArtistManager;

@SessionScoped
@Named("artistBean")
public class ArtistFormBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Artist artist = new Artist();
	
	private ArrayList<Artist> searchArtist = new ArrayList<Artist>();
	
	private ListDataModel<Artist> artists = new ListDataModel<Artist>();
	
	ArrayList<Artist> db = new ArrayList<Artist>();
	
	@Inject
	private ArtistManager am;
	

	public Artist getArtist() {
		
		return artist;
	}
	
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	


	public String addArtist() {
		am.addArtist(artist);
		return "showArtists";
		
	}
	
	   public String deleteArtistA() {
           am.deleteArtist(artist);
           return "showArtists";
   }
	
	   
	   
	public ListDataModel<Artist> getAllArtists() {
		artists.setWrappedData(am.getAllArtists());
		return artists;
	}
	
	// Akcja - szukanie zegarka
    public String searchArtistA() {
            searchArtist = am.searchArtist(artist);
            return "resultFind";
    }
    
    public ArrayList<Artist> getsearchArtist() {
        return searchArtist;
}

	
	 /*public void number(FacesContext context, UIComponent component, Object value) {

         String number = (String) value;

         for (Artist artist : am.getAllArtists()) {
                 if (artist.getNumber().equalsIgnoreCase(number)) {
                         FacesMessage message = new FacesMessage("Płyta o tym numerze, istnieje już w bazie");
                         message.setSeverity(FacesMessage.SEVERITY_ERROR);
                         throw new ValidatorException(message);
                 }
         }
 }*/
		
	   
	   public ArrayList<Artist> searchArtistA(Artist artist) {
         ArrayList<Artist> y = new ArrayList<Artist>();
         for (Artist e : db) {
                 if (e.getName().equals(artist.getName())) {
                         y.add(e);
                 }
         }
         
         return y;
         
	   }
	   
	   public void checkNumber(FacesContext context, UIComponent component, Object value) {

           String checkNumber = (String) value;

           for (Artist artist : am.getAllArtists()) {
                   if (artist.getNumber().equalsIgnoreCase(checkNumber)) {
                           FacesMessage message = new FacesMessage("Płyta o tym numerze, już istnieje w bazie danych.");
                           message.setSeverity(FacesMessage.SEVERITY_ERROR);
                           throw new ValidatorException(message);
                   }
           }
   }
	
}

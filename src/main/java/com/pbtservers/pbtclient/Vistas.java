package com.pbtservers.pbtclient;

public class Vistas implements VistasApi {
	 @Override
	 public void appendPanoramas(Map<Identifier, Panorama> set) {
	  // All your panorama magic goes here!
	  set.put(new Identifier("mod", "panorama_1"), Panorama.DEFAULT);
	 }
}
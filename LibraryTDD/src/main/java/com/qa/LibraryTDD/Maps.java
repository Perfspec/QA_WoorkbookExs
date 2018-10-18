package com.qa.LibraryTDD;

public class Maps extends Item {

	private String mapScale;
	
	public Maps(String mapName, String scale) {
		super(mapName);
		setMapScale(scale);
	}
	
	public String getMapScale() {
		return mapScale;
	}
	
	public void setMapScale(String scale) {
		this.mapScale = scale;
	}

}

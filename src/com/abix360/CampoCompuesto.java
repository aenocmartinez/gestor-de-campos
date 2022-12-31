package com.abix360;

import java.util.ArrayList;

public class CampoCompuesto extends Campo {
	
	private ArrayList<Campo> subcampos = new ArrayList<Campo>();
	
	
	public void agregarSubcampo(Campo campo) {
		this.subcampos.add(campo);
	}
	
	public ArrayList<Campo> subcampos() {
		return this.subcampos;
	}

	@Override
	public boolean create() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isComposite() {
		// TODO Auto-generated method stub
		return true;
	}

}

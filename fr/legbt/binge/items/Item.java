package fr.legbt.binge.items;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import fr.legbt.binge.Binge;
import fr.legbt.binge.data.*;


public abstract class Item implements Serializable {
	protected int x;
	protected int y;
	private transient int uniqueid;

	protected Item(int x, int y){
		this.x = x;
		this.y = y;
	}


	protected Item(Binge game, int x, int y){
		this.x = x;
		this.y = y;
		this.uniqueid = 0;
		this.setGame(game);
		game.getLvl().addItem(this);	
	}

	public void setID(int i){ this.uniqueid = i;}
	public int getID(){return uniqueid;}
	public int getX(){return this.x;}
	public int getY(){return this.y;}


	public void printNFO(){
		System.out.println("Item n°"+ uniqueid + " is a" + this.getClass().getName());
	}

	protected abstract Boolean collideWith(MovableItem mitem);
	protected abstract void traceMe(Binge game);
	protected abstract void action();
	public abstract void onLoaded(Binge game);
	public abstract void setGame(Binge game);

}

package fr.legbt.binge.items;

import java.awt.Graphics;

import fr.legbt.binge.*;


/**
 * Plan describe a right vertical half plan item for simple bounding collisions.
 */
public class PlanXMin extends Plan{
	private static final long serialVersionUID = 1l;
	protected int x;

	/**
	 * Xmax Plan construction 
	 */
	public PlanXMin(Binge game, int x){
		super(game);
		this.x = x;
	}

	protected Boolean collideWith(MovableItem mitem){
		if (mitem instanceof Rect){
			if (mitem.xnext <= x){ return true;} else {
				return false;}
		}
		if (mitem instanceof Ball){
			if (mitem.xnext <= x){ return true;} else {
				return false;}
		}	
		return false;
	}
	public void traceMe(Graphics g){
		g.fillRect(0,0,x,(int)g.getClipBounds().getHeight());
	}

}

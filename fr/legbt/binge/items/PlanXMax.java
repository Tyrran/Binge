package fr.legbt.binge.items;

import java.awt.Graphics;

import fr.legbt.binge.*;


/**
 * PlanXMax describe a right vertical half plan item for simple bounding collisions.
 */
public class PlanXMax extends Plan{
	private static final long serialVersionUID = 1l; //serialisation warnings
	protected int x;

	/**
	 * Xmax Plan construction 
	 */
	public PlanXMax(Binge game, int x){
		super(game);
		this.x = x;
	}

	protected Boolean collideWith(MovableItem mitem){
		if (mitem instanceof Rect){
			if (mitem.xnext+((Rect)mitem).width >= x){ return true;} else {
				return false;}
		}
		if (mitem instanceof Ball){
			if (mitem.xnext+((Ball)mitem).diameter >= x){ return true;} else {
				return false;}
		}	
		return false;
	}

	public void traceMe(Graphics g){
		g.fillRect(x,0,(int)g.getClipBounds().getWidth()-x,(int)g.getClipBounds().getHeight());
	}	
}

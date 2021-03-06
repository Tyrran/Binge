package fr.legbt.binge.items;

import java.awt.Graphics;
import fr.legbt.binge.*;


/**
 * Plan describe a right vertical half plan item for simple bounding collisions.
 */
public class PlanYMax extends Plan{
	private static final long serialVersionUID = 1l;

	protected int y;

	/**
	 * Xmax Plan construction 
	 */
	public PlanYMax(Binge game, int y){
		super(game);
		this.y = y;
	}

	protected Boolean collideWith(MovableItem mitem){
		if (mitem instanceof Rect){
			if (mitem.ynext + ((Rect)mitem).height >= y){ return true;} else {
				return false;}
		}
		if (mitem instanceof Ball){
			if (mitem.ynext+((Ball)mitem).diameter >= y){ return true;} else {
				return false;}
		}	
		return false;
	}

	public void traceMe(Graphics g){
		g.fillRect(0,y,(int)g.getClipBounds().getWidth(),(int)g.getClipBounds().getHeight()-y);
	}
}

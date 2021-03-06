package examples.bounce;

import java.awt.*;
import fr.legbt.binge.ui.StaticInfo;
import fr.legbt.binge.Binge;

public class Counter extends StaticInfo{
	private int count;
	private int xpos;
	private int ypos;

	public Counter(Binge game,int count, int x, int y){
		super(game);
		this.count = count;
		this.xpos = x;
		this.ypos = y;
		this.setRenderZone(new Rectangle(x,y,100,20));
	}

	public void addCount(){
		this.count += 1;
	}

	public void traceMe(Graphics g){
		Graphics2D g2d = (Graphics2D) g;	
		Font f = new Font("Casual",Font.PLAIN, 40);
		g2d.setFont(f);
		g2d.setColor(Color.RED);	
		g2d.drawString(Integer.toString(count),this.xpos,this.ypos);
	}
}

package p1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class p1test {

	public static void main(String[] args){
		
		
		int[] ax={1,2,3},ay={1,1,1},bx={5,6,7,8},by={5,6,7,8},cx={10,10,10,8},cy={1,2,3,1};
		final long startTime = System.currentTimeMillis();
		System.out.println("A-B");
		double minab=0,minbc=0,minca=0;
		double x2x1=bx[0]-ax[0];
		double y2y1=by[0]-ay[0];
		double d=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
		int pa=0,pb=0;
		for(int i=0;i<ax.length;i++){
		
		for (int j=0;j<bx.length;j++){
		x2x1=bx[j]-ax[i];
		y2y1=by[j]-ay[i];
		minab=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
		if(minab<d){
			d=minab;
			pa=i;
			pb=j;
			
		}
		else{minab=d;
		}
		}
		}
		System.out.println("Points with min distance in A-B:"+minab+"("+ax[pa]+","+ay[pa]+")("+bx[pb]+","+by[pb]+")");
		
		
		
		
		
		
		
		
		System.out.println("B-C");
		
		x2x1=cx[0]-bx[0];
		 y2y1=cy[0]-by[0];
		 d=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
		int pc=0;
		for(int i=0;i<bx.length;i++){
		
		for (int j=0;j<cx.length;j++){
		x2x1=cx[j]-bx[i];
		y2y1=cy[j]-by[i];
		minbc=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
		if(minab<d){
			d=minbc;
			pb=i;
			pc=j;
			
		}
		else{minbc=d;
		}
		}
		}
		System.out.println("Points with min distance in B-C:"+minbc+"("+bx[pb]+","+by[pb]+")("+cx[pc]+","+cy[pc]+")");
		
		
		
		System.out.println("C-A");
		
		 x2x1=ax[0]-cx[0];
		 y2y1=ay[0]-cy[0];
		d=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
	
		for(int i=0;i<cx.length;i++){
		
		for (int j=0;j<ax.length;j++){
		x2x1=ax[j]-cx[i];
		y2y1=ay[j]-cy[i];
		minca=Math.sqrt((x2x1*x2x1)+(y2y1*y2y1));
		if(minca<d){
			d=minca;
			pc=i;
			pa=j;
			
		}
		else{minca=d;
		}
		}
		}
		System.out.println("Points with min distance in C-A:"+minca+"("+cx[pc]+","+cy[pc]+")("+ax[pa]+","+ay[pa]+")");
		Map<String,Double> best=new HashMap<String,Double>();
		best.put("A-B", minab);
		best.put("B-C", minbc);
		best.put("C-A", minca);
		String key="A-B";
		double max=best.get("A-B");
		
		for(Map.Entry<String,Double> entry: best.entrySet()){
			 
			if(entry.getValue()>max){
				key=entry.getKey();
				max=entry.getValue();
			}
			
		}
		best.remove(key);
		for(Map.Entry<String,Double> entry: best.entrySet()){
		System.out.println(entry.getKey());
		}
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );
	}
	
	
	
}

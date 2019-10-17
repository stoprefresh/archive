package com.skilldistillery.advancedarrays.drills;

public class ReturningArrays {
	public static void main(String[] args) {

		allSing(createBand());

	}

	public static PopStar[] createBand() {
		PopStar[] sync = new PopStar[5];

		PopStar jt = new PopStar();
		jt.name = "Justin";
		jt.lyrics = "Something!";
		PopStar l = new PopStar();
		l.name = "Lance";
		l.lyrics = "Something! Something!";
		PopStar jc = new PopStar();
		jc.name = "JC";
		jc.lyrics = "Something! Something! Something!";
		PopStar jf = new PopStar();
		jf.name = "Joey";
		jf.lyrics = "Something! Something! Something! Something!";
		PopStar c = new PopStar();
		c.name = "Chris";
		c.lyrics = "Something! Something! Something! Something! Something! Something! Something! Something!";
		sync[0] = jt;
		sync[1] = l;
		sync[2] = jc;
		sync[3] = jf;
		sync[4] = c;

		return sync;
	}

	public static void allSing(PopStar[] stars) {

		for (int i = 0; i < stars.length; i++) {
			PopStar popStar = stars[i];
			popStar.sing();
		}
	}
}

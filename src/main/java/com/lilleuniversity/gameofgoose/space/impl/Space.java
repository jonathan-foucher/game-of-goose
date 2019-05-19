package com.lilleuniversity.gameofgoose.space.impl;

import com.lilleuniversity.gameofgoose.space.ISpace;
import com.lilleuniversity.gameofgoose.player.impl.Player;

/* Ce type de case ne r�alise aucune action sur le joueur */
public class Space implements ISpace {
	/*
		x : l'abscisse de la case sur le plateau par rapport � la case 0
		y : l'ordonn� de la case sur le plateau par rapport � la case 0
	*/
	private int x, y;
	
	/* Constructeur de la classe Case */
	public Space(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* Methode qui réalise l'action de la case lorsque le joueur arrive sur la case */
	public void action(Player player) {}
	
	/* Methode qui renvoie l'abscisse du joueur */
	public int getX() {
		return this.x;
	}
	
	/* Methode qui renvoie l'ordonnée du joueur */
	public int getY() {
		return this.y;
	}
}
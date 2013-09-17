package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class Tata extends Bidule {

  private int nbDeplacements;

  public Tata() {
    super("Warrio");
    setBackground(Color.MAGENTA);
    nbDeplacements = 0;
    this.setSize(200, 200);
  }

  @Override
  public void doMove() {
    nbDeplacements++;
    super.doMove();
    // tous les 200 deplacements et si descente
    if (isGoDown() && nbDeplacements % 200 == 0) 
      if (isGoLeft())
        goOnRight();
      else
        goOnLeft();
  }

}
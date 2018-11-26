/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amir.pokemon.object;

import com.amir.pokemon.framework.GameObject;
import com.amir.pokemon.framework.ObjectId;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

/**
 *
 * @author amir
 */
public class SpeedFlag extends GameObject {
    private int dim;
    public SpeedFlag(float x, float y, ObjectId id,int dim) {
        super(x,y,id);
        this.dim = dim;
    }

    public void tick(LinkedList<GameObject> object) {
     }

    public void render(Graphics g) {
        g.setColor(new Color(100,0,100));
        g.fillRect((int)x, (int)y, dim, dim);
    }

    
    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, (int) dim, (int) dim);
    }


    public int getPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

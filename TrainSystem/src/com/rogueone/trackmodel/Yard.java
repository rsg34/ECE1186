/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rogueone.trackmodel;

import com.rogueone.global.Global;
import com.rogueone.global.Global.PieceType;

/**
 *
 * @author Dan
 */
public class Yard implements TrackPiece {

    public TrackPiece getNext(TrackPiece previous) {
        return null;
    }

    public Global.PieceType getType() {
        return PieceType.YARD;
    }

    public int getID() {
        return 0;
    }
    
}
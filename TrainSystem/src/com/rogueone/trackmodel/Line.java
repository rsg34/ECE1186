/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rogueone.trackmodel;

import com.rogueone.global.Global;
import java.util.ArrayList;

/**
 *
 * @author Dan
 */
public class Line {
    
    Global.Line lineID;
    ArrayList<Section> sections = new ArrayList<Section>();
    
    public Line (Global.Line newLine) {
        lineID = newLine;
    }
    
    public Global.Line getLineID() {
        return lineID;
    }
    
    public ArrayList<Section> getSections() {
        return sections;
    }
    
    public void addSection(Section s) {
        sections.add(s);
    }
    
    public Block getBlock(int block) {
        //System.out.println("SEARCHING FOR " + block);
        for (Section s : sections) {
            for(Block b : s.getBlocks()) {
                //System.out.println(s.getSectionID() + " " + b.getID());
                if(b.getID() == block) {
                    return b;
                }
            }
        }
        System.err.println("Block " + lineID + ":" + block + " not found in line " + lineID);
        return null;
    }
    
    public Block getBlock(Section section, int block) {
        for (Section s : sections) {
            if (s.equals(section)) {
                return s.getBlock(block);
            }
        }
        System.err.println("Block " + lineID + ":" + section + ":" + block + " not found in " + lineID);
        return null;
    }
    
    public String toString() {
        return lineID.toString();
    }
    
    public boolean equals(Line otherLine) {
        return this.lineID == otherLine.getLineID();
    }
}

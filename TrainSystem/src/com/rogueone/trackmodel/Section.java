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
public class Section {
    Global.Section section;
    Global.Line line;
    ArrayList<Block> blocks = new ArrayList<Block>();
    
    public Section (Global.Section newSection, Global.Line newLine) {
        section = newSection;
        line = newLine;
    }
    
    public Global.Section getSection() {
        return section;
    }
    
    public Global.Line getLine() {
        return line;
    }
    
    public ArrayList<Block> getBlocks() {
        return blocks;
    }
    
    public void addBlock(Block b) {
        blocks.add(b);
    }
    
    public Block getBlock(int block) {
        for (Block b : blocks) {
            if (b.getID() == block) {
                return b;
            }
        }
        return null;
    }
    
    public String toString() {
        return section.toString();
    }
    
    public String toStringDetail() {
        return section.toString() + " (" + line.toString() + ")";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author apere
 */
public class Point implements Serializable{
    private int row;
    private int column;
    
    public Point(){
}
    public void setRow(int row){
        this.row = row;
}
    public int getRow(){
        return row;
    }
    public void setColumn(int column){
        this.column = column;
    }
    public int getColumn(){
        return column;
    }
}
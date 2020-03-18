/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Álvaro Prieto Barón
 */

public class StringOperation {
    public enum Operator{
        SUM,
        SUB,
        MULT,
        DIV,
        NOP
    }
    
    public StringOperation(){
        lh = "";
        rh = "";
        op = Operator.NOP;
    }
    
    private boolean addToLH(char next){
        String newLH = lh + next;
        try{
            Float.parseFloat(newLH);
        }
        catch(java.lang.NumberFormatException e){
            return false;
        }
        lh = newLH;
        return true;
    }
    
    private boolean addToRH(char next){
        String newRH = rh + next;
        try{
            Float.parseFloat(newRH);
        }
        catch(java.lang.NumberFormatException e){
            return false;
        }
        rh = newRH;
        return true;
    }
    
    public boolean setOperation(Operator newOp){
        if(lh.equals("") || !rh.equals("")){
            return false;
        }
        op = newOp;
        return true;
    }
    
    public boolean addSymbol(char symbol){
        if(op.equals(Operator.NOP)){
            return addToLH(symbol);
        }
        return addToRH(symbol);
    }
    
    @Override
    public String toString(){
        String str = new String();
        if(lh.equals("")){
            str = str.concat("0");
        }
        else{
            str = str.concat(lh);
        }
        if(!op.equals(Operator.NOP)){
            String operator = "";
            switch(op){
                case SUM:
                    operator = "+";
                    break;
                case SUB:
                    operator = "-";
                    break;
                case MULT:
                    operator = "*";
                    break;
                case DIV:
                    operator = "/";
                    break;
            }
            str = str.concat(operator);
            if(rh.equals("")){
                str = str.concat("0");
            }
            else{
                str = str.concat(rh);
            }
        }
        return str;
    }
    public void reset(){
        lh = "";
        rh = "";
        op = Operator.NOP;
    }
    public void zero(){
        if(op.equals(Operator.NOP)){
            lh = "";
        }
        rh = "";
    }
    public String calculate(){
        float lhFloat, rhFloat;
        if(lh.equals("")){
            lh = "0";
        }
        if(rh.equals("")){
            rh = "0";
        }
        if(op.equals(Operator.NOP)){
            op = Operator.SUM;
        }
        lhFloat = Float.parseFloat(lh);
        rhFloat = Float.parseFloat(rh);
        float result = new Float(0);
        switch(op){
            case SUM:
                result = Operaciones.suma(lhFloat, rhFloat);
                break;
            case SUB:
                result = Operaciones.resta(lhFloat, rhFloat);
                break;
            case MULT:
                result = Operaciones.mult(lhFloat, rhFloat);
                break;
            case DIV:
                result = Operaciones.div(lhFloat, rhFloat);
                break;
        }
        return Float.toString(result);
    }
    
    private String lh, rh;
    private Operator op;
}

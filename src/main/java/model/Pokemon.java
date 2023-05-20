package model;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("pokemonList")
public class Pokemon {
    @ExcelCellName("ID")
    private int id;
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("NOMBREJAPONES")
    private String nombreJapones;
    @ExcelCellName("ATK")
    private int atk;
    @ExcelCellName("DEF")
    private int def;
    @ExcelCellName("SP")
    private int sp;
    @ExcelCellName("SPDEF")
    private int spDef;
    @ExcelCellName("CRIT")
    private int crit;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("ATRAPADO")
    private boolean atrapado;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSp() {
        return sp;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getCrit() {
        return crit;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getAtrapado() {
        return atrapado;
    }
}

package org.najot.model;

public class Maxsulot {
    private Integer id;
    private String nomi;
    private Double narxi;

    public Maxsulot() {
    }
    public Maxsulot(String nomi, Double narxi) {
        this.nomi = nomi;
        this.narxi = narxi;
    }

    public Maxsulot(Integer id, String nomi, Double narxi) {
        this.id = id;
        this.nomi = nomi;
        this.narxi = narxi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public Double getNarxi() {
        return narxi;
    }

    public void setNarxi(Double narxi) {
        this.narxi = narxi;
    }



}

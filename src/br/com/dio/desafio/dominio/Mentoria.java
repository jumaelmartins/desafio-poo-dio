package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private LocaDate data;

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public int getdata () {
        return data;
    }

    public void setdata (LocaDate data) {
        this.data = data;
    
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return titulo+" "+descricao+" "+data;
    }
}

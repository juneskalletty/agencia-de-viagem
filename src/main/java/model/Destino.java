package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Destino {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Integer id;
    private String nome;
    private String localizacao;
    private String descricao;
    private Double mediaAvaliacoes;
    private int quantidadeAvaliacoes;

    public Destino(String nome, String localizacao, String descricao) {
        this.id = count.incrementAndGet();
        this.nome = nome;
        this.localizacao = localizacao;
        this.descricao = descricao;
        this.mediaAvaliacoes = 0.0;
        this.quantidadeAvaliacoes = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }

    public void setMediaAvaliacoes(Double mediaAvaliacoes) {
        this.mediaAvaliacoes = mediaAvaliacoes;
    }

    public int getQuantidadeAvaliacoes() {
        return quantidadeAvaliacoes;
    }

    public void setQuantidadeAvaliacoes(int quantidadeAvaliacoes) {
        this.quantidadeAvaliacoes = quantidadeAvaliacoes;
    }
}

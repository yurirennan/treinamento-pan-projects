package com.example.demo.model;

public enum TipoCliente {
    PESSOAFISICA(1, "PessoaFísica"),
    PESSOAJURIDICA(2, "Pessoa Jurídica"),
    ;

    private int code;
    private String nome;

    TipoCliente(int code, String nome) {
        this.code = code;
        this.nome = nome;
    }

    public int getCode() {
        return code;
    }

    public String getNome() {
        return nome;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (cod.equals(tipoCliente.getCode())) {
                return tipoCliente;
            }
        }

        throw new IllegalArgumentException("Id Inválido: " + cod);
    }
}

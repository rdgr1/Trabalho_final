package classes;

import lombok.Data;

@Data
public class Endereco {
    private String cep;
    private String local;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;

}

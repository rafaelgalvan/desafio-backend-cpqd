package br.com.cpqd.backendchalenge.core.domain;

import java.math.BigDecimal;

public class InformeDiario {

    private static final int CNPJ_FUNDO = 0;
    private static final int CAPTC_DIA = 1;
    private static final int RESG_DIA = 2;

    private String cnpj;
    private BigDecimal captacaoDia;
    private BigDecimal resgateDia;


    public InformeDiario(final String csvLine) {

        final String[] line = csvLine.split(";");

        this.cnpj = line[CNPJ_FUNDO];
        this.captacaoDia = BigDecimal.valueOf(new Double(line[CAPTC_DIA]));
        this.resgateDia = BigDecimal.valueOf(new Double(line[RESG_DIA]));


    }

    public String getCnpj() {
        return cnpj;
    }

    public BigDecimal getCaptacaoDia() {
        return captacaoDia;
    }

    public BigDecimal getResgateDia() {
        return resgateDia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCaptacaoDia(BigDecimal captacaoDia) {
        this.captacaoDia = captacaoDia;
    }

    public void setResgateDia(BigDecimal resgateDia) {
        this.resgateDia = resgateDia;
    }

}

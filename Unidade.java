public class Unidade {
    private int cd_unidade;
    private String ds_unidade;

    /*  Método construtor para receber cod. da unidade e descrição da unidade. Realiza a inserção de seus
    * valores através dos respectivos métodos*/
    public Unidade(int cd_unidade, String ds_unidade) {
        this.setCd_unidade(cd_unidade);
        this.setDs_unidade(ds_unidade);
    }

    public Unidade() {
    }
    /* Método get para permitir o acesso ao atributo do código da unidade*/
    public int getCd_unidade() {
        return cd_unidade;
    }
    /* Método set para permitir a inserção ao atributo do código da unidade*/
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }
    /* Método get para permitir o acesso ao atributo descrição da unidade*/
    public String getDs_unidade() {
        return ds_unidade;
    }
    /* Método set para permitir a inserção ao atributo da descrição da unidade*/
    public void setDs_unidade(String ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}

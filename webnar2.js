class Clientes {
    constructor (pNome, pEndereco){
        this.Nome = pNome;
        this.Endereco = pEndereco;
    }
    get Nome (){
        return this.nome;
    }
    set Nome (pNome) {
        this.nome = pNome;
    }
    get Endereco (){
        return this.endereco;
    }
    set Endereco (pEndereco){
        this.endereco = pEndereco;
    }

    imprimir (){ 
        return "Nome: " + this.nome +
            "\nEndereço: " + this.endereco;
    }
    }

class PessoaFisica extends Clientes {
    constructor (pNome, pEndereco, pCPF, pDataDeNascimento){
        super (pNome,pEndereco);
        this.Cpf = pCPF;
        this.DataDeNascimento = pDataDeNascimento;
    }
get Cpf (){
    return this.cpf;
}
set Cpf (pCPF) {
    this.cpf = pCPF;
}
get DataDeNascimento (){
    return this.datadenascimento;
}
set DataDeNascimento(pDataDeNascimento) {
    this.datadenascimento= pDataDeNascimento;
}
    imprimir(){
        return super.imprimir() + "\nCPF: " + this.cpf + "\nData de Nascimento:" + this.datadenascimento;
        }
    }


class PessoaJuridica extends Clientes {
    constructor (pNome, pEndereco, pCNPJ, pRazaoSocial){
        super (pNome, pEndereco);
        this.Cnpj = pCNPJ;
        this.RazaoSocial = pRazaoSocial;
    }
get Cnpj (){
    return this.cnpj;
}
set Cnpj (pCNPJ) {
    this.cnpj = pCNPJ;
}
get RazaoSocial (){
    return this.razaosocial;
}
set RazaoSocial (pRazaoSocial) {
    this.razaosocial = pRazaoSocial;
}
    imprimir(){
        return super.imprimir() + "\nCNPJ: " + this.cnpj + "\nRazão Social:" + this.razaosocial;

    }
}

var objeto_PessoaFisica = new PessoaFisica ("Anderson", "Rua xx", 2222,5);
console.log(objeto_PessoaFisica.imprimir());
console.log("\n########################################################\n");
var objeto_PessoaJuridica = new PessoaJuridica ("Andersoon", "Rua xxx", 9999,1000);
console.log(objeto_PessoaJuridica.imprimir());
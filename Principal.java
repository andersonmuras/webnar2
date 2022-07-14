public class Principal {
    public static void main (String[] args) {
       // DAO_produtos obj_produtos = new DAO_produtos();

        // obj_produtos.consultar();
        //Produto novoProduto = new Produto(7, "Macarrao", 5,10.0,1);
       // obj_produtos.inserir(novoProduto);
       // Produto produtoAlterado = new Produto(7,"macarrao alterado",2.50,100.00,2);
        //obj_produtos.alterar(produtoAlterado);
       // obj_produtos.excluir(4);

        DAO_unidades obj_unidades = new DAO_unidades();

        //obj_unidades.consultar(); // realiza a consulta das unidades
        //Unidade novaUnidade = new Unidade (7, "quilo");
        //obj_unidades.inserir(novaUnidade);
        //Unidade unidadeAlterada = new Unidade(6,"grama");
        //obj_unidades.alterar(unidadeAlterada);
        obj_unidades.excluir(2);

    }
}

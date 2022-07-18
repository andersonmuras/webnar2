package com.example.appprojetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private Button btnListar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        btnListar = findViewById(R.id.buttonListar);
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroActivity.this,Listagem.class);
            startActivity(intent);
            }
        });
    }

    public void inserir(View view){
        EditText etNome = findViewById(R.id.editTextProduto);
        String nome = etNome.getText().toString();
        EditText etQuantidade = findViewById(R.id.editTextQuantidade);
        int quantidade = Integer.parseInt(etQuantidade.getText().toString());
        EditText etPreco = findViewById(R.id.editTextPreco);
        double preco = Double.parseDouble(etPreco.getText().toString());
        Produto produto = new Produto(nome, quantidade,preco);
        ProdutoDAO dao;
        dao = new ProdutoDAO(this);
        long id = dao.inserir(produto);
        Toast.makeText(this, "Produto inserido com ID" + id, Toast.LENGTH_SHORT).show();
    }
}
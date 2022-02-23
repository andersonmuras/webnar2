let listaDeEstudantes = ["Helena", "Chico", "Mário"];
let quantidadeDeEstudantes = listaDeEstudantes.length;

let idade =19;
if (idade >=18)
{ if (quantidadeDeEstudantes < 100)
{
	listaDeEstudantes.push("José","Ralf");
	console.log(listaDeEstudantes);
	console.log("Cadastro feito com sucesso");
}
else {
	console.log("Excedido limite de cadastro");
}
}

else {
	console.log ("Cadastro não permitido, idade menor que 18");
}


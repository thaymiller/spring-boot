function exibeNome() {
	var elNome = document.getElementById('txtNome');
	var elDisplay = document.getElementById('display');
	elDisplay.innerText = elNome.value;
}

function novoContato() {
	var elListacontatos = document.getElementById('listaContatos');
	var inputContato = document.createElement("input");
	var labelContato = document.createElement("label");
	var br = document.createElement("br");
	var btnExcluir = document.createElement("input");
	var divLinha = document.createElement("div");

	btnExcluir.setAttribute("type", "button")
	btnExcluir.setAttribute("value", "-");
	btnExcluir.onclick = function excluir() {
		elListacontatos.removeChild(divLinha);
	}

	labelContato.innerText = "Contato :";
	divLinha.appendChild(labelContato);
	divLinha.appendChild(inputContato);
	divLinha.appendChild(btnExcluir);
	divLinha.appendChild(br);

	elListacontatos.appendChild(divLinha);
}
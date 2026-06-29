fetch("http://localhost:8081/animais").then((response) => response.json()).then((animais) => {
    const listaAnimais = document.getElementById("containerAnimais");
    animais.forEach((animal) => {
        const item = document.createElement("li")
        item.innerHTML = 
        `<h3>${animal.nome}</h3>
        <p>Idade: ${animal.idade}</p>
        <p>Raça: ${animal.especie}</p>
        <p>Tipo: ${animal.descricao}</p>
        `
        listaAnimais.appendChild(item);
    })
    
})
const form = document.getElementById("formAnimal")
form.addEventListener("submit", (event) => {
    event.preventDefault();
    let nomeValor = document.getElementById("nomeAnimal").value
    let idadeValor = parseInt(document.getElementById("idadeAnimal").value)
    let especieValor = document.getElementById("especieAnimal").value
    let descricaoValor = document.getElementById("descricaoAnimal").value
    const animalObject = {
        nome: nomeValor,
        idade: idadeValor,
        especie: especieValor,
        descricao: descricaoValor
    }
    fetch("http://localhost:8081/animais", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(animalObject)
    }).then(() => {
        alert("Animal cadastrado com sucesso!"); 
        window.location.reload(); 
    })
})



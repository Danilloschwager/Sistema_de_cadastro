# 💇‍♀️ SISTEMA DE CADASTRO (SPRING BOOT)
# ⚙️ USUARIO x PAGAMENTO — RELACIONAMENTO NO BACKEND

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/SpringBoot-Framework-green?style=for-the-badge&logo=spring)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge)

====================================================================

📌 SOBRE O PROJETO

Este sistema foi desenvolvido com **Java + Spring Boot**  
para gerenciar:

✔ Clientes  
✔ Serviços  
✔ Agendamentos  
✔ Pagamentos  

O foco principal é entender como funciona um sistema backend
bem estruturado utilizando boas práticas.

====================================================================

📚 ESTRUTURA DO SISTEMA

O projeto segue o padrão em camadas:

        Controller → Service → Repository → Model

Cada camada tem uma responsabilidade específica 👇

====================================================================

📦 MODEL (ESTRUTURA DOS DADOS)

Aqui ficam as entidades do sistema.

Exemplo:

✔ Usuario → dados do cliente  
✔ Pagamento → dados financeiros  

---

💡 RELACIONAMENTO

        Usuario 1 → 1 Pagamento

Ou seja:

✔ Um usuário possui um pagamento  
✔ Um pagamento pertence a um usuário  

====================================================================

📐 EXEMPLO SIMPLES

Usuario:

    nome: João
    serviço: Corte

Pagamento:

    valor: 100
    tipo: PIX

👉 O usuário está ligado ao pagamento

====================================================================

🧠 REPOSITORY (ACESSO AO BANCO)

Responsável por conversar com o banco de dados.

Exemplos:

✔ salvar dados  
✔ buscar usuários  
✔ filtrar por nome  
✔ ordenar resultados  

Tudo isso sem escrever SQL 😎

====================================================================

⚙️ SERVICE (REGRA DE NEGÓCIO)

Aqui fica a lógica do sistema.

Ele:

✔ recebe dados do controller  
✔ processa regras  
✔ envia para o repository  

Exemplo:

    salvar usuário  
    listar usuários  

====================================================================

🌐 CONTROLLER (ENTRADA DA API)

É a porta de entrada do sistema.

Aqui você consegue:

✔ cadastrar usuário (POST)  
✔ listar usuários (GET)  

---

📌 EXEMPLO DE REQUISIÇÃO

POST /usuarios

{
  "nome": "João",
  "servico": "Corte",
  "telefone": "11999999999",
  "agendamento": "2026-03-30T14:00:00",
  "pagamento": {
    "valor": 100,
    "tipo": "PIX"
  }
}

====================================================================

🔁 FLUXO DO SISTEMA

Cliente (Postman)
        ↓
Controller
        ↓
Service
        ↓
Repository
        ↓
Banco de Dados

====================================================================

🚀 O QUE VOCÊ APRENDE COM ESSE PROJETO

✔ Arquitetura em camadas  
✔ Spring Boot na prática  
✔ Relacionamento entre entidades  
✔ API REST  
✔ Organização de código  

====================================================================

⭐ Se esse projeto te ajudou, deixa uma estrela no repositório!

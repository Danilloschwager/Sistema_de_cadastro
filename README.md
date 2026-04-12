# SISTEMA DE CADASTRO (SPRING BOOT)
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
bem estruturado utilizando boas práticas como:

✔ Separação de responsabilidades  
✔ Organização em camadas  
✔ Reutilização de código  
✔ Facilidade de manutenção e escalabilidade  

====================================================================

📚 ESTRUTURA DO SISTEMA

O projeto segue o padrão em camadas:

        Controller → Service → Repository → Model

📌 EXPLICAÇÃO GERAL:

Cada camada possui uma função específica dentro da aplicação,
evitando código bagunçado e facilitando manutenção futura.

✔ Controller → recebe requisições HTTP  
✔ Service → processa regras de negócio  
✔ Repository → acessa o banco de dados  
✔ Model → representa os dados do sistema  

====================================================================

📦 MODEL (ESTRUTURA DOS DADOS)

Aqui ficam as entidades do sistema, ou seja, as classes que
representam as tabelas do banco de dados.

Exemplo:

✔ Usuario → armazena dados do cliente  
✔ Pagamento → armazena informações financeiras  

📌 Essas classes utilizam anotações como:

✔ @Entity  
✔ @Id  
✔ @OneToOne  

---

💡 RELACIONAMENTO

        Usuario 1 → 1 Pagamento

✔ Um usuário possui um pagamento  
✔ Um pagamento pertence a um usuário  

📌 Isso é feito utilizando:

    @OneToOne
    @JoinColumn

Esse tipo de relacionamento garante integridade dos dados
no banco.

====================================================================

📐 EXEMPLO SIMPLES

Usuario:

    nome: João
    serviço: Corte

Pagamento:

    valor: 100
    tipo: PIX

👉 O usuário está diretamente ligado ao pagamento,
permitindo fácil acesso às informações financeiras.

====================================================================

🧠 REPOSITORY (ACESSO AO BANCO)

Responsável por fazer a comunicação com o banco de dados.

Utiliza o **Spring Data JPA**, que permite:

✔ salvar dados automaticamente  
✔ buscar registros por ID  
✔ criar consultas sem SQL  
✔ paginação e ordenação  

Exemplo:

    usuarioRepository.save(usuario);
    usuarioRepository.findAll();

📌 Tudo isso sem precisar escrever SQL manualmente.

====================================================================

⚙️ SERVICE (REGRA DE NEGÓCIO)

Essa é a camada mais importante do sistema.

Ela é responsável por:

✔ validar dados  
✔ aplicar regras de negócio  
✔ evitar dados inconsistentes  
✔ organizar a lógica do sistema  

Exemplo de responsabilidades:

✔ impedir cadastro duplicado  
✔ validar campos obrigatórios  
✔ processar informações antes de salvar  

Fluxo:

Controller → Service → Repository

====================================================================

🌐 CONTROLLER (ENTRADA DA API)

Responsável por receber requisições do cliente (Postman, frontend, etc).

Aqui são definidos os endpoints da API:

✔ POST → cadastrar dados  
✔ GET → listar dados  
✔ PUT → atualizar  
✔ DELETE → remover  

Exemplo:

    @PostMapping("/usuarios")
    public Usuario salvar(@RequestBody Usuario usuario)

📌 O controller NÃO deve conter regras de negócio,
apenas encaminhar para o service.

====================================================================

📌 EXEMPLO DE REQUISIÇÃO

POST /usuarios

```json
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

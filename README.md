CRUD Aluno

Este projeto implementa um sistema CRUD (Criar, Ler, Atualizar, Deletar) para gerenciar alunos, utilizando Java com Spring Boot.

📦 Tecnologias

Java 17

Spring Boot

Spring Data JPA

H2 Database (banco de dados em memória)

Maven

🚀 Como rodar o projeto

Clone o repositório:

git clone https://github.com/Phhenrique3/crud_aluno.git
cd crud_aluno


Compile e execute o projeto:

./mvnw spring-boot:run


O servidor será iniciado na porta padrão 8080.

📚 Endpoints da API
📝 Cadastro de Aluno

POST /api/alunos

Cria um novo aluno.

Exemplo de corpo da requisição:

{
  "nome": "João Silva",
  "email": "joao.silva@example.com",
  "idade": 20
}


Resposta:

{
  "id": 1,
  "nome": "João Silva",
  "email": "joao.silva@example.com",
  "idade": 20
}

🔍 Listar Todos os Alunos

GET /api/alunos

Retorna todos os alunos cadastrados.

Resposta:

[
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@example.com",
    "idade": 20
  },
  {
    "id": 2,
    "nome": "Maria Oliveira",
    "email": "maria.oliveira@example.com",
    "idade": 22
  }
]

🔎 Buscar Aluno por ID

GET /api/alunos/{id}

Retorna os dados de um aluno pelo ID.

Exemplo de resposta:

{
  "id": 1,
  "nome": "João Silva",
  "email": "joao.silva@example.com",
  "idade": 20
}

✏️ Atualizar Aluno

PUT /api/alunos/{id}

Atualiza os dados de um aluno existente.

Exemplo de corpo da requisição:

{
  "nome": "João Silva Santos",
  "email": "joao.silva.santos@example.com",
  "idade": 21
}


Resposta:

{
  "id": 1,
  "nome": "João Silva Santos",
  "email": "joao.silva.santos@example.com",
  "idade": 21
}

🗑️ Deletar Aluno

DELETE /api/alunos/{id}

Deleta um aluno pelo ID.

Resposta:

{
  "message": "Aluno deletado com sucesso"
}

🧪 Testes no Postman

Você pode importar o arquivo crud_aluno.postman_collection.json
 para o Postman e testar os endpoints acima.

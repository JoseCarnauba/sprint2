# App StockAgil

## Descrição
StockAgil é uma aplicação para previsão de demandas de estoque.

## Equipe
- Jose Carnauba RM552367 | Eduardo Junio RM552374 | Danielly Pfander RM552391

## Distribução de Atividades

- Jose Carnaúba: Implementação das entidades JPA
- Eduardo Junio: Configuração do banco de dados e repositórios
- Jose Carnauba: Desenvolvimento dos endpoints REST
- Danielly Pfander: Documentação e testes

## Instruções para Rodar a Aplicação
1. Clone o repositório.
2. Configure o banco de dados no arquivo `application.properties`.
3. Rode o comando `StockAgilApplication`.

## Endpoints
- `POST /api/produto`: Cria um novo produto.
- `GET /api/produto/{id}`: Retorna um produto pelo ID.
- `GET /api/produto`: Retorna todos os produtos.
- `PUT /api/produto/{id}`: Atualiza um produto pelo ID.
- `DELETE /api/produto/{id}`: Deleta um produto pelo ID.


Aplicação desenvolvida em Spring Boot, Spring Web, Spring Data JPA para gerenciamento de filmes (CRUD completo), com persistência em banco H2 em memória.

---

# Como executar o projeto

1. Certifique-se de ter o **Java 17+** e **Maven** instalados.
2. Clone o repositório:
   ```bash
   git clone[ https://github.com/seu-usuario/moviemanager.git](https://github.com/juliafaco/movie-manager.git)
   Acesse a pasta do projeto:
3. Acesse a pasta do projeto:
  cd moviemanager
4. Execute o projeto com o Maven:
  mvn spring-boot:run
5. O projeto iniciará em:
  http://localhost:8080
6. Para acessar o console do banco H2:
  http://localhost:8080/h2-console

  JDBC URL: jdbc:h2:mem:movieappdb
  User: julia
  Password: (deixe em branco)

  # Endpoints
| Método | Endpoint       | Descrição              |
| POST   | `/movies`      | Cadastrar novo filme   |
| GET    | `/movies`      | Listar todos os filmes |
| GET    | `/movies/{id}` | Buscar filme por ID    |
| PUT    | `/movies/{id}` | Atualizar filme        |
| DELETE | `/movies/{id}` | Excluir filme          |

# Exemplos de requisição e resposta

Criar filme (POST /movies)

Request Body:
{
  "title": "Verity",
  "releaseYear": 2026,
  "genre": "Thriller",
  "watched": false
}

Response: 
{
  "id": 1,
  "title": "Verity",
  "releaseYear": 2026,
  "genre": "Thriller",
  "watched": false
}


Buscar por ID (GET /movies/1)

Response:
{
  "id": 1,
  "title": "Verity",
  "releaseYear": 2026,
  "genre": "Thriller",
  "watched": false
}

Atualizar filme (PUT /movies/1)

Request Body:
{
  "title": "Verity",
  "releaseYear": 2026,
  "genre": "Suspense",
  "watched": true
}


Response:
{
  "id": 1,
  "title": "Verity",
  "releaseYear": 2026,
  "genre": "Suspense",
  "watched": true
}

Excluir filme (DELETE /movies/1)

Response:
204 No Content


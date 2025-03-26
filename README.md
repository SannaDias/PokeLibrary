# PokeLibrary
Sistema completo para portfólio, utilizando backend em Java com microsserviços e frontend em Angular. O projeto simula um catálogo de livros e Pokémons, com gerenciamento, autenticação e mensageria.

![pokelibrary_diagrama](https://github.com/user-attachments/assets/92b20a49-5c96-417f-a671-908a5e6c86b2)


✅ Tecnologias utilizadas

Backend:

Java 17

Spring Boot (Web, Security, Data JPA, Actuator)

Spring Cloud (Gateway, Eureka, Config)

PostgreSQL (para autenticação e livros)

MongoDB ou Redis (para caching de pokémons)

Kafka ou RabbitMQ (mensageria)

JUnit e Mockito (testes unitários)

Swagger (documentação)

Frontend:

Angular 17

Angular Material

Consumo de APIs REST

Autenticação JWT

Gráficos e dashboard

Infraestrutura:

Docker

Docker Compose

Kubernetes (manifests de deployment e services)

Possibilidade de deploy serverless em GCP ou AWS

✅ Arquitetura



Frontend em Angular acessando API Gateway

Microsserviços separados para autenticação, livros e pokémons

Cada serviço com seu banco de dados próprio

Integração via Kafka ou RabbitMQ para notificações

Service Discovery com Eureka

✅ Estrutura do repositório

PokeLibrary/
 ├─ backend/
 │   ├─ api-gateway/
 │   ├─ auth-service/
 │   ├─ book-service/
 │   ├─ pokemon-service/
 │   └─ notifications-service/
 ├─ frontend/
 │   └─ poke-library-app/
 ├─ k8s/
 ├─ docker-compose.yml
 └─ README.md

✅ Como executar localmente

Pré-requisitos:

Docker e Docker Compose instalados

Node.js e Angular CLI instalados

Passos:

Clone o repositório:

git clone https://github.com/SannaDias/PokeLibrary.git

Acesse a pasta do projeto e suba os containers:

cd PokeLibrary
docker-compose up --build

Navegue até o frontend e rode a aplicação Angular:

cd frontend/poke-library-app
npm install
ng serve

Acesse o app em http://localhost:4200

✅ Deploy no Kubernetes

Os arquivos manifest de deployment e services estão na pasta k8s/. Você pode usar:

kubectl apply -f k8s/

✅ Funcionalidades

Login/Logout com JWT

Cadastro e visualização de livros

Consulta de pokémons via API pública e favoritos

Notificação via Kafka ou RabbitMQ

Gráficos de estatísticas

Testes unitários em todos os serviços

✅ Contribuição

Sinta-se à vontade para abrir issues ou PRs! 😄


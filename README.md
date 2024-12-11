<h1 align="center">
  Spring Oauth + BFF (Client Oauth) + SPA
</h1>

<p align="center">
</p>

## Configuração do Keycloak

1 - Executar Keycloak
```
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.5 start-dev
```

2 - Criar um Identity Provider pro Google no Keycloak

3 - Informar como Authentication do Realm via browser a opção google como IdP Redirector

4 - Criar client oauth no Keycloak com Standard Flow (Authorization Code)

5 - Adicionar redirect URIs do Gateway e do SPA

## Testando a Aplicação

Após garantir que o Keycloak está em execução, siga os passos abaixo:

- Execute os projetos `secured-service` e `security-gateway`
- Execute o projeto frontend-spa com o comando `npm run dev`

Será possível acessar a aplicação através do endereço [http://localhost:3000](http://localhost:3000). 

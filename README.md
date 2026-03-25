# Achat en Ligne - Microservice Spring Boot
### Description
Microservice achat-en-ligne-ms développé avec Spring Boot dans le package com.groupeisi.achatenlignems. Il expose une API RESTful pour la gestion des achats en ligne avec 4 entités : UserAccount, Produits, Achats et Ventes.
Le projet est structuré en couches avec les packages entities, dto, mapper, repository, service et controller. Il gère les entités JPA, les DTOs, les mappers MapStruct, les logs SLF4J, le cache Redis, les services métier et les RestControllers. Chaque entité dispose d'un CRUD complet. L'API est documentée avec Swagger et sécurisée avec Keycloak.

### Prérequis

Java 17
Maven 3.9
PostgreSQL
Redis
IntelliJ IDEA Ultimate

### Stack Technique

- Spring Boot 3.3
- Spring Data JPA — gestion de la base de données
- PostgreSQL — base de données relationnelle
- MapStruct — mapping entités/DTOs
- Lombok — réduction du code boilerplate
- Springdoc OpenAPI (Swagger) — documentation de l'API
- Spring Cache + Redis — mise en cache des données
- SLF4J (Logback) — gestion des logs

### Architecture du Projet

<img width="557" height="992" alt="image" src="https://github.com/user-attachments/assets/16f3cfe4-d034-4ea7-907b-81889105e5c4" />  

 ###  SUITE 

<img width="555" height="575" alt="image" src="https://github.com/user-attachments/assets/88de9d48-edef-4635-877d-46a52b873b96" />

### Documentation Swagger
http://localhost:8015/swagger-ui/index.html

Swagger UI
<img width="1919" height="979" alt="image" src="https://github.com/user-attachments/assets/7d4cb4c4-4e21-4991-93ee-3ecf3c3f2502" />

<img width="1919" height="972" alt="image" src="https://github.com/user-attachments/assets/8725d5ce-8818-4284-9647-2f04ddff121e" />

<img width="1919" height="975" alt="image" src="https://github.com/user-attachments/assets/b1036303-5def-4ed5-82f6-7330b3e617a5" />

### INTERFACE UTILISATEURS 

### Création d'un utilisateur (POST)
<img width="1916" height="967" alt="image" src="https://github.com/user-attachments/assets/bf34290d-1a2c-4c3a-b1c6-3d97a3586def" />

### Reponse 

<img width="1917" height="964" alt="image" src="https://github.com/user-attachments/assets/e40aeb13-319c-438b-9cfb-14550fa9df09" />

### Liste des utilisateurs (GET)

<img width="1918" height="984" alt="image" src="https://github.com/user-attachments/assets/64496dff-d18c-4a9f-bca5-eb3e9e32f94f" />

### Afficher un utilisateur par id (exemple id 7)

<img width="1900" height="973" alt="image" src="https://github.com/user-attachments/assets/66746f10-e580-434a-900a-21502a4fe044" />

### Modifier un utilisateur 

<img width="1902" height="981" alt="image" src="https://github.com/user-attachments/assets/dbdbb736-58b0-440b-8c2b-5ec4c776d8a9" />

### Reponse 

<img width="1905" height="977" alt="image" src="https://github.com/user-attachments/assets/973669b9-be4c-454e-bb98-68ef720b2f69" />

### Supprimer un utilisateur 

<img width="1919" height="988" alt="image" src="https://github.com/user-attachments/assets/8291f9b9-5a3b-4a16-aaa6-1bb200ff53ec" />

### INTERFACE PRODUITS

### Création d'un produit (POST)

<img width="1919" height="974" alt="image" src="https://github.com/user-attachments/assets/1ccb0aae-c739-4502-bb5b-97bdcc4c6e09" />

### Reponse 

<img width="1919" height="964" alt="image" src="https://github.com/user-attachments/assets/d05eef58-9d64-4087-a36e-72991bf66c61" />

### Liste des produits (GET)

<img width="1910" height="972" alt="image" src="https://github.com/user-attachments/assets/24b37454-d418-44b7-a73a-6fa5536cb35e" />

### Afficher un produit par reference (PROD007)

<img width="1919" height="994" alt="image" src="https://github.com/user-attachments/assets/9b6efe8c-786b-4550-ad0c-a4538e21e5a7" />

### Supprimer un produit 

<img width="1919" height="973" alt="image" src="https://github.com/user-attachments/assets/53567902-0940-4552-b04c-e7584825ce8e" />

### INTERFACE ACHAT 

<img width="1910" height="969" alt="image" src="https://github.com/user-attachments/assets/1904be5f-f803-44f0-aa4a-e22d5bf7709d" />


### Création d'un achat (POST)

<img width="1916" height="982" alt="image" src="https://github.com/user-attachments/assets/141ebb4b-48cb-4b9c-8747-fff7c6725ffb" />

### Reponse 

<img width="1919" height="986" alt="image" src="https://github.com/user-attachments/assets/516fe8f1-b547-49f3-b2e2-7b498b6de353" />

### Afficher tout les achats

<img width="1919" height="974" alt="image" src="https://github.com/user-attachments/assets/4242a035-352b-45b9-b26b-49757e713ca4" />

### Suppresion d'un achat id 3

<img width="1917" height="971" alt="image" src="https://github.com/user-attachments/assets/95de6c71-c71d-484e-98ce-709e764b4b54" />

### Afficher achat par id (1)

<img width="1918" height="983" alt="image" src="https://github.com/user-attachments/assets/17299363-6a05-4d78-8873-6daa47eee2f2" />

### VENTES

### Création d'une vente (POST)

<img width="1919" height="976" alt="image" src="https://github.com/user-attachments/assets/01affcb0-126a-4d74-a973-4bbb59475a74" />

### Liste des ventes 

<img width="1910" height="953" alt="image" src="https://github.com/user-attachments/assets/cebe190e-7fbe-4937-8f13-04cfa804e0f4" />

### Lister les ventes par 1 

<img width="1906" height="971" alt="image" src="https://github.com/user-attachments/assets/220b5963-6687-432c-8715-969f09f518a4" />

### la base de donne 

<img width="511" height="887" alt="image" src="https://github.com/user-attachments/assets/4922a77c-5412-4da6-b3cb-2c45c68afc77" />

### Authentification JWT

L'API est sécurisée avec JWT (JSON Web Token). Chaque requête protégée 
nécessite un token valide dans le header Authorization.

### Obtenir un token (Postman)

<img width="1914" height="994" alt="image" src="https://github.com/user-attachments/assets/c7455ef7-237b-4c26-b0e4-aa561f727b36" />

### Utiliser le token dans Swagger

1. Copier le token retourné par Postman
2. Ouvrir Swagger UI : `http://localhost:8015/swagger-ui/index.html`
3. Cliquer sur le bouton **Authorize 🔒** en haut à droite
4. Saisir dans le champ Value :

<img width="855" height="348" alt="image" src="https://github.com/user-attachments/assets/dcea18d9-c2eb-40b4-9b22-3be79eaff5bf" />

### Résultat

- Avec token valide → `200 OK`
- Sans token → `401 Unauthorized`
Et on pourra continuer a faie correctment les cruds




























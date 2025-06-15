# 🧬 FPGen – Functional Programming Generator Demo

This demo relies on Docker Hub to store backend and frontend images.

To keep it available, a Gmail and a DockerHub account have been created. Below are the credentials:

---

## 📧 Gmail Account
- **Email:** fpgen.unamur@gmail.com
- **Password:** fpgenUnamur2025

## 📦 DockerHub Account
- **Username:** fpgen
- **Password:** fpgenUnamur2025

---

## 🚀 How to Launch the Application Locally

### ✅ Preliminary Requirements
- Docker Engine must be installed on your machine.

### ▶️ Procedure

1. Open a terminal (PowerShell, terminal, or your IDE) and navigate to the path:  
   `fpgen\docker\fpgen_docker_demo`

2. Log in to Docker Hub using:
   ```
   docker login
   ```
    - **Username:** fpgen
    - **Password:** fpgenUnamur2025

3. Start the application stack with Docker Compose:
   ```
   docker compose up -d
   ```

4. Wait approximately 2 minutes (Keycloak takes time to initialize, especially on the first run).

5. Open a web browser and go to:  
   [http://localhost:4200/index.html](http://localhost:4200/index.html)

6. ✅ The application is ready to use.

---

## 👤 Default Accounts

### 🔑 Admin
- **Username:** admin
- **Password:** admin

> The admin is required to validate newly created accounts (authors).

### 👤 New User
- When registering a new account (author), validation by the admin is **mandatory**.
- Upon first login, use the default password: **default**.
- Keycloak will then prompt the user to choose a new password.

---

Enjoy using FPGen!

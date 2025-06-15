
# 🧬 FPGen – Development Mode

Welcome to the **FPGen** project! This guide helps you set up and run the application in development mode.

---

## 🚀 How to Launch the Application in Development Mode

### 1. Open a Terminal

Open a terminal (PowerShell, Bash, or your IDE’s terminal) and navigate to the development Docker environment:

```bash
cd fpgen/docker/fpgen_docker_dev
```

### 2. Start Database and Keycloak

Launch the required services using Docker Compose:

```bash
docker compose up -d
```

✅ This starts the **database** and **Keycloak** services.

### 3. Run the Backend

Start the backend using your IDE’s interface (run/debug configuration).

> ⚠️ Make sure environment variables and dependencies are correctly set.

### 4. Run the Frontend

#### Prerequisites

- Node.js (latest LTS recommended)
- Angular CLI globally installed:

```bash
npm install -g @angular/cli
```

#### Steps

1. Open a new terminal and navigate to the frontend directory:

```bash
cd fpgen/frontend/fpGenFront
```

2. Install dependencies (only if first time):

```bash
npm install
```

3. Start the frontend development server:

```bash
ng serve
```

---

## ✅ You're Ready!

Your backend and frontend are now running in development mode. Access the app at `http://localhost:4200`.

Happy coding! 👩‍💻👨‍💻

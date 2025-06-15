# Disclaimer / Usage Responsible
This project is intended solely for creating content aimed at advancing research in the detection of malicious individuals by training machine learning models.
It must not be used to harm anyone or for any unlawful activities.
Furthermore, this project should not serve as a source of inspiration for criminal behavior.

# 🧬 FPGen – Project Overview

Welcome to the **FPGen** project!  
This global README provides a quick overview of the project structure and guides new developers on where to find important parts of the codebase.

---

## 📁 Project Structure

The project is organized into **4 main folders**, each with its own responsibilities and README for detailed instructions:

### 1. `api`

- Contains the **API generator** and the related procedures.
- Responsible for generating backend and frontend API code from the API contract.
- Has its own README with detailed instructions on how to update and generate API code.

### 2. `backend`

- Contains the **backend application code**.
- Built using **Spring Boot**.
- The backend handles business logic, data persistence, and exposes the API.

### 3. `frontend`

- Contains the **frontend application code**.
- Built with **Angular**.
- The frontend consumes the backend API and provides the user interface.

### 4. `docker`

- Contains Docker configurations to launch different environments.
- Two main environments are provided:

    - **dev**: Starts a local database and Identity Access Management (IAM) services to allow development on your local machine.
    - **demo**: Runs the fully dockerized application for demonstration purposes.

- Each environment has detailed instructions in the folder README.

---

## 📚 Documentation

Each folder contains its own README file explaining how to set up, build, and run that part of the project:

- `api/README.md` – API contract and generator usage
- `backend/README.md` – Backend setup and launch instructions
- `frontend/README.md` – Frontend setup and launch instructions
- `docker/README.md` – Docker environment usage

---

## 🚀 Getting Started

To get started:

1. Choose the folder you want to work on (`api`, `backend`, `frontend`, or `docker`).
2. Follow the instructions in its README file.
3. For development, you will typically start the Docker **dev** environment first to have the database and IAM services running.
4. Then launch the backend and frontend projects from your IDE or terminal.

---

## 🙌 Need Help?

Feel free to explore each folder’s README for detailed guidance or reach out to the project maintainers for assistance.

## License
This is a student project. A student license has been provided; please see the LICENSE file for details.

Happy coding! 👩‍💻👨‍💻

Denis Schloune
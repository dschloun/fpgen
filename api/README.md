
# ⚙️ Working with the API Contract

In this project, to simplify development, we use an **API generator** to automatically generate both the backend and frontend API code.

---

## 📂 Project Structure

- **`api_contract`**  
  Contains the current version of the API contract (YAML file).

- **`api_generator`**  
  A Maven project responsible for generating API code based on the contract.

---

## 🚧 How to Work with the API Contract

If you want to add new endpoints or update the API, follow these steps carefully:

### 1. Prepare the API Generator Project

- Extract the **`api_generator`** project **outside** of the current project directory to avoid conflicts.
- If you prefer, the api generator is also available on github: https://github.com/dschloun/api_gen

### 2. Update the API Contract

- Edit the YAML file (`fpgen-api.yaml`) located in the `api_contract` folder.
- Add or modify endpoints, request/response objects, etc.
- Change the api version (up to the yaml)
- Change the api version in the pom of the generator project

### 3. Generate Backend Artifacts

- From the `api_generator` Maven project, run the following command to build and generate the backend code:

```bash
mvn clean install
```

- Alternatively, you can run this using your IDE’s Maven interface.
- If you want to deploy the generated artifacts to a remote repository, run:

```bash
mvn clean deploy
```

- **Note:** Make sure to update the repository configuration in the `pom.xml` if you deploy.

- change the api version in the project application pom: fpgen\backend\fp-gen-application\pom.xml
### 4. Generate Frontend Artifacts (TypeScript Angular)

- Navigate to the folder:

```bash
api_gen/src/main/resources/maven_api/gen
```

- Run the following command to generate the frontend API code:

```bash
npx openapi-generator-cli generate -i fpgen-api.yaml -g typescript-angular -o ./npm_api_out --additional-properties fileNaming=kebab-case,withInterfaces=true --generate-alias-as-model
```

- Classes will be generated in the folder api_gen/src/main/resources/maven_api/gen/npm_api_out

### 5. Update Frontend API Folder

- Copy all the generated files from the folder (in the generator project):

```bash
api_gen/src/main/resources/maven_api/gen/npm_api_out
```
    
- Replace the content of the frontend API folder located at (in the frontend project):

```bash
fpgen/frontend/fpGenFront/api
```

with the newly generated files.

---

## ✅ Summary

- Modify the API contract YAML in `api_contract`.
- Build backend with Maven.
- Generate frontend code with OpenAPI Generator CLI.
- Replace frontend API sources with the new generated files.

This approach keeps your backend and frontend API definitions perfectly synchronized and easy to maintain.

---

Happy coding! 🚀

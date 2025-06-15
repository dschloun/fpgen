FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

# Copie du fichier settings.xml AVANT de builder (très important)
COPY settings.xml /root/.m2/settings.xml

# Copie des fichiers de l'application
COPY . ./

# Build avec Maven
RUN ./mvnw clean install -DskipTests

# Étape finale plus légère
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copier uniquement le jar du build
COPY --from=builder /app/fp-gen-application/target/*.jar app.jar

EXPOSE 8000

ENTRYPOINT ["java", "-jar", "app.jar"]

# build the image: use this script like that you gave a name to the image:
#------------------------------------------------------------------------
# docker build -t fpgen/application:backend_1.0.0 .

# rename
# docker tag fpgen/application/backend:latest fpgen/application:backend_1.0.0


# push the image to the docker hub:
#-----------------------------------
# docker login
    #username: fpgen
    #pw: fpgenUnamur2025
# docker push fpgen/application:backend_1.0.0
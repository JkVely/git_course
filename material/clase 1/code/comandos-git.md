# Ejemplos de Comandos Git - Clase 1

## Configuración Inicial

```bash
# Configurar identidad
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@ejemplo.com"

# Configurar rama por defecto
git config --global init.defaultBranch main

# Configurar editor
git config --global core.editor nano

# Ver configuración
git config --list --global
```

## Primer Repositorio

```bash
# Crear y entrar al directorio
mkdir mi-primer-repo && cd mi-primer-repo

# Inicializar Git
git init

# Crear archivo
echo "# Mi Primer Repositorio" > README.md

# Ver estado
git status

# Agregar archivo al staging
git add README.md

# Crear commit
git commit -m "feat: agregar README inicial"

# Ver historial
git log --oneline
```

## Trabajando con Staging

```bash
# Agregar archivo específico
git add archivo.txt

# Agregar todos los archivos
git add .

# Agregar selectivamente (interactivo)
git add -p archivo.txt

# Ver diferencias (working vs staging)
git diff

# Ver diferencias (staging vs repository)
git diff --staged

# Quitar archivo del staging
git reset HEAD archivo.txt
```

## Conexión con Remoto

```bash
# Generar clave SSH
ssh-keygen -t ed25519 -C "tu.email@ejemplo.com"

# Ver clave pública (copiar a GitHub/GitLab)
cat ~/.ssh/id_ed25519.pub

# Agregar remoto
git remote add origin git@github.com:usuario/repo.git

# Ver remotos configurados
git remote -v

# Enviar cambios por primera vez
git push -u origin main

# Enviar cambios (después de configurar upstream)
git push

# Clonar repositorio
git clone git@github.com:usuario/repo.git
```

## Variables de Entorno Java

```bash
# Editar .bashrc o .zshrc
nano ~/.bashrc

# Agregar al final del archivo:
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH="$JAVA_HOME/bin:$PATH"

# Recargar configuración
source ~/.bashrc

# Verificar
echo $JAVA_HOME
java -version
mvn -v
```

## Flujo Completo de Trabajo

```bash
# 1. Hacer cambios en archivos
vim src/Main.java

# 2. Ver qué cambió
git status
git diff

# 3. Agregar cambios al staging
git add src/Main.java

# 4. Crear commit
git commit -m "feat: implementar método principal"

# 5. Enviar al remoto
git push

# 6. Obtener cambios del remoto
git pull
```

## Comandos Útiles

```bash
# Ver historial gráfico
git log --oneline --graph --all

# Ver detalles de un commit
git show <hash>

# Ver quién modificó cada línea
git blame archivo.txt

# Buscar en el historial
git log --grep="palabra"

# Ver archivos en un commit
git show <hash> --name-only
```

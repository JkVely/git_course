<div align="center">
	<h1>Índice del Curso</h1>
	<p><strong>Ingeniería de Software Colaborativa: Git y CI/CD</strong></p>
	<hr />
	<p>GLUD — Grupo GNU/Linux Universidad Distrital</p>
	<hr />
</div>

## Documentación General

<table width="100%">
	<tr>
		<td width="50%">
			<h3>📋 <a href="syllabus/Syllabus.pdf">Syllabus</a></h3>
			<p>Programa oficial del curso con objetivos, competencias y criterios de evaluación.</p>
		</td>
		<td width="50%">
			<h3>📘 <a href="Course.md">Descripción del Curso</a></h3>
			<p>Visión general, filosofía y estructura del programa formativo.</p>
		</td>
	</tr>
</table>

---

## Módulo 1: Fundamentos y Estandarización
**Semanas 1-3**

<div style="background-color: #f5f7f9; padding: 15px; margin: 10px 0; border-left: 4px solid #2c5f7c;color: black;">
	<h3>Semana 1: Configuración del Entorno</h3>
	<p><a href="routes/clase1.md">→ Clase 1</a> | <a href="material/clase%201/clase1.pdf">Presentación</a></p>
	<h4>Temas</h4>
	<ul>
		<li>Instalación y configuración de Git</li>
		<li>JDK 21 + Maven y variables de entorno</li>
		<li>Arquitectura de Git: Working Directory, Staging, Local Repository, Remote</li>
		<li>Primer <code>git init</code> y flujo básico</li>
	</ul>
	<p><strong>Comandos clave:</strong> <code>git init</code>, <code>git add</code>, <code>git commit</code>, <code>git push</code>, <code>git config</code></p>
</div>

<div style="background-color: #f5f7f9; padding: 15px; margin: 10px 0; border-left: 4px solid #2c5f7c;color: black;">
	<h3>Semana 2: Ciclo de Vida del Código</h3>
	<p><strong>Clase 2</strong> | Presentación</p>
	<h4>Temas</h4>
	<ul>
		<li>Estados del archivo (Untracked, Staged, Committed)</li>
		<li>Conventional Commits</li>
		<li>Estructura de proyecto del stack elegido</li>
		<li>Configuración de <code>.gitignore</code> apropiado</li>
	</ul>
	<p><strong>Comandos clave:</strong> <code>git status</code>, <code>git diff</code>, <code>git reset</code>, <code>git rm</code></p>
</div>

<div style="background-color: #f5f7f9; padding: 15px; margin: 10px 0; border-left: 4px solid #2c5f7c;color: black;">
	<h3>Semana 3: Viajes en el Tiempo</h3>
	<p><strong>Clase 3</strong> | Presentación</p>
	<h4>Temas</h4>
	<ul>
		<li>Historial (<code>git log</code>)</li>
		<li>Diferencias (<code>git diff</code>)</li>
		<li>Restauración (<code>git checkout</code>, <code>git restore</code>)</li>
		<li>Etiquetas (<code>git tag</code>) para versionamiento</li>
	</ul>
	<p><strong>Comandos clave:</strong> <code>git log</code>, <code>git show</code>, <code>git tag</code>, <code>git checkout</code>, <code>git restore</code></p>
</div>

---

## Módulo 2: Ramas y Estrategias de Colaboración
**Semanas 4-6**

<div style="background-color: #e8f2f7; padding: 15px; margin: 10px 0; border-left: 4px solid #1a3a52;color: black;">
	<h3>Semana 4: Trabajando con Ramas</h3>
	<p><a href="routes/clase4.md">→ Clase 4</a> | <a href="material/clase%204/clase4.pdf">Presentación</a></p>
	<h4>Temas</h4>
	<ul>
		<li>Concepto de ramas (branches) y punteros</li>
		<li>Comandos básicos: crear, cambiar, eliminar ramas</li>
		<li><strong>Git Flow</strong>: Estrategia estructurada (main, develop, feature, release, hotfix)</li>
		<li><strong>git-flow addon (AVH Edition)</strong>: Comandos simplificados</li>
		<li><strong>Feature Branch Workflow</strong>: Estrategia simple centrada en main</li>
		<li>Comparación y buenas prácticas</li>
		<li>Introducción a merge (detalle en Clase 5)</li>
	</ul>
	<p><strong>Comandos clave:</strong> <code>git branch</code>, <code>git switch</code>, <code>git checkout</code>, <code>git flow</code></p>
	<p><strong>Material adicional:</strong> <a href="material/clase%204/git-branches-cheatsheet.md">Cheatsheet de Ramas</a></p>
</div>

<div style="background-color: #e8f2f7; padding: 15px; margin: 10px 0; border-left: 4px solid #1a3a52;color: black;">

### Semana 5: Fusión y Conflictos

**Clase 5** | Presentación

**Temas:**
- Merge (Fast-Forward vs Recursive)
- Rebase (concepto básico)
- **Laboratorio de Caos:** Resolución guiada de conflictos

**Comandos clave:** `git merge`, `git rebase`, `git mergetool`

</div>

<div style="background-color: #e8f2f7; padding: 15px; margin: 10px 0; border-left: 4px solid #1a3a52;color: black;">

### Semana 6: Flujos Remotos

**Clase 6** | Presentación

**Temas:**
- Autenticación SSH (clave pública/privada)
- Conceptos de `origin` y `upstream`
- Clonación y sincronización
- Introducción a Git Flow (`develop`, `release`, `main`)

**Comandos clave:** `git remote`, `git fetch`, `git pull`, `git push`, `git clone`

</div>

---

## Módulo 3: Calidad y Gestión de Proyectos
**Semanas 7-8**

<div style="background-color: #fafbfc; padding: 15px; margin: 10px 0; border-left: 4px solid #c9a961;color: black;">

### Semana 7: Code Review y Pull Requests

**Clase 7** | Presentación

**Temas:**
- El arte de revisar código ajeno
- Todo cambio requiere un PR aprobado
- Comentarios constructivos
- Rol de Maintainer rotativo

**Plataformas:** GitHub Pull Requests, GitLab Merge Requests

</div>

<div style="background-color: #fafbfc; padding: 15px; margin: 10px 0; border-left: 4px solid #c9a961;color: black;">

### Semana 8: Project Management Integrado

**Clase 8** | Presentación

**Temas:**
- Issues, Labels, Milestones
- Tableros Kanban
- Reportar bugs y crear Issues
- Vinculación de commits con issues (`Fixes #12`)

**Plataformas:** GitHub Projects, GitLab Boards

</div>

---

## Módulo 4: Automatización e Integración Continua
**Semanas 9-10**

<div style="background-color: #f5f7f9; padding: 15px; margin: 10px 0; border-left: 4px solid #2c5f7c;color: black;">

### Semana 9: Introducción a CI (Integración Continua)

**Clase 9** | Presentación

**Temas:**
- ¿Qué es un Pipeline?
- Estructura YAML (`.github/workflows`, `.gitlab-ci.yml`)
- Configurar pipeline para ejecutar tests
- Bloqueo de PR si fallan tests

**Archivos clave:** `.github/workflows/*.yml`, `.gitlab-ci.yml`

</div>

<div style="background-color: #f5f7f9; padding: 15px; margin: 10px 0; border-left: 4px solid #2c5f7c;color: black;">

### Semana 10: Entrega Final y Despliegue

**Clase 10** | Presentación

**Temas:**
- Continuous Deployment (CD) básico
- Pipeline que genera artifacts
- Publicación en Releases al detectar tag `v1.0`
- **Proyecto Final:** Entrega de repositorio auditado

**Entregables:** Repositorio público con evidencia de trabajo colaborativo

</div>

---

## Materiales de Apoyo

### Código y Ejemplos

```
material/
├── clase 0/           # Presentación introductoria
├── clase 1/           # Configuración del entorno
│   ├── clase1.tex     # Fuente LaTeX de la presentación
│   ├── clase1.pdf     # Presentación compilada
│   └── code/          # Ejemplos de código
│       ├── comandos-git.md
│       ├── gitignore-ejemplo.txt
│       ├── Main.java
│       └── pom.xml
└── theme.sty          # Tema de presentaciones
```

### Rutas de Clase

```
routes/
├── clase1.md          # Guía detallada Clase 1
├── clase2.md          # Guía detallada Clase 2
└── ...
```

---

## Recursos Externos

### Documentación Oficial

| Recurso | Descripción |
|---------|-------------|
| [Pro Git Book](https://git-scm.com/book/es/v2) | Libro completo sobre Git en español |
| [Git Documentation](https://git-scm.com/docs) | Referencia oficial de comandos |
| [GitHub Docs](https://docs.github.com) | Documentación de GitHub |
| [GitLab Docs](https://docs.gitlab.com) | Documentación de GitLab |

### Herramientas Interactivas

| Recurso | Descripción |
|---------|-------------|
| [Learn Git Branching](https://learngitbranching.js.org/) | Visualización interactiva de Git |
| [GitHub Learning Lab](https://lab.github.com/) | Tutoriales prácticos |
| [Atlassian Git Tutorials](https://www.atlassian.com/git/tutorials) | Tutoriales detallados |
| [gitignore.io](https://gitignore.io) | Generador de `.gitignore` |

---

## Convenciones del Curso

### Commits Semánticos (Conventional Commits)

```
feat:     Nueva funcionalidad
fix:      Corrección de bug
docs:     Documentación
refactor: Refactorización
test:     Tests
chore:    Tareas de mantenimiento
```

### Estructura de Ramas

```
main           # Producción (nunca trabajar directo aquí)
develop        # Integración
feature/*      # Nuevas funcionalidades
hotfix/*       # Correcciones urgentes
release/*      # Preparación de versiones
```

---

## Evaluación

### Criterios de Aprobación (70/100 mínimo)

| Criterio | Peso |
|----------|------|
| Historial de commits semánticos | 25% |
| Pull Requests documentados (≥5) | 20% |
| Pipeline CI/CD funcional | 20% |
| Proyecto compilable/ejecutable | 15% |
| Issues gestionados (≥8) | 10% |
| Rotación de roles completada | 10% |

### Entrega Final

**Formato:** URL de repositorio público en GitHub/GitLab

**Fecha:** Semana 10

**Contenido mínimo:**
- Historial de commits bien documentado
- Pull Requests con revisiones
- Pipeline CI/CD pasando en verde
- Issues cerrados vinculados a commits
- README con documentación del proyecto

---

## Certificación

<div style="background-color: #e8f2f7; padding: 20px; border-radius: 5px; margin: 20px 0;color: black;">

Al completar el curso satisfactoriamente, se emitirá un **certificado digital** firmado por el GLUD, que incluye:

- Nombre del estudiante y código
- Duración del curso (10 semanas, 40 horas)
- Herramientas dominadas (Git, GitHub/GitLab, CI/CD)
- Enlace al repositorio público como evidencia verificable

</div>

---

## Soporte y Contacto

### Durante el Curso

- **Sesiones regulares:** Resolución de dudas en clase
- **Monitores GLUD:** Soporte en laboratorios complejos
- **Checkpoints:** Validación de avance por semana

### Después del Curso

- **Comunidad GLUD:** Acceso a eventos y talleres
- **Repositorio de plantillas:** Templates para proyectos
- **Documentación permanente:** Acceso a materiales del curso

---

<div align="center" style="margin-top: 40px; padding-top: 20px; border-top: 1px solid #d1dce5;">

**[← Volver a Descripción del Curso](Course.md)**

---

**GLUD — Grupo GNU/Linux Universidad Distrital**

*Control de Versiones y Desarrollo Colaborativo*

</div>

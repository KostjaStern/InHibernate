# InHibernate

   The main purpose of this application is illustration some difficult to understanding points from hibernate library working.
   
## How to build project

   * Remove previous build (optional step)
```bash
   > mvn clean
```

   * Build project
```bash
   > mvn package
```

   * Copy libraries to **target/lib** folder
```bash
   > mvn dependency:copy-dependencies
```

   * Download sources for dependencies (optional step)
```bash
   > mvn dependency:sources
```

## How to run project

   Run the following command.
```bash
   > java -jar target/InHibernate-0.1.jar
```
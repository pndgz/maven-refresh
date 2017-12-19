# maven-refresh

## Basic Usage

```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath group: 'com.github.pndgz', name: 'maven-refresh', version: '1.0.0'
    }
}
apply plugin: 'com.github.pndgz.maven-refresh'

```

## Custom Local Repository
```

mavenRefresh {
    localRepository="YourLocalMavenRepository"
}

```
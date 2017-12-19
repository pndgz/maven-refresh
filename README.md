# maven-refresh

Clean the SNAPSHOT dependencies of your project in Local Maven Repository (such as ~/.m2/repository).

## Basic Usage

Using plugins.gradle.org

```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.github.pndgz:maven-refresh:1.0.1"
  }
}

apply plugin: "com.github.pndgz.maven-refresh"
```

Using JCenter

```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath group: 'com.github.pndgz', name: 'maven-refresh', version: '1.0.1'
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
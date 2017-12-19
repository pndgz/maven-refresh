# maven-refresh

``````
buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath group: 'com.github.pndgz', name: 'maven-refresh', version: '1.0-SNAPSHOT'
    }
}
apply plugin: 'com.github.pndgz.maven-refresh'

mavenRefresh {

}
```
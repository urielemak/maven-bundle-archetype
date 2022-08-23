# Maven Bundle Archetype 😎

A basic Maven archetype for create OSGI Bundles with Apache Felix.

## Installation
First of all, clone this repo in your directory.

    git clone https://github.com/urielemak/maven-bundle-archetype

Go to the directory repo. `cd maven-bundle-archetype` and execute:

    mvn install

## Usage
Create your own osgi bundle with

    mvn archetype:generate -DarchetypeGroupId=github.urielemak \
      -DarchetypeArtifactId=maven-bundle-archetype \
      -DarchetypeVersion=1.0

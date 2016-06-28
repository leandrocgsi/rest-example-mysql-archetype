# How to use this Archetype?

First you need clone this project in your computer. This can be done with following command line.

```
git clone https://github.com/leandrocgsi/rest-example-mysql-archetype.git
```

Open the generated source folder, that can be should look like the image below.

![OpenFolder](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/1-OpenFolder.png?raw=true)

Execute following comand line in your folder.

```
mvn clean install
```
It's can be should look like the image below.

![CleanInstall](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/2-CleanInstall.png?raw=true)

Now go to the directory where you want to create your project and run the command below.

```
mvn archetype:generate 
    -DarchetypeGroupId=br.com.erudio
    -DarchetypeArtifactId=rest-example-mysql-archetype
    -DarchetypeVersion=0.0.1-SNAPSHOT
    -DgroupId=br.com.semeru
    -DartifactId=rest-mysql-from-archetype
    -Dversion=1.0-SNAPSHOT
    -Dpackage=br.com.semeru
```
Maven ask if you need change version of your project and your package base as is highlighted in red in the image below. If you dont want any change just type Enter Enter. If everything is gonna be OK you should see one image similar to following. Your project was created with success ;-)

![Building1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/4-Building.png?raw=true)

Now we just import our project in favorite IDE (Eclipse in this example). Go to menu File >> Import >> Maven >> Existing Maven Projects >> Next.

![Importing1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/9-Importing.png?raw=true)

As on image bellow type your Root Directory (where we found your code) and click in Browse >> Finish.

![Importing2](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/10-Importing.png?raw=true)

#[Série de Video Aulas em Português explicando passo a passo](https://www.youtube.com/playlist?list=PL18bbNo7xuh-uIfKSuwAUaG4PWw832YVx) (Only Portuguese)

[![01 Montando Um Archetype Maven](http://img.youtube.com/vi/wzdkHpMpkQE/0.jpg)](https://www.youtube.com/watch?v=wzdkHpMpkQE-Y "01 Montando Um Archetype Maven")
[![02 Montando Um Archetype Maven COMPACTO](http://img.youtube.com/vi/aBHtHx6MI6c/0.jpg)](https://www.youtube.com/watch?v=aBHtHx6MI6c-Y "02 Montando Um Archetype Maven COMPACTO")
[![03 Montando Um Archetype Maven DETALHADO Parte 1](http://img.youtube.com/vi/qpK8s_O_fwY/0.jpg)](https://www.youtube.com/watch?v=qpK8s_O_fwY-Y "01 Montando Um Archetype Maven DETALHADO Parte 1")
[![04 Montando Um Archetype Maven DETALHADO Parte 2](http://img.youtube.com/vi/auZCBhNQQrc/0.jpg)](https://www.youtube.com/watch?v=auZCBhNQQrc-Y "02 Montando Um Archetype Maven DETALHADO Parte 2")
[![05 Montando Um Archetype Maven DETALHADO Parte 3](http://img.youtube.com/vi/wzdkHpMpkQE/0.jpg)](https://www.youtube.com/watch?v=StTqXEQ2l-Y "03 Montando Um Archetype Maven DETALHADO Parte 3")

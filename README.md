<p align="center"><img src="img/logo-jupiter.gif" width = "833px" height="433px"></p>

<h1 align="center">API Planet dwarf</h1>

<h3 align="center">
API REST de código aberto para dados de consulta de  pesquisa  as informações nelas contidadas com o objetivo de estabelecer resultados relevantes <a href="https://www.nasa.gov/subject/6893/nebulae/" target="_blank">União Astronômica Internacional</a>
 <a href="https://www.iau2006.org/"usando como base organizacional um sistema de CRUD
<p align="center">
 
<a href="https://app.travis-ci.com/Mario23junior/Missions-to-Jupiter.svg?branch=main" target="_blank"> [![Build Status](https://app.travis-ci.com/Mario23junior/Missions-to-Jupiter.svg?branch=main)](https://app.travis-ci.com/Mario23junior/Missions-to-Jupiter)
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square" target="_blank"></a>
</p>
  
## Primeiro execute o maven 

## 🚀 Começando

Algums parametros de ação são necessarios para a execução
### 📋 Pré-requisitos


Você pode esta alterando o tamanho do print direto no codigo


### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Diga como essa etapa será:

```
java -jar target/planet-dwarf-API-1.0-SNAPSHOT.jar

```
 
## Uso

```
localhost:8080/project/mission/jupiter/api/v1/
```

## Resultado dos dados da API

```json
 [
    {
        "designacao": "1",
        "diametro": "975×909",
        "massa": "9,5×1020 0,00016",
        "raioEquatorial": "0,0738 471",
        "volume": 4.2E-4,
        "dataComplements": {
            "id": 2,
            "velocidade": 17882.0,
            "excentricidade": 0.08,
            "inclinacao": "10,587",
            "temperatura": 167.0,
            "satelitesNaturais": 0
        }
    }
]

```

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Java11](http://www.dropwizard.io/1.0.2/docs/)
* [Spring boot](https://spring.io/projects/spring-boot)
* [H2](https://www.h2database.com/html/main.html)
* [openJDK](https://maven.apache.org/)
 
## 📄 Licença

Este projeto está sob a licença (GNU GPLv3) - [GNU GPLv3.md](https://www.gnu.org/licenses/gpl-3.0.pt-br.html)

Compte rendu SIT - Simon LEDOUX-LEVIN
=====================
Groupe B
-------------------

Lors du module SIT, nous avons travaillé en équipe sur une application de contrôle de drône : 
-Envoi de commande avec une application Android pour déplacer le drone a partir de coordonnées GPS.
-Prise de photos/vidéos.

Cette première phase du projet avait pour objectif de définir l'architecture de notre système et 
les technologies qui seront utilisés pendant les développements.
J'ai donc travaillé sur le partie base de données et serveur web du système.

Nous avons tout d'abord choisi les technos pour le serveur web : une application spring (avec jhipster)
pour l'API REST et pour la persistence des données nous avons choisi une base NoSQL, MongoDB 
(qui est susceptible de changer, nous envisageons finalement d'utiliser une base de données relationnelle SQL). 
J'ai pu travailler sur le modèle de données. Nous avons dresser un diagramme et générer les entités nécessaires
dans notre projet spring : Mission, Localisation, Ordre.

Pour transmettre les données de retour à l'appli Android, nous avons prévu d'utiliser un broker RabbitMQ.
Je me suis intéressé à l'intégration de RabbitMQ dans un projet Spring (avec la librairie AMQP-spring).
Pour la suite, il est nécessaire de spécifier les données qui passeront par le broker ainsi la structure des 
topics, queues, channels.

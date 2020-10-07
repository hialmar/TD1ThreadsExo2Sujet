# TD1ThreadsExo2Sujet

Exercice 2 : Nous allons présenter dans cet exercice une interaction classique entre deux entités : un Producteur et un
Consommateur. Un Producteur crée des messages et les place dans une file, tandis qu’un Consommateur les lit et
les affiche.
Pour être réalistes, nous donnerons à la file une taille maximale. Et pour rendre les choses plus intéressantes, nous
rendrons le consommateur un peu feignant, en faisant en sorte qu’il s’exécute plus lentement que le producteur. Cela
signifie que le producteur doit parfois s’arrêter et attendre que le consommateur se mette à travailler.
1. Identifier sur un diagramme UML les classes de cette application (propriétés et méthodes).
2. Dans une première version de cet exercice et pour des raisons de simplification, nous allons dériver les classes
Producteur et Consommateur de la classe Thread.
2.1. Quel problème soulève l’interaction Production/Consommation sur l’objet unique « file de message ».
Comment le résoudre en java ?
2.2. Que signifie « thread-safe » ? Vector est-il « thread-safe » ? Est-ce que ça résout le problème de
synchronisation ?
2.3. Après avoir commenté le code des classes Producteur et Consommateur (donné), écrire la classe principale
Main qui simule l’application.
3. Reprendre l’exercice en implémentant pour les classes Producteur et Consommateur l’interface
Runnable (2ième version).
4. Développer la version « N Files – X Producteurs – Y Consommateurs » de cet exercice

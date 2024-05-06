Enoncé :
Vous êtes en charge de développer un système de gestion de bibliothèque en Java. Pour cela, vous devez modéliser différentes entités telles que des Livres et des DVD. Un Livre a un titre, un auteur et un nombre de pages, tandis qu'un DVD a un titre, un réalisateur et une durée en minutes. 

Votre tâche consiste à créer une hiérarchie de classes en utilisant l'héritage pour modéliser cette situation. La classe de base devrait être une classe abstraite nommée "Media" qui contient les attributs et méthodes communs à tous les médias. Ensuite, créez des classes concrètes pour représenter des Livres et des DVD, en utilisant l'héritage pour réutiliser le code commun de la classe "Media". Assurez-vous d'inclure des méthodes pour obtenir et définir les attributs de chaque classe, ainsi que des constructeurs appropriés.

De plus, implémentez une classe "Library" qui représente une bibliothèque et qui peut contenir une liste de médias (Livres et DVD). Cette classe devrait avoir des méthodes pour ajouter et supprimer des médias, ainsi que pour afficher tous les médias présents dans la bibliothèque.

Enfin, créez une classe principale nommée "LibraryManagementSystem" qui instancie une bibliothèque, ajoute quelques Livres et DVD à celle-ci, puis affiche le contenu de la bibliothèque.

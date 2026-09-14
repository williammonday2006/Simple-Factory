# Phase 1
Moving object creation to SimpleEnemyFactory decouples the main method from the concrete enemy classes. Instead of main having to use new Goblin(), it only needs to know the enemy type and the factory.
# Phase 2
The factory method pattern uses inheritance to allow different spawners to decide which enemies they create, EnenySpawner contains the general spawning process while Forest and Dungeon provide their own implementations. This makes adding another level type easy. If i wanted MountainSPawner all u needed to do is extend enemy spawner and override create enemy to make mountain enemies.
# Phase 3
The Abstract Factory pattern guarantees compatible equipment by grouping related products together inside the same factory. The WarriorEquipmentFactory creates both a sword and plateArmror while the mageEquipmentFactory creates both a staff and robe. Becuase the enemy receves an equipmentFactory it doesn't have to separately decide which weapons and armor to use.
# Phase 4
Main relies on the abstract types EnemySpawner and Enemy instead of directly depending on specific enemy classes. the forest and dungeon spawners are stored as EnemySpawner references . The concrete enemy classes and equipment factories are handled by the spawners. The ForestSpawner uses WarriorEquipmentFactory while DungeonSpawner uses MageEquipmentFactory.
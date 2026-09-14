public class Main {

    public static void main(String[] args) {

        EnemySpawner forest = new ForestSpawner();
        EnemySpawner dungeon = new DungeonSpawner();

        Enemy[] enemies = {
            forest.spawnEnemy("goblin"),
            forest.spawnEnemy("wolf"),
            dungeon.spawnEnemy("skeleton"),
            dungeon.spawnEnemy("slime")
        };

        for (Enemy enemy : enemies) {
            enemy.attack();
        }
    }
}
public class Main {

    public static void main(String[] args) {

        EnemySpawner forest = new ForestSpawner();
        EnemySpawner dungeon = new DungeonSpawner();

        Enemy goblin = forest.spawnEnemy("goblin");
        Enemy skeleton = dungeon.spawnEnemy("skeleton");

        goblin.attack();
        skeleton.attack();
    }
}
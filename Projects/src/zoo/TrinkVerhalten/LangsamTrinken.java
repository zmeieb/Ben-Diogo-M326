package zoo.TrinkVerhalten;

/**
 * LangsamTrinken.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Klasse für das langsame Trinkverhalten der Tier
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class LangsamTrinken implements TrinkVerhalten {
    /**
     * Das Tier fängt an langsam zu trinken.
     */
    @Override
    public void trinken() {
        System.out.println("Laaaangsaaaaam trinkeeeen...");
    }
}

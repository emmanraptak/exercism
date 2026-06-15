import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myCollCopy = new HashSet<>(myCollection);
        Set<String> theirCollCopy = new HashSet<>(theirCollection);
        
        myCollCopy.removeAll(theirCollection);
        theirCollCopy.removeAll(myCollection);
            
        return !myCollCopy.isEmpty() && !theirCollCopy.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        
        Set<String> commonCollection = new HashSet<>(collections.get(0));
        
        for (Set<String> collection : collections) {
            commonCollection.retainAll(collection);
        }

        return commonCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> knownCards = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            knownCards.addAll(collection);
        }

        return knownCards;
    }
}

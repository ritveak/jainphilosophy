import com.jain.core.api.JainPhilosophyEngine;
import com.jain.core.karma.KarmaBundle;
import com.jain.core.karma.KarmaClass;
import com.jain.core.karma.KarmaContext;
import com.jain.core.karma.KarmaEvent;
import com.jain.core.karma.KarmaSubType;
import com.jain.core.karma.KarmaType;
import com.jain.core.pudgala.ChargeParity;
import com.jain.core.pudgala.JainTradition;
import com.jain.core.pudgala.ParamanuBondingTable;
import com.jain.core.pudgala.PudgalaAggregateClass;
import com.jain.core.pudgala.VarganaOrderTier;
import com.jain.core.registry.Concept;

/**
 * Hindi: {@code Udaaharan} chaalaak.
 * English: Small demo of the Jain philosophy engine API.
 */
public class Main {
    public static void main(String[] args) {
        JainPhilosophyEngine engine = new JainPhilosophyEngine();
        KarmaBundle current = KarmaBundle.empty();
        KarmaEvent event = new KarmaEvent(KarmaType.MOHANIYA, KarmaSubType.KRODH_ANANTANUBANDHI, 7, 12);
        KarmaContext context = new KarmaContext(true, true, 1);

        KarmaBundle updated = engine.processAction(current, event, context);
        System.out.println("Karma particles after action: " + updated.particles().size());
        System.out.println("Ghati karma types: " + engine.karmaTypesInClass(KarmaClass.GHATI));
        System.out.println("Mohaniya groups: " + engine.karmaGroups(KarmaType.MOHANIYA));
        System.out.println("Mohaniya subtypes: " + engine.karmaSubtypes(KarmaType.MOHANIYA).size());
        System.out.println("Syadvada sample: " + engine.evaluateSyadvada("the soul is bound").get(0));
        System.out.println("Ontology root concept: " + engine.ontologyRoot().concept());
        Concept sample = Concept.JEEV;
        System.out.println("Lexical sample " + sample.name() + ": " + sample.englishMeaning());
        System.out.println("Pudgala (paper): " + engine.pudgalaSummary());
        System.out.println("Associable varganas: " + engine.associableVarganas());
        System.out.println(
                "Paramanu bonding 2q+4q dissimilar Shvetambara: "
                        + ParamanuBondingTable.canBond(2, 4, JainTradition.SHVETAMBAR, ChargeParity.VIPARIT));
        System.out.println("Vargana order 10 tier: " + VarganaOrderTier.forOrder(10));
        System.out.println(
                "Aggregate class paramanu touches: " + PudgalaAggregateClass.PARAMANU_DWISPARSH.touchCount());
    }
}

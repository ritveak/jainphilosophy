import com.jain.core.api.JainPhilosophyEngine;
import com.jain.core.pudgala.vargana.karma.KarmaBundle;
import com.jain.core.pudgala.vargana.karma.KarmaClass;
import com.jain.core.pudgala.vargana.karma.KarmaContext;
import com.jain.core.pudgala.vargana.karma.KarmaEvent;
import com.jain.core.pudgala.vargana.karma.KarmaSubType;
import com.jain.core.pudgala.vargana.karma.KarmaType;
import com.jain.core.pudgala.ahar.AharKind;
import com.jain.core.pudgala.ahar.AharMateriality;
import com.jain.core.pudgala.ahar.KavalAharForm;
import com.jain.core.pudgala.paramanu.ChargeParity;
import com.jain.core.context.JainContext;
import com.jain.core.pudgala.paramanu.ParamanuBondingTable;
import com.jain.core.pudgala.aggregate.PudgalaAggregateClass;
import com.jain.core.pudgala.vargana.VarganaOrderTier;
import com.jain.core.registry.Concept;

/**
 * Hindi: {@code Udaaharan} chaalaak.
 * English: Small demo of the Jain philosophy engine API.
 */
public class Main {
    public static void main(String[] args) {
        JainPhilosophyEngine engine = new JainPhilosophyEngine();
        KarmaBundle current = KarmaBundle.empty();
        KarmaEvent event = new KarmaEvent(KarmaSubType.KRODH_ANANTANUBANDHI, 7, 12);
        KarmaContext context = new KarmaContext(true, true, 1);

        KarmaBundle updated = engine.processAction(current, event, context);
        System.out.println("Karma particles after action: " + updated.particles().size());
        System.out.println("Event derived karma type: " + event.type());
        System.out.println("Event subtype group: " + event.subTypeGroup().orElse(null));
        System.out.println("Ghati karma types: " + engine.karmaTypesInClass(null, KarmaClass.GHATI));
        System.out.println("Mohaniya groups: " + engine.karmaGroups(null, KarmaType.MOHANIYA));
        System.out.println("Mohaniya subtypes: " + engine.karmaSubtypes(null, KarmaType.MOHANIYA).size());
        System.out.println("Syadvada sample: " + engine.evaluateSyadvada(null, "the soul is bound").get(0));
        System.out.println("Ontology root concept: " + engine.ontologyRoot().concept());
        Concept sample = Concept.JEEV;
        System.out.println("Lexical sample " + sample.name() + ": " + sample.englishMeaning());
        System.out.println("Pudgala (paper): " + engine.pudgalaSummary());
        System.out.println("Ahar summary: " + engine.aharSummary());
        System.out.println("Ahar kinds: " + engine.aharKinds());
        System.out.println("Kavalahara siblings: " + engine.siblingAharKindsOf(AharKind.KAVAL_AHAR));
        System.out.println("Subtle ahar kinds: " + engine.aharKindsByMateriality(AharMateriality.SUBTLE));
        System.out.println("Kaval breakdown: " + engine.kavalAharKinds(AharKind.KAVAL_AHAR));
        System.out.println("Liquid kaval kinds: " + engine.kavalAharKindsByForm(KavalAharForm.LIQUID_NOURISHMENT));
        System.out.println("Associable varganas: " + engine.associableVarganas());
        System.out.println(
                "Paramanu bonding 2q+4q dissimilar Shvetambara: "
                        + ParamanuBondingTable.canBond(2, 4, JainContext.SHVETAMBAR_MURTIPUJAK, ChargeParity.VIPARIT));
        System.out.println("Vargana order 10 tier: " + VarganaOrderTier.forOrder(10));
        System.out.println(
                "Aggregate class paramanu touches: " + PudgalaAggregateClass.PARAMANU_DWISPARSH.touchCount());
    }
}

import com.jain.core.api.JainPhilosophyEngine;
import com.jain.core.karma.KarmaBundle;
import com.jain.core.karma.KarmaContext;
import com.jain.core.karma.KarmaEvent;
import com.jain.core.karma.KarmaSubType;
import com.jain.core.karma.KarmaType;

public class Main {
    public static void main(String[] args) {
        JainPhilosophyEngine engine = new JainPhilosophyEngine();
        KarmaBundle current = KarmaBundle.empty();
        KarmaEvent event = new KarmaEvent(KarmaType.MOHANIYA, KarmaSubType.KRODHA_ANANTANUBANDHI, 7, 12);
        KarmaContext context = new KarmaContext(true, true, 1);

        KarmaBundle updated = engine.processAction(current, event, context);
        System.out.println("Karma particles after action: " + updated.particles().size());
        System.out.println("Syadvada sample: " + engine.evaluateSyadvada("the soul is bound").get(0));
        System.out.println("Ontology root concept: " + engine.ontologyRoot().concept());
    }
}
package jagat.padarth;

import jagat.base.Astikay;
import enums.Count;

public interface AkashAstikay extends Astikay {
    @Override
    default Count getPradeshCount(){
        return Count.ANANTA;
    }
}

package jagat.padarth;

import jagat.base.Astikay;
import enums.Count;

public interface DharmAstikay extends Astikay {
    @Override
    default Count getPradeshCount(){
        return Count.ASANKHYA;
    }
}

package jagat.padarth;

import jagat.base.Astikay;
import enums.Count;

public interface AdharmAstikay extends Astikay {
    @Override
    default Count getPradeshCount(){
        return Count.ASANKHYA;
    }
}

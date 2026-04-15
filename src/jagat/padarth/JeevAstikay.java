package jagat.padarth;

import jagat.base.Astikay;
import enums.Count;

public interface JeevAstikay extends Astikay {
    @Override
    default Count getPradeshCount(){
        return Count.ASANKHYA;
    }
}

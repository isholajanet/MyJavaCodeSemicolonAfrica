package africa.semicolon.chapterEight.EmergencyResponse;

import java.util.ArrayList;
import java.util.List;

public class Emergency {
    private List<Caller> callerInfo;

    public Emergency(Caller newCaller){
        callerInfo = new ArrayList<Caller>();
        callerInfo.add(newCaller);
    }

    public List<Caller> getCallerInfo() {
        return callerInfo;
    }

    public void setCallerInfo(List<Caller> callerInfo) {
        this.callerInfo = callerInfo;
    }
}

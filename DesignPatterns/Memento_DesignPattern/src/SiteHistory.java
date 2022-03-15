import java.util.Stack;

public class SiteHistory {

    Stack<SiteList.SiteMemento> siteHistory = new Stack<>();
    public void saveProcess(SiteList siteList){
        siteHistory.push(siteList.saveProcess());
    }

    public void rollback(SiteList siteList){
        if(!siteHistory.isEmpty()){
            siteList.rollback(siteHistory.pop());
        }else{
            System.out.println("Limited Reached Cannot Go More Back");
        }
    }
}

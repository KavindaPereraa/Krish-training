//originator

import java.util.ArrayList;

public class SiteList {
        ArrayList<Site> sites = new ArrayList<>();

        public void addSite(Site site){
            sites.add(site);
        }

    public ArrayList<Site> getSites() {
        return (ArrayList<Site>) sites.clone();
    }

    public SiteMemento saveProcess(){
            return  new SiteMemento(getSites());
    }

    public void rollback(SiteMemento siteMemento){
        sites=siteMemento.getSites();
    }

    @Override
    public String toString() {
        return "SiteList{" +
                "sites=" + sites +
                '}';
    }

    static class SiteMemento{

        ArrayList<Site> sites;

        public SiteMemento(ArrayList<Site> sites) {
            this.sites = sites;
        }

        public ArrayList<Site> getSites() {
            return sites;
        }
    }
}

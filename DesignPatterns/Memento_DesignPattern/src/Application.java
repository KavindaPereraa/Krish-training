public class Application {
    public static void main(String[] args){


        SiteHistory siteHistory = new SiteHistory();
        SiteList siteList = new SiteList();

        siteList.addSite(new Site("www.google.com"));
        siteHistory.saveProcess(siteList);
        System.out.println(siteList);

        siteList.addSite(new Site("www.youtube.com"));
        siteHistory.saveProcess(siteList);
        System.out.println(siteList);

        siteList.addSite(new Site("www.facebook.com"));
        siteHistory.saveProcess(siteList);
        System.out.println(siteList);

        siteList.addSite(new Site("www.Twiter.com"));
        siteHistory.saveProcess(siteList);
        System.out.println(siteList);
        System.out.println("\r\nRollBack");

        //Undo
        siteHistory.rollback(siteList);
        System.out.println(siteList);

        siteHistory.rollback(siteList);
        System.out.println(siteList);

        //additng but not saving and then removing
        siteList.addSite(new Site("www.testing.com"));
        System.out.println(siteList);

        siteHistory.rollback(siteList);
        System.out.println(siteList);
    }
}

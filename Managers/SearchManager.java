package Managers;

public class SearchManager {

    private static SearchManager instance;

    private SearchManager(){

    }

    public static SearchManager getInstance(){
        if (instance == null){
            instance = new SearchManager();
        }
        return instance;
    }

}

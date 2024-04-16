public class Game {
    private String title;
    private String platform;


    public String getTitle() {
        return title;
    }
    public Game(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }


  @Override
  public String toString() {
      return "Title: " + title + ", Platform: " + platform;
  }

}

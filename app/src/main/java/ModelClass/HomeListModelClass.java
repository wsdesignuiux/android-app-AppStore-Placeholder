package ModelClass;

/**
 * Created by Wolf Soft on 1/17/2018.
 */

public class HomeListModelClass {

    Integer image;
    String title,view,install;

    public HomeListModelClass(Integer image, String title, String view, String install) {
        this.image = image;
        this.title = title;
        this.view = view;
        this.install = install;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getInstall() {
        return install;
    }

    public void setInstall(String install) {
        this.install = install;
    }
}

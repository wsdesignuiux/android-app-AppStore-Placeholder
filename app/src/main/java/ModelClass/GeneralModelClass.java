package ModelClass;

/**
 * Created by Wolf Soft on 1/18/2018.
 */

public class GeneralModelClass {

    Integer image;
    String title;

    public GeneralModelClass(Integer image, String title) {
        this.image = image;
        this.title = title;
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
}

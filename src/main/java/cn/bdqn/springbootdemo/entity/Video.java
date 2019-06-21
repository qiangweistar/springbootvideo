package cn.bdqn.springbootdemo.entity;

/**
 * 视频信息
 */
public class Video {
    private int id; //id
    private String coverURL;//图片地址
    private String videoId;//播放凭证

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}

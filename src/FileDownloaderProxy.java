import java.io.IOException;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    private String url;
    public FileDownloaderProxy(String url){
        this.fileDownloader = new FileDownloader(url);
    }

    @Override
    public void download() throws IOException {
        fileDownloader.download();
    }
}

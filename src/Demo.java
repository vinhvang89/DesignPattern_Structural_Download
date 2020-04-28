import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        String url = "https://www.mozilla.org/vi/firefox/download/thanks/";
        FileDownloaderProxy proxy = new FileDownloaderProxy(url);
        proxy.download();
    }
}

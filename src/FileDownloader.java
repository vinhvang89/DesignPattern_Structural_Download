import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileDownloader implements Downloader {
    String url;
    public FileDownloader(String url) {

        this.url = url;
    }

    @Override
    public void download() throws IOException {
        URL website = new URL(url);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("FirefoxInstaller.html");
        fos.getChannel().transferFrom(rbc,0,Long.MAX_VALUE);
    }
}

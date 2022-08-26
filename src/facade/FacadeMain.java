package facade;

public class FacadeMain {
    public static void main(String[] args) {

        // Facade pattern 적용 전
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");

        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");

        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");

        reader.fileConnect();
        reader.fileRead();

        reader.fileDisConnect();
        writer.fileDisConnect();
        ftpClient.disConnect();

        System.out.println("/n");

        // Facade pattern 적용 후
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc", "text.tmp");

        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();

    }
}

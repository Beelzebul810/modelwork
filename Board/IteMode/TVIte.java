package IteMode;

public interface TVIte {
    void setChannel(int var1);

    void next();

    void previous();

    boolean isLast();

    boolean isFirst();

    Object currentChannel();
}

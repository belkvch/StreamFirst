package ex15first;

import java.io.*;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept (File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }
}

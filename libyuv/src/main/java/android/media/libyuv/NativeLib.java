package android.media.libyuv;

public class NativeLib {

    // Used to load the 'libyuv' library on application startup.
    static {
        System.loadLibrary("libyuv");
    }

    /**
     * A native method that is implemented by the 'libyuv' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
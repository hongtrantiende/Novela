package baidu.lac.jni;

import android.content.Context;

public final class LacLib {
    public static final LacLib INSTANCE = new LacLib();

    static {
        try {
            System.loadLibrary("paddle_light_api_shared");
            System.loadLibrary("lac_analyzer");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private LacLib() {
    }

    public static final native NativeToken[] analyze(long handle, String text);

    public static final native long create(Context context, String modelDir, int threadNum);

    public static final native void destroy(long handle);
}

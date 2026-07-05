package baidu.lac.jni;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class LacLib {
    public static final LacLib INSTANCE = new LacLib();

    static {
        System.loadLibrary("paddle_light_api_shared");
        System.loadLibrary("lac_analyzer");
    }

    private LacLib() {
    }

    public static final native NativeToken[] analyze(long j, String str);

    public static final native long create(Context context, String str, int i);

    public static final native void destroy(long j);
}

package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xt0  reason: default package */
/* loaded from: classes.dex */
public final class xt0 {
    public static final /* synthetic */ xt0 a = new Object();
    public static final String b = yt0.class.getSimpleName();

    public static yt0 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return zt0.a;
        }
        if (i >= 29) {
            return tn3.c;
        }
        if (i >= 28) {
            return zj1.c;
        }
        return p40.c;
    }
}

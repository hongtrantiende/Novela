package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cz0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class cz0 {
    public static /* synthetic */ int a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 36) {
            return i * 100000;
        }
        return Build.VERSION.SDK_INT_FULL;
    }
}

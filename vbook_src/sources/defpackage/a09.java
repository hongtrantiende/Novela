package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a09  reason: default package */
/* loaded from: classes.dex */
public final class a09 {
    public static final a09 c;
    public final String a;
    public final zz8 b;

    static {
        new a09("");
        c = new a09("preload");
    }

    public a09(String str) {
        zz8 zz8Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            zz8Var = new zz8(0);
        } else {
            zz8Var = null;
        }
        this.b = zz8Var;
    }

    public final synchronized LogSessionId a() {
        zz8 zz8Var;
        zz8Var = this.b;
        zz8Var.getClass();
        return (LogSessionId) zz8Var.a;
    }
}

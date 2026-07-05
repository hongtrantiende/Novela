package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l40  reason: default package */
/* loaded from: classes.dex */
public final class l40 {
    public static final l40 b = new Object();
    public AudioAttributes a;

    /* JADX WARN: Type inference failed for: r0v0, types: [l40, java.lang.Object] */
    static {
        a82.s(0, 1, 2, 3, 4);
        a2d.K(5);
        a2d.K(6);
    }

    public final AudioAttributes a() {
        if (this.a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                ff.y(usage);
                ff.a(usage);
            }
            if (i >= 32) {
                k40.b(usage);
                k40.a(usage);
            }
            this.a = usage.build();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l40.class == obj.getClass()) {
            l40 l40Var = (l40) obj;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -436042064;
    }
}

package defpackage;

import j$.time.ZoneOffset;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = n1d.class)
/* renamed from: f1d  reason: default package */
/* loaded from: classes3.dex */
public final class f1d implements Serializable {
    public static final e1d Companion = new Object();
    public static final f1d b;
    public final ZoneOffset a;

    /* JADX WARN: Type inference failed for: r0v0, types: [e1d, java.lang.Object] */
    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        b = new f1d(zoneOffset);
    }

    public f1d(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1d) {
            if (c16.i(this.a, ((f1d) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String zoneOffset = this.a.toString();
        zoneOffset.getClass();
        return zoneOffset;
    }
}

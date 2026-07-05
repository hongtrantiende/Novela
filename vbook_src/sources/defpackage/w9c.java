package defpackage;

import j$.time.ZoneId;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w9c  reason: default package */
/* loaded from: classes3.dex */
public class w9c {
    public static final /* synthetic */ int b = 0;
    public final ZoneId a;

    static {
        f1d.Companion.getClass();
        f1d f1dVar = f1d.b;
        ZoneId of = ZoneId.of("UTC");
        of.getClass();
        f1dVar.getClass();
        new w9c(of);
    }

    public w9c(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w9c) {
                if (!this.a.equals(((w9c) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String zoneId = this.a.toString();
        zoneId.getClass();
        return zoneId;
    }
}

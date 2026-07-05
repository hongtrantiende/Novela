package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tx3  reason: default package */
/* loaded from: classes.dex */
public final class tx3 {
    public final String a;
    public final long b;
    public final Map c;

    public tx3(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tx3) {
                tx3 tx3Var = (tx3) obj;
                if (!this.a.equals(tx3Var.a) || this.b != tx3Var.b || !c16.i(this.c, tx3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}

package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy4  reason: default package */
/* loaded from: classes.dex */
public final class oy4 {
    public final Map a;
    public final Map b;

    public oy4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4)) {
            return false;
        }
        oy4 oy4Var = (oy4) obj;
        if (c16.i(this.a, oy4Var.a) && c16.i(this.b, oy4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.a + ", providerNameToReceivers=" + this.b + ')';
    }
}

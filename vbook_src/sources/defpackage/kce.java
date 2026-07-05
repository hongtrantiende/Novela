package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kce  reason: default package */
/* loaded from: classes.dex */
public final class kce implements Serializable {
    public final Object a;

    public kce(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kce) {
            return nmd.H(this.a, ((kce) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return hl5.n("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}

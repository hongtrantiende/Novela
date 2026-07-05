package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hz6  reason: default package */
/* loaded from: classes3.dex */
public final class hz6 {
    public final boolean a;
    public final List b;

    public hz6(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz6)) {
            return false;
        }
        hz6 hz6Var = (hz6) obj;
        if (this.a == hz6Var.a && c16.i(this.b, hz6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LookupState(isLoading=" + this.a + ", lookups=" + this.b + ")";
    }
}

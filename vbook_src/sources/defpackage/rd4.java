package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rd4  reason: default package */
/* loaded from: classes3.dex */
public final class rd4 extends vd4 {
    public final Set a;

    public rd4(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rd4) && c16.i(this.a, ((rd4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "File(extensions=" + this.a + ")";
    }
}

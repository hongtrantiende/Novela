package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dc0  reason: default package */
/* loaded from: classes.dex */
public final class dc0 extends la2 {
    public final List a;

    public dc0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof la2) {
            return this.a.equals(((dc0) ((la2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return rs8.n(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}

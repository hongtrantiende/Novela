package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h7f  reason: default package */
/* loaded from: classes.dex */
public final class h7f {
    public final Class a;
    public final Class b;

    public h7f(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h7f) {
            h7f h7fVar = (h7f) obj;
            if (h7fVar.a.equals(this.a) && h7fVar.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return eub.o(this.a.getSimpleName(), " with serialization type: ", this.b.getSimpleName());
    }
}

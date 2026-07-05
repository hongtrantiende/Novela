package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p6f  reason: default package */
/* loaded from: classes.dex */
public final class p6f {
    public final Class a;
    public final Class b;

    public p6f(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p6f) {
            p6f p6fVar = (p6f) obj;
            if (p6fVar.a.equals(this.a) && p6fVar.b.equals(this.b)) {
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
        return eub.o(this.a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }
}

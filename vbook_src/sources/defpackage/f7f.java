package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f7f  reason: default package */
/* loaded from: classes.dex */
public final class f7f {
    public final Class a;
    public final hlf b;

    public f7f(Class cls, hlf hlfVar) {
        this.a = cls;
        this.b = hlfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f7f) {
            f7f f7fVar = (f7f) obj;
            if (f7fVar.a.equals(this.a) && f7fVar.b.equals(this.b)) {
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
        return eub.o(this.a.getSimpleName(), ", object identifier: ", String.valueOf(this.b));
    }
}

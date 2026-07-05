package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d4e  reason: default package */
/* loaded from: classes.dex */
public final class d4e {
    public final Object a;
    public final int b;

    public d4e(Object obj) {
        this.b = System.identityHashCode(obj);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d4e)) {
            return false;
        }
        d4e d4eVar = (d4e) obj;
        if (this.b != d4eVar.b || this.a != d4eVar.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }
}

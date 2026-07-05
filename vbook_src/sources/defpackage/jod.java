package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jod  reason: default package */
/* loaded from: classes.dex */
public final class jod implements iid {
    public final gid a;

    public jod(gid gidVar) {
        gidVar.getClass();
        this.a = gidVar;
        tm1.a("XYZ");
    }

    @Override // defpackage.iid
    public final gid d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jod) {
            if (c16.i(this.a, ((jod) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "XYZColorSpace(" + this.a + ')';
    }
}

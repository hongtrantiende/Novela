package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pva  reason: default package */
/* loaded from: classes3.dex */
public final class pva implements tva {
    public final String a;

    public pva(String str) {
        this.a = str;
        if (!k4b.j0(str)) {
            return;
        }
        vs.m("url must not be blank; use LinkUrlPolicy.validate before constructing Link");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pva) || !this.a.equals(((pva) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("Link(url=", this.a, ")");
    }
}

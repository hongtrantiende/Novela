package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mva  reason: default package */
/* loaded from: classes3.dex */
public final class mva implements tva {
    public final String a;

    public mva(String str) {
        str.getClass();
        this.a = str;
        if (!k4b.j0(str)) {
            return;
        }
        vs.m("url must not be blank");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mva) && c16.i(this.a, ((mva) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("InlineImage(url=", this.a, ")");
    }
}

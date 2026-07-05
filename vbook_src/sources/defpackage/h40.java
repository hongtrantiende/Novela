package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h40  reason: default package */
/* loaded from: classes3.dex */
public final class h40 {
    public final String a;
    public final isc b;

    public h40(String str, isc iscVar) {
        this.a = str;
        this.b = iscVar;
        if (!k4b.j0(str)) {
            return;
        }
        vs.m("Name can't be blank");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h40) {
                h40 h40Var = (h40) obj;
                if (!this.a.equals(h40Var.a) || !this.b.equals(h40Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }
}

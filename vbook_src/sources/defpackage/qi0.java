package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qi0  reason: default package */
/* loaded from: classes.dex */
public final class qi0 {
    public final String a;
    public final String b;

    public qi0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final void a(o45 o45Var) {
        o45Var.getClass();
        String m = kxe.m(r4b.H(this.a + ":" + this.b));
        StringBuilder sb = new StringBuilder("Basic ");
        sb.append(m);
        o45Var.h("Authorization", sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi0)) {
            return false;
        }
        qi0 qi0Var = (qi0) obj;
        if (c16.i(this.a, qi0Var.a) && c16.i(this.b, qi0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("BasicAuthAuthentication(username=", this.a, ", password=", this.b, ")");
    }
}

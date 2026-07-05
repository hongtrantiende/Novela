package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zxc  reason: default package */
/* loaded from: classes3.dex */
public final class zxc implements mo3 {
    public final String a;
    public final apa b;

    public zxc(String str, apa apaVar) {
        str.getClass();
        apaVar.getClass();
        this.a = str;
        this.b = apaVar;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        xoa xoaVar = so3Var.e;
        if (xoaVar == null) {
            return so3Var;
        }
        return so3.a(so3Var, null, null, null, null, xoa.a(xoaVar, this.a, this.b, null, null, 25), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxc)) {
            return false;
        }
        zxc zxcVar = (zxc) obj;
        if (c16.i(this.a, zxcVar.a) && c16.i(this.b, zxcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateSlashCommandSession(query=" + this.a + ", queryRange=" + this.b + ")";
    }
}

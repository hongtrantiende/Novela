package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fd8  reason: default package */
/* loaded from: classes3.dex */
public final class fd8 implements mo3 {
    public final String a;
    public final apa b;
    public final String c;

    public fd8(String str, apa apaVar, String str2) {
        str.getClass();
        apaVar.getClass();
        str2.getClass();
        this.a = str;
        this.b = apaVar;
        this.c = str2;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        return so3.a(so3Var, null, null, null, null, new xoa(this.a, this.c, this.b, ks3.a, null), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd8)) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        if (c16.i(this.a, fd8Var.a) && c16.i(this.b, fd8Var.b) && c16.i(this.c, fd8Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        StringBuilder sb = new StringBuilder("OpenSlashCommand(anchorBlockId=");
        sb.append(a);
        sb.append(", queryRange=");
        sb.append(this.b);
        sb.append(", initialQuery=");
        return s21.q(sb, this.c, ")");
    }
}

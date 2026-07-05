package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g65  reason: default package */
/* loaded from: classes3.dex */
public final class g65 implements mo3 {
    public final String a;

    public g65(String str) {
        this.a = str;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        xoa xoaVar = so3Var.e;
        if (xoaVar == null) {
            return so3Var;
        }
        return so3.a(so3Var, null, null, null, null, xoa.a(xoaVar, null, null, null, this.a, 15), 15);
    }

    public final boolean equals(Object obj) {
        boolean i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g65)) {
            return false;
        }
        String str = ((g65) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                i = true;
            }
            i = false;
        } else {
            if (str != null) {
                i = c16.i(str2, str);
            }
            i = false;
        }
        if (i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String a;
        String str = this.a;
        if (str == null) {
            a = "null";
        } else {
            a = noa.a(str);
        }
        return hl5.n("HighlightSlashCommand(commandId=", a, ")");
    }
}

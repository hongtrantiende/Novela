package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bm4  reason: default package */
/* loaded from: classes3.dex */
public final class bm4 implements mo3 {
    public final String a;

    public bm4(String str) {
        this.a = str;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        String str = this.a;
        if (str != null) {
            return so3.a(so3Var, null, str, rs3.a, null, null, 25);
        }
        return so3.a(so3Var, null, null, null, null, null, 29);
    }

    public final boolean equals(Object obj) {
        boolean i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm4)) {
            return false;
        }
        String str = ((bm4) obj).a;
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
            a = pm0.a(str);
        }
        return hl5.n("FocusBlock(blockId=", a, ")");
    }
}

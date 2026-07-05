package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh4  reason: default package */
/* loaded from: classes3.dex */
public final class jh4 implements qid {
    @Override // defpackage.qid
    public final int a(r13 r13Var) {
        return r13Var.X0(nae.e);
    }

    @Override // defpackage.qid
    public final int b(r13 r13Var, tc6 tc6Var) {
        return r13Var.X0(nae.e);
    }

    @Override // defpackage.qid
    public final int c(r13 r13Var) {
        return r13Var.X0(nae.e);
    }

    @Override // defpackage.qid
    public final int d(r13 r13Var, tc6 tc6Var) {
        return r13Var.X0(nae.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof jh4) && rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(nae.e) + nk2.d(nae.e, nk2.d(nae.e, Float.hashCode(nae.e) * 31, 31), 31);
    }

    public final String toString() {
        String c = rg3.c(nae.e);
        String c2 = rg3.c(nae.e);
        return nk2.w(nk2.y("Insets(left=", c, ", top=", c2, ", right="), rg3.c(nae.e), ", bottom=", rg3.c(nae.e), ")");
    }
}

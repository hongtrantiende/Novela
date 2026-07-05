package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c13  reason: default package */
/* loaded from: classes3.dex */
public final class c13 implements mo3 {
    public final String a;

    public c13(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        return new d13(fca.B(new pm0(this.a))).a(so3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c13) && c16.i(this.a, ((c13) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("DeleteBlock(blockId=", pm0.a(this.a), ")");
    }
}

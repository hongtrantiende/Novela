package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t68  reason: default package */
/* loaded from: classes3.dex */
public final class t68 implements s76 {
    public final s76 a;
    public final p9a b;

    public t68(s76 s76Var) {
        s76Var.getClass();
        this.a = s76Var;
        this.b = new p9a(s76Var.e());
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        if (obj != null) {
            jbeVar.G(this.a, obj);
        } else {
            jbeVar.D();
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        if (yq2Var.w()) {
            return yq2Var.d(this.a);
        }
        return null;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t68.class == obj.getClass() && c16.i(this.a, ((t68) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

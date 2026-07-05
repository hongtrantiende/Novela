package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kha  reason: default package */
/* loaded from: classes.dex */
public final class kha extends fb6 implements mu4 {
    public final /* synthetic */ qr a;
    public final /* synthetic */ eu3 b;
    public final /* synthetic */ lz3 c;
    public final /* synthetic */ iha d;
    public final /* synthetic */ nz9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kha(qr qrVar, eu3 eu3Var, lz3 lz3Var, iha ihaVar, nz9 nz9Var) {
        super(3);
        this.a = qrVar;
        this.b = eu3Var;
        this.c = lz3Var;
        this.d = ihaVar;
        this.e = nz9Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        nq7 nq7Var = (nq7) obj;
        rv4 rv4Var = (rv4) obj2;
        ((Number) obj3).intValue();
        rv4Var.e0(-233734437);
        tkc a = this.a.a();
        iha ihaVar = this.d;
        boolean h = rv4Var.h(ihaVar);
        Object P = rv4Var.P();
        Object obj4 = ax1.a;
        if (h || P == obj4) {
            P = new jha(ihaVar, 0);
            rv4Var.o0(P);
        }
        String i = rs8.i(ihaVar.a, "enter/exit for ");
        nq7 b = zt3.b(a, this.b, this.c, (vt4) P, null, i, rv4Var, 0, 20);
        rv4Var.e0(-1039792755);
        boolean h2 = rv4Var.h(ihaVar);
        Object P2 = rv4Var.P();
        if (h2 || P2 == obj4) {
            P2 = new jha(ihaVar, 1);
            rv4Var.o0(P2);
        }
        vt4 vt4Var = (vt4) P2;
        u22 u22Var = r0f.C;
        u22 u22Var2 = r0f.d;
        nq7 nq7Var2 = kq7.a;
        if (u22Var == u22Var2) {
            nq7Var2 = axe.k(nq7Var2, new ko9(vt4Var, 7));
        }
        nq7 a0 = nq7Var2.a0(new zna(this.e, vt4Var));
        rv4Var.q(false);
        nq7 a02 = b.a0(a0);
        rv4Var.q(false);
        return a02;
    }
}

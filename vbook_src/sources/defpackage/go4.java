package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go4  reason: default package */
/* loaded from: classes.dex */
public final class go4 implements do4 {
    public final ej a;
    public final fj b;
    public final s26 c;
    public final oo4 d;
    public final k57 e;
    public final fo4 f;

    public go4(ej ejVar, fj fjVar) {
        s26 s26Var = ho4.a;
        oo4 oo4Var = new oo4(ho4.b);
        k57 k57Var = new k57(2);
        this.a = ejVar;
        this.b = fjVar;
        this.c = s26Var;
        this.d = oo4Var;
        this.e = k57Var;
        this.f = new fo4(this, 0);
    }

    public final ctc a(zsc zscVar) {
        s26 s26Var = this.c;
        j34 j34Var = new j34(3, this, zscVar);
        synchronized (((v28) s26Var.b)) {
            ctc ctcVar = (ctc) ((ypa) s26Var.c).h(zscVar);
            if (ctcVar != null) {
                if (ctcVar.c()) {
                    return ctcVar;
                }
                ctc ctcVar2 = (ctc) ((ypa) s26Var.c).n(zscVar);
            }
            try {
                ctc ctcVar3 = (ctc) j34Var.invoke(new t3c(11, s26Var, zscVar));
                synchronized (((v28) s26Var.b)) {
                    if (((ypa) s26Var.c).h(zscVar) == null && ctcVar3.c()) {
                        ((ypa) s26Var.c).m(zscVar, ctcVar3);
                    }
                }
                return ctcVar3;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final ctc b(eo4 eo4Var, dq4 dq4Var, int i, int i2) {
        dq4 dq4Var2;
        fj fjVar = this.b;
        fjVar.getClass();
        int i3 = fjVar.a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            dq4Var2 = new dq4(dce.n(dq4Var.a + i3, 1, 1000));
        } else {
            dq4Var2 = dq4Var;
        }
        this.a.getClass();
        return a(new zsc(eo4Var, dq4Var2, i, i2, null));
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be5  reason: default package */
/* loaded from: classes.dex */
public final class be5 extends de5 {
    public be5() {
        super("Initial", 0);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (lh9.p(de5.a, dccVar)) {
            return true;
        }
        if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        }
        boolean b = dccVar.b();
        tc3 tc3Var = tc3.b;
        ld5 ld5Var = de5.c;
        if (b) {
            vbc vbcVar = (vbc) dccVar;
            fd3 fd3Var = new fd3(ed5Var.m().b(vbcVar.d.V()), vbcVar.f.V(), vbcVar.g.V());
            String str = vbcVar.e;
            if (str != null) {
                fd3Var.d("pubSysKey", str);
            }
            ed5Var.j().H(fd3Var);
            if (vbcVar.h || !fd3Var.c("name").equals("html") || fd3Var.c("publicId").equalsIgnoreCase("HTML")) {
                ed5Var.j().K = tc3Var;
            }
            ed5Var.l = ld5Var;
            return true;
        }
        ed5Var.j().K = tc3Var;
        ed5Var.l = ld5Var;
        return ed5Var.s(dccVar);
    }
}

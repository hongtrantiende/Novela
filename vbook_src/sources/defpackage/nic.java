package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nic  reason: default package */
/* loaded from: classes3.dex */
public final class nic implements mu4 {
    public final /* synthetic */ ui3 C;
    public final /* synthetic */ xt4 D;
    public final /* synthetic */ ddd a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ jrd c;
    public final /* synthetic */ List d;
    public final /* synthetic */ rk9 e;
    public final /* synthetic */ xt4 f;

    public nic(ddd dddVar, aw7 aw7Var, jrd jrdVar, List list, rk9 rk9Var, xt4 xt4Var, ui3 ui3Var, xt4 xt4Var2) {
        this.a = dddVar;
        this.b = aw7Var;
        this.c = jrdVar;
        this.d = list;
        this.e = rk9Var;
        this.f = xt4Var;
        this.C = ui3Var;
        this.D = xt4Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [zl9, java.lang.Object] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        nq7 nq7Var = (nq7) obj;
        rv4 rv4Var = (rv4) obj2;
        ((Number) obj3).intValue();
        nq7Var.getClass();
        rv4Var.e0(-694765045);
        rv4Var.e0(-1949275820);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        ddd dddVar = this.a;
        h23 h23Var = dddVar.e;
        float floatValue = ((Number) h23Var.getValue()).floatValue();
        rv4Var.e0(-1633490746);
        boolean c = rv4Var.c(floatValue) | rv4Var.c(20.0f);
        Object P = rv4Var.P();
        if (c || P == ax1.a) {
            P = Float.valueOf(r13Var.L0(20.0f) / ((Number) h23Var.getValue()).floatValue());
            rv4Var.o0(P);
        }
        float floatValue2 = ((Number) P).floatValue();
        rv4Var.q(false);
        rv4Var.q(false);
        aw7 aw7Var = this.b;
        jrd jrdVar = this.c;
        mic micVar = new mic(dddVar, aw7Var, dddVar, jrdVar, aw7Var);
        List list = this.d;
        rk9 rk9Var = this.e;
        xt4 xt4Var = this.f;
        lic licVar = new lic(dddVar, list, rk9Var, floatValue2 * floatValue2, xt4Var, this.C, dddVar, jrdVar, this.D, xt4Var);
        rv4Var.e0(-259642354);
        zg4 zg4Var = new zg4(1, yae.D(micVar, rv4Var), yae.D(licVar, rv4Var), yae.D(new Object(), rv4Var));
        rv4Var.q(false);
        ?? obj4 = new Object();
        obj4.a = new bx4();
        fx4 fx4Var = new fx4(zg4Var, (zl9) obj4);
        pvc pvcVar = pvc.a;
        nq7 b = dab.b(dab.b(nq7Var, pvcVar, fx4Var), pvcVar, new fx4((zl9) obj4, zg4Var));
        rv4Var.q(false);
        return b;
    }
}

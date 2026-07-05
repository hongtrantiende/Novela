package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss6  reason: default package */
/* loaded from: classes3.dex */
public final class ss6 extends aab implements lu4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.C = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ss6 ss6Var = new ss6((lq) obj5, (List) obj3, (em8) obj2, (dm8) this.C, (lq) obj4, m42Var);
                ss6Var.b = obj;
                return ss6Var;
            case 1:
                return new ss6((po5) this.b, (up5) obj5, (mrd) obj4, (wc4) obj3, (wn5) obj2, this.C, m42Var, 1);
            default:
                return new ss6((cyb) this.b, (h2a) obj5, (kob) obj4, (aw7) obj3, (aw7) obj2, this.C, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((ss6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((ss6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ss6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        g7b g7bVar = null;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f;
        aw7 aw7Var = this.C;
        switch (i) {
            case 0:
                hre.r(obj);
                m82 m82Var = (m82) this.b;
                lq lqVar = (lq) obj2;
                List list = (List) obj3;
                em8 em8Var = (em8) obj5;
                dm8 dm8Var = (dm8) aw7Var;
                lq lqVar2 = (lq) obj4;
                if (m82Var.q().get(cne.f) == null) {
                    z87.v(m82Var, null, null, new xr0(lqVar, list, em8Var, dm8Var, (m42) null), 3);
                    z87.v(m82Var, null, null, new ot0(lqVar2, null, 4), 3);
                    return pvcVar;
                }
                vm1.h();
                return null;
            case 1:
                hre.r(obj);
                up5 up5Var = (up5) obj2;
                ((mu4) aw7Var.getValue()).c(((po5) this.b).f, new Integer(up5Var.d), new Integer(up5Var.e));
                mrd mrdVar = (mrd) obj4;
                mrdVar.b.d(m8c.a);
                btd btdVar = mrdVar.a;
                qh9 qh9Var = qh9.a;
                btdVar.F.setValue(qh9Var);
                yrd yrdVar = btdVar.c;
                yrdVar.getClass();
                zr1.A();
                if (!c16.i(yrdVar.j, qh9Var)) {
                    yrdVar.j = qh9Var;
                    qw6 qw6Var = yrdVar.a;
                    qw6Var.getClass();
                    mw6 mw6Var = mw6.b;
                    if (qw6Var.a(mw6Var)) {
                        pj pjVar = qw6Var.b;
                        String str = qw6Var.a;
                        pjVar.getClass();
                        pj.a(mw6Var, str, "ZoomableState. readMode=" + qh9Var);
                    }
                    yrd.e(yrdVar, "readModeChanged");
                }
                wc4 wc4Var = (wc4) obj3;
                wn5 wn5Var = (wn5) obj5;
                b7b b7bVar = mrdVar.b.e;
                if (wc4Var != null) {
                    b7bVar.getClass();
                    g7bVar = new g7b(new aq5(wc4Var), wn5Var);
                }
                b7bVar.h(g7bVar);
                return pvcVar;
            default:
                aw7 aw7Var2 = (aw7) obj5;
                kob kobVar = (kob) obj4;
                aw7 aw7Var3 = (aw7) obj3;
                h2a h2aVar = (h2a) obj2;
                hre.r(obj);
                cyb cybVar = (cyb) this.b;
                p7a d = cybVar.d();
                hm8 hm8Var = cybVar.d;
                if (d == p7a.c) {
                    pwb c = cybVar.c();
                    c3c c3cVar = k3c.a;
                    long i2 = k3c.a(c, ((Number) aw7Var3.getValue()).intValue(), h2aVar.i().j().k, h2aVar.i().j().p, kobVar.b).i();
                    float floatValue = ((Number) aw7Var2.getValue()).floatValue();
                    float floatValue2 = ((Number) aw7Var.getValue()).floatValue();
                    long j = y78.j(i2, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
                    long c2 = k3c.a(cybVar.b(), ((Number) aw7Var3.getValue()).intValue(), h2aVar.i().j().k, h2aVar.i().j().p, kobVar.b).c();
                    float floatValue3 = ((Number) aw7Var2.getValue()).floatValue();
                    float floatValue4 = ((Number) aw7Var.getValue()).floatValue();
                    long j2 = y78.j(c2, (Float.floatToRawIntBits(floatValue4) & 4294967295L) | (Float.floatToRawIntBits(floatValue3) << 32));
                    int i3 = (Float.intBitsToFloat((int) (j & 4294967295L)) > (((int) (h2aVar.j() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) ? 1 : (Float.intBitsToFloat((int) (j & 4294967295L)) == (((int) (h2aVar.j() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) ? 0 : -1));
                    hm8 hm8Var2 = cybVar.e;
                    if (i3 > 0) {
                        hm8Var2.setValue(i6a.a);
                        hm8Var.setValue(new y78(j));
                    } else {
                        hm8Var2.setValue(i6a.b);
                        hm8Var.setValue(new y78(j2));
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss6(lq lqVar, List list, em8 em8Var, dm8 dm8Var, lq lqVar2, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.c = lqVar;
        this.e = list;
        this.f = em8Var;
        this.C = dm8Var;
        this.d = lqVar2;
    }
}

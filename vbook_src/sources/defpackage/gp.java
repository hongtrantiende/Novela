package defpackage;

import android.graphics.Canvas;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gp  reason: default package */
/* loaded from: classes.dex */
public final class gp extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(wcd wcdVar, od6 od6Var, wcd wcdVar2) {
        super(1);
        this.a = 0;
        this.b = wcdVar;
        this.d = od6Var;
        this.c = wcdVar2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object[] objArr;
        zj3 zj3Var;
        int i = this.a;
        qnc qncVar = qnc.a;
        rg rgVar = null;
        ih3 ih3Var = null;
        pvc pvcVar = pvc.a;
        boolean z = true;
        boolean z2 = false;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                wcd wcdVar = (wcd) obj4;
                od6 od6Var = (od6) obj2;
                wcd wcdVar2 = (wcd) obj3;
                k61 w = ((ak3) obj).Q0().w();
                if (wcdVar.getView().getVisibility() != 8) {
                    wcdVar.U = true;
                    wg8 wg8Var = od6Var.K;
                    if (wg8Var instanceof rg) {
                        rgVar = (rg) wg8Var;
                    }
                    if (rgVar != null) {
                        Canvas a = tf.a(w);
                        if (rgVar.l0 != null) {
                            wcdVar2.draw(a);
                        }
                    }
                    wcdVar.U = false;
                }
                return pvcVar;
            case 1:
                ib3 ib3Var = (ib3) obj;
                return new qq(0, (ora) obj4, obj3, (er) obj2);
            case 2:
                if (((Boolean) obj).booleanValue() == ((Boolean) ((vt0) obj4).b.d.getValue()).booleanValue()) {
                    return (rk9) obj3;
                }
                return (rk9) obj2;
            case 3:
                hh3 hh3Var = (hh3) obj;
                if (!hh3Var.J) {
                    return qnc.b;
                }
                if (hh3Var.M != null) {
                    lv5.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                xt4 xt4Var = hh3Var.K;
                if (xt4Var != null) {
                    ih3Var = (ih3) xt4Var.invoke((bh3) obj4);
                }
                hh3Var.M = ih3Var;
                if (ih3Var != null) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (objArr != null) {
                    ((si) ((rg) voe.w((hh3) obj3)).getDragAndDropManager()).b.add(hh3Var);
                }
                vl9 vl9Var = (vl9) obj2;
                if (!vl9Var.a && objArr == null) {
                    z = false;
                }
                vl9Var.a = z;
                return qncVar;
            case 4:
                rnc rncVar = (rnc) obj;
                hh3 hh3Var2 = (hh3) rncVar;
                if (((si) ((rg) voe.w((hh3) obj3)).getDragAndDropManager()).b.contains(hh3Var2) && rte.j(hh3Var2, tte.p((bh3) obj2))) {
                    ((zl9) obj4).a = rncVar;
                    return qnc.c;
                }
                return qncVar;
            case 5:
                hn4 hn4Var = (hn4) obj;
                if (!c16.i(hn4Var, (hn4) obj4)) {
                    if (!c16.i(hn4Var, ((rm4) obj3).c)) {
                        z2 = ((Boolean) ((xt4) obj2).invoke(hn4Var)).booleanValue();
                    } else {
                        vs.k("Focus search landed at the root.");
                        return null;
                    }
                }
                return Boolean.valueOf(z2);
            case 6:
                ak3 ak3Var = (ak3) obj;
                qd6 qd6Var = (qd6) obj4;
                n61 n61Var = qd6Var.a;
                zj3 zj3Var2 = qd6Var.b;
                qd6Var.b = (zj3) obj3;
                try {
                    r13 B = ak3Var.Q0().B();
                    tc6 D = ak3Var.Q0().D();
                    k61 w2 = ak3Var.Q0().w();
                    long G = ak3Var.Q0().G();
                    p15 p15Var = (p15) ak3Var.Q0().c;
                    xt4 xt4Var2 = (xt4) obj2;
                    r13 B2 = n61Var.b.B();
                    tc6 D2 = n61Var.b.D();
                    k61 w3 = n61Var.b.w();
                    long G2 = n61Var.b.G();
                    ij1 ij1Var = n61Var.b;
                    try {
                        p15 p15Var2 = (p15) ij1Var.c;
                        ij1Var.W(B);
                        ij1Var.X(D);
                        ij1Var.V(w2);
                        ij1Var.Y(G);
                        ij1Var.c = p15Var;
                        w2.i();
                        try {
                            xt4Var2.invoke(qd6Var);
                            w2.q();
                            ij1 ij1Var2 = n61Var.b;
                            ij1Var2.W(B2);
                            ij1Var2.X(D2);
                            ij1Var2.V(w3);
                            ij1Var2.Y(G2);
                            ij1Var2.c = p15Var2;
                            qd6Var.b = zj3Var2;
                            return pvcVar;
                        } catch (Throwable th) {
                            zj3Var = zj3Var2;
                            try {
                                w2.q();
                                ij1 ij1Var3 = n61Var.b;
                                ij1Var3.W(B2);
                                ij1Var3.X(D2);
                                ij1Var3.V(w3);
                                ij1Var3.Y(G2);
                                ij1Var3.c = p15Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                qd6Var.b = zj3Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zj3Var = zj3Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    zj3Var = zj3Var2;
                }
            case 7:
                af6 af6Var = (af6) obj;
                af6Var.getClass();
                long b = af6Var.b();
                mo9 mo9Var = (mo9) obj4;
                if (!((Boolean) mo9Var.i.invoke((rk9) obj3, npe.n(oue.p((int) (b >> 32), (int) (b & 4294967295L)), eg0.A(af6Var.a())))).booleanValue() || !mo9Var.r.contains(af6Var.getKey()) || !((Boolean) ((xt4) obj2).invoke(af6Var)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                jac jacVar = (jac) obj4;
                iac iacVar = (iac) obj3;
                if (wl3.c(jacVar.a(), iacVar.b) < 0) {
                    long j = iacVar.b;
                    AtomicReference atomicReference = jacVar.b;
                    aoa aoaVar = new aoa(j, 1);
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Object invoke = aoaVar.invoke(obj5);
                        while (!atomicReference.compareAndSet(obj5, invoke)) {
                            if (atomicReference.get() != obj5) {
                                break;
                            }
                        }
                    }
                }
                z87.v(jacVar, null, null, new kz5((lz5) obj2, null, 1), 3);
                return pvcVar;
            default:
                lw8 lw8Var = (lw8) obj;
                sc6 j2 = lw8Var.j();
                if (j2 != null) {
                    boolean I0 = ((e37) obj4).I0();
                    lha lhaVar = ((rha) obj3).K;
                    if (!I0) {
                        lhaVar.e = j2;
                    } else {
                        lhaVar.f = j2;
                    }
                }
                lw8Var.o((mw8) obj2, 0, 0, nae.e);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}

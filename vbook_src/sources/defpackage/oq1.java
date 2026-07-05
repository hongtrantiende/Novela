package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oq1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7a b;
    public final /* synthetic */ tu1 c;

    public /* synthetic */ oq1(tu1 tu1Var, f7a f7aVar) {
        this.a = 2;
        this.c = tu1Var;
        this.b = f7aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean i;
        Object j6aVar;
        oq9 oq9Var;
        f6a f6aVar;
        cu7 f;
        int i2;
        f6a f6aVar2;
        cu7 f2;
        boolean z2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        f7a f7aVar = this.b;
        tu1 tu1Var = this.c;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                qwe.a(f7aVar, tu1Var, (rv4) obj, xoe.p(49));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                q0f.a(f7aVar, tu1Var, (rv4) obj, xoe.p(49));
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = 1;
                int i5 = 0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    tu1Var.invoke(rv4Var, 0);
                    if (f7aVar.j() && ((Boolean) f7aVar.E.getValue()).booleanValue()) {
                        g6a i6 = f7aVar.i();
                        if (i6 == null) {
                            i = true;
                        } else {
                            i = c16.i(i6.a, i6.b);
                        }
                        if (!i) {
                            rv4Var.e0(1202520707);
                            g6a i7 = f7aVar.i();
                            if (i7 == null) {
                                rv4Var.e0(-1376563746);
                                rv4Var.q(false);
                                z2 = false;
                            } else {
                                rv4Var.e0(-1376563745);
                                rv4Var.e0(1202522235);
                                List B = tl1.B(Boolean.TRUE, Boolean.FALSE);
                                int size = B.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    boolean booleanValue = ((Boolean) B.get(i8)).booleanValue();
                                    boolean g = rv4Var.g(booleanValue);
                                    Object P = rv4Var.P();
                                    Object obj3 = ax1.a;
                                    if (g || P == obj3) {
                                        P = new e7a(booleanValue, f7aVar);
                                        rv4Var.o0(P);
                                    }
                                    npb npbVar = (npb) P;
                                    boolean g2 = rv4Var.g(booleanValue);
                                    Object P2 = rv4Var.P();
                                    if (g2 || P2 == obj3) {
                                        if (booleanValue) {
                                            j6aVar = new j6a(f7aVar, i5);
                                        } else {
                                            j6aVar = new j6a(f7aVar, i4);
                                        }
                                        P2 = j6aVar;
                                        rv4Var.o0(P2);
                                    }
                                    vt4 vt4Var = (vt4) P2;
                                    if (booleanValue) {
                                        oq9Var = i7.a.a;
                                    } else {
                                        oq9Var = i7.b.a;
                                    }
                                    float f3 = nae.e;
                                    if (booleanValue) {
                                        g6a i9 = f7aVar.i();
                                        if (i9 != null && (f2 = f7aVar.f((f6aVar2 = i9.a))) != null) {
                                            int i10 = f6aVar2.b;
                                            fvb fvbVar = (fvb) f2.c.invoke();
                                            if (fvbVar != null) {
                                                f3 = nye.u(fvbVar, i10);
                                            }
                                        }
                                    } else {
                                        g6a i11 = f7aVar.i();
                                        if (i11 != null && (f = f7aVar.f((f6aVar = i11.b))) != null) {
                                            int i12 = f6aVar.b;
                                            fvb fvbVar2 = (fvb) f.c.invoke();
                                            if (fvbVar2 != null) {
                                                f3 = nye.u(fvbVar2, i12);
                                            }
                                        }
                                    }
                                    int i13 = i8;
                                    o6a o6aVar = new o6a(vt4Var);
                                    boolean z3 = i7.c;
                                    boolean h = rv4Var.h(npbVar);
                                    Object P3 = rv4Var.P();
                                    if (!h && P3 != obj3) {
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                        P3 = new n6a(npbVar, 0);
                                        rv4Var.o0(P3);
                                    }
                                    qre.n(o6aVar, booleanValue, oq9Var, z3, 0L, f3, dab.b(kq7.a, npbVar, (PointerInputEventHandler) P3), rv4Var, 0, 16);
                                    i8 = i13 + 1;
                                    i5 = i2;
                                    i4 = 1;
                                    i7 = i7;
                                }
                                boolean z4 = i5;
                                rv4Var.q(z4);
                                rv4Var.q(z4);
                                z2 = z4;
                            }
                            rv4Var.q(z2);
                        }
                    }
                    rv4Var.e0(-1374590254);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ oq1(f7a f7aVar, tu1 tu1Var, int i, int i2) {
        this.a = i2;
        this.b = f7aVar;
        this.c = tu1Var;
    }
}

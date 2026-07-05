package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy6  reason: default package */
/* loaded from: classes.dex */
public final class wy6 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy6(xy6 xy6Var, int i) {
        super(0);
        this.a = i;
        this.b = xy6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ty6 C1;
        int i = this.a;
        kv7 kv7Var = null;
        r1 = null;
        r1 = null;
        lw8 lw8Var = null;
        pvc pvcVar = pvc.a;
        xy6 xy6Var = this.b;
        switch (i) {
            case 0:
                sd6 sd6Var = xy6Var.f;
                sd6Var.h = 0;
                gw7 z = sd6Var.a.z();
                Object[] objArr = z.a;
                int i2 = z.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    xy6 xy6Var2 = ((od6) objArr[i3]).d0.q;
                    xy6Var2.getClass();
                    xy6Var2.D = xy6Var2.E;
                    xy6Var2.E = Integer.MAX_VALUE;
                    if (xy6Var2.F == md6.b) {
                        xy6Var2.F = md6.c;
                    }
                }
                od6 od6Var = sd6Var.a;
                od6 od6Var2 = sd6Var.a;
                gw7 z2 = od6Var.z();
                Object[] objArr2 = z2.a;
                int i4 = z2.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    xy6 xy6Var3 = ((od6) objArr2[i5]).d0.q;
                    xy6Var3.getClass();
                    xy6Var3.O.d = false;
                }
                vv5 vv5Var = xy6Var.n().v0;
                if (vv5Var != null) {
                    iv7 iv7Var = (iv7) od6Var2.o();
                    int i6 = ((gw7) iv7Var.b).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        od6 od6Var3 = (od6) iv7Var.get(i7);
                        ty6 C12 = ((i38) od6Var3.c0.e).C1();
                        if (C12 != null) {
                            if (C12.K) {
                                if (kv7Var == null) {
                                    kv7Var = new kv7();
                                }
                                kv7Var.a(od6Var3);
                            }
                            C12.K = vv5Var.K;
                        }
                    }
                    vv5Var.V0().a();
                    iv7 iv7Var2 = (iv7) od6Var2.o();
                    int i8 = ((gw7) iv7Var2.b).c;
                    int i9 = 0;
                    while (true) {
                        boolean z3 = true;
                        if (i9 < i8) {
                            od6 od6Var4 = (od6) iv7Var2.get(i9);
                            z3 = (kv7Var == null || kv7Var.g(od6Var4) < 0) ? false : false;
                            ty6 C13 = ((i38) od6Var4.c0.e).C1();
                            if (C13 != null) {
                                C13.K = z3;
                            }
                            i9++;
                        } else {
                            gw7 z4 = od6Var2.z();
                            Object[] objArr3 = z4.a;
                            int i10 = z4.c;
                            for (int i11 = 0; i11 < i10; i11++) {
                                xy6 xy6Var4 = ((od6) objArr3[i11]).d0.q;
                                xy6Var4.getClass();
                                int i12 = xy6Var4.D;
                                int i13 = xy6Var4.E;
                                if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                                    xy6Var4.M0(true);
                                }
                            }
                            gw7 z5 = od6Var2.z();
                            Object[] objArr4 = z5.a;
                            int i14 = z5.c;
                            for (int i15 = 0; i15 < i14; i15++) {
                                xy6 xy6Var5 = ((od6) objArr4[i15]).d0.q;
                                xy6Var5.getClass();
                                pd6 pd6Var = xy6Var5.O;
                                pd6Var.e = pd6Var.d;
                            }
                            return pvcVar;
                        }
                    }
                } else {
                    vs.k("Expected lookahead delegate");
                    return null;
                }
                break;
            case 1:
                sd6 sd6Var2 = xy6Var.f;
                if (!xbe.F(sd6Var2.a) && !sd6Var2.c) {
                    i38 i38Var = sd6Var2.a().S;
                    if (i38Var != null && (C1 = i38Var.C1()) != null) {
                        lw8Var = C1.L;
                    }
                } else {
                    i38 i38Var2 = sd6Var2.a().S;
                    if (i38Var2 != null) {
                        lw8Var = i38Var2.L;
                    }
                }
                if (lw8Var == null) {
                    lw8Var = ((rg) rd6.a(sd6Var2.a)).getPlacementScope();
                }
                ty6 C14 = sd6Var2.a().C1();
                C14.getClass();
                lw8.t(lw8Var, C14, xy6Var.K);
                return pvcVar;
            default:
                ty6 C15 = xy6Var.f.a().C1();
                C15.getClass();
                C15.M(xy6Var.V);
                return pvcVar;
        }
    }
}

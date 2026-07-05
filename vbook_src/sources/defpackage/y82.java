package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y82  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y82 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2a b;

    public /* synthetic */ y82(h2a h2aVar, int i) {
        this.a = i;
        this.b = h2aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ij1 Q0;
        long G;
        int i = this.a;
        pvc pvcVar = pvc.a;
        h2a h2aVar = this.b;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                float f = a92.b;
                ak3Var.getClass();
                int ordinal = h2aVar.f().ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        float e = h2aVar.e();
                        uf ufVar = h2aVar.h;
                        if (ufVar != null) {
                            ufVar.a(ak3Var.Q0().w());
                        }
                        Q0 = ak3Var.Q0();
                        G = Q0.G();
                        Q0.w().i();
                        try {
                            mu9 mu9Var = (mu9) Q0.b;
                            ij1 ij1Var = (ij1) mu9Var.a;
                            mu9.E(mu9Var, dce.m((-Float.intBitsToFloat((int) (ij1Var.G() >> 32))) + e, -Float.intBitsToFloat((int) (ij1Var.G() >> 32)), nae.e), nae.e, 2);
                            uf ufVar2 = h2aVar.j;
                            if (ufVar2 != null) {
                                ufVar2.a(ak3Var.Q0().w());
                            }
                            Q0.w().q();
                            Q0.Y(G);
                            a92.b(ak3Var, dce.m(e, -ak3Var.L0(f), Float.intBitsToFloat((int) (ak3Var.b() >> 32))));
                        } finally {
                        }
                    }
                } else {
                    float e2 = h2aVar.e() - h2aVar.c;
                    uf ufVar3 = h2aVar.i;
                    if (ufVar3 != null) {
                        ufVar3.a(ak3Var.Q0().w());
                    }
                    Q0 = ak3Var.Q0();
                    G = Q0.G();
                    Q0.w().i();
                    try {
                        mu9 mu9Var2 = (mu9) Q0.b;
                        mu9.E(mu9Var2, dce.m(e2, -Float.intBitsToFloat((int) (((ij1) mu9Var2.a).G() >> 32)), nae.e), nae.e, 2);
                        uf ufVar4 = h2aVar.h;
                        if (ufVar4 != null) {
                            ufVar4.a(ak3Var.Q0().w());
                        }
                        Q0.w().q();
                        Q0.Y(G);
                        a92.b(ak3Var, Float.intBitsToFloat((int) (ak3Var.b() >> 32)) + dce.m(e2, (-Float.intBitsToFloat((int) (ak3Var.b() >> 32))) - ak3Var.L0(f), nae.e));
                    } finally {
                    }
                }
                return pvcVar;
            case 1:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                float e3 = h2aVar.e() - h2aVar.c;
                if (h2aVar.f() != fi8.a) {
                    Q0 = ak3Var2.Q0();
                    G = Q0.G();
                    Q0.w().i();
                    try {
                        mu9 mu9Var3 = (mu9) Q0.b;
                        mu9.E(mu9Var3, (-Float.intBitsToFloat((int) (((ij1) mu9Var3.a).G() >> 32))) + e3, nae.e, 2);
                        uf ufVar5 = h2aVar.j;
                        if (ufVar5 != null) {
                            ufVar5.a(ak3Var2.Q0().w());
                        }
                        Q0.w().q();
                        Q0.Y(G);
                        Q0 = ak3Var2.Q0();
                        G = Q0.G();
                        Q0.w().i();
                        try {
                            mu9.E((mu9) Q0.b, e3, nae.e, 2);
                            uf ufVar6 = h2aVar.h;
                            if (ufVar6 != null) {
                                ufVar6.a(ak3Var2.Q0().w());
                            }
                            Q0.w().q();
                            Q0.Y(G);
                            Q0 = ak3Var2.Q0();
                            G = Q0.G();
                            Q0.w().i();
                            try {
                                mu9 mu9Var4 = (mu9) Q0.b;
                                mu9.E(mu9Var4, Float.intBitsToFloat((int) (((ij1) mu9Var4.a).G() >> 32)) + e3, nae.e, 2);
                                uf ufVar7 = h2aVar.i;
                                if (ufVar7 != null) {
                                    ufVar7.a(ak3Var2.Q0().w());
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                return pvcVar;
            case 2:
                h2aVar.g.setValue(new zy5(((zy5) obj).a));
                return pvcVar;
            case 3:
                y78 y78Var = (y78) obj;
                h2aVar.p(Float.intBitsToFloat((int) (y78Var.a >> 32)), Float.intBitsToFloat((int) (y78Var.a & 4294967295L)));
                return pvcVar;
            default:
                z09 z09Var = (z09) obj;
                z09Var.getClass();
                long j = z09Var.c;
                h2aVar.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                return pvcVar;
        }
    }
}

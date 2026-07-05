package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs0 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qs0(rk9 rk9Var, sf8 sf8Var, hy0 hy0Var, float f, yj yjVar) {
        this.c = rk9Var;
        this.d = sf8Var;
        this.e = hy0Var;
        this.b = f;
        this.f = yjVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ij1 ij1Var;
        long j;
        int i = this.a;
        float f = this.b;
        pvc pvcVar = pvc.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                rk9 rk9Var = (rk9) obj5;
                sf8 sf8Var = (sf8) obj4;
                hy0 hy0Var = (hy0) obj3;
                yj yjVar = (yj) obj2;
                ak3 ak3Var = (ak3) obj;
                float f2 = -rk9Var.a;
                float f3 = -rk9Var.b;
                ((mu9) ak3Var.Q0().b).D(f2, f3);
                try {
                    ak3.N(ak3Var, sf8Var.c, hy0Var, nae.e, new s4b(f * 2.0f, nae.e, 0, 0, null, 30), null, 0, 52);
                    float intBitsToFloat = (Float.intBitsToFloat((int) (ak3Var.b() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                    long b1 = ak3Var.b1();
                    ij1 Q0 = ak3Var.Q0();
                    long G = Q0.G();
                    Q0.w().i();
                    try {
                        ((mu9) Q0.b).A(intBitsToFloat, intBitsToFloat2, b1);
                        j = G;
                        ij1Var = Q0;
                        try {
                            ak3.N(ak3Var, yjVar, hy0Var, nae.e, null, null, 0, 28);
                            ij1Var.w().q();
                            ij1Var.Y(j);
                            return pvcVar;
                        } catch (Throwable th) {
                            th = th;
                            ij1Var.w().q();
                            ij1Var.Y(j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ij1Var = Q0;
                        j = G;
                    }
                } finally {
                    ((mu9) ak3Var.Q0().b).D(-f2, -f3);
                }
            case 1:
                List list = (List) obj5;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new pj7(11, list), new tu1(new tp7(list, (String) obj4, f, (xt4) obj3), true, 802480018));
                ri6.y(ri6Var, null, new tu1(new tl3(f, 1, (vt4) obj2), true, 1714000518), 3);
                return pvcVar;
            default:
                long longValue = ((Long) obj).longValue();
                Object obj6 = ((zl9) obj5).a;
                obj6.getClass();
                ote.q((wr) obj6, longValue, this.b, (sr) obj4, (es) obj3, (xt4) obj2);
                return pvcVar;
        }
    }

    public /* synthetic */ qs0(zl9 zl9Var, float f, sr srVar, es esVar, xt4 xt4Var) {
        this.c = zl9Var;
        this.b = f;
        this.d = srVar;
        this.e = esVar;
        this.f = xt4Var;
    }

    public /* synthetic */ qs0(List list, String str, float f, xt4 xt4Var, vt4 vt4Var) {
        this.c = list;
        this.d = str;
        this.b = f;
        this.e = xt4Var;
        this.f = vt4Var;
    }
}

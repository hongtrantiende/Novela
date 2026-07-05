package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy0 b;
    public final /* synthetic */ na5 c;

    public /* synthetic */ oc(hy0 hy0Var, na5 na5Var, int i) {
        this.a = i;
        this.b = hy0Var;
        this.c = na5Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float L0;
        float L02;
        int i = this.a;
        pvc pvcVar = pvc.a;
        na5 na5Var = this.c;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                ij1 Q0 = ak3Var.Q0();
                long G = Q0.G();
                Q0.w().i();
                try {
                    ((mu9) Q0.b).n(nae.e, nae.e, intBitsToFloat, intBitsToFloat2, 1);
                    hc2.j(ak3Var);
                    rs8.r(Q0, G);
                    ak3.h1(ak3Var, this.b, 0L, 0L, nae.e, null, null, 0, Token.ELSE);
                    ak3.R0(ak3Var, zl1.c, 0L, 0L, nae.e, new s4b(ak3Var.L0(0.5f), nae.e, 0, 0, null, 30), 0, 110);
                    float intBitsToFloat3 = (1.0f - na5Var.d) * Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                    float L03 = ak3Var.L0(4.0f);
                    qye.j(ak3Var, (Float.floatToRawIntBits(intBitsToFloat3 - L03) << 32) | (Float.floatToRawIntBits(-L0) & 4294967295L), (Float.floatToRawIntBits(L03 * 2.0f) << 32) | (Float.floatToRawIntBits((2.0f * L0) + Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))) & 4294967295L), ak3Var.L0(1.0f));
                    return pvcVar;
                } catch (Throwable th) {
                    rs8.r(Q0, G);
                    throw th;
                }
            default:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                ak3.h1(ak3Var2, this.b, 0L, 0L, nae.e, null, null, 0, Token.ELSE);
                ak3.R0(ak3Var2, zl1.c, 0L, 0L, nae.e, new s4b(ak3Var2.L0(0.5f), nae.e, 0, 0, null, 30), 0, 110);
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L));
                float f = intBitsToFloat4 - ((na5Var.a * intBitsToFloat4) / 360.0f);
                float L04 = ak3Var2.L0(4.0f);
                qye.j(ak3Var2, (Float.floatToRawIntBits(f - L04) & 4294967295L) | (Float.floatToRawIntBits(-L02) << 32), (Float.floatToRawIntBits((L02 * 2.0f) + Float.intBitsToFloat((int) (ak3Var2.b() >> 32))) << 32) | (Float.floatToRawIntBits(L04 * 2.0f) & 4294967295L), ak3Var2.L0(1.0f));
                return pvcVar;
        }
    }
}

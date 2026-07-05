package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ yya c;

    public /* synthetic */ sk7(long j, yya yyaVar, int i) {
        this.a = i;
        this.b = j;
        this.c = yyaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        yya yyaVar = this.c;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                ak3.R0(ak3Var, this.b, 0L, 0L, ((Number) yyaVar.getValue()).floatValue(), null, 0, Token.AND);
                return pvcVar;
            default:
                long j = this.b;
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L));
                float floatValue = (((Number) yyaVar.getValue()).floatValue() * intBitsToFloat * 0.2f) + (0.25f * intBitsToFloat);
                float floatValue2 = (1.0f - ((Number) yyaVar.getValue()).floatValue()) * 180.0f;
                long b1 = ak3Var2.b1();
                ij1 Q0 = ak3Var2.Q0();
                long G = Q0.G();
                Q0.w().i();
                try {
                    ((mu9) Q0.b).z(floatValue2, b1);
                    if (((Number) yyaVar.getValue()).floatValue() < 0.5f) {
                        f2 = ((Number) yyaVar.getValue()).floatValue() / 0.85f;
                    } else {
                        f2 = nae.e;
                    }
                    if (((Number) yyaVar.getValue()).floatValue() < 0.5d) {
                        f3 = 1.0f;
                    } else {
                        f3 = nae.e;
                    }
                    owe.y(ak3Var2, j, (1.0f - f2) * 1.5f * floatValue, 0.3f * floatValue, floatValue * 0.2f, f3);
                    owe.u(ak3Var2, floatValue, ((Number) yyaVar.getValue()).floatValue(), j);
                    Q0.w().q();
                    Q0.Y(G);
                    if (((Number) yyaVar.getValue()).floatValue() > 0.8f) {
                        f4 = (((Number) yyaVar.getValue()).floatValue() - 0.8f) / 0.2f;
                    } else {
                        f4 = nae.e;
                    }
                    owe.z(ak3Var2, j, (Float.floatToRawIntBits(intBitsToFloat * 0.4f) << 32) | (Float.floatToRawIntBits(0.4f * intBitsToFloat2) & 4294967295L), 0.05f * intBitsToFloat2 * f4, f4);
                    owe.z(ak3Var2, j, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 * 0.2f) & 4294967295L), intBitsToFloat2 * 0.1f * f4, f4);
                    return pvcVar;
                } catch (Throwable th) {
                    rs8.r(Q0, G);
                    throw th;
                }
        }
    }
}

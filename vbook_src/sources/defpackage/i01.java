package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i01  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i01 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ i01(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                long j = this.b;
                if (j != 16) {
                    ak3.R0(ak3Var, j, 0L, 0L, nae.e, null, 25, 62);
                    ak3.R0(ak3Var, zl1.b(0.75f, j), 0L, 0L, nae.e, null, 0, Token.ELSE);
                }
                long j2 = this.c;
                if (j2 != 16) {
                    ak3.R0(ak3Var, j2, 0L, 0L, nae.e, null, 0, Token.ELSE);
                }
                return pvcVar;
            default:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                ak3.R0(ak3Var2, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                float L0 = ak3Var2.L0(3.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L));
                ak3.R0(ak3Var2, this.c, 0L, (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), nae.e, null, 0, Token.FUNCTION);
                return pvcVar;
        }
    }
}

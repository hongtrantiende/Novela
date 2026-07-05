package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lh6(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mh6 mh6Var = (mh6) obj2;
                mh6Var.h(py5.c(((py5) ((lq) obj).e()).a, j));
                mh6Var.c.invoke();
                return pvcVar;
            case 1:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                ak3.h1(ak3Var, (za7) obj2, 0L, this.b, nae.e, null, null, 0, Token.FUNCTION);
                return pvcVar;
            case 2:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                for (pr8 pr8Var : (List) obj2) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * pr8Var.a;
                    float f = pr8Var.b;
                    long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                    float f2 = pr8Var.c - pr8Var.a;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * (pr8Var.d - f);
                    ak3.R0(ak3Var2, this.b, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * f) & 4294967295L) | (floatToRawIntBits << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * f2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), nae.e, null, 0, 120);
                }
                return pvcVar;
            case 3:
                ak3 ak3Var3 = (ak3) obj;
                ak3Var3.getClass();
                for (pr8 pr8Var2 : ((vp8) obj2).b) {
                    float f3 = pr8Var2.a;
                    float f4 = pr8Var2.b;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * f3;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var3.b() & 4294967295L)) * f4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32);
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * (pr8Var2.c - pr8Var2.a);
                    float intBitsToFloat5 = Float.intBitsToFloat((int) (ak3Var3.b() & 4294967295L)) * (pr8Var2.d - f4);
                    ak3.R0(ak3Var3, this.b, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), nae.e, null, 0, 120);
                }
                return pvcVar;
            case 4:
                mw8 mw8Var = (mw8) obj2;
                lw8 lw8Var = (lw8) obj;
                lw8Var.getClass();
                int intBitsToFloat6 = ((int) Float.intBitsToFloat((int) (j >> 32))) - (mw8Var.a / 2);
                int intBitsToFloat7 = ((int) Float.intBitsToFloat((int) (4294967295L & j))) - lw8Var.X0(48.0f);
                int X0 = lw8Var.X0(64.0f);
                if (intBitsToFloat7 < X0) {
                    intBitsToFloat7 = X0;
                }
                lw8.z(lw8Var, mw8Var, intBitsToFloat6, intBitsToFloat7);
                return pvcVar;
            case 5:
                ((ib3) obj).getClass();
                return new oi9((vfb) obj2, j);
            default:
                ak3 ak3Var4 = (ak3) obj;
                ak3Var4.getClass();
                ak3.R0(ak3Var4, zl1.b(1.0f - ((ef2) obj2).a(), j), 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
        }
    }
}

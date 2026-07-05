package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wc3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wc3 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wc3(float f, r71 r71Var, long j, yya yyaVar, yya yyaVar2) {
        this.b = f;
        this.c = j;
        this.d = yyaVar;
        this.e = yyaVar2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        float f = this.b;
        switch (i) {
            case 0:
                List list = (List) obj3;
                lw8 lw8Var = (lw8) obj;
                lw8Var.getClass();
                long j = this.c;
                long floatToRawIntBits = 4294967295L & Float.floatToRawIntBits(x02.h(j));
                ((dt8) obj2).a.i(lw8Var.f() * f, floatToRawIntBits | (Float.floatToRawIntBits(x02.i(j)) << 32));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yk8 yk8Var = (yk8) list.get(i2);
                    uy5 uy5Var = ((mi8) yk8Var.a).d;
                    lw8.z(lw8Var, (mw8) yk8Var.b, uy5Var.a, uy5Var.b);
                }
                return pvcVar;
            default:
                yya yyaVar = (yya) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float L0 = ak3Var.L0(f);
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float floatValue = ((Number) ((yya) obj3).getValue()).floatValue();
                float L02 = ak3Var.L0(16.0f);
                float L03 = ak3Var.L0(24.0f);
                gl3 gl3Var = null;
                if (intBitsToFloat > nae.e && L02 >= nae.e && L03 >= nae.e) {
                    if (floatValue < nae.e) {
                        floatValue = 0.0f;
                    }
                    float f2 = (L03 * floatValue) + L02;
                    float f3 = intBitsToFloat - L02;
                    if (f2 < f3) {
                        gl3Var = new gl3(f2, f3);
                    }
                }
                if (gl3Var != null) {
                    float f4 = gl3Var.a;
                    float floatValue2 = ((Number) yyaVar.getValue()).floatValue();
                    float f5 = gl3Var.b;
                    float floatValue3 = ((Number) yyaVar.getValue()).floatValue();
                    ak3.Y0(ak3Var, this.c, (Float.floatToRawIntBits(floatValue2) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(f5) << 32) | (4294967295L & Float.floatToRawIntBits(floatValue3)), L0, 1, nae.e, 480);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ wc3(long j, float f, List list, dt8 dt8Var) {
        this.c = j;
        this.b = f;
        this.d = list;
        this.e = dt8Var;
    }
}

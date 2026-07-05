package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef2 b;

    public /* synthetic */ ft0(ef2 ef2Var, int i) {
        this.a = i;
        this.b = ef2Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        float f = 0.2f;
        float f2 = -0.2f;
        pvc pvcVar = pvc.a;
        ef2 ef2Var = this.b;
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) obj;
                tj3Var.getClass();
                float a = ef2Var.a();
                float o = tj3Var.a * b23.o(4.0f, 14.0f, a);
                float o2 = tj3Var.a * b23.o(4.0f, 18.0f, a);
                if (a <= 0.3f) {
                    z = false;
                }
                rse.g(tj3Var, o, o2, z, 4);
                return pvcVar;
            case 1:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.v(((Number) ef2Var.o.e()).floatValue());
                t15Var.l(((Number) ef2Var.p.e()).floatValue());
                float floatValue = ((Number) ef2Var.m.e()).floatValue() / 10.0f;
                float d = t15Var.d();
                float f3 = 0.75f * floatValue;
                if (f3 < -0.2f) {
                    f3 = -0.2f;
                }
                if (f3 > 0.2f) {
                    f3 = 0.2f;
                }
                t15Var.v(d / (1.0f - f3));
                float B = t15Var.B();
                float f4 = floatValue * 0.25f;
                if (f4 >= -0.2f) {
                    f2 = f4;
                }
                if (f2 <= 0.2f) {
                    f = f2;
                }
                t15Var.l((1.0f - f) * B);
                return pvcVar;
            case 2:
                t15 t15Var2 = (t15) obj;
                t15Var2.getClass();
                float o3 = b23.o(1.0f, ((t15Var2.f() * 16.0f) / Float.intBitsToFloat((int) (t15Var2.b() >> 32))) + 1.0f, ef2Var.a());
                t15Var2.v(o3);
                t15Var2.l(o3);
                return pvcVar;
            case 3:
                z09 z09Var = (z09) obj;
                z09Var.getClass();
                ef2Var.d.invoke(ef2Var, new y78(z09Var.c));
                ef2Var.r.d();
                z87.v(ef2Var.a, null, null, new db(ef2Var, null, 10), 3);
                return pvcVar;
            case 4:
                ((z09) obj).getClass();
                ef2Var.e.invoke(ef2Var);
                z87.v(ef2Var.a, null, null, new cv0(ef2Var, null, 24), 3);
                return pvcVar;
            case 5:
                lq lqVar = (lq) obj;
                c5d c5dVar = ef2Var.r;
                c5dVar.a(by5.a.k().b(), (Float.floatToRawIntBits(ef2Var.c()) << 32) | (4294967295L & Float.floatToRawIntBits(nae.e)));
                float b = z4d.b(c5dVar.b());
                jk1 jk1Var = ef2Var.b;
                z87.v(ef2Var.a, null, null, new xe2(ef2Var, b / (Float.valueOf(jk1Var.b).floatValue() - Float.valueOf(jk1Var.a).floatValue()), null, 2), 3);
                return pvcVar;
            case 6:
                tj3 tj3Var2 = (tj3) obj;
                tj3Var2.getClass();
                float a2 = ef2Var.a();
                uaf.w(tj3Var2, (1.0f - a2) * tj3Var2.a * 8.0f);
                float f5 = tj3Var2.a;
                rse.g(tj3Var2, 5.0f * f5 * a2, f5 * 10.0f * a2, true, 4);
                return pvcVar;
            default:
                t15 t15Var3 = (t15) obj;
                t15Var3.getClass();
                t15Var3.v(((Number) ef2Var.o.e()).floatValue());
                t15Var3.l(((Number) ef2Var.p.e()).floatValue());
                float floatValue2 = ((Number) ef2Var.m.e()).floatValue() / 50.0f;
                float d2 = t15Var3.d();
                float f6 = 0.75f * floatValue2;
                if (f6 < -0.2f) {
                    f6 = -0.2f;
                }
                if (f6 > 0.2f) {
                    f6 = 0.2f;
                }
                t15Var3.v(d2 / (1.0f - f6));
                float B2 = t15Var3.B();
                float f7 = floatValue2 * 0.25f;
                if (f7 >= -0.2f) {
                    f2 = f7;
                }
                if (f2 <= 0.2f) {
                    f = f2;
                }
                t15Var3.l((1.0f - f) * B2);
                return pvcVar;
        }
    }
}

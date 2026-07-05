package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h01  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h01 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz5 b;

    public /* synthetic */ h01(oz5 oz5Var, int i) {
        this.a = i;
        this.b = oz5Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        oz5 oz5Var = this.b;
        switch (i2) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (t15Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (t15Var.b() & 4294967295L));
                float f = 1.0f;
                float o = b23.o(1.0f, ((t15Var.f() * 4.0f) / Float.intBitsToFloat((int) (t15Var.b() & 4294967295L))) + 1.0f, ((Number) oz5Var.d.e()).floatValue());
                float c = dna.c(t15Var.b());
                long i3 = y78.i(((y78) oz5Var.e.e()).a, oz5Var.f);
                t15Var.x(((float) Math.tanh((Float.intBitsToFloat(i) * 0.05f) / c)) * c);
                int i4 = (int) (i3 & 4294967295L);
                t15Var.i(c * ((float) Math.tanh((Float.intBitsToFloat(i4) * 0.05f) / c)));
                float f2 = (t15Var.f() * 4.0f) / Float.intBitsToFloat((int) (t15Var.b() & 4294967295L));
                double atan2 = (float) Math.atan2(Float.intBitsToFloat(i4), Float.intBitsToFloat(i));
                float abs = Math.abs((Float.intBitsToFloat((int) (i3 >> 32)) * ((float) Math.cos(atan2))) / dna.b(t15Var.b())) * f2;
                float f3 = intBitsToFloat / intBitsToFloat2;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                t15Var.v((abs * f3) + o);
                float abs2 = Math.abs((Float.intBitsToFloat(i4) * ((float) Math.sin(atan2))) / dna.b(t15Var.b())) * f2;
                float f4 = intBitsToFloat2 / intBitsToFloat;
                if (f4 <= 1.0f) {
                    f = f4;
                }
                t15Var.l((abs2 * f) + o);
                return pvcVar;
            case 1:
                qd6 qd6Var = (qd6) obj;
                qd6Var.getClass();
                float floatValue = ((Number) oz5Var.d.e()).floatValue();
                if (floatValue > nae.e) {
                    ak3.R0(qd6Var, zl1.b(floatValue * 0.25f, zl1.e), 0L, 0L, nae.e, null, 12, 62);
                }
                qd6Var.a();
                return pvcVar;
            case 2:
                z09 z09Var = (z09) obj;
                z09Var.getClass();
                oz5Var.f = z09Var.c;
                z87.v(oz5Var.a, null, null, new nz5(oz5Var, null, 0), 3);
                return pvcVar;
            default:
                ((z09) obj).getClass();
                z87.v(oz5Var.a, null, null, new nz5(oz5Var, null, 1), 3);
                return pvcVar;
        }
    }
}

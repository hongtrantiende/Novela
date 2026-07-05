package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ub3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ub3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ ub3(float f, long j, int i) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.b;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3.Y0(ak3Var, this.c, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(ak3Var.L0(f) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(ak3Var.L0(f) / 2.0f)), ak3Var.L0(f), 0, nae.e, 496);
                return pvcVar;
            default:
                ak3 ak3Var2 = (ak3) obj;
                float L0 = ak3Var2.L0(f);
                long floatToRawIntBits = Float.floatToRawIntBits(ak3Var2.L0(f) / 2.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L));
                ak3.Y0(ak3Var2, this.c, (Float.floatToRawIntBits(nae.e) & 4294967295L) | (floatToRawIntBits << 32), (Float.floatToRawIntBits(ak3Var2.L0(f) / 2.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), L0, 0, nae.e, 496);
                return pvcVar;
        }
    }
}

package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ie7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ie7(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.b;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                float f = 0.35f * intBitsToFloat2;
                ak3.D0(ak3Var, zl1.b(0.25f, j3), intBitsToFloat2 * 0.4f, (Float.floatToRawIntBits(0.25f * intBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), nae.e, null, 120);
                float f2 = intBitsToFloat2 * 0.3f;
                ak3.D0(ak3Var, zl1.b(0.2f, j2), f2, (Float.floatToRawIntBits(intBitsToFloat * 0.75f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), nae.e, null, 120);
                ak3.D0(ak3Var, zl1.b(0.22f, j), f, (Float.floatToRawIntBits(0.7f * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 * 0.75f) & 4294967295L), nae.e, null, 120);
                ak3.D0(ak3Var, zl1.b(0.18f, j3), intBitsToFloat2 * 0.22f, (Float.floatToRawIntBits(intBitsToFloat * 0.2f) << 32) | (Float.floatToRawIntBits(0.78f * intBitsToFloat2) & 4294967295L), nae.e, null, 120);
                return pvcVar;
            default:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * 0.5f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * 0.5f) & 4294967295L);
                float c = dna.c(ak3Var2.b()) * 0.2f;
                ak3.D0(ak3Var2, zl1.b(0.22f, j3), c, floatToRawIntBits, nae.e, new s4b(2.0f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                ak3.D0(ak3Var2, zl1.b(0.18f, j2), c * 1.6f, floatToRawIntBits, nae.e, new s4b(2.0f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                ak3.D0(ak3Var2, zl1.b(0.14f, j), c * 2.2f, floatToRawIntBits, nae.e, new s4b(2.0f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                ak3.D0(ak3Var2, zl1.b(0.12f, j3), c * 1.3f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * 0.2f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * 0.25f) & 4294967295L), nae.e, new s4b(1.5f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                ak3.D0(ak3Var2, zl1.b(0.12f, j2), c * 1.1f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * 0.82f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) * 0.75f) & 4294967295L), nae.e, new s4b(1.5f, nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
                return pvcVar;
        }
    }
}

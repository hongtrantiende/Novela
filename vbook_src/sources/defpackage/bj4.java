package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bj4  reason: default package */
/* loaded from: classes.dex */
public final class bj4 implements ri4 {
    public final float a;
    public final fxa b;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, fxa] */
    public bj4(float f, float f2, float f3) {
        this.a = f3;
        ?? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < nae.e) {
            g39.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= nae.e) {
            g39.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt(f2);
        this.b = obj;
    }

    @Override // defpackage.ri4
    public final float b(long j, float f, float f2, float f3) {
        fxa fxaVar = this.b;
        fxaVar.a = f2;
        return Float.intBitsToFloat((int) (fxaVar.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    @Override // defpackage.ri4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj4.c(float, float, float):long");
    }

    @Override // defpackage.ri4
    public final float d(float f, float f2, float f3) {
        return nae.e;
    }

    @Override // defpackage.ri4
    public final float e(long j, float f, float f2, float f3) {
        fxa fxaVar = this.b;
        fxaVar.a = f2;
        return Float.intBitsToFloat((int) (fxaVar.a(f, f3, j / 1000000) >> 32));
    }
}

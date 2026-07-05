package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk7  reason: default package */
/* loaded from: classes3.dex */
public final class vk7 implements u08 {
    public final /* synthetic */ yha a;
    public final /* synthetic */ xt4 b;

    public vk7(yha yhaVar, xt4 xt4Var) {
        this.a = yhaVar;
        this.b = xt4Var;
    }

    public final long a(float f) {
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32);
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        float h;
        if (i == 1) {
            pe peVar = this.a.b;
            float e = peVar.e(Float.intBitsToFloat((int) (j2 & 4294967295L)));
            dm8 dm8Var = peVar.j;
            if (Float.isNaN(dm8Var.h())) {
                h = nae.e;
            } else {
                h = dm8Var.h();
            }
            dm8Var.i(e);
            return a(e - h);
        }
        return 0L;
    }

    @Override // defpackage.u08
    public final Object l1(long j, long j2, m42 m42Var) {
        this.b.invoke(new Float(z4d.c(j2)));
        return new z4d(j2);
    }

    @Override // defpackage.u08
    public final Object m0(long j, m42 m42Var) {
        float c = z4d.c(j);
        yha yhaVar = this.a;
        float f = yhaVar.b.f();
        float c2 = yhaVar.b.d().c();
        if (c < nae.e && f > c2) {
            this.b.invoke(new Float(c));
        } else {
            j = 0;
        }
        return new z4d(j);
    }

    @Override // defpackage.u08
    public final long u0(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = nae.e;
        if (intBitsToFloat < nae.e && i == 1) {
            pe peVar = this.a.b;
            float e = peVar.e(intBitsToFloat);
            dm8 dm8Var = peVar.j;
            if (!Float.isNaN(dm8Var.h())) {
                f = dm8Var.h();
            }
            dm8Var.i(e);
            return a(e - f);
        }
        return 0L;
    }
}

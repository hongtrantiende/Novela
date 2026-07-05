package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b5d  reason: default package */
/* loaded from: classes.dex */
public final class b5d {
    public final boolean a;
    public final a5d b;
    public final int c;
    public final dg2[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public b5d(boolean z, a5d a5dVar) {
        int i;
        this.a = z;
        this.b = a5dVar;
        if (z && a5dVar.equals(a5d.a)) {
            vs.k("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = a5dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else {
                xk5.o();
                throw null;
            }
        } else {
            i = 3;
        }
        this.c = i;
        this.d = new dg2[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, dg2] */
    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        dg2[] dg2VarArr = this.d;
        dg2 dg2Var = dg2VarArr[i];
        if (dg2Var == 0) {
            ?? obj = new Object();
            obj.a = j;
            obj.b = f;
            dg2VarArr[i] = obj;
            return;
        }
        dg2Var.a = j;
        dg2Var.b = f;
    }

    public final float b() {
        boolean z;
        a5d a5dVar;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = this.e;
        dg2[] dg2VarArr = this.d;
        dg2 dg2Var = dg2VarArr[i3];
        if (dg2Var == null) {
            return nae.e;
        }
        int i4 = 0;
        dg2 dg2Var2 = dg2Var;
        do {
            dg2 dg2Var3 = dg2VarArr[i3];
            z = this.a;
            a5dVar = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (dg2Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = nae.e;
            } else {
                long j = dg2Var.a;
                i = i4;
                f = nae.e;
                long j2 = dg2Var3.a;
                float f5 = (float) (j - j2);
                fArr2 = fArr3;
                i2 = 1;
                float abs = (float) Math.abs(j2 - dg2Var2.a);
                if (a5dVar != a5d.a && !z) {
                    dg2Var2 = dg2Var;
                } else {
                    dg2Var2 = dg2Var3;
                }
                if (f5 <= 100.0f && abs <= 40.0f) {
                    fArr2[i] = dg2Var3.b;
                    fArr[i] = -f5;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 >= this.c) {
            int ordinal = a5dVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == i2) {
                    int i5 = i4 - i2;
                    float f6 = fArr[i5];
                    int i6 = i5;
                    float f7 = f;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f8 = fArr[i7];
                        if (f6 != f8) {
                            if (z) {
                                f4 = -fArr2[i7];
                            } else {
                                f4 = fArr2[i6] - fArr2[i7];
                            }
                            float f9 = f4 / (f6 - f8);
                            float abs2 = (Math.abs(f9) * (f9 - (Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f))))) + f7;
                            if (i6 == i5) {
                                abs2 *= 0.5f;
                            }
                            f7 = abs2;
                        }
                        i6--;
                        f6 = f8;
                    }
                    f3 = Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                } else {
                    xk5.o();
                    return f;
                }
            } else {
                try {
                    float[] fArr4 = this.h;
                    hse.l(fArr, fArr2, i4, fArr4);
                    f2 = fArr4[1];
                } catch (IllegalArgumentException unused) {
                    f2 = f;
                }
                f3 = f2;
            }
            return f3 * 1000.0f;
        }
        return f;
    }

    public final float c(float f) {
        if (f <= nae.e) {
            lv5.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float b = b();
        if (b == nae.e || Float.isNaN(b)) {
            return nae.e;
        }
        if (b > nae.e) {
            if (b > f) {
                return f;
            }
        } else {
            float f2 = -f;
            if (b < f2) {
                return f2;
            }
        }
        return b;
    }

    public /* synthetic */ b5d() {
        this(false, a5d.a);
    }

    public b5d(boolean z) {
        this(z, a5d.b);
    }
}

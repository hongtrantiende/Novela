package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sv7  reason: default package */
/* loaded from: classes.dex */
public final class sv7 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public sv7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                return;
            default:
                this.b = nae.e;
                this.c = nae.e;
                this.d = nae.e;
                this.e = nae.e;
                return;
        }
    }

    public boolean a(float f, float f2) {
        float f3 = this.b;
        if (f <= this.d && f3 <= f) {
            float f4 = this.c;
            if (f2 <= this.e && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean c() {
        boolean z;
        boolean z2 = false;
        if (this.b >= this.d) {
            z = true;
        } else {
            z = false;
        }
        if (this.c >= this.e) {
            z2 = true;
        }
        return z | z2;
    }

    public void d(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += intBitsToFloat;
        this.c += intBitsToFloat2;
        this.d += intBitsToFloat;
        this.e += intBitsToFloat2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String E = dce.E(this.b);
                String E2 = dce.E(this.c);
                return nk2.w(nk2.y("MutableRect(", E, ", ", E2, ", "), dce.E(this.d), ", ", dce.E(this.e), ")");
            default:
                return super.toString();
        }
    }
}

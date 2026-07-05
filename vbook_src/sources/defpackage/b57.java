package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b57  reason: default package */
/* loaded from: classes.dex */
public final class b57 {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new a57().a();
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
        a2d.K(4);
    }

    public b57(a57 a57Var) {
        long j = a57Var.a;
        long j2 = a57Var.b;
        long j3 = a57Var.c;
        float f = a57Var.d;
        float f2 = a57Var.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a57, java.lang.Object] */
    public final a57 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b57)) {
            return false;
        }
        b57 b57Var = (b57) obj;
        if (this.a == b57Var.a && this.b == b57Var.b && this.c == b57Var.c && this.d == b57Var.d && this.e == b57Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int i3 = 0;
        if (f != nae.e) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        float f2 = this.e;
        if (f2 != nae.e) {
            i3 = Float.floatToIntBits(f2);
        }
        return i4 + i3;
    }
}

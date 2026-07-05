package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb0  reason: default package */
/* loaded from: classes.dex */
public final class mb0 extends ma2 {
    public final long a;
    public final String b;
    public final ga2 c;
    public final ha2 d;
    public final ia2 e;
    public final la2 f;

    public mb0(long j, String str, ga2 ga2Var, ha2 ha2Var, ia2 ia2Var, la2 la2Var) {
        this.a = j;
        this.b = str;
        this.c = ga2Var;
        this.d = ha2Var;
        this.e = ia2Var;
        this.f = la2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lb0] */
    public final lb0 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ma2) {
            mb0 mb0Var = (mb0) ((ma2) obj);
            if (this.a == mb0Var.a && this.b.equals(mb0Var.b) && this.c.equals(mb0Var.c) && this.d.equals(mb0Var.d)) {
                ia2 ia2Var = mb0Var.e;
                ia2 ia2Var2 = this.e;
                if (ia2Var2 != null ? ia2Var2.equals(ia2Var) : ia2Var == null) {
                    la2 la2Var = mb0Var.f;
                    la2 la2Var2 = this.f;
                    if (la2Var2 != null ? la2Var2.equals(la2Var) : la2Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        ia2 ia2Var = this.e;
        if (ia2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ia2Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        la2 la2Var = this.f;
        if (la2Var != null) {
            i = la2Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ku5  reason: default package */
/* loaded from: classes.dex */
public final class ku5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public ku5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        String b = y09.b(this.a);
        String l = y78.l(this.c);
        String l2 = y78.l(this.g);
        boolean z = this.i;
        return "IndirectPointerInputChange(id=" + b + ", uptimeMillis=" + this.b + ", position=" + l + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + l2 + ", previousPressed=" + this.h + ", isConsumed=" + z + ")";
    }
}

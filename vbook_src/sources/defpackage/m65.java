package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m65  reason: default package */
/* loaded from: classes.dex */
public final class m65 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public m65(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        String l = y78.l(this.b);
        String l2 = y78.l(this.d);
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + l + ", scaleFactor=" + this.c + ", panOffset=" + l2 + ")";
    }
}

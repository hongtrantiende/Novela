package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n8b  reason: default package */
/* loaded from: classes.dex */
public final class n8b {
    public static final n8b c = new n8b(false, -9223372036854775807L);
    public boolean a;
    public long b;

    public n8b(boolean z, long j) {
        this.b = j;
        this.a = z;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}

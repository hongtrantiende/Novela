package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi0  reason: default package */
/* loaded from: classes.dex */
public abstract class bi0 implements a47 {
    public final long a;
    public final long b;
    public long c;

    public bi0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j >= this.a && j <= this.b) {
            return;
        }
        xk5.g();
    }

    @Override // defpackage.a47
    public final boolean next() {
        boolean z;
        long j = this.c + 1;
        this.c = j;
        if (j > this.b) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pjc  reason: default package */
/* loaded from: classes.dex */
public final class pjc {
    public final long a;
    public final long b;
    public final boolean c;

    public pjc(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final pjc a(pjc pjcVar) {
        boolean z;
        long j = y78.j(this.a, pjcVar.a);
        long max = Math.max(this.b, pjcVar.b);
        if (!this.c && !pjcVar.c) {
            z = false;
        } else {
            z = true;
        }
        return new pjc(j, max, z);
    }
}

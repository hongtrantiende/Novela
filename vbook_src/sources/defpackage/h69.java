package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h69  reason: default package */
/* loaded from: classes.dex */
public final class h69 extends vwa {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public h69(long j, long j2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                return;
            default:
                this.b = j2;
                this.c = j;
                return;
        }
    }

    public static long d(long j, km8 km8Var) {
        long z = km8Var.z();
        if ((128 & z) != 0) {
            return 8589934591L & ((((z & 1) << 32) | km8Var.B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.vwa
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return hl5.q(sb, this.c, " }");
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return hl5.q(sb2, this.c, " }");
        }
    }
}

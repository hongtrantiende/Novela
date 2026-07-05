package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ga1  reason: default package */
/* loaded from: classes.dex */
public final class ga1 extends e8b implements Comparable {
    public long G;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ga1 ga1Var = (ga1) obj;
        if (h(4) != ga1Var.h(4)) {
            if (h(4)) {
                return 1;
            }
            return -1;
        }
        long j = this.C - ga1Var.C;
        if (j == 0) {
            j = this.G - ga1Var.G;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}

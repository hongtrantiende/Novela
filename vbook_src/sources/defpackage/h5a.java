package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h5a  reason: default package */
/* loaded from: classes.dex */
public final class h5a extends g5a {
    public final List j;

    public h5a(zg9 zg9Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(zg9Var, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.g5a
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.g5a
    public final zg9 h(rp9 rp9Var, long j) {
        return (zg9) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.g5a
    public final boolean i() {
        return true;
    }
}

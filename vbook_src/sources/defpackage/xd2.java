package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd2  reason: default package */
/* loaded from: classes.dex */
public final class xd2 implements x7b {
    public static final k01 c = new k01(new uz0(4), az7.b);
    public final qs5 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd2(defpackage.mm9 r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd2.<init>(mm9):void");
    }

    @Override // defpackage.x7b
    public final int a(long j) {
        int b = a2d.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.x7b
    public final long c(int i) {
        boolean z;
        if (i < this.a.size()) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        return this.b[i];
    }

    @Override // defpackage.x7b
    public final List f(long j) {
        int f = a2d.f(this.b, j, false);
        if (f == -1) {
            ms5 ms5Var = qs5.b;
            return mm9.e;
        }
        return (qs5) this.a.get(f);
    }

    @Override // defpackage.x7b
    public final int g() {
        return this.a.size();
    }
}

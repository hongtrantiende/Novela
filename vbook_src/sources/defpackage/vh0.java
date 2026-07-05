package defpackage;

import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vh0  reason: default package */
/* loaded from: classes3.dex */
public final class vh0 extends w20 {
    public final /* synthetic */ RandomAccessFile a;
    public final /* synthetic */ l6d b;
    public final /* synthetic */ b6d c;
    public final /* synthetic */ String d;

    public vh0(RandomAccessFile randomAccessFile, l6d l6dVar, b6d b6dVar, String str) {
        this.a = randomAccessFile;
        this.b = l6dVar;
        this.c = b6dVar;
        this.d = str;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        this.a.close();
        return pvc.a;
    }

    @Override // defpackage.w20, defpackage.e10
    public final Object e(n42 n42Var) {
        return qye.k(new kq(this.a, null, 1), n42Var);
    }

    @Override // defpackage.w20
    public final Object i(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        return qye.k(new th0(this.a, j, bArr, i, i2, null), (n42) m42Var);
    }

    @Override // defpackage.w20
    public final Object j(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        Object k = qye.k(new uh0(this.b, this.a, j, bArr, i, i2, null), (n42) m42Var);
        if (k == n82.a) {
            return k;
        }
        return pvc.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('(');
        return s21.p(sb, this.d, ')');
    }
}

package defpackage;

import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt2  reason: default package */
/* loaded from: classes.dex */
public final class pt2 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final c4d c = new c4d(0);
    public fz4 d;
    public int e;
    public int f;
    public long g;

    public final long a(s94 s94Var, int i) {
        byte[] bArr = this.a;
        s94Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}

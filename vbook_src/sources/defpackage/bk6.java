package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk6  reason: default package */
/* loaded from: classes.dex */
public final class bk6 extends c3e {
    public final boolean b;
    public final xj6 c;
    public final vh6 d;
    public final lk6 e;
    public final /* synthetic */ ck6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk6(ck6 ck6Var, boolean z, xj6 xj6Var, vh6 vh6Var, lk6 lk6Var) {
        super(4);
        this.f = ck6Var;
        this.b = z;
        this.c = xj6Var;
        this.d = vh6Var;
        this.e = lk6Var;
    }

    public final ik6 Y(int i, long j) {
        int i2;
        long h;
        xj6 xj6Var = this.c;
        Object b = xj6Var.b(i);
        Object q = xj6Var.b.q(i);
        lk6 lk6Var = this.e;
        int[] iArr = lk6Var.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = lk6Var.a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.b) {
            if (i2 < 0) {
                nv5.a("width must be >= 0");
            }
            h = y02.h(i2, i2, 0, Integer.MAX_VALUE);
        } else {
            if (i2 < 0) {
                nv5.a("height must be >= 0");
            }
            h = y02.h(0, Integer.MAX_VALUE, i2, i2);
        }
        long j2 = h;
        List A = A(this.d, i, j2);
        ck6 ck6Var = this.f;
        return new ik6(i, b, A, ck6Var.f, ck6Var.l, i4, i5, ck6Var.j, ck6Var.k, q, ck6Var.a.t, j2);
    }

    @Override // defpackage.c3e
    public final wh6 x(int i, int i2, int i3, long j) {
        xj6 xj6Var = this.c;
        Object b = xj6Var.b(i);
        Object q = xj6Var.b.q(i);
        List A = A(this.d, i, j);
        ck6 ck6Var = this.f;
        return new ik6(i, b, A, ck6Var.f, ck6Var.l, i2, i3, ck6Var.j, ck6Var.k, q, ck6Var.a.t, j);
    }
}

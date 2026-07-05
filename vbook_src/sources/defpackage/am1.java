package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am1  reason: default package */
/* loaded from: classes.dex */
public final class am1 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ bm1 j;

    public am1(bm1 bm1Var, int i, int i2) {
        this.j = bm1Var;
        this.a = i;
        this.b = i2;
        a();
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        bm1 bm1Var = this.j;
        int[] iArr = (int[]) bm1Var.b;
        int[] iArr2 = (int[]) bm1Var.c;
        int i7 = this.b;
        int i8 = Integer.MAX_VALUE;
        int i9 = this.a;
        if (i9 <= i7) {
            i2 = Integer.MIN_VALUE;
            i3 = Integer.MIN_VALUE;
            i4 = 0;
            int i10 = i9;
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
            i = Integer.MIN_VALUE;
            while (true) {
                int i11 = iArr[i10];
                i4 += iArr2[i11];
                int i12 = (i11 >> 10) & 31;
                int i13 = (i11 >> 5) & 31;
                int i14 = i11 & 31;
                if (i12 > i) {
                    i = i12;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i13 > i2) {
                    i2 = i13;
                }
                if (i13 < i5) {
                    i5 = i13;
                }
                if (i14 > i3) {
                    i3 = i14;
                }
                if (i14 < i6) {
                    i6 = i14;
                }
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
        } else {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            i3 = Integer.MIN_VALUE;
            i4 = 0;
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
        }
        this.d = i8;
        this.e = i;
        this.f = i5;
        this.g = i2;
        this.h = i6;
        this.i = i3;
        this.c = i4;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}

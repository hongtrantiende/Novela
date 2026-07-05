package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gg6  reason: default package */
/* loaded from: classes.dex */
public final class gg6 {
    public final int a;
    public final fg6[] b;
    public final jg6 c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public gg6(int i, fg6[] fg6VarArr, jg6 jg6Var, List list, boolean z, int i2) {
        this.a = i;
        this.b = fg6VarArr;
        this.c = jg6Var;
        this.d = list;
        this.e = z;
        this.f = i2;
        int i3 = 0;
        for (fg6 fg6Var : fg6VarArr) {
            i3 = Math.max(i3, fg6Var.o);
        }
        this.g = i3;
        int i4 = i3 + this.f;
        this.h = i4 >= 0 ? i4 : 0;
    }

    public final fg6[] a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        fg6[] fg6VarArr = this.b;
        int length = fg6VarArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            fg6 fg6Var = fg6VarArr[i9];
            int i12 = i10 + 1;
            int i13 = (int) ((i25) this.d.get(i10)).a;
            int i14 = this.c.b[i11];
            int i15 = this.a;
            boolean z = this.e;
            if (z) {
                i4 = i15;
            } else {
                i4 = i11;
            }
            if (z) {
                i5 = i11;
                i8 = i;
                i6 = i2;
                i7 = i3;
            } else {
                i5 = i15;
                i6 = i2;
                i7 = i3;
                i8 = i;
            }
            fg6Var.o(i8, i14, i6, i7, i4, i5);
            i11 += i13;
            i9++;
            i10 = i12;
        }
        return fg6VarArr;
    }
}

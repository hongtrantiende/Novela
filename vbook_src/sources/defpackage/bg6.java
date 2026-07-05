package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bg6  reason: default package */
/* loaded from: classes.dex */
public final class bg6 {
    public final boolean a;
    public final jg6 b;
    public final int c;
    public final int d;
    public final ag6 e;
    public final mg6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ jg6 h;

    public bg6(boolean z, jg6 jg6Var, int i, int i2, ag6 ag6Var, mg6 mg6Var) {
        this.g = z;
        this.h = jg6Var;
        this.a = z;
        this.b = jg6Var;
        this.c = i;
        this.d = i2;
        this.e = ag6Var;
        this.f = mg6Var;
    }

    public final long a(int i, int i2) {
        int i3;
        jg6 jg6Var = this.b;
        int[] iArr = jg6Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = jg6Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.a) {
            if (i3 < 0) {
                nv5.a("width must be >= 0");
            }
            return y02.h(i3, i3, 0, Integer.MAX_VALUE);
        }
        if (i3 < 0) {
            nv5.a("height must be >= 0");
        }
        return y02.h(0, Integer.MAX_VALUE, i3, i3);
    }

    public final gg6 b(int i) {
        int i2;
        qy2 b = this.f.b(i);
        int i3 = b.a;
        int size = b.b.size();
        int i4 = 0;
        if (size != 0 && i3 + size != this.c) {
            i2 = this.d;
        } else {
            i2 = 0;
        }
        fg6[] fg6VarArr = new fg6[size];
        int i5 = 0;
        while (true) {
            List list = b.b;
            if (i4 < size) {
                int i6 = (int) ((i25) list.get(i4)).a;
                fg6 Y = this.e.Y(i3 + i4, a(i5, i6), i5, i6, i2);
                i5 += i6;
                fg6VarArr[i4] = Y;
                i4++;
            } else {
                return new gg6(i, fg6VarArr, this.h, list, this.g, i2);
            }
        }
    }
}

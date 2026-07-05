package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oh6  reason: default package */
/* loaded from: classes.dex */
public final class oh6 {
    public x02 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ qh6 h;
    public mh6[] a = n4f.h;
    public int e = 1;

    public oh6(qh6 qh6Var) {
        this.h = qh6Var;
    }

    public static void b(oh6 oh6Var, wh6 wh6Var, m82 m82Var, m15 m15Var, int i, int i2, boolean z) {
        long j;
        oh6Var.h.getClass();
        long g = wh6Var.g(0);
        if (!z) {
            j = g & 4294967295L;
        } else {
            j = g >> 32;
        }
        oh6Var.a(wh6Var, m82Var, m15Var, i, i2, (int) j);
    }

    public final void a(wh6 wh6Var, m82 m82Var, m15 m15Var, int i, int i2, int i3) {
        mh6[] mh6VarArr;
        zg6 zg6Var;
        mh6[] mh6VarArr2 = this.a;
        int length = mh6VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                mh6 mh6Var = mh6VarArr2[i4];
                if (mh6Var != null && mh6Var.g) {
                    break;
                }
                i4++;
            } else {
                this.f = i;
                this.g = i2;
                break;
            }
        }
        int size = wh6Var.e().size();
        int length2 = this.a.length;
        while (true) {
            mh6VarArr = this.a;
            if (size >= length2) {
                break;
            }
            mh6 mh6Var2 = mh6VarArr[size];
            if (mh6Var2 != null) {
                mh6Var2.d();
            }
            size++;
        }
        if (mh6VarArr.length != wh6Var.e().size()) {
            this.a = (mh6[]) Arrays.copyOf(this.a, wh6Var.e().size());
        }
        this.b = new x02(wh6Var.d());
        this.c = i3;
        this.d = wh6Var.h();
        this.e = wh6Var.b();
        int size2 = wh6Var.e().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object S = ((mw8) wh6Var.e().get(i5)).S();
            if (S instanceof zg6) {
                zg6Var = (zg6) S;
            } else {
                zg6Var = null;
            }
            mh6[] mh6VarArr3 = this.a;
            if (zg6Var == null) {
                mh6 mh6Var3 = mh6VarArr3[i5];
                if (mh6Var3 != null) {
                    mh6Var3.d();
                }
                this.a[i5] = null;
            } else {
                mh6 mh6Var4 = mh6VarArr3[i5];
                if (mh6Var4 == null) {
                    mh6Var4 = new mh6(m82Var, m15Var, new u76(this.h, 2));
                    this.a[i5] = mh6Var4;
                }
                mh6Var4.d = zg6Var.K;
                mh6Var4.e = zg6Var.L;
                mh6Var4.f = zg6Var.M;
            }
        }
    }
}

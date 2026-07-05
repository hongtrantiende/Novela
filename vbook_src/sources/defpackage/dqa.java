package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dqa  reason: default package */
/* loaded from: classes.dex */
public abstract class dqa {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int e = e(arrayList, i, i2);
        if (e >= 0) {
            return e;
        }
        return -(e + 1);
    }

    public static final int b(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final bqa d(bqa bqaVar) {
        if (!(bqaVar instanceof bqa)) {
            bqaVar = null;
        }
        if (bqaVar != null) {
            return bqaVar;
        }
        ex1.b("Inconsistent composition");
        ls2.c();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((lv4) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int l = c16.l(i5, i);
            if (l < 0) {
                i3 = i4 + 1;
            } else if (l > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}

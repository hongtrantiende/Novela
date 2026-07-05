package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ne3  reason: default package */
/* loaded from: classes3.dex */
public final class ne3 {
    public int a = Parser.ARGC_LIMIT;
    public int[] b = new int[Parser.ARGC_LIMIT];
    public int[] c = new int[Parser.ARGC_LIMIT];
    public final il0 d;
    public final int[][] e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public final hy j;
    public final me3 k;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, il0] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, me3] */
    public ne3(String[] strArr) {
        ?? obj = new Object();
        obj.a = new long[1024];
        this.d = obj;
        int length = strArr.length;
        int[][] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            int length2 = str.length();
            int[] iArr2 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr2[i2] = str.charAt(i2) + 1;
            }
            iArr[i] = iArr2;
        }
        this.e = iArr;
        this.f = strArr.length;
        this.j = new hy(1);
        ?? obj2 = new Object();
        obj2.a = new ArrayList();
        this.k = obj2;
        this.c[0] = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        le3 le3Var;
        hy hyVar = this.j;
        ArrayList arrayList = hyVar.a;
        ArrayList arrayList2 = hyVar.a;
        if (arrayList.isEmpty()) {
            le3Var = new Object();
        } else {
            Object remove = arrayList.remove(arrayList.size() - 1);
            remove.getClass();
            le3Var = (le3) remove;
        }
        le3Var.c = 0;
        le3Var.d = this.f;
        le3Var.b = 0;
        le3Var.a = 0;
        me3 me3Var = this.k;
        ArrayList a = me3Var.a();
        b(le3Var, a);
        c(a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            Object obj = a.get(i);
            obj.getClass();
            arrayList2.add((le3) obj);
        }
        a.clear();
        me3Var.a.add(a);
        arrayList2.add(le3Var);
        int[] iArr = this.c;
        int i2 = this.i + Parser.ARGC_LIMIT;
        int[] iArr2 = new int[i2];
        b00.Z(0, Math.min(i2, iArr.length), 2, iArr, iArr2);
        this.c = iArr2;
        int[] iArr3 = this.b;
        int i3 = this.i + Parser.ARGC_LIMIT;
        int[] iArr4 = new int[i3];
        b00.Z(0, Math.min(i3, iArr3.length), 2, iArr3, iArr4);
        this.b = iArr4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(le3 le3Var, ArrayList arrayList) {
        int i;
        le3 le3Var2;
        if (this.h < 0) {
            return 0;
        }
        int i2 = le3Var.b;
        int i3 = le3Var.d;
        int i4 = 0;
        int i5 = -1;
        for (int i6 = le3Var.c; i6 < i3; i6++) {
            int[] iArr = this.e[i6];
            int length = iArr.length;
            if (length >= i2) {
                if (length == i2) {
                    i = 0;
                } else {
                    i = iArr[i2];
                }
                if (i4 > i) {
                    this.h = -3;
                    return 0;
                }
                if (i != i4 || i5 == -1) {
                    ArrayList arrayList2 = this.j.a;
                    if (arrayList2.isEmpty()) {
                        le3Var2 = new Object();
                    } else {
                        Object remove = arrayList2.remove(arrayList2.size() - 1);
                        remove.getClass();
                        le3Var2 = (le3) remove;
                    }
                    le3Var2.b = i2 + 1;
                    le3Var2.a = i;
                    le3Var2.c = i6;
                    if (i5 != -1) {
                        ((le3) arrayList.get(i5)).d = i6;
                    }
                    arrayList.add(le3Var2);
                    i5 = arrayList.size() - 1;
                }
                i4 = i;
            }
        }
        if (i5 != -1) {
            ((le3) arrayList.get(i5)).d = i3;
        }
        return arrayList.size();
    }

    public final int c(ArrayList arrayList) {
        int i;
        int i2;
        int i3;
        il0 il0Var;
        int i4;
        if (this.h < 0) {
            return 0;
        }
        int i5 = 1;
        int max = Math.max(((le3) arrayList.get(0)).a + 1, this.g);
        int i6 = max - 1;
        if (this.a <= i6) {
            d(max);
        }
        int i7 = ((le3) arrayList.get(0)).a;
        int size = arrayList.size();
        int i8 = ((le3) arrayList.get(size - 1)).a;
        int i9 = 65535 + i8;
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((le3) arrayList.get(i10)).a;
        }
        int i11 = 0;
        int i12 = 0;
        loop1: while (true) {
            i6 += i5;
            int i13 = this.a;
            if (i13 <= i6 && i6 > i13) {
                d(i6);
            }
            if (this.b[i6] != 0) {
                i11++;
            } else {
                if (i12 == 0) {
                    this.g = i6;
                    i12 = i5;
                }
                i = i6 - i7;
                int i14 = this.a;
                i2 = i + i8;
                if (i14 <= i2 && (i4 = i + i9) > i14) {
                    d(i4);
                }
                i3 = i >> 6;
                il0Var = this.d;
                long[] jArr = il0Var.a;
                int i15 = i5;
                if (i3 >= jArr.length || (jArr[i3] & (1 << i)) == 0) {
                    for (int i16 = i15; i16 < size; i16++) {
                        if (this.b[i + iArr[i16]] == 0) {
                        }
                    }
                    break loop1;
                }
                i5 = i15;
            }
        }
        if (i11 * 20 >= ((i6 - this.g) + 1) * 19) {
            this.g = i6;
        }
        long[] jArr2 = il0Var.a;
        if (i3 >= jArr2.length) {
            il0Var.a = Arrays.copyOf(jArr2, i3 + 1);
        }
        long[] jArr3 = il0Var.a;
        jArr3[i3] = jArr3[i3] | (1 << i);
        this.i = Math.max(this.i, i2 + 1);
        for (int i17 = 0; i17 < size; i17++) {
            this.b[iArr[i17] + i] = i;
        }
        for (int i18 = 0; i18 < size; i18++) {
            Object obj = arrayList.get(i18);
            obj.getClass();
            le3 le3Var = (le3) obj;
            me3 me3Var = this.k;
            ArrayList a = me3Var.a();
            if (b(le3Var, a) == 0) {
                this.c[le3Var.a + i] = (-le3Var.c) - 1;
            } else {
                this.c[le3Var.a + i] = c(a);
            }
            int size2 = a.size();
            for (int i19 = 0; i19 < size2; i19++) {
                Object obj2 = a.get(i19);
                obj2.getClass();
                hy hyVar = this.j;
                hyVar.getClass();
                hyVar.a.add((le3) obj2);
            }
            a.clear();
            me3Var.a.add(a);
        }
        return i;
    }

    public final void d(int i) {
        int i2 = this.a;
        if (i <= i2) {
            return;
        }
        int i3 = i2 >> 1;
        if (i3 < 1) {
            i3 = 1;
        }
        int max = Math.max(i, i2 + i3);
        this.c = Arrays.copyOf(this.c, max);
        this.b = Arrays.copyOf(this.b, max);
        this.a = max;
    }
}

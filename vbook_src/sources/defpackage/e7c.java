package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e7c  reason: default package */
/* loaded from: classes.dex */
public final class e7c {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public e7c(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i != -1) {
            long[] jArr = this.b;
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    int i4 = ((jArr[i3] - j) > 0L ? 1 : ((jArr[i3] - j) == 0L ? 0 : -1));
                    if (i4 < 0) {
                        i2 = i3 + 1;
                    } else if (i4 > 0) {
                        i = i3 - 1;
                    } else {
                        return i3;
                    }
                }
                return -(i2 + 1);
            }
            int i5 = (jArr[0] > j ? 1 : (jArr[0] == j ? 0 : -1));
            if (i5 == 0) {
                return 0;
            }
            if (i5 > 0) {
                return -2;
            }
        }
        return -1;
    }

    public final e7c b(Object obj, long j) {
        long[] jArr;
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        Object[] objArr2 = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                jArr = this.b;
                i = this.a;
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = jArr[i5];
                Object obj3 = objArr[i5];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr2[i3] = j;
                objArr2[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = jArr[i5];
                    Object obj4 = objArr[i5];
                    if (obj4 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new e7c(i4, jArr2, objArr2);
    }
}

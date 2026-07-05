package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b  reason: default package */
/* loaded from: classes3.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ed1.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(my0 my0Var, e31 e31Var, long j, long j2, int i) {
        e5a e5aVar;
        long j3 = j;
        long j4 = j2;
        e31Var.getClass();
        long j5 = i;
        bbe.n(e31Var.e(), 0L, j5);
        if (i > 0) {
            if (j3 >= 0) {
                if (j3 <= j4) {
                    long j6 = my0Var.b;
                    if (j4 > j6) {
                        j4 = j6;
                    }
                    if (j3 != j4 && (e5aVar = my0Var.a) != null) {
                        long j7 = 0;
                        if (j6 - j3 < j3) {
                            while (j6 > j3) {
                                e5aVar = e5aVar.g;
                                e5aVar.getClass();
                                j6 -= e5aVar.c - e5aVar.b;
                            }
                            byte[] i2 = e31Var.i();
                            byte b2 = i2[0];
                            long min = Math.min(j4, (my0Var.b - j5) + 1);
                            while (j6 < min) {
                                byte[] bArr = e5aVar.a;
                                int min2 = (int) Math.min(e5aVar.c, (e5aVar.b + min) - j6);
                                for (int i3 = (int) ((e5aVar.b + j3) - j6); i3 < min2; i3++) {
                                    if (bArr[i3] == b2 && b(e5aVar, i3 + 1, i2, 1, i)) {
                                        return (i3 - e5aVar.b) + j6;
                                    }
                                }
                                j6 += e5aVar.c - e5aVar.b;
                                e5aVar = e5aVar.f;
                                e5aVar.getClass();
                                j3 = j6;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j8 = j7 + (e5aVar.c - e5aVar.b);
                            if (j8 > j3) {
                                break;
                            }
                            e5aVar = e5aVar.f;
                            e5aVar.getClass();
                            j7 = j8;
                        }
                        byte[] i4 = e31Var.i();
                        byte b3 = i4[0];
                        long min3 = Math.min(j4, (my0Var.b - j5) + 1);
                        while (j7 < min3) {
                            byte[] bArr2 = e5aVar.a;
                            int min4 = (int) Math.min(e5aVar.c, (e5aVar.b + min3) - j7);
                            for (int i5 = (int) ((e5aVar.b + j3) - j7); i5 < min4; i5++) {
                                if (bArr2[i5] == b3 && b(e5aVar, i5 + 1, i4, 1, i)) {
                                    return (i5 - e5aVar.b) + j7;
                                }
                            }
                            j7 += e5aVar.c - e5aVar.b;
                            e5aVar = e5aVar.f;
                            e5aVar.getClass();
                            j3 = j7;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                StringBuilder o = rs8.o(j3, "fromIndex > toIndex: ", " > ");
                o.append(j4);
                throw new IllegalArgumentException(o.toString().toString());
            }
            p1a.k(hl5.k(j3, "fromIndex < 0: "));
            return 0L;
        }
        vs.m("byteCount == 0");
        return 0L;
    }

    public static final boolean b(e5a e5aVar, int i, byte[] bArr, int i2, int i3) {
        int i4 = e5aVar.c;
        byte[] bArr2 = e5aVar.a;
        while (i2 < i3) {
            if (i == i4) {
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                byte[] bArr3 = e5aVar.a;
                bArr2 = bArr3;
                i = e5aVar.b;
                i4 = e5aVar.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(my0 my0Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (my0Var.S(j2) == 13) {
                String I0 = my0Var.I0(j2, ed1.a);
                my0Var.skip(2L);
                return I0;
            }
        }
        String I02 = my0Var.I0(j, ed1.a);
        my0Var.skip(1L);
        return I02;
    }
}

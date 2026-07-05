package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cra  reason: default package */
/* loaded from: classes.dex */
public final class cra implements Iterable, j76 {
    public static final cra e = new cra(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public cra(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final cra a(cra craVar) {
        long[] jArr;
        cra craVar2 = this;
        cra craVar3 = e;
        if (craVar == craVar3) {
            return craVar2;
        }
        if (craVar2 == craVar3) {
            return craVar3;
        }
        long j = craVar.c;
        long j2 = craVar.c;
        long[] jArr2 = craVar.d;
        long j3 = craVar.b;
        long j4 = craVar.a;
        long j5 = craVar2.c;
        if (j == j5 && jArr2 == (jArr = craVar2.d)) {
            return new cra(craVar2.a & (~j4), craVar2.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                craVar2 = craVar2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    craVar2 = craVar2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    craVar2 = craVar2.b(i2 + j2 + 64);
                }
            }
        }
        return craVar2;
    }

    public final cra b(long j) {
        long[] jArr;
        int f;
        long[] jArr2;
        long j2 = j - this.c;
        if (c16.m(j2, 0L) >= 0 && c16.m(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new cra(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (c16.m(j2, 64L) >= 0 && c16.m(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new cra(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (c16.m(j2, 0L) < 0 && (jArr = this.d) != null && (f = vae.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (f > 0) {
                    b00.Y(jArr, jArr3, 0, 0, f);
                }
                if (f < i) {
                    b00.Y(jArr, jArr3, f, f + 1, length);
                }
                jArr2 = jArr3;
            }
            return new cra(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.c;
        if (c16.m(j2, 0L) >= 0 && c16.m(j2, 64L) < 0) {
            if (((1 << ((int) j2)) & this.b) != 0) {
                return true;
            }
            return false;
        } else if (c16.m(j2, 64L) >= 0 && c16.m(j2, 128L) < 0) {
            if (((1 << (((int) j2) - 64)) & this.a) != 0) {
                return true;
            }
            return false;
        } else if (c16.m(j2, 0L) <= 0 && (jArr = this.d) != null && vae.f(jArr, j) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public final cra d(cra craVar) {
        cra craVar2;
        long[] jArr;
        cra craVar3 = this;
        cra craVar4 = e;
        if (craVar == craVar4) {
            return craVar3;
        }
        if (craVar3 == craVar4) {
            return craVar;
        }
        long j = craVar.c;
        long j2 = craVar.c;
        long[] jArr2 = craVar.d;
        long j3 = craVar.b;
        long j4 = craVar.a;
        long j5 = craVar3.c;
        int i = (j > j5 ? 1 : (j == j5 ? 0 : -1));
        long j6 = craVar3.b;
        long j7 = craVar3.a;
        if (i == 0 && jArr2 == (jArr = craVar3.d)) {
            return new cra(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = craVar3.d;
        if (jArr3 == null) {
            if (jArr3 != null) {
                craVar2 = craVar;
                for (long j8 : jArr3) {
                    craVar2 = craVar2.e(j8);
                }
            } else {
                craVar2 = craVar;
            }
            int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            long j9 = craVar3.c;
            if (i3 != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if (((1 << i4) & j6) != 0) {
                        craVar2 = craVar2.e(i4 + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j7) != 0) {
                        craVar2 = craVar2.e(i2 + j9 + 64);
                    }
                    i2++;
                }
            }
            return craVar2;
        }
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                craVar3 = craVar3.e(j10);
            }
        }
        if (j3 != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j3) != 0) {
                    craVar3 = craVar3.e(i5 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j4) != 0) {
                    craVar3 = craVar3.e(i2 + j2 + 64);
                }
                i2++;
            }
        }
        return craVar3;
    }

    public final cra e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.c;
        long j6 = j - j5;
        long j7 = 0;
        int m = c16.m(j6, 0L);
        long j8 = this.b;
        if (m >= 0 && c16.m(j6, 64L) < 0) {
            long j9 = 1 << ((int) j6);
            if ((j8 & j9) == 0) {
                return new cra(this.a, j8 | j9, this.c, this.d);
            }
        } else {
            int m2 = c16.m(j6, 64L);
            long j10 = this.a;
            int i2 = 64;
            if (m2 >= 0 && c16.m(j6, 128L) < 0) {
                long j11 = 1 << (((int) j6) - 64);
                if ((j10 & j11) == 0) {
                    return new cra(j10 | j11, this.b, this.c, this.d);
                }
            } else {
                int m3 = c16.m(j6, 128L);
                long[] jArr3 = this.d;
                if (m3 >= 0) {
                    if (!c(j)) {
                        long j12 = ((j + 1) / 64) * 64;
                        if (c16.m(j12, 0L) < 0) {
                            j12 = 9223372036854775680L;
                        }
                        long j13 = j10;
                        g99 g99Var = null;
                        while (true) {
                            if (c16.m(j5, j12) < 0) {
                                if (j8 != j7) {
                                    if (g99Var == null) {
                                        g99Var = new g99(jArr3);
                                    }
                                    int i3 = 0;
                                    i = i2;
                                    while (i3 < i) {
                                        if ((j8 & (1 << i3)) != j7) {
                                            j4 = j7;
                                            ((bv7) g99Var.b).a(i3 + j5);
                                        } else {
                                            j4 = j7;
                                        }
                                        i3++;
                                        j7 = j4;
                                    }
                                } else {
                                    i = i2;
                                }
                                long j14 = j7;
                                if (j13 == j14) {
                                    j2 = j12;
                                    j3 = j14;
                                    break;
                                }
                                j5 += 64;
                                j7 = j14;
                                j8 = j13;
                                i2 = i;
                                j13 = j7;
                            } else {
                                j2 = j5;
                                j3 = j8;
                                break;
                            }
                        }
                        if (g99Var != null) {
                            bv7 bv7Var = (bv7) g99Var.b;
                            int i4 = bv7Var.b;
                            if (i4 == 0) {
                                jArr2 = null;
                            } else {
                                long[] jArr4 = new long[i4];
                                long[] jArr5 = bv7Var.a;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    jArr4[i5] = jArr5[i5];
                                }
                                jArr2 = jArr4;
                            }
                            if (jArr2 != null) {
                                jArr = jArr2;
                                return new cra(j13, j3, j2, jArr).e(j);
                            }
                        }
                        jArr = jArr3;
                        return new cra(j13, j3, j2, jArr).e(j);
                    }
                } else if (jArr3 == null) {
                    return new cra(this.a, this.b, this.c, new long[]{j});
                } else {
                    int f = vae.f(jArr3, j);
                    if (f < 0) {
                        int i6 = -(f + 1);
                        int length = jArr3.length;
                        long[] jArr6 = new long[length + 1];
                        b00.Y(jArr3, jArr6, 0, 0, i6);
                        b00.Y(jArr3, jArr6, i6 + 1, i6, length);
                        jArr6[i6] = j;
                        return new cra(this.a, this.b, this.c, jArr6);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return h9a.O(new t04(this, null, 2));
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(tl1.s(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null) {
                z = obj2 instanceof CharSequence;
            }
            if (z) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return rs8.l(obj, " [", sb.toString(), "]");
    }
}

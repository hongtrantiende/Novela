package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jk9  reason: default package */
/* loaded from: classes.dex */
public final class jk9 extends aab implements mu4 {
    public Set C;
    public uv7 D;
    public int E;
    public /* synthetic */ xq7 F;
    public final /* synthetic */ kk9 G;
    public List a;
    public List b;
    public List c;
    public uv7 d;
    public uv7 e;
    public uv7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk9(kk9 kk9Var, m42 m42Var) {
        super(3, m42Var);
        this.G = kk9Var;
    }

    public static final void o(kk9 kk9Var, List list, List list2, List list3, uv7 uv7Var, uv7 uv7Var2, uv7 uv7Var3, uv7 uv7Var4) {
        char c;
        long j;
        long j2;
        synchronized (kk9Var.d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ux1 ux1Var = (ux1) list3.get(i);
                    ux1Var.b();
                    kk9Var.P(ux1Var);
                }
                list3.clear();
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    ux1 ux1Var2 = (ux1) objArr[(i2 << 3) + i4];
                                    ux1Var2.b();
                                    kk9Var.P(ux1Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                uv7Var.b();
                Object[] objArr2 = uv7Var2.b;
                long[] jArr2 = uv7Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((ux1) objArr2[(i5 << 3) + i7]).k();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
                uv7Var2.b();
                uv7Var3.b();
                Object[] objArr3 = uv7Var4.b;
                long[] jArr3 = uv7Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    ux1 ux1Var3 = (ux1) objArr3[(i8 << 3) + i10];
                                    ux1Var3.b();
                                    kk9Var.P(ux1Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                    }
                }
                uv7Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void p(List list, kk9 kk9Var) {
        list.clear();
        synchronized (kk9Var.d) {
            try {
                ArrayList arrayList = kk9Var.l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((ls7) arrayList.get(i));
                }
                kk9Var.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        m82 m82Var = (m82) obj;
        jk9 jk9Var = new jk9(this.G, (m42) obj3);
        jk9Var.F = (xq7) obj2;
        jk9Var.invokeSuspend(pvc.a);
        return n82.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x013e -> B:44:0x0140). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0234 -> B:12:0x009b). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

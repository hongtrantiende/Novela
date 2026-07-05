package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l25  reason: default package */
/* loaded from: classes.dex */
public final class l25 implements vd2 {
    public final ArrayList a;

    public l25(int i) {
        this.a = new ArrayList(i);
    }

    @Override // defpackage.vd2
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((wd2) arrayList.get(0)).b) {
            return ((wd2) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            wd2 wd2Var = (wd2) arrayList.get(i);
            long j2 = wd2Var.b;
            long j3 = wd2Var.b;
            if (j < j2) {
                long j4 = ((wd2) arrayList.get(i - 1)).d;
                if (j4 != -9223372036854775807L && j4 > j && j4 < j3) {
                    return j4;
                }
                return j3;
            }
        }
        long j5 = ((wd2) yf2.t(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // defpackage.vd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(defpackage.wd2 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            defpackage.wq9.s(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r9 = r9.a
            int r3 = r9.size()
            int r3 = r3 - r6
        L2b:
            if (r3 < 0) goto L4e
            java.lang.Object r4 = r9.get(r3)
            wd2 r4 = (defpackage.wd2) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L3e
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L3e:
            java.lang.Object r4 = r9.get(r3)
            wd2 r4 = (defpackage.wd2) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L4b
            r2 = r5
        L4b:
            int r3 = r3 + (-1)
            goto L2b
        L4e:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l25.b(wd2, long):boolean");
    }

    @Override // defpackage.vd2
    public qs5 c(long j) {
        int g = g(j);
        if (g == 0) {
            ms5 ms5Var = qs5.b;
            return mm9.e;
        }
        wd2 wd2Var = (wd2) this.a.get(g - 1);
        long j2 = wd2Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            ms5 ms5Var2 = qs5.b;
            return mm9.e;
        }
        return wd2Var.a;
    }

    @Override // defpackage.vd2
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.vd2
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((wd2) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((wd2) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                wd2 wd2Var = (wd2) arrayList.get(i - 1);
                long j3 = wd2Var.d;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return wd2Var.b;
            }
        }
        wd2 wd2Var2 = (wd2) yf2.t(arrayList);
        long j4 = wd2Var2.d;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return wd2Var2.b;
    }

    @Override // defpackage.vd2
    public void e(long j) {
        int g = g(j);
        if (g == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j2 = ((wd2) arrayList.get(g - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            g--;
        }
        arrayList.subList(0, g).clear();
    }

    public void f(Object obj) {
        if (obj != null) {
            boolean z = obj instanceof Object[];
            ArrayList arrayList = this.a;
            if (z) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                }
            } else if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    arrayList.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                Class<?> cls = obj.getClass();
                throw new UnsupportedOperationException("Don't know how to spread " + cls);
            }
        }
    }

    public int g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (j < ((wd2) arrayList.get(i)).b) {
                    return i;
                }
                i++;
            } else {
                return arrayList.size();
            }
        }
    }

    public l25(ArrayList arrayList) {
        this.a = arrayList;
    }

    public l25() {
        this.a = new ArrayList();
    }

    public l25(ArrayList arrayList, int i, int i2) {
        this.a = arrayList;
    }
}

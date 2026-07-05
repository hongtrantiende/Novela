package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u97  reason: default package */
/* loaded from: classes.dex */
public final class u97 implements vd2 {
    public static final fy1 b = new fy1(new k01(new uz0(10), az7.b), new k01(new uz0(11), az7.c));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.vd2
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((wd2) arrayList.get(i)).b;
            long j4 = ((wd2) arrayList.get(i)).d;
            if (j < j3) {
                if (j2 == -9223372036854775807L) {
                    j2 = j3;
                } else {
                    j2 = Math.min(j2, j3);
                }
            } else {
                if (j < j4) {
                    if (j2 == -9223372036854775807L) {
                        j2 = j4;
                    } else {
                        j2 = Math.min(j2, j4);
                    }
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.vd2
    public final boolean b(wd2 wd2Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = wd2Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        if (wd2Var.c != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.s(z2);
        if (j2 <= j && j < wd2Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((wd2) arrayList.get(size)).b) {
                arrayList.add(size + 1, wd2Var);
                return z3;
            }
        }
        arrayList.add(0, wd2Var);
        return z3;
    }

    @Override // defpackage.vd2
    public final qs5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((wd2) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    wd2 wd2Var = (wd2) arrayList.get(i);
                    if (j >= wd2Var.b && j < wd2Var.d) {
                        arrayList2.add(wd2Var);
                    }
                    if (j < wd2Var.b) {
                        break;
                    }
                }
                mm9 v = qs5.v(b, arrayList2);
                ls5 i2 = qs5.i();
                for (int i3 = 0; i3 < v.d; i3++) {
                    i2.c(((wd2) v.get(i3)).a);
                }
                return i2.g();
            }
        }
        ms5 ms5Var = qs5.b;
        return mm9.e;
    }

    @Override // defpackage.vd2
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.vd2
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((wd2) arrayList.get(0)).b) {
                long j2 = ((wd2) arrayList.get(0)).b;
                for (int i = 0; i < arrayList.size(); i++) {
                    long j3 = ((wd2) arrayList.get(i)).b;
                    long j4 = ((wd2) arrayList.get(i)).d;
                    if (j4 <= j) {
                        j2 = Math.max(j2, j4);
                    } else if (j3 > j) {
                        break;
                    } else {
                        j2 = Math.max(j2, j3);
                    }
                }
                return j2;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.vd2
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = (j > ((wd2) arrayList.get(i)).b ? 1 : (j == ((wd2) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((wd2) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (i2 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}

package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq  reason: default package */
/* loaded from: classes.dex */
public final class vq implements b37 {
    public final er a;

    public vq(er erVar) {
        this.a = erVar;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).J(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i2)).J(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        yk8 yk8Var;
        yq yqVar;
        yq yqVar2;
        int size = list.size();
        mw8[] mw8VarArr = new mw8[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            w27 w27Var = (w27) list.get(i);
            Object S = w27Var.S();
            if (S instanceof yq) {
                yqVar2 = (yq) S;
            } else {
                yqVar2 = null;
            }
            if (yqVar2 != null && ((Boolean) yqVar2.a.getValue()).booleanValue()) {
                mw8 M = w27Var.M(j);
                int i2 = M.a;
                long j3 = M.b & 4294967295L;
                mw8VarArr[i] = M;
                j2 = j3 | (i2 << 32);
            }
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            w27 w27Var2 = (w27) list.get(i3);
            if (mw8VarArr[i3] == null) {
                mw8VarArr[i3] = w27Var2.M(j);
            }
        }
        if (e37Var.I0()) {
            yk8Var = new yk8(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                mw8 mw8Var = mw8VarArr[i6];
                if (mw8Var != null) {
                    Object S2 = ((w27) list.get(i6)).S();
                    if (S2 instanceof yq) {
                        yqVar = (yq) S2;
                    } else {
                        yqVar = null;
                    }
                    if (yqVar == null || !((Boolean) yqVar.b.getValue()).booleanValue()) {
                        int i7 = mw8Var.a;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                        int i8 = mw8Var.b;
                        if (i8 > i5) {
                            i5 = i8;
                        }
                    }
                }
            }
            yk8Var = new yk8(Integer.valueOf(i4), Integer.valueOf(i5));
        }
        int intValue = ((Number) yk8Var.a).intValue();
        int intValue2 = ((Number) yk8Var.b).intValue();
        if (!e37Var.I0()) {
            this.a.d.setValue(new zy5((intValue << 32) | (intValue2 & 4294967295L)));
        }
        return e37Var.q0(intValue, intValue2, ls3.a, new uq(mw8VarArr, this, intValue, intValue2));
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).F(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i2)).F(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).j(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i2)).j(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).n0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i2)).n0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}

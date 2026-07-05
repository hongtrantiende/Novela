package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ec4  reason: default package */
/* loaded from: classes.dex */
public final class ec4 {
    public static final /* synthetic */ int c = 0;
    public final iqa a = iqa.f();
    public boolean b;

    static {
        new ec4(0);
    }

    public ec4(int i) {
        a();
        a();
    }

    public static void b(fl1 fl1Var, fld fldVar, int i, Object obj) {
        if (fldVar == fld.d) {
            fl1Var.B(i, 3);
            ((x2) obj).b(fl1Var);
            fl1Var.B(i, 4);
            return;
        }
        fl1Var.B(i, fldVar.b);
        switch (fldVar.ordinal()) {
            case 0:
                fl1Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                fl1Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                fl1Var.F(((Long) obj).longValue());
                return;
            case 3:
                fl1Var.F(((Long) obj).longValue());
                return;
            case 4:
                fl1Var.w(((Integer) obj).intValue());
                return;
            case 5:
                fl1Var.u(((Long) obj).longValue());
                return;
            case 6:
                fl1Var.s(((Integer) obj).intValue());
                return;
            case 7:
                fl1Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof c31) {
                    fl1Var.q((c31) obj);
                    return;
                } else {
                    fl1Var.A((String) obj);
                    return;
                }
            case 9:
                ((x2) obj).b(fl1Var);
                return;
            case 10:
                x2 x2Var = (x2) obj;
                fl1Var.D(((qw4) x2Var).a(null));
                x2Var.b(fl1Var);
                return;
            case 11:
                if (obj instanceof c31) {
                    fl1Var.q((c31) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                fl1Var.D(length);
                fl1Var.n(bArr, 0, length);
                return;
            case 12:
                fl1Var.D(((Integer) obj).intValue());
                return;
            case 13:
                fl1Var.w(((Integer) obj).intValue());
                return;
            case 14:
                fl1Var.s(((Integer) obj).intValue());
                return;
            case 15:
                fl1Var.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                fl1Var.D((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                fl1Var.F((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        iqa iqaVar = this.a;
        int size = iqaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = iqaVar.c(i);
            if (c2.getValue() instanceof qw4) {
                qw4 qw4Var = (qw4) c2.getValue();
                qw4Var.getClass();
                z89 z89Var = z89.c;
                z89Var.getClass();
                z89Var.a(qw4Var.getClass()).b(qw4Var);
                qw4Var.i();
            }
        }
        if (!iqaVar.c) {
            if (iqaVar.a.size() <= 0) {
                Iterator it = iqaVar.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    vm1.h();
                    return;
                }
            } else {
                iqaVar.c(0).getKey().getClass();
                vm1.h();
                return;
            }
        }
        if (!iqaVar.c) {
            if (iqaVar.b.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(iqaVar.b);
            }
            iqaVar.b = unmodifiableMap;
            if (iqaVar.e.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(iqaVar.e);
            }
            iqaVar.e = unmodifiableMap2;
            iqaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        ec4 ec4Var = new ec4();
        iqa iqaVar = this.a;
        if (iqaVar.a.size() <= 0) {
            Iterator it = iqaVar.d().iterator();
            if (!it.hasNext()) {
                return ec4Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                vm1.h();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry c2 = iqaVar.c(0);
        if (c2.getKey() != null) {
            vm1.h();
            return null;
        }
        c2.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec4)) {
            return false;
        }
        return this.a.equals(((ec4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ec4() {
    }
}

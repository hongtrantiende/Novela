package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ bl(int i, String str, int i2) {
        this.a = i2;
        this.c = i;
        this.b = str;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int length;
        iw9 h1;
        hgb hgbVar;
        int i = this.a;
        int i2 = -1;
        int i3 = 0;
        pvc pvcVar = pvc.a;
        String str = this.b;
        int i4 = this.c;
        switch (i) {
            case 0:
                o9b o9bVar = (o9b) obj;
                o9bVar.getClass();
                int i5 = i4 + 1;
                if (str == null) {
                    o9bVar.r(i5);
                } else {
                    o9bVar.g(i5, str);
                }
                return pvcVar;
            case 1:
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                int i6 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!((vh8) it.next()).a.equals(str)) {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                    }
                }
                if (i6 < 0) {
                    Iterator it2 = list.iterator();
                    int i7 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((vh8) it2.next()).b == i4) {
                                i2 = i7;
                            } else {
                                i7++;
                            }
                        }
                    }
                    i6 = i2;
                }
                if (i6 >= 0) {
                    i3 = i6;
                }
                return Integer.valueOf(i3);
            case 2:
                frb frbVar = (frb) obj;
                fxb fxbVar = frbVar.C;
                if (fxbVar != null) {
                    long j = fxbVar.a;
                    b23.m(frbVar, (int) (j >> 32), (int) (j & 4294967295L), str);
                } else {
                    b23.m(frbVar, fxb.g(frbVar.f), fxb.f(frbVar.f), str);
                }
                int g = fxb.g(frbVar.f);
                if (i4 > 0) {
                    length = (g + i4) - 1;
                } else {
                    length = (g + i4) - str.length();
                }
                int n = dce.n(length, 0, frbVar.c.length());
                frbVar.g(sze.a(n, n));
                return pvcVar;
            case 3:
                e56 e56Var = (e56) obj;
                e56Var.getClass();
                z87.x(e56Var, "code", Integer.valueOf(i4));
                z87.y(e56Var, "message", str);
                return pvcVar;
            case 4:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                h1 = cw9Var.h1("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    h1.b0(1, str);
                    h1.m(2, i4);
                    int t = que.t(h1, "work_spec_id");
                    int t2 = que.t(h1, "generation");
                    int t3 = que.t(h1, "system_id");
                    if (h1.Z0()) {
                        hgbVar = new hgb(h1.s0(t), (int) h1.getLong(t2), (int) h1.getLong(t3));
                    } else {
                        hgbVar = null;
                    }
                    return hgbVar;
                } finally {
                }
            case 5:
                List list2 = (List) obj;
                list2.getClass();
                Iterator it3 = list2.iterator();
                int i8 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (!((wh8) it3.next()).a.equals(str)) {
                            i8++;
                        }
                    } else {
                        i8 = -1;
                    }
                }
                if (i8 < 0) {
                    Iterator it4 = list2.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            if (((wh8) it4.next()).b == i4) {
                                i2 = i9;
                            } else {
                                i9++;
                            }
                        }
                    }
                    i8 = i2;
                }
                if (i8 >= 0) {
                    i3 = i8;
                }
                return Integer.valueOf(i3);
            case 6:
                cw9 cw9Var2 = (cw9) obj;
                cw9Var2.getClass();
                h1 = cw9Var2.h1("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    h1.b0(1, str);
                    h1.m(2, i4);
                    h1.Z0();
                    return pvcVar;
                } finally {
                }
            default:
                cw9 cw9Var3 = (cw9) obj;
                cw9Var3.getClass();
                h1 = cw9Var3.h1("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    h1.m(1, i4);
                    h1.b0(2, str);
                    h1.Z0();
                    return pvcVar;
                } finally {
                }
        }
    }

    public /* synthetic */ bl(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}

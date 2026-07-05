package defpackage;

import android.graphics.Shader;
import android.os.Build;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kte  reason: default package */
/* loaded from: classes3.dex */
public abstract class kte {
    public static final tu1 a = new tu1(new cv1(16), false, 1933057964);
    public static final tu1 b = new tu1(new cv1(17), false, -156134813);
    public static final u13 c = new u13(1.0f, 1.0f);
    public static final yy9 d = new yy9(new zy9(18), new az9(10));
    public static final yy9 e = new yy9(new zy9(19), new az9(11));
    public static final yy9 f = new yy9(new zy9(20), new az9(12));
    public static final yy9 g = new yy9(new zy9(21), new az9(13));
    public static final yy9 h = new yy9(new zy9(22), new az9(14));

    public static final qv5 a(qv5 qv5Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dm0 dm0Var = ((xl0) it.next()).c;
            if (dm0Var instanceof cm0) {
                cm0 cm0Var = (cm0) dm0Var;
                qv5Var = d(qv5Var, new qv5(cm0Var.a, cm0Var.b));
            }
        }
        return qv5Var;
    }

    public static final qv5 b(qv5 qv5Var, String str) {
        if (str.length() == 0) {
            return qv5Var;
        }
        String u = nk2.u(qv5Var.a, str);
        List list = qv5Var.b;
        list.getClass();
        return new qv5(u, list);
    }

    public static final mq7 c(f03 f03Var, int i) {
        mq7 mq7Var = ((mq7) f03Var).a.f;
        if (mq7Var != null && (mq7Var.d & i) != 0) {
            while (mq7Var != null) {
                int i2 = mq7Var.c;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return mq7Var;
                    }
                    mq7Var = mq7Var.f;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final qv5 d(qv5 qv5Var, qv5 qv5Var2) {
        iyb iybVar;
        String str = qv5Var2.a;
        List<iyb> list = qv5Var2.b;
        if (str.length() == 0 && list.isEmpty()) {
            return qv5Var;
        }
        String str2 = qv5Var.a;
        int length = str2.length();
        String u = nk2.u(str2, str);
        List list2 = qv5Var.b;
        ArrayList arrayList = new ArrayList();
        for (iyb iybVar2 : list) {
            int length2 = str.length() + str2.length();
            int i = iybVar2.a + length;
            int i2 = iybVar2.b + length;
            if (i >= 0 && i2 > i && i2 <= length2) {
                iybVar = iyb.a(iybVar2, i, i2);
            } else {
                iybVar = null;
            }
            if (iybVar != null) {
                arrayList.add(iybVar);
            }
        }
        return new qv5(u, sl1.n0(list2, arrayList));
    }

    public static final String e(String str, List list) {
        gm9 gm9Var = n6d.a;
        String r0 = k4b.r0(4, String.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(r0.length());
        for (int i = 0; i < r0.length(); i++) {
            arrayList.add(Character.valueOf((char) (r0.charAt(i) + '1')));
        }
        String n = hl5.n("mask", sl1.i0(arrayList, "", null, null, null, 62), "mask");
        list.add(new yk8(n, str));
        return n;
    }

    public static final en2 f(ubb ubbVar) {
        ubbVar.getClass();
        return new en2(ubbVar.a, ubbVar.b, ubbVar.c, ubbVar.d, ubbVar.e, ubbVar.f, ubbVar.g, ubbVar.h, ubbVar.i, ubbVar.j, ubbVar.k, ubbVar.l);
    }

    public static final float g(vl6 vl6Var) {
        vl6Var.getClass();
        int i = vl6Var.u;
        if (i > 0) {
            return (float) (((dce.n(vl6Var.s, 0, i - 1) + dce.l(vl6Var.t, 0.0d, 1.0d)) * 100.0d) / i);
        }
        return nae.e;
    }

    public static final boolean h(vl6 vl6Var) {
        vl6Var.getClass();
        return c16.i(vl6Var.B.get("hide_chapter_name"), "true");
    }

    public static final boolean i(vl6 vl6Var) {
        int i;
        vl6Var.getClass();
        int i2 = vl6Var.f;
        if (i2 != 10 && i2 != 20 && (i = vl6Var.e) != 4 && i != 3) {
            return true;
        }
        return false;
    }

    public static c9b j(c9b c9bVar) {
        if (!(c9bVar instanceof e9b)) {
            if (c9bVar instanceof d9b) {
                return c9bVar;
            }
            if (c9bVar instanceof Serializable) {
                return new d9b(c9bVar);
            }
            return new e9b(c9bVar);
        }
        return c9bVar;
    }

    public static final Shader.TileMode k(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                return ih.l();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static int l(long j) {
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}

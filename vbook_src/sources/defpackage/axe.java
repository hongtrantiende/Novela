package defpackage;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: axe  reason: default package */
/* loaded from: classes.dex */
public abstract class axe {
    public static qs9 b;
    public static final tu1 a = new tu1(new iv1(8), false, 1044111493);
    public static final byte[] c = new byte[0];

    public static final af a() {
        return new af();
    }

    public static final boolean b(int i, KeyEvent keyEvent) {
        if (((int) (gae.i(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static final void c(tv7 tv7Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = tv7Var.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = tv7Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof uv7) {
                ((uv7) obj3).a(obj2);
            } else if (obj3 != obj2) {
                uv7 uv7Var = new uv7();
                uv7Var.a(obj3);
                uv7Var.a(obj2);
                obj2 = uv7Var;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~f;
            tv7Var.b[i] = obj;
            tv7Var.c[i] = obj2;
            return;
        }
        tv7Var.c[f] = obj2;
    }

    public static final float d(rh8 rh8Var, rv4 rv4Var) {
        rh8Var.getClass();
        return zbe.n(rh8Var, (tc6) rv4Var.j(dy1.n));
    }

    public static long e(boolean z, int i, ng0 ng0Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        long scalb;
        ng0Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j8 = j2 + 900000;
                if (j6 < j8) {
                    return j8;
                }
            }
            return j6;
        } else if (z) {
            if (ng0Var == ng0.b) {
                scalb = j * i;
            } else {
                scalb = Math.scalb((float) j, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        } else if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
            } else {
                j7 = j2 + j5;
            }
            if (j4 != j5 && i2 == 0) {
                return (j5 - j4) + j7;
            }
            return j7;
        } else if (j2 == -1) {
            return Long.MAX_VALUE;
        } else {
            return j2 + j3;
        }
    }

    public static final float f(rh8 rh8Var, rv4 rv4Var) {
        rh8Var.getClass();
        return zbe.o(rh8Var, (tc6) rv4Var.j(dy1.n));
    }

    public static long[] g(long[]... jArr) {
        boolean z;
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        wq9.q("the total number of elements (%s) in the arrays must fit in an int", j, z);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static tv7 h() {
        long[] jArr = tz9.a;
        return new tv7();
    }

    public static final oc5 i() {
        Map map;
        oc5 oc5Var = oc5.g;
        oc5Var.getClass();
        vr1 vr1Var = new vr1(0);
        Map map2 = oc5Var.c;
        map2.getClass();
        if (map2.isEmpty()) {
            map = Collections.singletonMap("image", vr1Var);
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("image", vr1Var);
            map = linkedHashMap;
        }
        return oc5.a(oc5Var, null, map, 8187).b("img", new ur1(2)).b("emoji", new ur1(0)).b("p", new ur1(1));
    }

    public static final jj j(jj jjVar) {
        Bitmap bitmap = jjVar.a;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float min = Math.min(200.0f / width, 200.0f / height);
        int i = (int) (width * min);
        int i2 = (int) (height * min);
        jj d = twe.d(i, i2, 0, 28);
        k61.m(zbe.a(d), jjVar, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L), 0L, (i << 32) | (i2 & 4294967295L), lre.c(), 10);
        return d;
    }

    public static final nq7 k(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new nm0(xt4Var));
    }

    public static nq7 l(nq7 nq7Var, float f, float f2, float f3, float f4, float f5, wea weaVar, boolean z, wl0 wl0Var, int i) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        ba5 ba5Var;
        boolean z2;
        wl0 wl0Var2;
        if ((i & 1) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f;
        }
        if ((i & 2) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f2;
        }
        if ((i & 4) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f3;
        }
        if ((i & 32) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f4;
        }
        if ((i & 256) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f5;
        }
        long j = ckc.b;
        if ((i & 2048) != 0) {
            ba5Var = lre.g;
        } else {
            ba5Var = weaVar;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        long j2 = u15.a;
        if ((i & 262144) != 0) {
            wl0Var2 = null;
        } else {
            wl0Var2 = wl0Var;
        }
        return nq7Var.a0(new q15(f6, f7, f8, f9, f10, j, ba5Var, z2, j2, j2, wl0Var2, hc6.a));
    }

    public static int m(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final xl0 p(String str, List list) {
        str.getClass();
        String q2dVar = hre.q().toString();
        cm0 cm0Var = new cm0(str, ks3.a);
        xl0 xl0Var = new xl0(q2dVar, en0.a, cm0Var);
        if (!(cm0Var instanceof cm0)) {
            cm0Var = null;
        }
        if (cm0Var != null) {
            return xl0.a(xl0Var, null, cm0.a(cm0Var, list), null, 11);
        }
        return xl0Var;
    }

    public static final boolean q(tv7 tv7Var, Object obj, Object obj2) {
        Object g = tv7Var.g(obj);
        if (g == null) {
            return false;
        }
        if (g instanceof uv7) {
            uv7 uv7Var = (uv7) g;
            boolean l = uv7Var.l(obj2);
            if (l && uv7Var.g()) {
                tv7Var.l(obj);
            }
            return l;
        } else if (!g.equals(obj2)) {
            return false;
        } else {
            tv7Var.l(obj);
            return true;
        }
    }

    public static final void r(tv7 tv7Var, Object obj) {
        boolean z;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = tv7Var.b[i4];
                            Object obj3 = tv7Var.c[i4];
                            if (obj3 instanceof uv7) {
                                uv7 uv7Var = (uv7) obj3;
                                uv7Var.l(obj);
                                z = uv7Var.g();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                tv7Var.m(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static final ArrayList s(List list) {
        cm0 cm0Var;
        iyb iybVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xl0 xl0Var = (xl0) it.next();
            dm0 dm0Var = xl0Var.c;
            if (dm0Var instanceof cm0) {
                cm0Var = (cm0) dm0Var;
            } else {
                cm0Var = null;
            }
            if (cm0Var != null) {
                List<iyb> list2 = cm0Var.b;
                String str = cm0Var.a;
                if (str.length() != 0) {
                    List<gp6> a2 = hp6.a(str);
                    ArrayList arrayList2 = new ArrayList();
                    for (gp6 gp6Var : a2) {
                        if (list2 == null || !list2.isEmpty()) {
                            for (iyb iybVar2 : list2) {
                                if ((iybVar2.c instanceof pva) && iybVar2.a < gp6Var.b && iybVar2.b > gp6Var.a) {
                                    iybVar = null;
                                    break;
                                }
                            }
                        }
                        iybVar = new iyb(gp6Var.a, gp6Var.b, new pva(gp6Var.c));
                        if (iybVar != null) {
                            arrayList2.add(iybVar);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        xl0Var = xl0.a(xl0Var, null, cm0.a(cm0Var, sl1.n0(list2, arrayList2)), null, 11);
                    }
                }
            }
            arrayList.add(xl0Var);
        }
        return arrayList;
    }

    public static final void t(ArrayList arrayList, o40 o40Var, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        qv5 d = o40Var.d(sl1.C0(arrayList));
        if (!k4b.j0(d.a)) {
            arrayList2.add(p(d.a, d.b));
        }
        arrayList.clear();
    }

    public abstract void n(Throwable th);

    public abstract void o(oaa oaaVar);
}

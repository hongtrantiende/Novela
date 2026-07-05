package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kn4  reason: default package */
/* loaded from: classes.dex */
public final class kn4 implements Comparator {
    public final /* synthetic */ int a;
    public static final kn4 b = new kn4(0);
    public static final /* synthetic */ kn4 c = new kn4(1);
    public static final kn4 d = new kn4(2);
    public static final kn4 e = new kn4(3);
    public static final kn4 f = new kn4(4);
    public static final kn4 C = new kn4(5);
    public static final /* synthetic */ kn4 D = new kn4(6);

    public /* synthetic */ kn4(int i) {
        this.a = i;
    }

    public static float a(kga kgaVar) {
        if (kgaVar.b.h() == nae.e && (kgaVar instanceof kga) && kgaVar.G == null) {
            return -1.0f;
        }
        return kgaVar.b.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                hn4 hn4Var = (hn4) obj;
                hn4 hn4Var2 = (hn4) obj2;
                if (dae.t(hn4Var) && dae.t(hn4Var2)) {
                    od6 v = voe.v(hn4Var);
                    od6 v2 = voe.v(hn4Var2);
                    if (!c16.i(v, v2)) {
                        od6[] od6VarArr = new od6[16];
                        int i = 0;
                        while (v != null) {
                            int i2 = i + 1;
                            if (od6VarArr.length < i2) {
                                int length = od6VarArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(od6VarArr, 0, r4, 0, length);
                                od6VarArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(od6VarArr, 0, od6VarArr, 0 + 1, i + 0);
                            }
                            od6VarArr[0] = v;
                            i++;
                            v = v.v();
                        }
                        od6[] od6VarArr2 = new od6[16];
                        int i3 = 0;
                        while (v2 != null) {
                            int i4 = i3 + 1;
                            if (od6VarArr2.length < i4) {
                                int length2 = od6VarArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(od6VarArr2, 0, r42, 0, length2);
                                od6VarArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(od6VarArr2, 0, od6VarArr2, 0 + 1, i3 + 0);
                            }
                            od6VarArr2[0] = v2;
                            i3++;
                            v2 = v2.v();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (c16.i(od6VarArr[i5], od6VarArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return c16.l(od6VarArr[i5].w(), od6VarArr2[i5].w());
                        }
                        vs.k("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else if (dae.t(hn4Var)) {
                    return -1;
                } else {
                    if (dae.t(hn4Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                return Float.compare(a((kga) obj), a((kga) obj2));
            case 2:
                rk9 h = ((b8a) obj).h();
                rk9 h2 = ((b8a) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare == 0) {
                    int compare2 = Float.compare(h.b, h2.b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h.d, h2.d);
                        if (compare3 == 0) {
                            return Float.compare(h.c, h2.c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 3:
                od6 od6Var = (od6) obj;
                od6 od6Var2 = (od6) obj2;
                int l = c16.l(od6Var2.M, od6Var.M);
                if (l == 0) {
                    return c16.l(od6Var.hashCode(), od6Var2.hashCode());
                }
                return l;
            case 4:
                rk9 h3 = ((b8a) obj).h();
                rk9 h4 = ((b8a) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h3.b, h4.b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h3.d, h4.d);
                        if (compare6 == 0) {
                            return Float.compare(h4.a, h3.a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            case 5:
                yk8 yk8Var = (yk8) obj;
                yk8 yk8Var2 = (yk8) obj2;
                int compare7 = Float.compare(((rk9) yk8Var.a).b, ((rk9) yk8Var2.a).b);
                if (compare7 == 0) {
                    return Float.compare(((rk9) yk8Var.a).d, ((rk9) yk8Var2.a).d);
                }
                return compare7;
            case 6:
                ((zvd) obj2).getClass();
                ((zvd) obj).getClass();
                return 0;
            case 7:
                return hxe.j((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
            case 8:
                return hxe.j(((Field) obj).getName(), ((Field) obj2).getName());
            case 9:
                return hxe.j(((oy7) obj).a, ((oy7) obj2).a);
            case 10:
                return Integer.valueOf(((os) obj).b).compareTo(Integer.valueOf(((os) obj2).b));
            case 11:
                return Integer.valueOf(((os) obj).b).compareTo(Integer.valueOf(((os) obj2).b));
            case 12:
                return Long.valueOf(((tq0) obj2).o).compareTo(Long.valueOf(((tq0) obj).o));
            case 13:
                return Long.valueOf(((tq0) obj2).o).compareTo(Long.valueOf(((tq0) obj).o));
            case 14:
                return Long.valueOf(((hk2) obj2).G).compareTo(Long.valueOf(((hk2) obj).G));
            case 15:
                return Long.valueOf(((hk2) obj2).G).compareTo(Long.valueOf(((hk2) obj).G));
            case 16:
                return Long.valueOf(((j62) obj2).k).compareTo(Long.valueOf(((j62) obj).k));
            case 17:
                return Long.valueOf(((fa7) obj).a()).compareTo(Long.valueOf(((fa7) obj2).a()));
            case 18:
                throw s21.i(obj);
            case 19:
                return Integer.valueOf(((we0) obj).a).compareTo(Integer.valueOf(((we0) obj2).a));
            case 20:
                return Long.valueOf(((i86) obj2).a).compareTo(Long.valueOf(((i86) obj).a));
            case 21:
                od6 od6Var3 = (od6) obj;
                od6 od6Var4 = (od6) obj2;
                int l2 = c16.l(od6Var3.M, od6Var4.M);
                if (l2 == 0) {
                    return c16.l(od6Var3.hashCode(), od6Var4.hashCode());
                }
                return l2;
            case 22:
                return hxe.j((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 23:
                return hxe.j((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 24:
                return Boolean.valueOf(((n93) obj2).k).compareTo(Boolean.valueOf(((n93) obj).k));
            case 25:
                return Boolean.valueOf(((n93) obj2).k).compareTo(Boolean.valueOf(((n93) obj).k));
            case 26:
                return hxe.j(((l54) obj).b, ((l54) obj2).b);
            case 27:
                return Float.valueOf(((ob3) obj).a).compareTo(Float.valueOf(((ob3) obj2).a));
            case 28:
                m66 m66Var = pe4.a;
                return hxe.j(m66Var.y0((hn8) obj).e, m66Var.y0((hn8) obj2).e);
            default:
                xv4 xv4Var = (xv4) obj;
                xv4 xv4Var2 = (xv4) obj2;
                RecyclerView recyclerView = xv4Var.d;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (xv4Var2.d == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    if (recyclerView == null) {
                        return 1;
                    }
                } else {
                    boolean z3 = xv4Var.a;
                    if (z3 != xv4Var2.a) {
                        if (!z3) {
                            return 1;
                        }
                    } else {
                        int i6 = xv4Var2.b - xv4Var.b;
                        if (i6 == 0) {
                            int i7 = xv4Var.c - xv4Var2.c;
                            if (i7 == 0) {
                                return 0;
                            }
                            return i7;
                        }
                        return i6;
                    }
                }
                return -1;
        }
    }
}

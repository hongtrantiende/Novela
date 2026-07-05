package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ijd  reason: default package */
/* loaded from: classes.dex */
public class ijd extends qjd {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public cx5[] d;
    public cx5 e;
    public tjd f;
    public cx5 g;
    public int h;
    public db3 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public ijd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar);
        this.e = null;
        this.l = new Rect[10];
        this.m = new Rect[10];
        this.c = windowInsets;
    }

    private db3 D(View view) {
        Display display;
        int i;
        int i2;
        int i3;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return db3.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i4 = 0;
        ru9 m = ih.m(display, 0);
        ru9 m2 = ih.m(display, 1);
        ru9 m3 = ih.m(display, 2);
        ru9 m4 = ih.m(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (m != null) {
            i = m.b;
        } else {
            i = 0;
        }
        if (m2 != null) {
            i2 = m2.b;
        } else {
            i2 = 0;
        }
        if (m3 != null) {
            i3 = m3.b;
        } else {
            i3 = 0;
        }
        if (m4 != null) {
            i4 = m4.b;
        }
        return db3.a(i5, i6, false, i, i2, i3, i4);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[iwe.g(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] F(cx5 cx5Var) {
        ArrayList arrayList = new ArrayList();
        int i = cx5Var.a;
        int i2 = cx5Var.d;
        int i3 = cx5Var.c;
        int i4 = cx5Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, cx5Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private cx5 G(int i, boolean z) {
        cx5 cx5Var = cx5.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                cx5Var = cx5.a(cx5Var, H(i2, z));
            }
        }
        return cx5Var;
    }

    private cx5 I() {
        tjd tjdVar = this.f;
        if (tjdVar != null) {
            return tjdVar.a.l();
        }
        return cx5.e;
    }

    private cx5 J(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!n) {
                L();
            }
            Method method = o;
            if (method != null && p != null && q != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) q.get(r.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return cx5.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        xk5.q("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qjd
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.qjd
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.qjd
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public cx5 H(int i, boolean z) {
        int i2;
        bb3 h;
        int i3;
        int i4;
        int i5;
        cx5 cx5Var = cx5.e;
        int i6 = 0;
        if (i != 1) {
            cx5 cx5Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    tjd tjdVar = this.f;
                                    if (tjdVar != null) {
                                        h = tjdVar.a.h();
                                    } else {
                                        h = h();
                                    }
                                    if (h != null) {
                                        int i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 28) {
                                            i3 = ru.v(h.a);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i4 = ru.x(h.a);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i5 = ru.w(h.a);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i6 = ru.u(h.a);
                                        }
                                        return cx5.b(i3, i4, i5, i6);
                                    }
                                }
                            } else {
                                return o();
                            }
                        } else {
                            return k();
                        }
                    } else {
                        return m();
                    }
                } else {
                    cx5[] cx5VarArr = this.d;
                    if (cx5VarArr != null) {
                        cx5Var2 = cx5VarArr[iwe.g(8)];
                    }
                    if (cx5Var2 != null) {
                        return cx5Var2;
                    }
                    cx5 n2 = n();
                    cx5 I = I();
                    int i8 = n2.d;
                    if (i8 > I.d) {
                        return cx5.b(0, 0, 0, i8);
                    }
                    cx5 cx5Var3 = this.g;
                    if (cx5Var3 != null && !cx5Var3.equals(cx5Var) && (i2 = this.g.d) > I.d) {
                        return cx5.b(0, 0, 0, i2);
                    }
                }
            } else if (z) {
                cx5 I2 = I();
                cx5 l = l();
                return cx5.b(Math.max(I2.a, l.a), 0, Math.max(I2.c, l.c), Math.max(I2.d, l.d));
            } else if ((this.h & 2) == 0) {
                cx5 n3 = n();
                tjd tjdVar2 = this.f;
                if (tjdVar2 != null) {
                    cx5Var2 = tjdVar2.a.l();
                }
                int i9 = n3.d;
                if (cx5Var2 != null) {
                    i9 = Math.min(i9, cx5Var2.d);
                }
                return cx5.b(n3.a, 0, n3.c, i9);
            }
        } else if (z) {
            return cx5.b(0, Math.max(I().b, n().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return cx5.b(0, n().b, 0, 0);
            }
        }
        return cx5Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(cx5.e);
    }

    @Override // defpackage.qjd
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        cx5 J = J(view);
        if (J == null) {
            J = cx5.e;
        }
        x(J);
    }

    @Override // defpackage.qjd
    public void e(tjd tjdVar) {
        tjdVar.a.y(this.f);
        cx5 cx5Var = this.g;
        qjd qjdVar = tjdVar.a;
        qjdVar.x(cx5Var);
        qjdVar.A(this.h);
        qjdVar.v(this.i);
        qjdVar.B(this.l);
        qjdVar.C(this.m);
    }

    @Override // defpackage.qjd
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ijd ijdVar = (ijd) obj;
        if (!Objects.equals(this.g, ijdVar.g) || !M(this.h, ijdVar.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qjd
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.qjd
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.qjd
    public cx5 i(int i) {
        return G(i, false);
    }

    @Override // defpackage.qjd
    public cx5 j(int i) {
        return G(i, true);
    }

    @Override // defpackage.qjd
    public final cx5 n() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = cx5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.qjd
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.qjd
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int g = iwe.g(i);
            this.l[g] = F(i(i));
            if (i != 8) {
                this.m[g] = F(j(i));
            }
        }
    }

    @Override // defpackage.qjd
    public tjd r(int i, int i2, int i3, int i4) {
        hjd ajdVar;
        tjd c = tjd.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            ajdVar = new gjd(c);
        } else if (i5 >= 35) {
            ajdVar = new fjd(c);
        } else if (i5 >= 34) {
            ajdVar = new ejd(c);
        } else if (i5 >= 31) {
            ajdVar = new djd(c);
        } else if (i5 >= 30) {
            ajdVar = new cjd(c);
        } else if (i5 >= 29) {
            ajdVar = new bjd(c);
        } else {
            ajdVar = new ajd(c);
        }
        ajdVar.h(tjd.a(n(), i, i2, i3, i4));
        ajdVar.f(tjd.a(l(), i, i2, i3, i4));
        return ajdVar.b();
    }

    @Override // defpackage.qjd
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.qjd
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qjd
    public void v(db3 db3Var) {
        this.i = db3Var;
    }

    @Override // defpackage.qjd
    public void w(cx5[] cx5VarArr) {
        this.d = cx5VarArr;
    }

    @Override // defpackage.qjd
    public void x(cx5 cx5Var) {
        this.g = cx5Var;
    }

    @Override // defpackage.qjd
    public void y(tjd tjdVar) {
        this.f = tjdVar;
    }

    public ijd(tjd tjdVar, ijd ijdVar) {
        this(tjdVar, new WindowInsets(ijdVar.c));
    }
}

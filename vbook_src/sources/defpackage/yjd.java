package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.vbook.android.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yjd  reason: default package */
/* loaded from: classes.dex */
public final class yjd {
    public static final WeakHashMap w = new WeakHashMap();
    public final rp a;
    public final rp b;
    public final rp c;
    public final rp d;
    public final rp e;
    public final rp f;
    public final rp g;
    public final rp h;
    public final rp i;
    public final a4d j;
    public final hm8 k;
    public final ovc l;
    public final a4d m;
    public final a4d n;
    public final a4d o;
    public final a4d p;
    public final a4d q;
    public final a4d r;
    public final a4d s;
    public final boolean t;
    public int u;
    public final fx5 v;

    public yjd(View view) {
        View view2;
        Object obj;
        Boolean bool;
        boolean z;
        rp i = h88.i(4, "captionBar");
        this.a = i;
        rp i2 = h88.i(Token.CASE, "displayCutout");
        this.b = i2;
        rp i3 = h88.i(8, "ime");
        this.c = i3;
        rp i4 = h88.i(32, "mandatorySystemGestures");
        this.d = i4;
        rp i5 = h88.i(2, "navigationBars");
        this.e = i5;
        rp i6 = h88.i(1, "statusBars");
        this.f = i6;
        rp i7 = h88.i(519, "systemBars");
        this.g = i7;
        rp i8 = h88.i(16, "systemGestures");
        this.h = i8;
        rp i9 = h88.i(64, "tappableElement");
        this.i = i9;
        a4d a4dVar = new a4d(new jx5(0, 0, 0, 0), "waterfall");
        this.j = a4dVar;
        this.k = yae.z(null);
        ovc ovcVar = new ovc(new ovc(i7, i3), i2);
        ovc ovcVar2 = new ovc(new ovc(new ovc(i9, i4), i8), a4dVar);
        this.l = ovcVar2;
        new ovc(ovcVar, ovcVar2);
        this.m = h88.l(4, "captionBarIgnoringVisibility");
        this.n = h88.l(2, "navigationBarsIgnoringVisibility");
        this.o = h88.l(1, "statusBarsIgnoringVisibility");
        this.p = h88.l(519, "systemBarsIgnoringVisibility");
        this.q = h88.l(64, "tappableElementIgnoringVisibility");
        this.r = new a4d(new jx5(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new a4d(new jx5(0, 0, 0, 0), "imeAnimationSource");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.t = z;
        this.v = new fx5(this);
        Field field = rcd.a;
        tjd a = lcd.a(view);
        if (a != null) {
            qjd qjdVar = a.a;
            i.f(qjdVar.u(4));
            i2.f(qjdVar.u(Token.CASE));
            i3.f(qjdVar.u(8));
            i4.f(qjdVar.u(32));
            i5.f(qjdVar.u(2));
            i6.f(qjdVar.u(1));
            i7.f(qjdVar.u(519));
            i8.f(qjdVar.u(16));
            i9.f(qjdVar.u(64));
        }
    }

    public static void b(yjd yjdVar, tjd tjdVar) {
        cx5 cx5Var;
        Path path;
        boolean z = false;
        yjdVar.a.g(tjdVar, 0);
        yjdVar.c.g(tjdVar, 0);
        yjdVar.b.g(tjdVar, 0);
        yjdVar.e.g(tjdVar, 0);
        yjdVar.f.g(tjdVar, 0);
        yjdVar.g.g(tjdVar, 0);
        yjdVar.h.g(tjdVar, 0);
        yjdVar.i.g(tjdVar, 0);
        yjdVar.d.g(tjdVar, 0);
        yjdVar.m.f(qwe.z(tjdVar.a.j(4)));
        yjdVar.n.f(qwe.z(tjdVar.a.j(2)));
        yjdVar.o.f(qwe.z(tjdVar.a.j(1)));
        yjdVar.p.f(qwe.z(tjdVar.a.j(519)));
        yjdVar.q.f(qwe.z(tjdVar.a.j(64)));
        bb3 h = tjdVar.a.h();
        a4d a4dVar = yjdVar.j;
        if (h != null) {
            cx5Var = h.a();
        } else {
            cx5Var = cx5.e;
        }
        a4dVar.f(qwe.z(cx5Var));
        yj yjVar = null;
        if (h != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = ih.j(h.a);
            } else {
                path = null;
            }
            if (path != null) {
                yjVar = new yj(path);
            }
        }
        yjdVar.k.setValue(yjVar);
        synchronized (dra.c) {
            uv7 uv7Var = dra.j.h;
            if (uv7Var != null) {
                if (uv7Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            dra.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            fx5 fx5Var = this.v;
            fx5Var.e = false;
            fx5Var.f = false;
            fx5Var.C = null;
            Field field = rcd.a;
            kcd.b(view, fx5Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(fx5Var);
            rcd.d(view, fx5Var);
        }
        this.u++;
    }
}

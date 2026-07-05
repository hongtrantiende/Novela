package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.vbook.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw1  reason: default package */
/* loaded from: classes.dex */
public final class vw1 {
    public final View a;
    public boolean b;
    public px1 c;
    public un6 d;
    public ty9 e;
    public sdd f;
    public final dr5 g;
    public final yq9 h;
    public final Configuration i;
    public final aw7 j;
    public final cne k;
    public final xo l;
    public final kw5 m;
    public final wf n;
    public final bo4 o;
    public final aw7 p;
    public final s35 q;
    public final bp r;
    public final qd6 s;
    public final zk6 t;
    public final o61 u;
    public int v;
    public final ik w;
    public final uw1 x;

    public vw1(vw1 vw1Var, View view, px1 px1Var, un6 un6Var, ty9 ty9Var, sdd sddVar) {
        Context context;
        dr5 dr5Var;
        yq9 yq9Var;
        Configuration configuration;
        aw7 z;
        cne cneVar;
        xo xoVar;
        kw5 kw5Var;
        wf wfVar;
        bo4 p40Var;
        aw7 hm8Var;
        s35 dx8Var;
        bp bpVar;
        qd6 qd6Var;
        o61 o61Var;
        View view2;
        if (vw1Var != null && (view2 = vw1Var.a) != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        boolean i = c16.i(context, view.getContext());
        this.a = view;
        this.c = px1Var;
        this.d = un6Var;
        this.e = ty9Var;
        this.f = sddVar;
        if (i) {
            vw1Var.getClass();
            dr5Var = vw1Var.g;
        } else {
            dr5Var = new dr5();
        }
        this.g = dr5Var;
        this.h = (vw1Var == null || (yq9Var = vw1Var.h) == null) ? new yq9() : yq9Var;
        if (i) {
            vw1Var.getClass();
            configuration = vw1Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (i) {
            vw1Var.getClass();
            z = vw1Var.j;
        } else {
            z = yae.z(new Configuration(configuration));
        }
        this.j = z;
        if (i) {
            vw1Var.getClass();
            cneVar = vw1Var.k;
        } else {
            Context context2 = view.getContext();
            cneVar = new cne(15);
            Object systemService = context2.getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        }
        this.k = cneVar;
        if (i) {
            vw1Var.getClass();
            xoVar = vw1Var.l;
        } else {
            xoVar = new xo(view.getContext());
        }
        this.l = xoVar;
        if (i) {
            vw1Var.getClass();
            kw5Var = vw1Var.m;
        } else {
            kw5Var = new kw5((Object) view.getContext(), 3);
        }
        this.m = kw5Var;
        if (i) {
            vw1Var.getClass();
            wfVar = vw1Var.n;
        } else {
            wfVar = new wf(kw5Var);
        }
        this.n = wfVar;
        if (i) {
            vw1Var.getClass();
            p40Var = vw1Var.o;
        } else {
            view.getContext();
            p40Var = new p40(16);
        }
        this.o = p40Var;
        if (i) {
            vw1Var.getClass();
            hm8Var = vw1Var.p;
        } else {
            hm8Var = new hm8(gae.f(view.getContext()), r0f.L);
        }
        this.p = hm8Var;
        if (view == (vw1Var != null ? vw1Var.a : null)) {
            dx8Var = vw1Var.q;
        } else {
            dx8Var = new dx8(view);
        }
        this.q = dx8Var;
        if (i) {
            vw1Var.getClass();
            bpVar = vw1Var.r;
        } else {
            bpVar = new bp(ViewConfiguration.get(view.getContext()));
        }
        this.r = bpVar;
        this.s = (vw1Var == null || (qd6Var = vw1Var.s) == null) ? new qd6() : qd6Var;
        this.t = new zk6();
        this.u = (vw1Var == null || (o61Var = vw1Var.u) == null) ? new o61() : o61Var;
        this.w = new ik(this, 5);
        this.x = new uw1(this);
    }

    public final void a(rg rgVar, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        Set set;
        String str;
        View view;
        Object obj;
        rv4Var.g0(123858079);
        if (rv4Var.h(rgVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.h(lu4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(this)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z2 = false;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            Object tag = rgVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            if ((tag instanceof Set) && (!(tag instanceof j76) || (tag instanceof o76))) {
                set = (Set) tag;
            } else {
                set = null;
            }
            if (set == null) {
                ViewParent parent = rgVar.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if ((obj instanceof Set) && (!(obj instanceof j76) || (obj instanceof o76))) {
                    set = obj;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(rv4Var.y());
                rv4Var.q = true;
                rv4Var.C = true;
                rv4Var.c.b();
                rv4Var.H.b();
                eqa eqaVar = rv4Var.I;
                bqa bqaVar = eqaVar.a;
                eqaVar.e = bqaVar.F;
                eqaVar.f = bqaVar.G;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                f();
                ty9 ty9Var = this.e;
                ty9Var.getClass();
                ViewParent parent2 = rgVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag2 = view2.getTag(R.id.compose_view_saveable_id_tag);
                if (tag2 instanceof String) {
                    str = (String) tag2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String m = s21.m("SaveableStateRegistry:", str);
                s26 j = ty9Var.j();
                Bundle q = j.q(m);
                if (q != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : q.keySet()) {
                        ArrayList parcelableArrayList = q.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                kg kgVar = kg.a0;
                tza tzaVar = ay9.a;
                zx9 zx9Var = new zx9(linkedHashMap, kgVar);
                if (j.y(m) == null) {
                    try {
                        j.L(m, new ut1(zx9Var, 1));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                lb3 lb3Var = new lb3(zx9Var, new mb3(z2, j, m));
                rv4Var.o0(lb3Var);
                P = lb3Var;
            }
            lb3 lb3Var2 = (lb3) P;
            boolean h = rv4Var.h(lb3Var2);
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new jc(lb3Var2, 12);
                rv4Var.o0(P2);
            }
            yte.b(pvc.a, (xt4) P2, rv4Var);
            ly1 ly1Var = dy1.x;
            boolean booleanValue = ((Boolean) rv4Var.j(ly1Var)).booleanValue() | rgVar.getScrollCaptureInProgress$ui();
            boolean f = rv4Var.f(rgVar.getView());
            Object P3 = rv4Var.P();
            if (f || P3 == lh9Var) {
                P3 = new ced(rgVar.getView());
                rv4Var.o0(P3);
            }
            ced cedVar = (ced) P3;
            boolean f2 = rv4Var.f(rgVar.getView());
            Object P4 = rv4Var.P();
            if (f2 || P4 == lh9Var) {
                P4 = new gm(rgVar.getView());
                rv4Var.o0(P4);
            }
            i99 a = nu6.a.a(c());
            f99 f99Var = wu6.a;
            f();
            ty9 ty9Var2 = this.e;
            ty9Var2.getClass();
            pye.b(new i99[]{a, f99Var.a(ty9Var2), gh.d.a(this.g), gh.e.a(this.h), dy1.v.a((nsa) P4), gh.b.a(rgVar.getContext()), mx5.a.a(set), gh.a.a(rgVar.getConfiguration()), ay9.a.a(lb3Var2), gh.f.a(rgVar.getView()), ly1Var.a(Boolean.valueOf(booleanValue)), dy1.t.a(rgVar.getViewConfiguration()), da5.a.a(cedVar)}, jce.E(1317454175, new tw1(rgVar, this, lu4Var), rv4Var), rv4Var, 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new tw1(this, rgVar, lu4Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.v = 0;
        }
        if (this.v == 0) {
            View view = this.a;
            Context context = view.getContext();
            uw1 uw1Var = this.x;
            context.unregisterComponentCallbacks(uw1Var);
            zk6 zk6Var = this.t;
            if (zk6Var.b == null) {
                zk6Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(uw1Var);
        }
    }

    public final un6 c() {
        f();
        un6 un6Var = this.d;
        un6Var.getClass();
        return un6Var;
    }

    public final void d() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            uw1 uw1Var = this.x;
            context.registerComponentCallbacks(uw1Var);
            e(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            zk6 zk6Var = this.t;
            zk6Var.c.setValue(Boolean.valueOf(hasWindowFocus));
            hm8 hm8Var = zk6Var.b;
            ik ikVar = this.w;
            if (hm8Var == null) {
                zk6Var.a = ikVar;
            }
            if (hm8Var != null) {
                hm8Var.setValue(ikVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(uw1Var);
        }
    }

    public final void e(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                br5 br5Var = (br5) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (br5Var == null || Configuration.needNewResources(updateFrom, br5Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            yq9 yq9Var = this.h;
            synchronized (yq9Var) {
                yq9Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(gae.f(this.a.getContext()));
            }
            if ((805248384 & updateFrom) != 0) {
                zk6 zk6Var = this.t;
                ik ikVar = this.w;
                hm8 hm8Var = zk6Var.b;
                if (hm8Var != null) {
                    hm8Var.setValue(ikVar.invoke());
                }
            }
        }
    }

    public final void f() {
        if (!this.b) {
            this.b = true;
            px1 px1Var = this.c;
            View view = this.a;
            if (px1Var == null) {
                px1 a = ukd.a(view);
                if (a == null) {
                    ViewParent parent = view.getParent();
                    while (a == null && (parent instanceof View)) {
                        View view2 = (View) parent;
                        a = ukd.a(view2);
                        parent = gue.q(view2);
                    }
                }
                if (a == null) {
                    a = ukd.b(view);
                }
                this.c = a;
            }
            if (this.d == null) {
                un6 O = iue.O(view);
                if (O != null) {
                    this.d = O;
                } else {
                    vs.k("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
            }
            if (this.e == null) {
                ty9 I = jue.I(view);
                if (I != null) {
                    this.e = I;
                } else {
                    vs.k("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    return;
                }
            }
            if (this.f == null) {
                this.f = kue.h(view);
            }
        }
    }
}

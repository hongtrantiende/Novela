package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns4  reason: default package */
/* loaded from: classes.dex */
public final class ns4 {
    public final s6f a;
    public final oaa b;
    public final rr4 c;
    public boolean d = false;
    public int e = -1;

    public ns4(s6f s6fVar, oaa oaaVar, ClassLoader classLoader, bs4 bs4Var, Bundle bundle) {
        this.a = s6fVar;
        this.b = oaaVar;
        ms4 ms4Var = (ms4) bundle.getParcelable("state");
        rr4 a = bs4Var.a(ms4Var.a);
        a.e = ms4Var.b;
        a.J = ms4Var.c;
        a.L = ms4Var.d;
        a.M = true;
        a.T = ms4Var.e;
        a.U = ms4Var.f;
        a.V = ms4Var.C;
        a.Y = ms4Var.D;
        a.H = ms4Var.E;
        a.X = ms4Var.F;
        a.W = ms4Var.G;
        a.i0 = kn6.values()[ms4Var.H];
        a.D = ms4Var.I;
        a.E = ms4Var.J;
        a.d0 = ms4Var.K;
        this.c = a;
        a.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        hs4 hs4Var = a.P;
        if (hs4Var != null && (hs4Var.H || hs4Var.I)) {
            vs.k("Fragment already added and state has been saved");
            throw null;
        }
        a.f = bundle2;
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + rr4Var);
        }
        Bundle bundle = rr4Var.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        rr4Var.R.Q();
        rr4Var.a = 3;
        rr4Var.a0 = false;
        rr4Var.t();
        if (rr4Var.a0) {
            if (hs4.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + rr4Var);
            }
            rr4Var.b = null;
            hs4 hs4Var = rr4Var.R;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(4);
            this.a.q(rr4Var, false);
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + rr4Var);
        }
        rr4 rr4Var2 = rr4Var.C;
        ns4 ns4Var = null;
        oaa oaaVar = this.b;
        if (rr4Var2 != null) {
            ns4 ns4Var2 = (ns4) ((HashMap) oaaVar.c).get(rr4Var2.e);
            if (ns4Var2 != null) {
                rr4Var.D = rr4Var.C.e;
                rr4Var.C = null;
                ns4Var = ns4Var2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(rr4Var);
                rr4 rr4Var3 = rr4Var.C;
                sb.append(" declared target fragment ");
                sb.append(rr4Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = rr4Var.D;
            if (str != null && (ns4Var = (ns4) ((HashMap) oaaVar.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(rr4Var);
                sb2.append(" declared target fragment ");
                vs.k(s21.q(sb2, rr4Var.D, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (ns4Var != null) {
            ns4Var.j();
        }
        hs4 hs4Var = rr4Var.P;
        rr4Var.Q = hs4Var.w;
        rr4Var.S = hs4Var.y;
        s6f s6fVar = this.a;
        s6fVar.y(rr4Var, false);
        ArrayList arrayList = rr4Var.n0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((or4) obj).a();
        }
        arrayList.clear();
        rr4Var.R.b(rr4Var.Q, rr4Var.g(), rr4Var);
        rr4Var.a = 0;
        rr4Var.a0 = false;
        rr4Var.v(rr4Var.Q.d);
        if (rr4Var.a0) {
            Iterator it = rr4Var.P.p.iterator();
            while (it.hasNext()) {
                ((ks4) it.next()).a();
            }
            hs4 hs4Var2 = rr4Var.R;
            hs4Var2.H = false;
            hs4Var2.I = false;
            hs4Var2.O.C = false;
            hs4Var2.u(0);
            s6fVar.r(rr4Var, false);
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onAttach()");
    }

    public final int c() {
        nx2 nx2Var;
        Object obj;
        Object obj2;
        rr4 rr4Var = this.c;
        if (rr4Var.P == null) {
            return rr4Var.a;
        }
        int i = this.e;
        int ordinal = rr4Var.i0.ordinal();
        int i2 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i = Math.min(i, -1);
                    }
                } else {
                    i = Math.min(i, 5);
                }
            } else {
                i = Math.min(i, 1);
            }
        } else {
            i = Math.min(i, 0);
        }
        if (rr4Var.J) {
            boolean z = rr4Var.K;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
            } else if (i3 < 4) {
                i = Math.min(i, rr4Var.a);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (rr4Var.L && rr4Var.b0 == null) {
            i = Math.min(i, 4);
        }
        if (!rr4Var.G) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = rr4Var.b0;
        if (viewGroup != null) {
            rr4Var.o().I().getClass();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof nx2) {
                nx2Var = (nx2) tag;
            } else {
                nx2Var = new nx2(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, nx2Var);
            }
            ArrayList arrayList = nx2Var.b;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                obj = null;
                if (i4 < size) {
                    obj2 = arrayList.get(i4);
                    i4++;
                    ((kwa) obj2).getClass();
                    if (c16.i(null, rr4Var)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            kwa kwaVar = (kwa) obj2;
            ArrayList arrayList2 = nx2Var.c;
            int size2 = arrayList2.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i2);
                i2++;
                ((kwa) obj3).getClass();
                if (c16.i(null, rr4Var)) {
                    obj = obj3;
                    break;
                }
            }
            kwa kwaVar2 = (kwa) obj;
        }
        if (rr4Var.H) {
            if (rr4Var.s()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (rr4Var.c0 && rr4Var.a < 5) {
            i = Math.min(i, 4);
        }
        if (rr4Var.I) {
            i = Math.max(i, 3);
        }
        if (hs4.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + rr4Var);
        }
        return i;
    }

    public final void d() {
        Bundle bundle;
        Bundle bundle2;
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + rr4Var);
        }
        Bundle bundle3 = rr4Var.b;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!rr4Var.g0) {
            s6f s6fVar = this.a;
            s6fVar.z(rr4Var, false);
            rr4Var.R.Q();
            rr4Var.a = 1;
            rr4Var.a0 = false;
            rr4Var.j0.a(new qk9(rr4Var, 3));
            rr4Var.w(bundle);
            rr4Var.g0 = true;
            if (rr4Var.a0) {
                rr4Var.j0.d(jn6.ON_CREATE);
                s6fVar.s(rr4Var, false);
                return;
            }
            fb4.f(rr4Var, " did not call through to super.onCreate()");
            return;
        }
        rr4Var.a = 1;
        Bundle bundle4 = rr4Var.b;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            rr4Var.R.V(bundle2);
            hs4 hs4Var = rr4Var.R;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(1);
        }
    }

    public final void e() {
        Bundle bundle;
        String str;
        rr4 rr4Var = this.c;
        if (rr4Var.J) {
            return;
        }
        if (hs4.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + rr4Var);
        }
        Bundle bundle2 = rr4Var.b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater A = rr4Var.A(bundle);
        ViewGroup viewGroup2 = rr4Var.b0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = rr4Var.U;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) rr4Var.P.x.x(i);
                    if (viewGroup == null) {
                        if (!rr4Var.M && !rr4Var.L) {
                            try {
                                str = rr4Var.G().getResources().getResourceName(rr4Var.U);
                            } catch (Resources.NotFoundException unused) {
                                str = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(rr4Var.U) + " (" + str + ") for fragment " + rr4Var);
                        }
                    } else if (!(viewGroup instanceof wr4)) {
                        os4 os4Var = ps4.a;
                        ps4.b(new ls4(rr4Var, "Attempting to add fragment " + rr4Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        ps4.a(rr4Var).getClass();
                    }
                } else {
                    hfd.p(rr4Var, " for a container view with no id", "Cannot create fragment ");
                    return;
                }
            }
        }
        rr4Var.b0 = viewGroup;
        rr4Var.F(A, viewGroup, bundle);
        rr4Var.a = 2;
    }

    public final void f() {
        boolean z;
        boolean z2;
        rr4 s;
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + rr4Var);
        }
        boolean z3 = true;
        int i = 0;
        if (rr4Var.H && !rr4Var.s()) {
            z = true;
        } else {
            z = false;
        }
        oaa oaaVar = this.b;
        if (z) {
            oaaVar.P(rr4Var.e, null);
        }
        if (!z) {
            js4 js4Var = (js4) oaaVar.e;
            if (js4Var.b.containsKey(rr4Var.e) && js4Var.e) {
                z2 = js4Var.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = rr4Var.D;
                if (str != null && (s = oaaVar.s(str)) != null && s.Y) {
                    rr4Var.C = s;
                }
                rr4Var.a = 0;
                return;
            }
        }
        tr4 tr4Var = rr4Var.Q;
        if (tr4Var != null) {
            z3 = ((js4) oaaVar.e).f;
        } else {
            ur4 ur4Var = tr4Var.d;
            if (ur4Var != null) {
                z3 = true ^ ur4Var.isChangingConfigurations();
            }
        }
        if (z || z3) {
            ((js4) oaaVar.e).e(rr4Var, false);
        }
        rr4Var.R.l();
        rr4Var.j0.d(jn6.ON_DESTROY);
        rr4Var.a = 0;
        rr4Var.a0 = false;
        rr4Var.g0 = false;
        rr4Var.x();
        if (rr4Var.a0) {
            this.a.t(rr4Var, false);
            ArrayList w = oaaVar.w();
            int size = w.size();
            while (i < size) {
                Object obj = w.get(i);
                i++;
                ns4 ns4Var = (ns4) obj;
                if (ns4Var != null) {
                    rr4 rr4Var2 = ns4Var.c;
                    if (rr4Var.e.equals(rr4Var2.D)) {
                        rr4Var2.C = rr4Var;
                        rr4Var2.D = null;
                    }
                }
            }
            String str2 = rr4Var.D;
            if (str2 != null) {
                rr4Var.C = oaaVar.s(str2);
            }
            oaaVar.I(this);
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onDestroy()");
    }

    public final void g() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + rr4Var);
        }
        ViewGroup viewGroup = rr4Var.b0;
        rr4Var.R.u(1);
        rr4Var.a = 1;
        rr4Var.a0 = false;
        rr4Var.y();
        if (rr4Var.a0) {
            qdd i = rr4Var.i();
            i.getClass();
            ob2 ob2Var = ob2.b;
            ob2Var.getClass();
            odd oddVar = new odd(i, ls6.d, ob2Var);
            gi1 a = cm9.a(ls6.class);
            String f = a.f();
            if (f != null) {
                bwa bwaVar = ((ls6) oddVar.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).b;
                int i2 = bwaVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((ks6) bwaVar.e(i3)).j();
                }
                rr4Var.N = false;
                this.a.E(rr4Var, false);
                rr4Var.b0 = null;
                rr4Var.k0.i(null);
                rr4Var.K = false;
                return;
            }
            vs.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onDestroyView()");
    }

    public final void h() {
        boolean z;
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + rr4Var);
        }
        rr4Var.a = -1;
        rr4Var.a0 = false;
        rr4Var.z();
        if (rr4Var.a0) {
            hs4 hs4Var = rr4Var.R;
            if (!hs4Var.J) {
                hs4Var.l();
                rr4Var.R = new hs4();
            }
            this.a.w(rr4Var, false);
            rr4Var.a = -1;
            rr4Var.Q = null;
            rr4Var.S = null;
            rr4Var.P = null;
            if (!rr4Var.H || rr4Var.s()) {
                js4 js4Var = (js4) this.b.e;
                if (js4Var.b.containsKey(rr4Var.e) && js4Var.e) {
                    z = js4Var.f;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (hs4.K(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + rr4Var);
            }
            rr4Var.q();
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onDetach()");
    }

    public final void i() {
        Bundle bundle;
        rr4 rr4Var = this.c;
        if (rr4Var.J && rr4Var.K && !rr4Var.N) {
            if (hs4.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + rr4Var);
            }
            Bundle bundle2 = rr4Var.b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            rr4Var.F(rr4Var.A(bundle), null, bundle);
        }
    }

    public final void j() {
        oaa oaaVar = this.b;
        boolean z = this.d;
        rr4 rr4Var = this.c;
        if (z) {
            if (hs4.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + rr4Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = rr4Var.a;
                if (c != i) {
                    if (c > i) {
                        switch (i + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                d();
                                continue;
                            case 2:
                                i();
                                e();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                rr4Var.a = 4;
                                continue;
                            case 5:
                                n();
                                continue;
                            case 6:
                                rr4Var.a = 6;
                                continue;
                            case 7:
                                m();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                h();
                                continue;
                            case 0:
                                f();
                                continue;
                            case 1:
                                g();
                                rr4Var.a = 1;
                                continue;
                            case 2:
                                rr4Var.K = false;
                                rr4Var.a = 2;
                                continue;
                            case 3:
                                if (hs4.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + rr4Var);
                                }
                                rr4Var.a = 3;
                                continue;
                            case 4:
                                o();
                                continue;
                            case 5:
                                rr4Var.a = 5;
                                continue;
                            case 6:
                                k();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && rr4Var.H && !rr4Var.s()) {
                        if (hs4.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + rr4Var);
                        }
                        ((js4) oaaVar.e).e(rr4Var, true);
                        oaaVar.I(this);
                        if (hs4.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + rr4Var);
                        }
                        rr4Var.q();
                    }
                    if (rr4Var.f0) {
                        hs4 hs4Var = rr4Var.P;
                        if (hs4Var != null && rr4Var.G && hs4.L(rr4Var)) {
                            hs4Var.G = true;
                        }
                        rr4Var.f0 = false;
                        rr4Var.R.o();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + rr4Var);
        }
        rr4Var.R.u(5);
        rr4Var.j0.d(jn6.ON_PAUSE);
        rr4Var.a = 6;
        rr4Var.a0 = true;
        this.a.x(rr4Var, false);
    }

    public final void l(ClassLoader classLoader) {
        rr4 rr4Var = this.c;
        Bundle bundle = rr4Var.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (rr4Var.b.getBundle("savedInstanceState") == null) {
                rr4Var.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                rr4Var.c = rr4Var.b.getSparseParcelableArray("viewState");
                rr4Var.d = rr4Var.b.getBundle("viewRegistryState");
                ms4 ms4Var = (ms4) rr4Var.b.getParcelable("state");
                if (ms4Var != null) {
                    rr4Var.D = ms4Var.I;
                    rr4Var.E = ms4Var.J;
                    rr4Var.d0 = ms4Var.K;
                }
                if (!rr4Var.d0) {
                    rr4Var.c0 = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + rr4Var, e);
            }
        }
    }

    public final void m() {
        View view;
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + rr4Var);
        }
        pr4 pr4Var = rr4Var.e0;
        if (pr4Var == null) {
            view = null;
        } else {
            view = pr4Var.j;
        }
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        rr4Var.l().j = null;
        rr4Var.R.Q();
        rr4Var.R.A(true);
        rr4Var.a = 7;
        rr4Var.a0 = false;
        rr4Var.B();
        if (rr4Var.a0) {
            rr4Var.j0.d(jn6.ON_RESUME);
            hs4 hs4Var = rr4Var.R;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(7);
            this.a.A(rr4Var, false);
            this.b.P(rr4Var.e, null);
            rr4Var.b = null;
            rr4Var.c = null;
            rr4Var.d = null;
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onResume()");
    }

    public final void n() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + rr4Var);
        }
        rr4Var.R.Q();
        rr4Var.R.A(true);
        rr4Var.a = 5;
        rr4Var.a0 = false;
        rr4Var.D();
        if (rr4Var.a0) {
            rr4Var.j0.d(jn6.ON_START);
            hs4 hs4Var = rr4Var.R;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(5);
            this.a.C(rr4Var, false);
            return;
        }
        fb4.f(rr4Var, " did not call through to super.onStart()");
    }

    public final void o() {
        boolean K = hs4.K(3);
        rr4 rr4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + rr4Var);
        }
        hs4 hs4Var = rr4Var.R;
        hs4Var.I = true;
        hs4Var.O.C = true;
        hs4Var.u(4);
        rr4Var.j0.d(jn6.ON_STOP);
        rr4Var.a = 4;
        rr4Var.a0 = false;
        rr4Var.E();
        if (rr4Var.a0) {
            this.a.D(rr4Var, false);
        } else {
            fb4.f(rr4Var, " did not call through to super.onStop()");
        }
    }

    public ns4(s6f s6fVar, oaa oaaVar, rr4 rr4Var) {
        this.a = s6fVar;
        this.b = oaaVar;
        this.c = rr4Var;
    }

    public ns4(s6f s6fVar, oaa oaaVar, rr4 rr4Var, Bundle bundle) {
        this.a = s6fVar;
        this.b = oaaVar;
        this.c = rr4Var;
        rr4Var.c = null;
        rr4Var.d = null;
        rr4Var.O = 0;
        rr4Var.K = false;
        rr4Var.G = false;
        rr4 rr4Var2 = rr4Var.C;
        rr4Var.D = rr4Var2 != null ? rr4Var2.e : null;
        rr4Var.C = null;
        rr4Var.b = bundle;
        rr4Var.f = bundle.getBundle("arguments");
    }
}

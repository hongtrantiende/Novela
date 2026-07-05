package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rr4  reason: default package */
/* loaded from: classes.dex */
public abstract class rr4 implements ComponentCallbacks, View.OnCreateContextMenuListener, un6, sdd, y35, ty9 {
    public static final Object p0 = new Object();
    public rr4 C;
    public int E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public hs4 P;
    public tr4 Q;
    public rr4 S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean a0;
    public Bundle b;
    public ViewGroup b0;
    public SparseArray c;
    public boolean c0;
    public Bundle d;
    public pr4 e0;
    public Bundle f;
    public boolean f0;
    public boolean g0;
    public String h0;
    public kn6 i0;
    public xn6 j0;
    public final zu7 k0;
    public vy9 l0;
    public eb5 m0;
    public final ArrayList n0;
    public final or4 o0;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String D = null;
    public Boolean F = null;
    public hs4 R = new hs4();
    public final boolean Z = true;
    public boolean d0 = true;

    public rr4() {
        new og(this, 4);
        this.i0 = kn6.e;
        this.k0 = new zu7();
        new AtomicInteger();
        this.n0 = new ArrayList();
        this.o0 = new or4(this);
        p();
    }

    public LayoutInflater A(Bundle bundle) {
        tr4 tr4Var = this.Q;
        if (tr4Var != null) {
            ur4 ur4Var = tr4Var.C;
            LayoutInflater cloneInContext = ur4Var.getLayoutInflater().cloneInContext(ur4Var);
            cloneInContext.setFactory2(this.R.f);
            return cloneInContext;
        }
        vs.k("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public void B() {
        this.a0 = true;
    }

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public void F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.R.Q();
        this.N = true;
        i();
    }

    public final Context G() {
        ur4 ur4Var;
        tr4 tr4Var = this.Q;
        if (tr4Var == null) {
            ur4Var = null;
        } else {
            ur4Var = tr4Var.d;
        }
        if (ur4Var != null) {
            return ur4Var;
        }
        fb4.g(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void H(int i, int i2, int i3, int i4) {
        if (this.e0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        l().b = i;
        l().c = i2;
        l().d = i3;
        l().e = i4;
    }

    @Override // defpackage.y35
    public final ldd e() {
        Application application = null;
        if (this.P != null) {
            if (this.l0 == null) {
                Context applicationContext = G().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && hs4.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + G().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.l0 = new vy9(application, this, this.f);
            }
            return this.l0;
        }
        vs.k("Can't access ViewModels from detached fragment");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y35
    public final ru7 f() {
        Application application;
        Context applicationContext = G().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && hs4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + G().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ru7 ru7Var = new ru7(0);
        LinkedHashMap linkedHashMap = ru7Var.a;
        if (application != null) {
            linkedHashMap.put(kdd.d, application);
        }
        linkedHashMap.put(ny9.a, this);
        linkedHashMap.put(ny9.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(ny9.c, bundle);
        }
        return ru7Var;
    }

    public obe g() {
        return new u53(this);
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.T));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.U));
        printWriter.print(" mTag=");
        printWriter.println(this.V);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.G);
        printWriter.print(" mRemoving=");
        printWriter.print(this.H);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.J);
        printWriter.print(" mInLayout=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.W);
        printWriter.print(" mDetached=");
        printWriter.print(this.X);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Z);
        printWriter.print(" mHasMenu=");
        int i8 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.Y);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.d0);
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.Q);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.S);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        rr4 rr4Var = this.C;
        ur4 ur4Var = null;
        if (rr4Var == null) {
            hs4 hs4Var = this.P;
            if (hs4Var != null && (str2 = this.D) != null) {
                rr4Var = hs4Var.c.s(str2);
            } else {
                rr4Var = null;
            }
        }
        if (rr4Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(rr4Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.E);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        pr4 pr4Var = this.e0;
        if (pr4Var == null) {
            z = false;
        } else {
            z = pr4Var.a;
        }
        printWriter.println(z);
        pr4 pr4Var2 = this.e0;
        if (pr4Var2 == null) {
            i = 0;
        } else {
            i = pr4Var2.b;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            pr4 pr4Var3 = this.e0;
            if (pr4Var3 == null) {
                i7 = 0;
            } else {
                i7 = pr4Var3.b;
            }
            printWriter.println(i7);
        }
        pr4 pr4Var4 = this.e0;
        if (pr4Var4 == null) {
            i2 = 0;
        } else {
            i2 = pr4Var4.c;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            pr4 pr4Var5 = this.e0;
            if (pr4Var5 == null) {
                i6 = 0;
            } else {
                i6 = pr4Var5.c;
            }
            printWriter.println(i6);
        }
        pr4 pr4Var6 = this.e0;
        if (pr4Var6 == null) {
            i3 = 0;
        } else {
            i3 = pr4Var6.d;
        }
        if (i3 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            pr4 pr4Var7 = this.e0;
            if (pr4Var7 == null) {
                i5 = 0;
            } else {
                i5 = pr4Var7.d;
            }
            printWriter.println(i5);
        }
        pr4 pr4Var8 = this.e0;
        if (pr4Var8 == null) {
            i4 = 0;
        } else {
            i4 = pr4Var8.e;
        }
        if (i4 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            pr4 pr4Var9 = this.e0;
            if (pr4Var9 != null) {
                i8 = pr4Var9.e;
            }
            printWriter.println(i8);
        }
        if (this.b0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.b0);
        }
        tr4 tr4Var = this.Q;
        if (tr4Var != null) {
            ur4Var = tr4Var.d;
        }
        if (ur4Var != null) {
            new eb5(this, i()).o(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.R + ":");
        this.R.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.sdd
    public final qdd i() {
        if (this.P != null) {
            if (n() != 1) {
                HashMap hashMap = this.P.O.d;
                qdd qddVar = (qdd) hashMap.get(this.e);
                if (qddVar == null) {
                    qdd qddVar2 = new qdd();
                    hashMap.put(this.e, qddVar2);
                    return qddVar2;
                }
                return qddVar;
            }
            vs.k("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        vs.k("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override // defpackage.ty9
    public final s26 j() {
        return (s26) this.m0.c;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.j0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pr4, java.lang.Object] */
    public final pr4 l() {
        if (this.e0 == null) {
            ?? obj = new Object();
            Object obj2 = p0;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.j = null;
            this.e0 = obj;
        }
        return this.e0;
    }

    public final hs4 m() {
        if (this.Q != null) {
            return this.R;
        }
        fb4.g(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final int n() {
        kn6 kn6Var = this.i0;
        if (kn6Var != kn6.b && this.S != null) {
            return Math.min(kn6Var.ordinal(), this.S.n());
        }
        return kn6Var.ordinal();
    }

    public final hs4 o() {
        hs4 hs4Var = this.P;
        if (hs4Var != null) {
            return hs4Var;
        }
        fb4.g(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ur4 ur4Var;
        tr4 tr4Var = this.Q;
        if (tr4Var == null) {
            ur4Var = null;
        } else {
            ur4Var = tr4Var.c;
        }
        if (ur4Var != null) {
            ur4Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            fb4.g(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a0 = true;
    }

    public final void p() {
        this.j0 = new xn6(this, true);
        this.m0 = new eb5(new sy9(this, new ak9(this, 9)));
        this.l0 = null;
        ArrayList arrayList = this.n0;
        or4 or4Var = this.o0;
        if (!arrayList.contains(or4Var)) {
            if (this.a >= 0) {
                or4Var.a();
            } else {
                arrayList.add(or4Var);
            }
        }
    }

    public final void q() {
        p();
        this.h0 = this.e;
        this.e = UUID.randomUUID().toString();
        this.G = false;
        this.H = false;
        this.J = false;
        this.K = false;
        this.M = false;
        this.O = 0;
        this.P = null;
        this.R = new hs4();
        this.Q = null;
        this.T = 0;
        this.U = 0;
        this.V = null;
        this.W = false;
        this.X = false;
    }

    public final boolean r() {
        boolean r;
        if (!this.W) {
            hs4 hs4Var = this.P;
            if (hs4Var != null) {
                rr4 rr4Var = this.S;
                hs4Var.getClass();
                if (rr4Var == null) {
                    r = false;
                } else {
                    r = rr4Var.r();
                }
                if (r) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean s() {
        if (this.O > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ds4, java.lang.Object] */
    public final void startActivityForResult(Intent intent, int i) {
        if (this.Q != null) {
            hs4 o = o();
            if (o.C != null) {
                String str = this.e;
                ?? obj = new Object();
                obj.a = str;
                obj.b = i;
                o.F.addLast(obj);
                o.C.a(intent);
                return;
            }
            tr4 tr4Var = o.w;
            tr4Var.getClass();
            intent.getClass();
            if (i == -1) {
                tr4Var.d.startActivity(intent, null);
                return;
            } else {
                vs.k("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        fb4.g(this, " not attached to Activity", "Fragment ");
    }

    public void t() {
        this.a0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Token.CASE);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.T != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.T));
        }
        if (this.V != null) {
            sb.append(" tag=");
            sb.append(this.V);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(int i, int i2, Intent intent) {
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void v(Context context) {
        ur4 ur4Var;
        this.a0 = true;
        tr4 tr4Var = this.Q;
        if (tr4Var == null) {
            ur4Var = null;
        } else {
            ur4Var = tr4Var.c;
        }
        if (ur4Var != null) {
            this.a0 = true;
        }
    }

    public abstract void w(Bundle bundle);

    public void x() {
        this.a0 = true;
    }

    public void y() {
        this.a0 = true;
    }

    public void z() {
        this.a0 = true;
    }
}

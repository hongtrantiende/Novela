package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu1  reason: default package */
/* loaded from: classes.dex */
public abstract class bu1 extends au1 implements sdd, y35, ty9, ub8, zz7, s6 {
    public final mfb C;
    public final AtomicInteger D;
    public final zt1 E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public final CopyOnWriteArrayList J;
    public final CopyOnWriteArrayList K;
    public final CopyOnWriteArrayList L;
    public boolean M;
    public boolean N;
    public final mfb O;
    public final mfb P;
    public final mfb Q;
    public final k32 b;
    public final zg4 c;
    public final eb5 d;
    public qdd e;
    public final xt1 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k32] */
    public bu1() {
        ?? obj = new Object();
        obj.a = new CopyOnWriteArraySet();
        this.b = obj;
        this.c = new zg4(new qt1(this, 0));
        sy9 sy9Var = new sy9(this, new ak9(this, 9));
        eb5 eb5Var = new eb5(sy9Var);
        this.d = eb5Var;
        this.f = new xt1(this);
        this.C = new mfb(new rt1(this, 1));
        this.D = new AtomicInteger();
        this.E = new zt1(this);
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = new CopyOnWriteArrayList();
        this.K = new CopyOnWriteArrayList();
        this.L = new CopyOnWriteArrayList();
        this.O = new mfb(new rt1(this, 2));
        xn6 xn6Var = this.a;
        if (xn6Var != null) {
            xn6Var.a(new rn6(this) { // from class: tt1
                public final /* synthetic */ bu1 b;

                {
                    this.b = this;
                }

                @Override // defpackage.rn6
                public final void C(un6 un6Var, jn6 jn6Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    bu1 bu1Var = this.b;
                    switch (i) {
                        case 0:
                            if (jn6Var == jn6.ON_STOP && (window = bu1Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (jn6Var == jn6.ON_DESTROY) {
                                bu1Var.b.b = null;
                                if (!bu1Var.isChangingConfigurations()) {
                                    bu1Var.i().a();
                                }
                                xt1 xt1Var = bu1Var.f;
                                bu1 bu1Var2 = xt1Var.d;
                                bu1Var2.getWindow().getDecorView().removeCallbacks(xt1Var);
                                bu1Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xt1Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.a.a(new rn6(this) { // from class: tt1
                public final /* synthetic */ bu1 b;

                {
                    this.b = this;
                }

                @Override // defpackage.rn6
                public final void C(un6 un6Var, jn6 jn6Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    bu1 bu1Var = this.b;
                    switch (i) {
                        case 0:
                            if (jn6Var == jn6.ON_STOP && (window = bu1Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (jn6Var == jn6.ON_DESTROY) {
                                bu1Var.b.b = null;
                                if (!bu1Var.isChangingConfigurations()) {
                                    bu1Var.i().a();
                                }
                                xt1 xt1Var = bu1Var.f;
                                bu1 bu1Var2 = xt1Var.d;
                                bu1Var2.getWindow().getDecorView().removeCallbacks(xt1Var);
                                bu1Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xt1Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.a.a(new qk9(this, 1));
            sy9Var.a();
            ny9.b(this);
            ((s26) eb5Var.c).L("android:support:activity-result", new ut1(this, 0));
            vt1 vt1Var = new vt1(this, 0);
            bu1 bu1Var = (bu1) obj.b;
            if (bu1Var != null) {
                vt1Var.a(bu1Var);
            }
            ((CopyOnWriteArraySet) obj.a).add(vt1Var);
            this.P = new mfb(new rt1(this, 3));
            this.Q = new mfb(new rt1(this, 4));
            return;
        }
        vs.k("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void l(tb8 tb8Var, bu1 bu1Var, un6 un6Var, jn6 jn6Var) {
        if (jn6Var == jn6.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = bu1Var.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            tb8Var.c(onBackInvokedDispatcher);
        }
    }

    public static void m(bu1 bu1Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (c16.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw e;
        } catch (NullPointerException e2) {
            if (!c16.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ub8
    public final tb8 b() {
        return (tb8) this.Q.getValue();
    }

    @Override // defpackage.y35
    public final ldd e() {
        return (ldd) this.P.getValue();
    }

    @Override // defpackage.y35
    public final ru7 f() {
        Bundle bundle;
        ru7 ru7Var = new ru7(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = ru7Var.a;
        if (application != null) {
            linkedHashMap.put(kdd.d, getApplication());
        }
        linkedHashMap.put(ny9.a, this);
        linkedHashMap.put(ny9.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(ny9.c, bundle);
        }
        return ru7Var;
    }

    @Override // defpackage.zz7
    public final yz7 getNavigationEventDispatcher() {
        return b().b().c;
    }

    @Override // defpackage.s6
    public final zt1 h() {
        return this.E;
    }

    @Override // defpackage.sdd
    public final qdd i() {
        if (getApplication() != null) {
            if (this.e == null) {
                wt1 wt1Var = (wt1) getLastNonConfigurationInstance();
                if (wt1Var != null) {
                    this.e = wt1Var.a;
                }
                if (this.e == null) {
                    this.e = new qdd();
                }
            }
            qdd qddVar = this.e;
            qddVar.getClass();
            return qddVar;
        }
        vs.k("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // defpackage.ty9
    public final s26 j() {
        return (s26) this.d.c;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.a;
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.E.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((h73) this.O.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.F.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.au1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.s(bundle);
        k32 k32Var = this.b;
        k32Var.getClass();
        k32Var.b = this;
        Iterator it = ((CopyOnWriteArraySet) k32Var.a).iterator();
        while (it.hasNext()) {
            ((vt1) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = fp9.b;
        dp9.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((as4) it.next()).a.k();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (!super.onMenuItemSelected(i, menuItem)) {
            if (i == 0) {
                Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
                while (it.hasNext()) {
                    if (((as4) it.next()).a.p()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.M = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.M = false;
            Iterator it = this.I.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((i12) it.next()).accept(new du7(z));
            }
        } catch (Throwable th) {
            this.M = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.H.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((as4) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.N = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.N = false;
            Iterator it = this.J.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((i12) it.next()).accept(new hv8(z));
            }
        } catch (Throwable th) {
            this.N = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        iv8 b = oo3.b(pictureInPictureUiState);
        Iterator it = this.K.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(b);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((as4) it.next()).a.t();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.E.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [wt1, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        wt1 wt1Var;
        qdd qddVar = this.e;
        if (qddVar == null && (wt1Var = (wt1) getLastNonConfigurationInstance()) != null) {
            qddVar = wt1Var.a;
        }
        if (qddVar == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = qddVar;
        return obj;
    }

    @Override // defpackage.au1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        xn6 xn6Var = this.a;
        if (xn6Var != null) {
            xn6Var.g(kn6.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.t(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.G.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.L.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (sxd.l()) {
                Trace.beginSection(sxd.o("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ut4 ut4Var = (ut4) this.C.getValue();
            synchronized (ut4Var.a) {
                ut4Var.b = true;
                ArrayList arrayList = ut4Var.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vt4) obj).invoke();
                }
                ut4Var.c.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.M) {
            return;
        }
        Iterator it = this.I.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(new du7(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.N) {
            return;
        }
        Iterator it = this.J.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((i12) it.next()).accept(new hv8(z));
        }
    }
}

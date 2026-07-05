package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu1  reason: default package */
/* loaded from: classes.dex */
public class fu1 extends Dialog implements un6, ub8, zz7, ty9 {
    public xn6 a;
    public final eb5 b;
    public final mfb c;
    public final mfb d;

    public fu1(Context context, int i) {
        super(context, i);
        this.b = new eb5(new sy9(this, new ak9(this, 9)));
        this.c = new mfb(new vt4(this) { // from class: eu1
            public final /* synthetic */ fu1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e08] */
            @Override // defpackage.vt4
            public final Object invoke() {
                int i2 = r2;
                fu1 fu1Var = this.b;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        fu1Var.getNavigationEventDispatcher().b(obj);
                        return obj;
                    default:
                        return new tb8(new x0(fu1Var, 10));
                }
            }
        });
        this.d = new mfb(new vt4(this) { // from class: eu1
            public final /* synthetic */ fu1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e08] */
            @Override // defpackage.vt4
            public final Object invoke() {
                int i2 = r2;
                fu1 fu1Var = this.b;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        fu1Var.getNavigationEventDispatcher().b(obj);
                        return obj;
                    default:
                        return new tb8(new x0(fu1Var, 10));
                }
            }
        });
    }

    public static void a(fu1 fu1Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ub8
    public final tb8 b() {
        return (tb8) this.d.getValue();
    }

    public final xn6 c() {
        xn6 xn6Var = this.a;
        if (xn6Var == null) {
            xn6 xn6Var2 = new xn6(this, true);
            this.a = xn6Var2;
            return xn6Var2;
        }
        return xn6Var;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.zz7
    public final yz7 getNavigationEventDispatcher() {
        return b().b().c;
    }

    @Override // defpackage.ty9
    public final s26 j() {
        return (s26) this.b.c;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((h73) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            tb8 b = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            b.c(onBackInvokedDispatcher);
        }
        this.b.s(bundle);
        c().d(jn6.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.t(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(jn6.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        c().d(jn6.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}

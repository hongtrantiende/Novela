package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v53  reason: default package */
/* loaded from: classes.dex */
public class v53 extends rr4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final s53 q0;
    public final t53 r0;
    public int s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public boolean x0;
    public final mu9 y0;
    public Dialog z0;

    public v53() {
        new og(this, 2);
        this.q0 = new s53(this);
        this.r0 = new t53(this);
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = true;
        this.v0 = true;
        this.w0 = -1;
        this.y0 = new mu9(this);
        this.D0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:29:0x0048, B:32:0x0050, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:33:0x0068), top: B:52:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:29:0x0048, B:32:0x0050, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:33:0x0068), top: B:52:0x001a }] */
    @Override // defpackage.rr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater A(android.os.Bundle r9) {
        /*
            r8 = this;
            android.view.LayoutInflater r9 = super.A(r9)
            boolean r0 = r8.v0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L99
            boolean r3 = r8.x0
            if (r3 == 0) goto L11
            goto L99
        L11:
            if (r0 != 0) goto L14
            goto L70
        L14:
            boolean r0 = r8.D0
            if (r0 != 0) goto L70
            r0 = 0
            r3 = 1
            r8.x0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.I()     // Catch: java.lang.Throwable -> L4e
            r8.z0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8.v0     // Catch: java.lang.Throwable -> L4e
            r6 = 0
            if (r5 == 0) goto L68
            int r5 = r8.s0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3c
            if (r5 == r2) goto L3c
            r7 = 3
            if (r5 == r7) goto L31
            goto L3f
        L31:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3c
            r7 = 24
            r5.addFlags(r7)     // Catch: java.lang.Throwable -> L4e
        L3c:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3f:
            tr4 r4 = r8.Q     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L44
            goto L46
        L44:
            ur4 r6 = r4.d     // Catch: java.lang.Throwable -> L4e
        L46:
            if (r6 == 0) goto L50
            android.app.Dialog r4 = r8.z0     // Catch: java.lang.Throwable -> L4e
            r4.setOwnerActivity(r6)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r9 = move-exception
            goto L6d
        L50:
            android.app.Dialog r4 = r8.z0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8.u0     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.z0     // Catch: java.lang.Throwable -> L4e
            s53 r5 = r8.q0     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r8.z0     // Catch: java.lang.Throwable -> L4e
            t53 r5 = r8.r0     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r8.D0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6a
        L68:
            r8.z0 = r6     // Catch: java.lang.Throwable -> L4e
        L6a:
            r8.x0 = r0
            goto L70
        L6d:
            r8.x0 = r0
            throw r9
        L70:
            boolean r0 = defpackage.hs4.K(r2)
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8c:
            android.app.Dialog r8 = r8.z0
            if (r8 == 0) goto Lc4
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r8 = r9.cloneInContext(r8)
            return r8
        L99:
            boolean r0 = defpackage.hs4.K(r2)
            if (r0 == 0) goto Lc4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r8 = r8.v0
            if (r8 != 0) goto Lbb
            java.lang.String r8 = "mShowsDialog = false: "
            java.lang.String r8 = r8.concat(r0)
            android.util.Log.d(r1, r8)
            return r9
        Lbb:
            java.lang.String r8 = "mCreatingDialog = true: "
            java.lang.String r8 = r8.concat(r0)
            android.util.Log.d(r1, r8)
        Lc4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v53.A(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.rr4
    public final void C(Bundle bundle) {
        Dialog dialog = this.z0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.s0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.t0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.u0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.v0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.w0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.rr4
    public final void D() {
        this.a0 = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = false;
            dialog.show();
            View decorView = this.z0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.rr4
    public final void E() {
        this.a0 = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.rr4
    public final void F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.F(layoutInflater, viewGroup, bundle);
        if (this.z0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.z0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog I() {
        if (hs4.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new fu1(G(), this.t0);
    }

    @Override // defpackage.rr4
    public final obe g() {
        return new u53(this, new u53(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0) {
            if (hs4.K(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.B0) {
                this.B0 = true;
                this.C0 = false;
                Dialog dialog = this.z0;
                if (dialog != null) {
                    dialog.setOnDismissListener(null);
                    this.z0.dismiss();
                }
                this.A0 = true;
                if (this.w0 >= 0) {
                    hs4 o = o();
                    int i = this.w0;
                    if (i >= 0) {
                        o.y(new fs4(o, i), true);
                        this.w0 = -1;
                        return;
                    }
                    vs.m(a82.j(i, "Bad id: "));
                    return;
                }
                uf0 uf0Var = new uf0(o());
                uf0Var.o = true;
                hs4 hs4Var = this.P;
                if (hs4Var != null && hs4Var != uf0Var.q) {
                    throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
                }
                uf0Var.b(new qs4(3, this));
                uf0Var.e(true, true);
            }
        }
    }

    @Override // defpackage.rr4
    public final void t() {
        this.a0 = true;
    }

    @Override // defpackage.rr4
    public final void v(Context context) {
        super.v(context);
        zu7 zu7Var = this.k0;
        zu7Var.getClass();
        zu7.a("observeForever");
        mu9 mu9Var = this.y0;
        as6 as6Var = new as6(zu7Var, mu9Var);
        as6 as6Var2 = (as6) zu7Var.b.a(mu9Var, as6Var);
        if (!(as6Var2 instanceof zr6)) {
            if (as6Var2 == null) {
                as6Var.a(true);
            }
            if (!this.C0) {
                this.B0 = false;
                return;
            }
            return;
        }
        vs.m("Cannot add the same observer with different lifecycles");
    }

    @Override // defpackage.rr4
    public final void w(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        this.a0 = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.R.V(bundle2);
            hs4 hs4Var = this.R;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(1);
        }
        hs4 hs4Var2 = this.R;
        if (hs4Var2.v < 1) {
            hs4Var2.H = false;
            hs4Var2.I = false;
            hs4Var2.O.C = false;
            hs4Var2.u(1);
        }
        new Handler();
        if (this.U == 0) {
            z = true;
        } else {
            z = false;
        }
        this.v0 = z;
        if (bundle != null) {
            this.s0 = bundle.getInt("android:style", 0);
            this.t0 = bundle.getInt("android:theme", 0);
            this.u0 = bundle.getBoolean("android:cancelable", true);
            this.v0 = bundle.getBoolean("android:showsDialog", this.v0);
            this.w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.rr4
    public final void y() {
        this.a0 = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = true;
            dialog.setOnDismissListener(null);
            this.z0.dismiss();
            if (!this.B0) {
                onDismiss(this.z0);
            }
            this.z0 = null;
            this.D0 = false;
        }
    }

    @Override // defpackage.rr4
    public final void z() {
        this.a0 = true;
        if (!this.C0 && !this.B0) {
            this.B0 = true;
        }
        this.k0.h(this.y0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}

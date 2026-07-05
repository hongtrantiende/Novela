package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ur4  reason: default package */
/* loaded from: classes.dex */
public abstract class ur4 extends bu1 {
    public boolean T;
    public boolean U;
    public final fz4 R = new fz4(new tr4(this));
    public final xn6 S = new xn6(this, true);
    public boolean V = true;

    public ur4() {
        ((s26) this.d.c).L("android:support:lifecycle", new ut1(this, 2));
        this.F.add(new i12(this) { // from class: sr4
            public final /* synthetic */ ur4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj) {
                int i = r2;
                ur4 ur4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        ur4Var.R.h0();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        ur4Var.R.h0();
                        return;
                }
            }
        });
        this.H.add(new i12(this) { // from class: sr4
            public final /* synthetic */ ur4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj) {
                int i = r2;
                ur4 ur4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        ur4Var.R.h0();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        ur4Var.R.h0();
                        return;
                }
            }
        });
        vt1 vt1Var = new vt1(this, 1);
        k32 k32Var = this.b;
        k32Var.getClass();
        bu1 bu1Var = (bu1) k32Var.b;
        if (bu1Var != null) {
            vt1Var.a(bu1Var);
        }
        ((CopyOnWriteArraySet) k32Var.a).add(vt1Var);
    }

    public static boolean o(hs4 hs4Var) {
        ur4 ur4Var;
        boolean z = false;
        for (rr4 rr4Var : hs4Var.c.z()) {
            if (rr4Var != null) {
                tr4 tr4Var = rr4Var.Q;
                if (tr4Var == null) {
                    ur4Var = null;
                } else {
                    ur4Var = tr4Var.C;
                }
                if (ur4Var != null) {
                    z |= o(rr4Var.m());
                }
                if (rr4Var.j0.h.compareTo(kn6.d) >= 0) {
                    rr4Var.j0.g(kn6.c);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r0.equals("--list-dumpables") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r0.equals("--dump-dumpable") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L5d
            int r0 = r7.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.T
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.U
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.V
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto Lb9
            eb5 r1 = new eb5
            qdd r2 = r3.i()
            r1.<init>(r3, r2)
            r1.o(r0, r6)
        Lb9:
            fz4 r3 = r3.R
            java.lang.Object r3 = r3.a
            tr4 r3 = (defpackage.tr4) r3
            hs4 r3 = r3.f
            r3.w(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur4.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.bu1, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.R.h0();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.bu1, defpackage.au1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S.d(jn6.ON_CREATE);
        hs4 hs4Var = ((tr4) this.R.a).f;
        hs4Var.H = false;
        hs4Var.I = false;
        hs4Var.O.C = false;
        hs4Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        wr4 wr4Var = (wr4) ((tr4) this.R.a).f.f.onCreateView(null, str, context, attributeSet);
        if (wr4Var == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return wr4Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((tr4) this.R.a).f.l();
        this.S.d(jn6.ON_DESTROY);
    }

    @Override // defpackage.bu1, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((tr4) this.R.a).f.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.U = false;
        ((tr4) this.R.a).f.u(5);
        this.S.d(jn6.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.S.d(jn6.ON_RESUME);
        hs4 hs4Var = ((tr4) this.R.a).f;
        hs4Var.H = false;
        hs4Var.I = false;
        hs4Var.O.C = false;
        hs4Var.u(7);
    }

    @Override // defpackage.bu1, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.R.h0();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        fz4 fz4Var = this.R;
        fz4Var.h0();
        super.onResume();
        this.U = true;
        ((tr4) fz4Var.a).f.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        fz4 fz4Var = this.R;
        fz4Var.h0();
        tr4 tr4Var = (tr4) fz4Var.a;
        super.onStart();
        this.V = false;
        if (!this.T) {
            this.T = true;
            hs4 hs4Var = tr4Var.f;
            hs4Var.H = false;
            hs4Var.I = false;
            hs4Var.O.C = false;
            hs4Var.u(4);
        }
        tr4Var.f.A(true);
        this.S.d(jn6.ON_START);
        hs4 hs4Var2 = tr4Var.f;
        hs4Var2.H = false;
        hs4Var2.I = false;
        hs4Var2.O.C = false;
        hs4Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.R.h0();
    }

    @Override // android.app.Activity
    public final void onStop() {
        fz4 fz4Var;
        super.onStop();
        this.V = true;
        do {
            fz4Var = this.R;
        } while (o(((tr4) fz4Var.a).f));
        hs4 hs4Var = ((tr4) fz4Var.a).f;
        hs4Var.I = true;
        hs4Var.O.C = true;
        hs4Var.u(4);
        this.S.d(jn6.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        wr4 wr4Var = (wr4) ((tr4) this.R.a).f.f.onCreateView(view, str, context, attributeSet);
        return wr4Var == null ? super.onCreateView(view, str, context, attributeSet) : wr4Var;
    }
}

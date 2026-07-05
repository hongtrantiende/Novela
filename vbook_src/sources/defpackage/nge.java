package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nge  reason: default package */
/* loaded from: classes.dex */
public final class nge extends rr4 implements sn6 {
    public static final WeakHashMap r0 = new WeakHashMap();
    public final kj q0 = new kj(18, false);

    @Override // defpackage.rr4
    public final void B() {
        this.a0 = true;
        kj kjVar = this.q0;
        kjVar.a = 3;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onResume();
        }
    }

    @Override // defpackage.rr4
    public final void C(Bundle bundle) {
        this.q0.F(bundle);
    }

    @Override // defpackage.rr4
    public final void D() {
        this.a0 = true;
        kj kjVar = this.q0;
        kjVar.a = 2;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onStart();
        }
    }

    @Override // defpackage.rr4
    public final void E() {
        this.a0 = true;
        kj kjVar = this.q0;
        kjVar.a = 4;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onStop();
        }
    }

    @Override // defpackage.sn6
    public final void a(String str, mn6 mn6Var) {
        this.q0.C(str, mn6Var);
    }

    @Override // defpackage.sn6
    public final mn6 c(Class cls, String str) {
        return (mn6) cls.cast(((Map) this.q0.b).get(str));
    }

    @Override // defpackage.sn6
    public final Activity d() {
        tr4 tr4Var = this.Q;
        if (tr4Var == null) {
            return null;
        }
        return tr4Var.c;
    }

    @Override // defpackage.rr4
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (mn6 mn6Var : ((Map) this.q0.b).values()) {
            mn6Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.rr4
    public final void u(int i, int i2, Intent intent) {
        super.u(i, i2, intent);
        for (mn6 mn6Var : ((Map) this.q0.b).values()) {
            mn6Var.onActivityResult(i, i2, intent);
        }
    }

    @Override // defpackage.rr4
    public final void w(Bundle bundle) {
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
        this.q0.D(bundle);
    }

    @Override // defpackage.rr4
    public final void x() {
        this.a0 = true;
        kj kjVar = this.q0;
        kjVar.a = 5;
        for (mn6 mn6Var : ((Map) kjVar.b).values()) {
            mn6Var.onDestroy();
        }
    }
}

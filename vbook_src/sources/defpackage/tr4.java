package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tr4  reason: default package */
/* loaded from: classes.dex */
public final class tr4 extends obe implements sdd, ub8, s6, ty9, ks4 {
    public final /* synthetic */ ur4 C;
    public final ur4 c;
    public final ur4 d;
    public final Handler e;
    public final hs4 f;

    public tr4(ur4 ur4Var) {
        this.C = ur4Var;
        Handler handler = new Handler();
        this.c = ur4Var;
        this.d = ur4Var;
        this.e = handler;
        this.f = new hs4();
    }

    @Override // defpackage.ub8
    public final tb8 b() {
        return this.C.b();
    }

    @Override // defpackage.s6
    public final zt1 h() {
        return this.C.E;
    }

    @Override // defpackage.sdd
    public final qdd i() {
        return this.C.i();
    }

    @Override // defpackage.ty9
    public final s26 j() {
        return (s26) this.C.d.c;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.C.S;
    }

    @Override // defpackage.obe
    public final View x(int i) {
        return this.C.findViewById(i);
    }

    @Override // defpackage.obe
    public final boolean z() {
        Window window = this.C.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ks4
    public final void a() {
    }
}

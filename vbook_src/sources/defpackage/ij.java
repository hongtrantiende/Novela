package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij  reason: default package */
/* loaded from: classes.dex */
public final class ij implements m15 {
    public static boolean g = true;
    public final rg a;
    public final Object b = new Object();
    public cdd c;
    public boolean d;
    public ij1 e;
    public final gj f;

    public ij(rg rgVar) {
        this.a = rgVar;
        gj gjVar = new gj(this, 0);
        this.f = gjVar;
        if (rgVar.isAttachedToWindow()) {
            Context context = rgVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(gjVar);
                this.d = true;
            }
        }
        rgVar.addOnAttachStateChangeListener(new hj(this, 0));
    }

    public static final void d(ij ijVar) {
        ij1 ij1Var = ijVar.e;
        if (ij1Var != null) {
            synchronized (ij1Var) {
                try {
                    tv7 tv7Var = (tv7) ij1Var.b;
                    if (tv7Var != null) {
                        tv7Var.a();
                    }
                    tv7 tv7Var2 = (tv7) ij1Var.c;
                    if (tv7Var2 != null) {
                        tv7Var2.a();
                    }
                    ij1Var.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ijVar.e = null;
    }

    @Override // defpackage.m15
    public final void a(p15 p15Var) {
        synchronized (this.b) {
            if (!p15Var.s) {
                p15Var.s = true;
                p15Var.b();
            }
        }
    }

    @Override // defpackage.m15
    public final ij1 b() {
        ij1 ij1Var = this.e;
        if (ij1Var == null) {
            ij1 ij1Var2 = new ij1(9, false);
            this.e = ij1Var2;
            return ij1Var2;
        }
        return ij1Var;
    }

    @Override // defpackage.m15
    public final p15 c() {
        r15 y15Var;
        r15 r15Var;
        p15 p15Var;
        synchronized (this.b) {
            try {
                rg rgVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    ff.s(rgVar);
                }
                if (i >= 29) {
                    r15Var = new w15();
                } else {
                    if (g) {
                        y15Var = new v15(this.a, new o61(), new n61());
                    } else {
                        y15Var = new y15(e(this.a));
                    }
                    r15Var = y15Var;
                }
                p15Var = new p15(r15Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return p15Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cdd, yj3, android.view.View, android.view.ViewGroup] */
    public final yj3 e(rg rgVar) {
        cdd cddVar = this.c;
        if (cddVar == null) {
            ?? viewGroup = new ViewGroup(rgVar.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            rgVar.addView((View) viewGroup, -1);
            this.c = viewGroup;
            return viewGroup;
        }
        return cddVar;
    }
}

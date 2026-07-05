package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fx5  reason: default package */
/* loaded from: classes.dex */
public final class fx5 extends xb1 implements Runnable, ib8, View.OnAttachStateChangeListener {
    public tjd C;
    public final yjd d;
    public boolean e;
    public boolean f;

    public fx5(yjd yjdVar) {
        super(!yjdVar.t ? 1 : 0);
        this.d = yjdVar;
    }

    @Override // defpackage.xb1
    public final void d(zid zidVar) {
        this.e = false;
        this.f = false;
        tjd tjdVar = this.C;
        if (zidVar.a.a() > 0 && tjdVar != null) {
            qjd qjdVar = tjdVar.a;
            yjd yjdVar = this.d;
            yjdVar.s.f(qwe.z(qjdVar.i(8)));
            yjdVar.r.f(qwe.z(qjdVar.i(8)));
            yjd.b(yjdVar, tjdVar);
        }
        this.C = null;
    }

    @Override // defpackage.xb1
    public final void e(zid zidVar) {
        this.e = true;
        this.f = true;
    }

    @Override // defpackage.xb1
    public final tjd f(tjd tjdVar, List list) {
        yjd yjdVar = this.d;
        yjd.b(yjdVar, tjdVar);
        if (yjdVar.t) {
            return tjd.b;
        }
        return tjdVar;
    }

    @Override // defpackage.xb1
    public final rwa g(zid zidVar, rwa rwaVar) {
        this.e = false;
        return rwaVar;
    }

    @Override // defpackage.ib8
    public final tjd i(View view, tjd tjdVar) {
        this.C = tjdVar;
        yjd yjdVar = this.d;
        a4d a4dVar = yjdVar.r;
        qjd qjdVar = tjdVar.a;
        a4dVar.f(qwe.z(qjdVar.i(8)));
        if (this.e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f) {
            yjdVar.s.f(qwe.z(qjdVar.i(8)));
            yjd.b(yjdVar, tjdVar);
        }
        if (yjdVar.t) {
            return tjd.b;
        }
        return tjdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.e = false;
            this.f = false;
            tjd tjdVar = this.C;
            if (tjdVar != null) {
                yjd yjdVar = this.d;
                yjdVar.s.f(qwe.z(tjdVar.a.i(8)));
                yjd.b(yjdVar, tjdVar);
                this.C = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

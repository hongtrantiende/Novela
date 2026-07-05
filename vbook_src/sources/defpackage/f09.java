package defpackage;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.SubtitleView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f09  reason: default package */
/* loaded from: classes.dex */
public final class f09 implements az8, View.OnClickListener, pz8, gz8 {
    public final y9c a = new y9c();
    public Object b;
    public final /* synthetic */ j09 c;

    public f09(j09 j09Var) {
        this.c = j09Var;
    }

    @Override // defpackage.az8
    public final void F(int i, int i2) {
        j09 j09Var = this.c;
        View view = j09Var.d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && j09Var.f0) {
            i09 i09Var = j09Var.f;
            i09Var.getClass();
            j09Var.K.post(new bn(6, i09Var, (SurfaceView) view, new e09(j09Var, 0)));
        }
    }

    @Override // defpackage.az8
    public final void a(uad uadVar) {
        j09 j09Var;
        cz8 cz8Var;
        if (!uadVar.equals(uad.d) && (cz8Var = (j09Var = this.c).O) != null && ((i04) cz8Var).r() != 1) {
            j09Var.j();
        }
    }

    @Override // defpackage.az8
    public final void h(int i, boolean z) {
        j09 j09Var = this.c;
        j09Var.k();
        if (j09Var.d() && j09Var.d0) {
            qz8 qz8Var = j09Var.H;
            if (qz8Var != null) {
                qz8Var.g();
                return;
            }
            return;
        }
        j09Var.e(false);
    }

    @Override // defpackage.az8
    public final void l(int i) {
        j09 j09Var = this.c;
        j09Var.k();
        j09Var.m();
        if (j09Var.d() && j09Var.d0) {
            qz8 qz8Var = j09Var.H;
            if (qz8Var != null) {
                qz8Var.g();
                return;
            }
            return;
        }
        j09Var.e(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.i();
    }

    @Override // defpackage.az8
    public final void p(ud2 ud2Var) {
        SubtitleView subtitleView = this.c.E;
        if (subtitleView != null) {
            subtitleView.setCues(ud2Var.a);
        }
    }

    @Override // defpackage.az8
    public final void q(tjc tjcVar) {
        aac aacVar;
        j09 j09Var = this.c;
        cz8 cz8Var = j09Var.O;
        cz8Var.getClass();
        i04 i04Var = (i04) cz8Var;
        if (i04Var.v(17)) {
            aacVar = i04Var.m();
        } else {
            aacVar = aac.a;
        }
        if (aacVar.p()) {
            this.b = null;
        } else {
            boolean v = i04Var.v(30);
            y9c y9cVar = this.a;
            if (v && !i04Var.n().a.isEmpty()) {
                this.b = aacVar.f(i04Var.j(), y9cVar, true).b;
            } else {
                Object obj = this.b;
                if (obj != null) {
                    int b = aacVar.b(obj);
                    if (b != -1) {
                        if (i04Var.i() == aacVar.f(b, y9cVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
        }
        j09Var.n(false);
    }

    @Override // defpackage.az8
    public final void r(int i, bz8 bz8Var, bz8 bz8Var2) {
        qz8 qz8Var;
        j09 j09Var = this.c;
        if (j09Var.d() && j09Var.d0 && (qz8Var = j09Var.H) != null) {
            qz8Var.g();
        }
    }

    @Override // defpackage.az8
    public final void x() {
        j09 j09Var = this.c;
        View view = j09Var.c;
        if (view != null) {
            view.setVisibility(4);
            if (j09Var.b()) {
                ImageView imageView = j09Var.C;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            j09Var.c();
        }
    }
}

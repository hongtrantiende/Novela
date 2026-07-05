package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz8  reason: default package */
/* loaded from: classes.dex */
public final class fz8 implements az8, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ qz8 a;

    public fz8(qz8 qz8Var) {
        this.a = qz8Var;
    }

    @Override // defpackage.az8
    public final void c(zy8 zy8Var) {
        boolean a = zy8Var.a(4, 5, 13);
        qz8 qz8Var = this.a;
        if (a) {
            qz8Var.q();
        }
        if (zy8Var.a(4, 5, 7, 13)) {
            qz8Var.s();
        }
        if (zy8Var.a(8, 13)) {
            qz8Var.t();
        }
        if (zy8Var.a(9, 13)) {
            qz8Var.v();
        }
        if (zy8Var.a(8, 9, 11, 0, 16, 17, 13)) {
            qz8Var.p();
        }
        if (zy8Var.a(11, 0, 13)) {
            qz8Var.w();
        }
        if (zy8Var.a(12, 13)) {
            qz8Var.r();
        }
        if (zy8Var.a(2, 13)) {
            qz8Var.x();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qz8 qz8Var = this.a;
        ImageView imageView = qz8Var.c0;
        View view2 = qz8Var.h0;
        View view3 = qz8Var.g0;
        View view4 = qz8Var.f0;
        vz8 vz8Var = qz8Var.a;
        cz8 cz8Var = qz8Var.M0;
        if (cz8Var != null) {
            vz8Var.g();
            if (qz8Var.Q == view) {
                i04 i04Var = (i04) cz8Var;
                if (i04Var.v(9)) {
                    i04Var.H();
                }
            } else if (qz8Var.P == view) {
                i04 i04Var2 = (i04) cz8Var;
                if (i04Var2.v(7)) {
                    i04Var2.I();
                }
            } else if (qz8Var.S == view) {
                i04 i04Var3 = (i04) cz8Var;
                if (i04Var3.r() != 4 && i04Var3.v(12)) {
                    i04Var3.X();
                    long k = i04Var3.k() + i04Var3.n0;
                    long p = i04Var3.p();
                    if (p != -9223372036854775807L) {
                        k = Math.min(k, p);
                    }
                    i04Var3.G(Math.max(k, 0L), i04Var3.i(), false);
                }
            } else if (qz8Var.T == view) {
                i04 i04Var4 = (i04) cz8Var;
                if (i04Var4.v(11)) {
                    i04Var4.X();
                    long k2 = i04Var4.k() + (-i04Var4.m0);
                    long p2 = i04Var4.p();
                    if (p2 != -9223372036854775807L) {
                        k2 = Math.min(k2, p2);
                    }
                    i04Var4.G(Math.max(k2, 0L), i04Var4.i(), false);
                }
            } else if (qz8Var.R == view) {
                if (a2d.a0(cz8Var, qz8Var.Q0)) {
                    a2d.H(cz8Var);
                    return;
                }
                i04 i04Var5 = (i04) cz8Var;
                if (i04Var5.v(1)) {
                    i04Var5.M(false);
                }
            } else if (qz8Var.W == view) {
                i04 i04Var6 = (i04) cz8Var;
                if (i04Var6.v(15)) {
                    i04Var6.X();
                    int i = i04Var6.G;
                    int i2 = qz8Var.W0;
                    for (int i3 = 1; i3 <= 2; i3++) {
                        int i4 = (i + i3) % 3;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 == 2 && (i2 & 2) != 0) {
                                }
                            } else if ((i2 & 1) == 0) {
                            }
                        }
                        i = i4;
                    }
                    i04Var6.O(i);
                }
            } else if (qz8Var.a0 == view) {
                i04 i04Var7 = (i04) cz8Var;
                if (i04Var7.v(14)) {
                    i04Var7.X();
                    boolean z = !i04Var7.H ? 1 : 0;
                    rr6 rr6Var = i04Var7.m;
                    i04Var7.X();
                    if (i04Var7.H != z) {
                        i04Var7.H = z;
                        ggb ggbVar = i04Var7.l.D;
                        ggbVar.getClass();
                        fgb c = ggb.c();
                        c.a = ggbVar.a.obtainMessage(12, z ? 1 : 0, 0);
                        c.b();
                        rr6Var.c(9, new yz3(0, z));
                        i04Var7.T();
                        rr6Var.b();
                    }
                }
            } else if (view4 == view) {
                vz8Var.f();
                qz8Var.e(qz8Var.I, view4);
            } else if (view3 == view) {
                vz8Var.f();
                qz8Var.e(qz8Var.J, view3);
            } else if (view2 == view) {
                vz8Var.f();
                qz8Var.e(qz8Var.L, view2);
            } else if (imageView == view) {
                vz8Var.f();
                qz8Var.e(qz8Var.K, imageView);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        qz8 qz8Var = this.a;
        if (qz8Var.c1) {
            qz8Var.a.g();
        }
    }
}

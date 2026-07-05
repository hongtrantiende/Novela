package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc6  reason: default package */
/* loaded from: classes.dex */
public final class nc6 implements jc6, ix8, iy8 {
    public static final nc6 a = new Object();
    public static final nc6 b = new Object();
    public static final nc6 c = new Object();

    public static String e(TextClassification textClassification, rv4 rv4Var) {
        rv4Var.e0(950061013);
        String valueOf = String.valueOf(textClassification.getLabel());
        rv4Var.q(false);
        return valueOf;
    }

    public static void f(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            k4.A(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static String g(RemoteAction remoteAction, rv4 rv4Var) {
        rv4Var.e0(-1376593684);
        String obj = remoteAction.getTitle().toString();
        rv4Var.q(false);
        return obj;
    }

    public static Typeface j(String str, dq4 dq4Var, int i) {
        Typeface create;
        if (i == 0 && c16.i(dq4Var, dq4.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && c16.i(dq4Var, dq4.D) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        boolean z = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = dq4Var.a;
        if (i == 1) {
            z = true;
        }
        return Typeface.create(create, i2, z);
    }

    public static void k(r32 r32Var, Context context, cpb cpbVar) {
        if (context == null) {
            return;
        }
        int i = cpbVar.c;
        TextClassification textClassification = cpbVar.b;
        Drawable drawable = cpbVar.d;
        tu1 tu1Var = null;
        if (i < 0) {
            el7 el7Var = new el7(textClassification, 25);
            if (drawable != null) {
                tu1Var = new tu1(new tob(drawable, 0), true, -1123224187);
            }
            r32.b(r32Var, el7Var, tu1Var, new a0b(9, context, textClassification), 6);
            return;
        }
        RemoteAction remoteAction = textClassification.getActions().get(i);
        el7 el7Var2 = new el7(remoteAction, 26);
        if (drawable != null) {
            tu1Var = new tu1(new tob(drawable, 1), true, 1106162332);
        }
        r32.b(r32Var, el7Var2, tu1Var, new imb(remoteAction, 3), 6);
    }

    @Override // defpackage.iy8
    public Typeface a(dq4 dq4Var, int i) {
        return j(null, dq4Var, i);
    }

    @Override // defpackage.ix8
    public boolean b() {
        return false;
    }

    @Override // defpackage.ix8
    public hx8 c(View view, boolean z, long j, float f, float f2, boolean z2, r13 r13Var, float f3) {
        return new jx8(new Magnifier(view));
    }

    @Override // defpackage.iy8
    public Typeface d(uw4 uw4Var, dq4 dq4Var, int i) {
        return j(uw4Var.f, dq4Var, i);
    }

    public void h(Drawable drawable, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(257732500);
        if (rv4Var.h(drawable)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            nq7 n = pna.n(kq7.a, b42.e);
            boolean h = rv4Var.h(drawable);
            Object P = rv4Var.P();
            if (h || P == ax1.a) {
                P = new ux9(drawable, 23);
                rv4Var.o0(P);
            }
            fu0.a(ote.r(n, (xt4) P), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(this, drawable, i, 15);
        }
    }

    @Override // defpackage.jc6
    public Object i(p15 p15Var, m42 m42Var) {
        return Bitmap.createBitmap(new mc6(p15Var));
    }
}

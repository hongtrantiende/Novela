package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.vbook.android.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qz8  reason: default package */
/* loaded from: classes.dex */
public final class qz8 extends FrameLayout {
    public static final float[] d1;
    public final float A0;
    public final float B0;
    public final Method C;
    public final String C0;
    public final Class D;
    public final String D0;
    public final Method E;
    public final Drawable E0;
    public final Method F;
    public final Drawable F0;
    public final CopyOnWriteArrayList G;
    public final String G0;
    public final RecyclerView H;
    public final String H0;
    public final lz8 I;
    public final Drawable I0;
    public final iz8 J;
    public final Drawable J0;
    public final ez8 K;
    public final String K0;
    public final ez8 L;
    public final String L0;
    public final fz4 M;
    public cz8 M0;
    public final PopupWindow N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public final ImageView P;
    public boolean P0;
    public final ImageView Q;
    public boolean Q0;
    public final ImageView R;
    public boolean R0;
    public final View S;
    public boolean S0;
    public final View T;
    public int T0;
    public final TextView U;
    public boolean U0;
    public final TextView V;
    public int V0;
    public final ImageView W;
    public int W0;
    public long[] X0;
    public boolean[] Y0;
    public final long[] Z0;
    public final vz8 a;
    public final ImageView a0;
    public final boolean[] a1;
    public final Resources b;
    public final ImageView b0;
    public long b1;
    public final Handler c;
    public final ImageView c0;
    public boolean c1;
    public final fz8 d;
    public final ImageView d0;
    public final Class e;
    public final ImageView e0;
    public final Method f;
    public final View f0;
    public final View g0;
    public final View h0;
    public final TextView i0;
    public final TextView j0;
    public final g9c k0;
    public final StringBuilder l0;
    public final Formatter m0;
    public final y9c n0;
    public final z9c o0;
    public final x0 p0;
    public final Drawable q0;
    public final Drawable r0;
    public final Drawable s0;
    public final Drawable t0;
    public final Drawable u0;
    public final String v0;
    public final String w0;
    public final String x0;
    public final Drawable y0;
    public final Drawable z0;

    static {
        g57.a("media3.ui");
        d1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:8:0x0083
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public qz8(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz8.<init>(android.content.Context):void");
    }

    public static void a(qz8 qz8Var, cz8 cz8Var, long j) {
        if (qz8Var.R0) {
            i04 i04Var = (i04) cz8Var;
            if (i04Var.v(17) && i04Var.v(10)) {
                aac m = i04Var.m();
                int o = m.o();
                int i = 0;
                while (true) {
                    long e0 = a2d.e0(m.m(i, qz8Var.o0, 0L).l);
                    if (j < e0) {
                        break;
                    } else if (i == o - 1) {
                        j = e0;
                        break;
                    } else {
                        j -= e0;
                        i++;
                    }
                }
                i04Var.G(j, i, false);
            }
        } else {
            i04 i04Var2 = (i04) cz8Var;
            if (i04Var2.v(5)) {
                i04Var2.G(j, i04Var2.i(), false);
            }
        }
        qz8Var.s();
    }

    public static boolean c(cz8 cz8Var, z9c z9cVar) {
        aac m;
        int o;
        i04 i04Var = (i04) cz8Var;
        if (!i04Var.v(17) || (o = (m = i04Var.m()).o()) <= 1 || o > 100) {
            return false;
        }
        for (int i = 0; i < o; i++) {
            if (m.m(i, z9cVar, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        cz8 cz8Var = this.M0;
        if (cz8Var != null && ((i04) cz8Var).v(13)) {
            i04 i04Var = (i04) this.M0;
            i04Var.X();
            i04Var.N(new my8(f, i04Var.q0.o.b));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        cz8 cz8Var = this.M0;
        if (cz8Var == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                i04 i04Var = (i04) cz8Var;
                if (i04Var.r() != 4 && i04Var.v(12)) {
                    i04Var.X();
                    long k = i04Var.k() + i04Var.n0;
                    long p = i04Var.p();
                    if (p != -9223372036854775807L) {
                        k = Math.min(k, p);
                    }
                    i04Var.G(Math.max(k, 0L), i04Var.i(), false);
                }
            } else {
                if (keyCode == 89) {
                    i04 i04Var2 = (i04) cz8Var;
                    if (i04Var2.v(11)) {
                        i04Var2.X();
                        long k2 = i04Var2.k() + (-i04Var2.m0);
                        long p2 = i04Var2.p();
                        if (p2 != -9223372036854775807L) {
                            k2 = Math.min(k2, p2);
                        }
                        i04Var2.G(Math.max(k2, 0L), i04Var2.i(), false);
                    }
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        String str = a2d.a;
                                        i04 i04Var3 = (i04) cz8Var;
                                        if (i04Var3.v(1)) {
                                            i04Var3.M(false);
                                        }
                                    }
                                } else {
                                    a2d.H(cz8Var);
                                }
                            } else {
                                i04 i04Var4 = (i04) cz8Var;
                                if (i04Var4.v(7)) {
                                    i04Var4.I();
                                }
                            }
                        } else {
                            i04 i04Var5 = (i04) cz8Var;
                            if (i04Var5.v(9)) {
                                i04Var5.H();
                            }
                        }
                    } else if (a2d.a0(cz8Var, this.Q0)) {
                        a2d.H(cz8Var);
                    } else {
                        i04 i04Var6 = (i04) cz8Var;
                        if (i04Var6.v(1)) {
                            i04Var6.M(false);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(yk9 yk9Var, View view) {
        this.H.setAdapter(yk9Var);
        u();
        this.c1 = false;
        PopupWindow popupWindow = this.N;
        popupWindow.dismiss();
        this.c1 = true;
        int i = this.O;
        popupWindow.showAsDropDown(view, (getWidth() - popupWindow.getWidth()) - i, (-popupWindow.getHeight()) - i);
    }

    public final mm9 f(tjc tjcVar, int i) {
        qs5 qs5Var;
        sjc sjcVar;
        String f;
        String str;
        String str2;
        int i2 = 4;
        kue.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        qs5 qs5Var2 = tjcVar.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < qs5Var2.size()) {
            sjc sjcVar2 = (sjc) qs5Var2.get(i3);
            if (sjcVar2.b.c == i) {
                int i5 = 0;
                while (i5 < sjcVar2.a) {
                    if (sjcVar2.d[i5] == i2) {
                        vq4 vq4Var = sjcVar2.b.d[i5];
                        int i6 = vq4Var.e;
                        int i7 = vq4Var.j;
                        if ((i6 & 2) == 0) {
                            fz4 fz4Var = this.M;
                            Resources resources = (Resources) fz4Var.a;
                            Resources resources2 = (Resources) fz4Var.a;
                            String str3 = vq4Var.o;
                            int i8 = vq4Var.G;
                            qs5Var = qs5Var2;
                            int i9 = vq4Var.w;
                            int i10 = vq4Var.v;
                            int i11 = i4;
                            String str4 = vq4Var.k;
                            int i12 = lc7.i(str3);
                            sjcVar = sjcVar2;
                            if (i12 == -1) {
                                if (lc7.j(str4) == null) {
                                    if (lc7.b(str4) == null) {
                                        if (i10 == -1 && i9 == -1) {
                                            if (i8 == -1 && vq4Var.H == -1) {
                                                i12 = -1;
                                            }
                                        }
                                    }
                                    i12 = 1;
                                }
                                i12 = 2;
                            }
                            String str5 = "";
                            if (i12 == 2) {
                                String g = fz4Var.g(vq4Var);
                                if (i10 == -1 || i9 == -1) {
                                    str2 = "";
                                } else {
                                    str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i9));
                                }
                                if (i7 != -1) {
                                    str5 = resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f));
                                }
                                f = fz4Var.a0(g, str2, str5);
                            } else if (i12 == 1) {
                                String f2 = fz4Var.f(vq4Var);
                                if (i8 == -1 || i8 < 1) {
                                    str = "";
                                } else if (i8 != 1) {
                                    if (i8 != 2) {
                                        if (i8 != 6 && i8 != 7) {
                                            if (i8 != 8) {
                                                str = resources.getString(R.string.exo_track_surround);
                                            } else {
                                                str = resources.getString(R.string.exo_track_surround_7_point_1);
                                            }
                                        } else {
                                            str = resources.getString(R.string.exo_track_surround_5_point_1);
                                        }
                                    } else {
                                        str = resources.getString(R.string.exo_track_stereo);
                                    }
                                } else {
                                    str = resources.getString(R.string.exo_track_mono);
                                }
                                if (i7 != -1) {
                                    str5 = resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f));
                                }
                                f = fz4Var.a0(f2, str, str5);
                            } else {
                                f = fz4Var.f(vq4Var);
                            }
                            if (f.isEmpty()) {
                                String str6 = vq4Var.d;
                                if (str6 != null && !str6.trim().isEmpty()) {
                                    f = resources.getString(R.string.exo_track_unknown_name, str6);
                                } else {
                                    f = resources.getString(R.string.exo_track_unknown);
                                }
                            }
                            nz8 nz8Var = new nz8(tjcVar, i3, i5, f);
                            i4 = i11 + 1;
                            int e = hs5.e(objArr.length, i4);
                            if (e > objArr.length) {
                                objArr = Arrays.copyOf(objArr, e);
                            }
                            objArr[i11] = nz8Var;
                            i5++;
                            qs5Var2 = qs5Var;
                            sjcVar2 = sjcVar;
                            i2 = 4;
                        }
                    }
                    qs5Var = qs5Var2;
                    sjcVar = sjcVar2;
                    i5++;
                    qs5Var2 = qs5Var;
                    sjcVar2 = sjcVar;
                    i2 = 4;
                }
            }
            i3++;
            qs5Var2 = qs5Var2;
            i2 = 4;
        }
        return qs5.h(i4, objArr);
    }

    public final void g() {
        vz8 vz8Var = this.a;
        int i = vz8Var.A;
        if (i != 3 && i != 2) {
            vz8Var.f();
            if (!vz8Var.D) {
                vz8Var.i(2);
            } else if (vz8Var.A == 1) {
                vz8Var.n.start();
            } else {
                vz8Var.o.start();
            }
        }
    }

    public cz8 getPlayer() {
        return this.M0;
    }

    public int getRepeatToggleModes() {
        return this.W0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.a0);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.c0);
    }

    public int getShowTimeoutMs() {
        return this.T0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.b0);
    }

    public final boolean h(cz8 cz8Var) {
        Class cls;
        if (cz8Var != null && (cls = this.D) != null && cls.isAssignableFrom(cz8Var.getClass())) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(cz8 cz8Var) {
        Class cls;
        if (cz8Var != null && (cls = this.e) != null && cls.isAssignableFrom(cz8Var.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        vz8 vz8Var = this.a;
        if (vz8Var.A == 0 && vz8Var.a.l()) {
            return true;
        }
        return false;
    }

    public final boolean k(cz8 cz8Var) {
        try {
            if (i(cz8Var)) {
                Method method = this.C;
                method.getClass();
                Object invoke = method.invoke(cz8Var, null);
                invoke.getClass();
                if (((Boolean) invoke).booleanValue()) {
                    return true;
                }
            }
            if (h(cz8Var)) {
                Method method2 = this.F;
                method2.getClass();
                Object invoke2 = method2.invoke(cz8Var, null);
                invoke2.getClass();
                if (((Boolean) invoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e) {
            e = e;
            fb4.l(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            fb4.l(e);
            return false;
        }
    }

    public final boolean l() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        float f;
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (z) {
            f = this.A0;
        } else {
            f = this.B0;
        }
        view.setAlpha(f);
    }

    public final void o(boolean z) {
        if (this.N0 == z) {
            return;
        }
        this.N0 = z;
        String str = this.L0;
        Drawable drawable = this.J0;
        String str2 = this.K0;
        Drawable drawable2 = this.I0;
        ImageView imageView = this.d0;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.e0;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
                return;
            }
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz8 vz8Var = this.a;
        vz8Var.a.addOnLayoutChangeListener(vz8Var.y);
        this.O0 = true;
        if (j()) {
            vz8Var.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz8 vz8Var = this.a;
        vz8Var.a.removeOnLayoutChangeListener(vz8Var.y);
        this.O0 = false;
        removeCallbacks(this.p0);
        vz8Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        if (l() && this.O0) {
            cz8 cz8Var = this.M0;
            if (cz8Var != null) {
                if (this.P0 && c(cz8Var, this.o0)) {
                    z = ((i04) cz8Var).v(10);
                } else {
                    z = ((i04) cz8Var).v(5);
                }
                i04 i04Var = (i04) cz8Var;
                z3 = i04Var.v(7);
                z4 = i04Var.v(11);
                z5 = i04Var.v(12);
                z2 = i04Var.v(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.b;
            View view = this.T;
            if (z4) {
                cz8 cz8Var2 = this.M0;
                if (cz8Var2 != null) {
                    i04 i04Var2 = (i04) cz8Var2;
                    i04Var2.X();
                    j2 = i04Var2.m0;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.V;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.S;
            if (z5) {
                cz8 cz8Var3 = this.M0;
                if (cz8Var3 != null) {
                    i04 i04Var3 = (i04) cz8Var3;
                    i04Var3.X();
                    j = i04Var3.n0;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.U;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            n(this.P, z3);
            n(view, z4);
            n(view2, z5);
            n(this.Q, z2);
            g9c g9cVar = this.k0;
            if (g9cVar != null) {
                ((zx2) g9cVar).setEnabled(z);
            }
        }
    }

    public final void q() {
        ImageView imageView;
        Drawable drawable;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        f57 f57Var;
        if (l() && this.O0 && (imageView = this.R) != null) {
            boolean a0 = a2d.a0(this.M0, this.Q0);
            if (a0) {
                drawable = this.q0;
            } else {
                drawable = this.r0;
            }
            if (a0) {
                i = R.string.exo_controls_play_description;
            } else {
                i = R.string.exo_controls_pause_description;
            }
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            cz8 cz8Var = this.M0;
            boolean z4 = false;
            if (cz8Var != null) {
                i04 i04Var = (i04) cz8Var;
                int r = i04Var.r();
                if (i04Var.v(16)) {
                    aac m = i04Var.m();
                    if (m.p()) {
                        f57Var = null;
                    } else {
                        f57Var = m.m(i04Var.i(), i04Var.a, 0L).b;
                    }
                    if (f57Var == null) {
                        z = false;
                        boolean v = i04Var.v(1);
                        if (r != 1 && i04Var.v(2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (r != 4 && i04Var.v(4)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z && (v || z2 || z3)) {
                            z4 = true;
                        }
                    }
                }
                z = true;
                boolean v2 = i04Var.v(1);
                if (r != 1) {
                }
                z2 = false;
                if (r != 4) {
                }
                z3 = false;
                if (z) {
                    z4 = true;
                }
            }
            n(imageView, z4);
        }
    }

    public final void r() {
        iz8 iz8Var;
        cz8 cz8Var = this.M0;
        if (cz8Var == null) {
            return;
        }
        i04 i04Var = (i04) cz8Var;
        i04Var.X();
        float f = i04Var.q0.o.a;
        boolean z = false;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            iz8Var = this.J;
            float[] fArr = iz8Var.d;
            if (i >= fArr.length) {
                break;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                i2 = i;
                f2 = abs;
            }
            i++;
        }
        iz8Var.e = i2;
        String str = iz8Var.c[i2];
        lz8 lz8Var = this.I;
        lz8Var.d[0] = str;
        if (lz8Var.d(1) || lz8Var.d(0)) {
            z = true;
        }
        n(this.f0, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r15 = this;
            boolean r0 = r15.l()
            if (r0 == 0) goto Lae
            boolean r0 = r15.O0
            if (r0 != 0) goto Lc
            goto Lae
        Lc:
            cz8 r0 = r15.M0
            if (r0 == 0) goto L2f
            r1 = r0
            i04 r1 = (defpackage.i04) r1
            r2 = 16
            boolean r2 = r1.v(r2)
            if (r2 == 0) goto L2f
            long r2 = r15.b1
            r1.X()
            ly8 r4 = r1.q0
            long r4 = r1.f(r4)
            long r4 = r4 + r2
            long r2 = r15.b1
            long r6 = r1.e()
            long r6 = r6 + r2
            goto L32
        L2f:
            r4 = 0
            r6 = r4
        L32:
            android.widget.TextView r1 = r15.j0
            if (r1 == 0) goto L45
            boolean r2 = r15.S0
            if (r2 != 0) goto L45
            java.lang.StringBuilder r2 = r15.l0
            java.util.Formatter r3 = r15.m0
            java.lang.String r2 = defpackage.a2d.E(r2, r3, r4)
            r1.setText(r2)
        L45:
            g9c r1 = r15.k0
            if (r1 == 0) goto L59
            r2 = r1
            zx2 r2 = (defpackage.zx2) r2
            r2.setPosition(r4)
            boolean r3 = r15.k(r0)
            if (r3 == 0) goto L56
            r6 = r4
        L56:
            r2.setBufferedPosition(r6)
        L59:
            x0 r2 = r15.p0
            r15.removeCallbacks(r2)
            r3 = 1
            if (r0 != 0) goto L63
            r6 = r3
            goto L6a
        L63:
            r6 = r0
            i04 r6 = (defpackage.i04) r6
            int r6 = r6.r()
        L6a:
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto La6
            i04 r0 = (defpackage.i04) r0
            boolean r9 = r0.x()
            if (r9 == 0) goto La6
            if (r1 == 0) goto L7f
            zx2 r1 = (defpackage.zx2) r1
            long r9 = r1.getPreferredUpdateDelay()
            goto L80
        L7f:
            r9 = r7
        L80:
            long r4 = r4 % r7
            long r3 = r7 - r4
            long r3 = java.lang.Math.min(r9, r3)
            r0.X()
            ly8 r0 = r0.q0
            my8 r0 = r0.o
            float r0 = r0.a
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L98
            float r1 = (float) r3
            float r1 = r1 / r0
            long r7 = (long) r1
        L98:
            r9 = r7
            int r0 = r15.V0
            long r11 = (long) r0
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = defpackage.a2d.j(r9, r11, r13)
            r15.postDelayed(r2, r0)
            return
        La6:
            r0 = 4
            if (r6 == r0) goto Lae
            if (r6 == r3) goto Lae
            r15.postDelayed(r2, r7)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz8.s():void");
    }

    public void setAnimationEnabled(boolean z) {
        this.a.D = z;
    }

    public void setMediaRouteButtonViewProvider(aed aedVar) {
        View findViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (findViewById != null) {
            if (aedVar == null) {
                findViewById.setVisibility(8);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            if (viewGroup != null) {
                ListenableFuture view = aedVar.getView();
                zg4 zg4Var = new zg4(this, findViewById, viewGroup);
                Handler handler = this.c;
                Objects.requireNonNull(handler);
                view.a(new bv4(0, view, zg4Var), new m60(handler, 1));
                return;
            }
            vs.k("The media route button placeholder has no parent view.");
            return;
        }
        vs.k("The media route button placeholder is missing.");
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(gz8 gz8Var) {
        boolean z;
        boolean z2 = true;
        if (gz8Var != null) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.d0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (gz8Var == null) {
            z2 = false;
        }
        ImageView imageView2 = this.e0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(cz8 cz8Var) {
        boolean z;
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        if (cz8Var == null || ((i04) cz8Var).s == Looper.getMainLooper()) {
            z2 = true;
        }
        wq9.s(z2);
        cz8 cz8Var2 = this.M0;
        if (cz8Var2 == cz8Var) {
            return;
        }
        fz8 fz8Var = this.d;
        if (cz8Var2 != null) {
            ((i04) cz8Var2).E(fz8Var);
        }
        this.M0 = cz8Var;
        if (cz8Var != null) {
            rr6 rr6Var = ((i04) cz8Var).m;
            fz8Var.getClass();
            rr6Var.a(fz8Var);
        }
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.W0 = i;
        cz8 cz8Var = this.M0;
        boolean z = false;
        if (cz8Var != null && ((i04) cz8Var).v(15)) {
            i04 i04Var = (i04) this.M0;
            i04Var.X();
            int i2 = i04Var.G;
            if (i == 0 && i2 != 0) {
                ((i04) this.M0).O(0);
            } else if (i == 1 && i2 == 2) {
                ((i04) this.M0).O(1);
            } else if (i == 2 && i2 == 1) {
                ((i04) this.M0).O(2);
            }
        }
        if (i != 0) {
            z = true;
        }
        this.a.h(this.W, z);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.S, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.P0 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.Q, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.Q0 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.P, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.T, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.a0, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.c0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.T0 = i;
        if (j()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.b0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.V0 = a2d.i(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.U0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        ImageView imageView = this.b0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            n(imageView, z);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.W) != null) {
            if (this.W0 == 0) {
                n(imageView, false);
                return;
            }
            cz8 cz8Var = this.M0;
            String str = this.v0;
            Drawable drawable = this.s0;
            if (cz8Var != null) {
                i04 i04Var = (i04) cz8Var;
                if (i04Var.v(15)) {
                    n(imageView, true);
                    i04Var.X();
                    int i = i04Var.G;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                imageView.setImageDrawable(this.u0);
                                imageView.setContentDescription(this.x0);
                                return;
                            }
                            return;
                        }
                        imageView.setImageDrawable(this.t0);
                        imageView.setContentDescription(this.w0);
                        return;
                    }
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                    return;
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.H;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.O;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.N;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.a0) != null) {
            cz8 cz8Var = this.M0;
            if (!this.a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.D0;
            Drawable drawable = this.z0;
            if (cz8Var != null) {
                i04 i04Var = (i04) cz8Var;
                if (i04Var.v(14)) {
                    n(imageView, true);
                    i04Var.X();
                    if (i04Var.H) {
                        drawable = this.y0;
                    }
                    imageView.setImageDrawable(drawable);
                    i04Var.X();
                    if (i04Var.H) {
                        str = this.C0;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void w() {
        boolean z;
        aac aacVar;
        boolean z2;
        long j;
        long j2;
        int i;
        long e0;
        int i2;
        int i3;
        int i4;
        aac aacVar2;
        boolean z3;
        boolean[] zArr;
        boolean z4;
        int length;
        cz8 cz8Var = this.M0;
        if (cz8Var == null) {
            return;
        }
        boolean z5 = this.P0;
        z9c z9cVar = this.o0;
        boolean z6 = false;
        boolean z7 = true;
        if (z5 && c(cz8Var, z9cVar)) {
            z = true;
        } else {
            z = false;
        }
        this.R0 = z;
        long j3 = 0;
        this.b1 = 0L;
        i04 i04Var = (i04) cz8Var;
        if (i04Var.v(17)) {
            aacVar = i04Var.m();
        } else {
            aacVar = aac.a;
        }
        if (!aacVar.p()) {
            int i5 = i04Var.i();
            boolean z8 = this.R0;
            if (z8) {
                i2 = 0;
            } else {
                i2 = i5;
            }
            if (z8) {
                i3 = aacVar.o() - 1;
            } else {
                i3 = i5;
            }
            i = 0;
            long j4 = 0;
            while (true) {
                if (i2 > i3) {
                    break;
                }
                long j5 = -9223372036854775807L;
                if (i2 == i5) {
                    this.b1 = a2d.e0(j4);
                }
                aacVar.n(i2, z9cVar);
                if (z9cVar.l == -9223372036854775807L) {
                    wq9.D(this.R0 ^ z7);
                    break;
                }
                int i6 = z9cVar.m;
                boolean z9 = z6;
                while (i6 <= z9cVar.n) {
                    y9c y9cVar = this.n0;
                    aacVar.f(i6, y9cVar, z9);
                    long j6 = j5;
                    c7 c7Var = y9cVar.g;
                    c7Var.getClass();
                    int i7 = c7Var.a;
                    for (int i8 = z9; i8 < i7; i8++) {
                        y9cVar.d(i8);
                        long j7 = j3;
                        long j8 = y9cVar.e;
                        if (j8 >= j7) {
                            long[] jArr = this.X0;
                            i4 = i5;
                            if (i == jArr.length) {
                                if (jArr.length == 0) {
                                    length = 1;
                                } else {
                                    length = jArr.length * 2;
                                }
                                this.X0 = Arrays.copyOf(jArr, length);
                                this.Y0 = Arrays.copyOf(this.Y0, length);
                            }
                            this.X0[i] = a2d.e0(j8 + j4);
                            boolean[] zArr2 = this.Y0;
                            a7 a = y9cVar.g.a(i8);
                            int i9 = a.a;
                            if (i9 == -1) {
                                zArr = zArr2;
                                aacVar2 = aacVar;
                                z3 = true;
                                z4 = true;
                            } else {
                                int i10 = 0;
                                while (i10 < i9) {
                                    zArr = zArr2;
                                    int i11 = a.e[i10];
                                    aacVar2 = aacVar;
                                    z3 = true;
                                    if (i11 != 0 && i11 != 1) {
                                        i10++;
                                        zArr2 = zArr;
                                        aacVar = aacVar2;
                                    } else {
                                        z4 = true;
                                        break;
                                    }
                                }
                                zArr = zArr2;
                                aacVar2 = aacVar;
                                z3 = true;
                                z4 = false;
                            }
                            zArr[i] = !z4;
                            i++;
                        } else {
                            i4 = i5;
                            aacVar2 = aacVar;
                            z3 = z7;
                        }
                        z7 = z3;
                        j3 = j7;
                        i5 = i4;
                        aacVar = aacVar2;
                    }
                    i6++;
                    j5 = j6;
                    aacVar = aacVar;
                    z9 = false;
                }
                j4 += z9cVar.l;
                i2++;
                z7 = z7;
                aacVar = aacVar;
                z6 = false;
            }
            z2 = z7;
            j2 = j4;
        } else {
            z2 = true;
            if (i04Var.v(16)) {
                aac m = i04Var.m();
                if (m.p()) {
                    e0 = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    e0 = a2d.e0(m.m(i04Var.i(), i04Var.a, 0L).l);
                }
                if (e0 != -9223372036854775807L) {
                    j2 = a2d.Q(e0);
                    i = 0;
                }
            } else {
                j = 0;
            }
            j2 = j;
            i = 0;
        }
        long e02 = a2d.e0(j2);
        TextView textView = this.i0;
        if (textView != null) {
            textView.setText(a2d.E(this.l0, this.m0, e02));
        }
        g9c g9cVar = this.k0;
        if (g9cVar != null) {
            zx2 zx2Var = (zx2) g9cVar;
            zx2Var.setDuration(e02);
            long[] jArr2 = this.Z0;
            int length2 = jArr2.length;
            int i12 = i + length2;
            long[] jArr3 = this.X0;
            if (i12 > jArr3.length) {
                this.X0 = Arrays.copyOf(jArr3, i12);
                this.Y0 = Arrays.copyOf(this.Y0, i12);
            }
            System.arraycopy(jArr2, 0, this.X0, i, length2);
            System.arraycopy(this.a1, 0, this.Y0, i, length2);
            long[] jArr4 = this.X0;
            boolean[] zArr3 = this.Y0;
            if (i12 != 0 && (jArr4 == null || zArr3 == null)) {
                z2 = false;
            }
            wq9.s(z2);
            zx2Var.l0 = i12;
            zx2Var.m0 = jArr4;
            zx2Var.n0 = zArr3;
            zx2Var.e();
        }
        s();
    }

    public final void x() {
        boolean z;
        ez8 ez8Var = this.K;
        ez8Var.getClass();
        List list = Collections.EMPTY_LIST;
        ez8Var.c = list;
        ez8 ez8Var2 = this.L;
        ez8Var2.getClass();
        ez8Var2.c = list;
        cz8 cz8Var = this.M0;
        ImageView imageView = this.c0;
        boolean z2 = false;
        if (cz8Var != null && ((i04) cz8Var).v(30) && ((i04) this.M0).v(29)) {
            tjc n = ((i04) this.M0).n();
            mm9 f = f(n, 1);
            ez8Var2.c = f;
            qz8 qz8Var = ez8Var2.f;
            cz8 cz8Var2 = qz8Var.M0;
            lz8 lz8Var = qz8Var.I;
            cz8Var2.getClass();
            kjc u = ((i04) cz8Var2).u();
            if (f.isEmpty()) {
                lz8Var.d[1] = qz8Var.getResources().getString(R.string.exo_track_selection_none);
            } else if (!ez8Var2.d(u)) {
                lz8Var.d[1] = qz8Var.getResources().getString(R.string.exo_track_selection_auto);
            } else {
                int i = 0;
                while (true) {
                    if (i >= f.d) {
                        break;
                    }
                    nz8 nz8Var = (nz8) f.get(i);
                    if (nz8Var.a.e[nz8Var.b]) {
                        lz8Var.d[1] = nz8Var.c;
                        break;
                    }
                    i++;
                }
            }
            if (this.a.b(imageView)) {
                ez8Var.e(f(n, 3));
            } else {
                ez8Var.e(mm9.e);
            }
        }
        if (ez8Var.a() > 0) {
            z = true;
        } else {
            z = false;
        }
        n(imageView, z);
        lz8 lz8Var2 = this.I;
        if (lz8Var2.d(1) || lz8Var2.d(0)) {
            z2 = true;
        }
        n(this.f0, z2);
    }

    public void setProgressUpdateListener(jz8 jz8Var) {
    }
}

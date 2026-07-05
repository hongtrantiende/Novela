package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vz8  reason: default package */
/* loaded from: classes.dex */
public final class vz8 {
    public boolean B;
    public boolean C;
    public final qz8 a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final rz8 t = new rz8(this, 0);
    public final rz8 u = new rz8(this, 3);
    public final rz8 v = new rz8(this, 4);
    public final rz8 w = new rz8(this, 5);
    public final rz8 x = new rz8(this, 6);
    public final g71 y = new g71(this, 2);
    public boolean D = true;
    public int A = 0;
    public final ArrayList z = new ArrayList();

    public vz8(qz8 qz8Var) {
        this.a = qz8Var;
        this.c = (ViewGroup) qz8Var.findViewById(R.id.exo_top_controls);
        this.b = qz8Var.findViewById(R.id.exo_controls_background);
        this.d = (ViewGroup) qz8Var.findViewById(R.id.exo_center_controls);
        this.f = (ViewGroup) qz8Var.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) qz8Var.findViewById(R.id.exo_bottom_bar);
        this.e = viewGroup;
        this.j = (ViewGroup) qz8Var.findViewById(R.id.exo_time);
        View findViewById = qz8Var.findViewById(R.id.exo_progress);
        this.k = findViewById;
        this.g = (ViewGroup) qz8Var.findViewById(R.id.exo_basic_controls);
        this.h = (ViewGroup) qz8Var.findViewById(R.id.exo_extra_controls);
        this.i = (ViewGroup) qz8Var.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = qz8Var.findViewById(R.id.exo_overflow_show);
        this.l = findViewById2;
        View findViewById3 = qz8Var.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new dz8(this, 4));
            findViewById3.setOnClickListener(new dz8(this, 4));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, nae.e);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new sz8(this, 3));
        ofFloat.addListener(new tz8(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(nae.e, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new sz8(this, 0));
        ofFloat2.addListener(new tz8(this, 1));
        Resources resources = qz8Var.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new uz8(this, qz8Var, 0));
        animatorSet.play(ofFloat).with(d(findViewById, nae.e, dimension)).with(d(viewGroup, nae.e, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new uz8(this, qz8Var, 1));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new uz8(this, qz8Var, 2));
        animatorSet3.play(ofFloat).with(d(findViewById, nae.e, dimension2)).with(d(viewGroup, nae.e, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new tz8(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, nae.e)).with(d(viewGroup, dimension, nae.e));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new tz8(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, nae.e)).with(d(viewGroup, dimension2, nae.e));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nae.e, 1.0f);
        this.r = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new sz8(this, 1));
        ofFloat3.addListener(new tz8(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, nae.e);
        this.s = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new sz8(this, 2));
        ofFloat4.addListener(new tz8(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
        }
        return width;
    }

    public static ObjectAnimator d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_media_route_button_placeholder && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        if (view != null && this.z.contains(view)) {
            return true;
        }
        return false;
    }

    public final void e(long j, Runnable runnable) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        rz8 rz8Var = this.x;
        qz8 qz8Var = this.a;
        qz8Var.removeCallbacks(rz8Var);
        qz8Var.removeCallbacks(this.u);
        qz8Var.removeCallbacks(this.w);
        qz8Var.removeCallbacks(this.v);
    }

    public final void g() {
        if (this.A != 3) {
            f();
            int showTimeoutMs = this.a.getShowTimeoutMs();
            if (showTimeoutMs > 0) {
                if (!this.D) {
                    e(showTimeoutMs, this.x);
                } else if (this.A == 1) {
                    e(2000L, this.v);
                } else {
                    e(showTimeoutMs, this.w);
                }
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.z;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        qz8 qz8Var;
        int i2 = this.A;
        this.A = i;
        qz8 qz8Var2 = this.a;
        if (i == 2) {
            qz8Var2.setVisibility(8);
        } else if (i2 == 2) {
            qz8Var2.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = qz8Var2.G.iterator();
            while (it.hasNext()) {
                int visibility = qz8Var2.getVisibility();
                j09 j09Var = ((f09) ((pz8) it.next())).c;
                j09Var.l();
                g09 g09Var = j09Var.Q;
                if (g09Var != null) {
                    j09 j09Var2 = (j09) ((d89) g09Var).b;
                    if (visibility == 0 && (qz8Var = j09Var2.H) != null) {
                        qz8Var.g();
                    }
                }
            }
        }
    }

    public final void k() {
        if (!this.D) {
            i(0);
            g();
            return;
        }
        int i = this.A;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    }
                } else {
                    this.C = true;
                }
            } else {
                this.q.start();
            }
        } else {
            this.p.start();
        }
        g();
    }
}
